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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String memberId = req.getParameter("memberId");
			String memberPw = req.getParameter("memberPw");

			MemoService service = new MemoServiceImpl();

			Member member = service.login(memberId, memberPw);

			if (member == null) {
				HttpSession session = req.getSession();
				session.setAttribute("message", memberId + "가 없습니다.");

				resp.sendRedirect("/");
				return;
			}

			
			HttpSession session = req.getSession();
			session.setAttribute("member", member);
			session.setAttribute("message", member.getMemberName() + "님 환영하세요.");
			resp.sendRedirect("/");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
