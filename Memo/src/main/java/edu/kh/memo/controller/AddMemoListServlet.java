package edu.kh.memo.controller;

import java.io.IOException;

import edu.kh.memo.model.dto.Member;
import edu.kh.memo.model.service.MemoService;
import edu.kh.memo.model.service.MemoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/memo/add")
public class AddMemoListServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			MemoService service = new MemoServiceImpl();
			
			String memoTitle = req.getParameter("memoTitle");
			String memoDetail = req.getParameter("memoDetail");

			HttpSession session = req.getSession();
			Member loginMember = (Member) session.getAttribute("member");
			
			int memberNo = loginMember.getMemberNo();

            // 회원 번호도 함께 서비스로 전달
            int result = service.memoAdd(memoTitle, memoDetail, memberNo);

            String message = null;

            if (result > 0) message = "추가 성공!";
            else message = "추가 실패";

            session.setAttribute("message", message);
            resp.sendRedirect("/");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
