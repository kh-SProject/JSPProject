package edu.kh.memo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import edu.kh.memo.model.dto.MemoList;
import edu.kh.memo.model.service.MemoService;
import edu.kh.memo.model.service.MemoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/memo/edit")
public class MemoUpdateServlet extends HttpServlet {



   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

   try {
       

        String param = req.getParameter("no"); // 👉 name="no"와 일치해야 함

        if (param == null) {
            resp.sendRedirect("/");
            return;
        }

        int memoNo = Integer.parseInt(param); // 이제 안전하게 파싱 가능

        MemoService service = new MemoServiceImpl();
        MemoList memoList = service.selectOne(memoNo);

        if (memoList == null) {
            resp.sendRedirect("/memo/detail");
            return;
        }

        req.setAttribute("memoList", memoList);
        req.getRequestDispatcher("/WEB-INF/views/memoUpdate.jsp").forward(req, resp);

      
   }catch(Exception e) {
      e.printStackTrace();
   }
   
   
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       try {
           req.setCharacterEncoding("UTF-8");
           resp.setContentType("text/html; charset=UTF-8"); // 한글 깨짐 방지

           String memoTitle = req.getParameter("memoTitle");
           String memoDetail = req.getParameter("memoDetail");
           int memoNo = Integer.parseInt(req.getParameter("no"));

           MemoService service = new MemoServiceImpl();
           int result = service.memoUpdate(memoNo, memoTitle, memoDetail);

           PrintWriter out = resp.getWriter(); // out 선언 필요!

           if (result > 0) {
               out.println("<script>");
               out.println("alert('수정되었습니다.');");
               out.println("location.href='/memo/detail?no=" + memoNo + "';");
               out.println("</script>");
           } else {
               out.println("<script>");
               out.println("alert('수정 실패ㅠㅠ');");
               out.println("history.back();");
               out.println("</script>");
           }

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
      
}
 
