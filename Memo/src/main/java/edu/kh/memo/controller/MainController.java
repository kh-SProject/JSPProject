package edu.kh.memo.controller;

import java.io.IOException;
import java.util.List;

import edu.kh.memo.model.dto.Member;
import edu.kh.memo.model.dto.MemoList;
import edu.kh.memo.model.service.MemoService;
import edu.kh.memo.model.service.MemoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/main")
public class MainController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		try {
			HttpSession session = req.getSession();
			Member member = (Member) session.getAttribute("member");

			if (member != null) {
				MemoService service = new MemoServiceImpl();
				List<MemoList> memoList = service.selectByMemberNo(member.getMemberNo());
				req.setAttribute("memoList", memoList);
			}

			String path = "/WEB-INF/views/main.jsp";
			req.getRequestDispatcher(path).forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}