package edu.kh.memo.controller;

import java.io.IOException;

import edu.kh.memo.model.dto.MemoList;
import edu.kh.memo.model.service.MemoService;
import edu.kh.memo.model.service.MemoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/memo/update")
public class MemoUpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			int memoNO = Integer.parseInt(req.getParameter("memoNo"));

			MemoService service = new MemoServiceImpl();

			MemoList memoList = service.selectOne(memoNO);

			if (memoList == null) {
				resp.sendRedirect("/memo/detail");
				return;
			}

			req.setAttribute("memoList", memoList);

			req.getRequestDispatcher("/WEB-INF/views/memoUpdate.jsp").forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	try {
		
		String memoTitle = req.getParameter("memoTitle");
		String memoDetail = req.getParameter("memoDetail");
		int memoNo = Integer.parseInt(req.getParameter("memoNo"));
		
		MemoService service = new MemoServiceImpl();
		int result = service.memoUpdate(memoNo, memoTitle, memoDetail);
		
		String url = null;
		String message = null;
		
		if (result > 0) {
			
			url = "/memo/detail?memoNo=" + memoNo;
			message = "수정 되었습니다.";
			
		} else { 
			url = "/memo/update?todoNo=" + memoNo;
			message = "수정 실패";				
			
		}
		
		req.getSession().setAttribute("message", message);
		
		resp.sendRedirect("/");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	}
	
}
