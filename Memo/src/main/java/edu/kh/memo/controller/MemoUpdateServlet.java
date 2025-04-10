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
	
}
