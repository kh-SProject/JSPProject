package edu.kh.memo.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    HttpSession session = req.getSession(false);
    
    if (session != null) {
        session.invalidate(); // 세션 무효화
    }

    // 새로운 세션을 만들어서 메시지를 전달 (invalidate했기 때문에)
    HttpSession newSession = req.getSession();
    newSession.setAttribute("message", "로그아웃이 완료되었습니다.");

    // 메인 페이지로 리다이렉트
    resp.sendRedirect("/");
  }
}