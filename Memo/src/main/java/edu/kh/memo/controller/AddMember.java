package edu.kh.memo.controller;

import java.io.IOException;

import edu.kh.memo.model.service.MemoService;
import edu.kh.memo.model.service.MemoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/signUp")
public class AddMember extends HttpServlet {

    private MemoService service = new MemoServiceImpl();

    // 📌 GET 요청: 회원가입 화면으로 이동
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/signUp.jsp").forward(req, resp);
    }

    // 📌 POST 요청: 회원가입 처리
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String memberId = req.getParameter("memberId");
            String memberPw = req.getParameter("memberPw");
            String memberName = req.getParameter("memberName");

            int result = service.Addmember(memberId, memberPw, memberName);

            String message = (result > 0) ? "회원가입 되었습니다." : "회원가입에 실패했습니다.";

            HttpSession session = req.getSession();
            session.setAttribute("message", message);

            // 메인 페이지로 이동 또는 로그인 페이지로 리다이렉트
            resp.sendRedirect(req.getContextPath() + "/");

        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("errorMessage", "회원가입 중 문제가 발생했습니다.");
            req.getRequestDispatcher("/").forward(req, resp);
        }
    }
}
