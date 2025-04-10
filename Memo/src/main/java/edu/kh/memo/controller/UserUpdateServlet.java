//package edu.kh.memo.controller;
//
//import java.io.IOException;
//
//import edu.kh.memo.model.dto.Member;
//import edu.kh.memo.model.service.MemoService;
//import edu.kh.memo.model.service.MemoServiceImpl;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@WebServlet("/user/update")
//public class UserUpdateServlet extends HttpServlet {
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//		try {
//
//			int memberNo = Integer.parseInt(req.getParameter("memberNO"));
//
//			MemoService service = new MemoServiceImpl();
//
//		Member member = service.memberDetail(memberNo);
//		
//		if (member == null ) {
//			resp.sendRedirect("/member/detail");
//			return;
//		}
//		
//		req.setAttribute("member", member);
//		
//		req.getRequestDispatcher("/WEB-INF/views/userUpdate.jsp").forward(req, resp);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//		try {
//
//			String memberId = req.getParameter("memberId");
//			String memberPw = req.getParameter("memberPw");
//			int memberNo = Integer.parseInt(req.getParameter("memberNo"));
//
//			MemoService service = new MemoServiceImpl();
//			int result = service.memberUpdate(memberId, memberPw, memberNo);
//
//			String url = null;
//			String message = null;
//
//			if (result > 0) {
//				url = "/member/detail?memberNo=" + memberNo;
//				message = "수정 되었습니다";
//
//			} else {
//				url = "/member/update?memberNo=" + memberNo;
//				message = "수정 실패";
//			}
//
//			req.getSession().setAttribute("message", message);
//
//			resp.sendRedirect("/");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//}
