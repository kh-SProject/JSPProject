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

@WebServlet("/memo/detail")
public class MemoDetailServlet extends HttpServlet {
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int memoNo = Integer.parseInt(req.getParameter("no"));

            MemoService service = new MemoServiceImpl();
            MemoList memo = service.selectOne(memoNo);

            req.setAttribute("memo", memo);
            req.getRequestDispatcher("/WEB-INF/views/memoDetail.jsp").forward(req, resp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
