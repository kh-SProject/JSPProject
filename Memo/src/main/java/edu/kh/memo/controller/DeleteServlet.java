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

@WebServlet("/main/delete")
public class DeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		try {
			
		MemoService service = new MemoServiceImpl();
		
		int memo = Integer.parseInt(req.getParameter("memoNo"));
		
		int result = service.memoDelete(memo);
		
		HttpSession session = req.getSession();
		
		String message = null;
		
		if(result > 0) {
			
			message = "메모가 삭제되었습니다.";

			
		} else {
			
			message = "메모가 존재하지 않습니다!";
		}
		
		session.setAttribute("message", message);
		resp.sendRedirect("/");
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	}
}
