package edu.kh.memo.controller;

import java.io.IOException;

import edu.kh.memo.model.dto.Member;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*@WebServlet("/login")
public class LoginController extends HttpServlet {

    //private MemberService service = new MemberService();

   @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        try {
            String id = req.getParameter("id");
            String pw = req.getParameter("pw");

           Member loginMember = service.login(id, pw);

            if (loginMember != null) {
                req.getSession().setAttribute("loginMember", loginMember);
            } else {
                req.setAttribute("message", "아이디 또는 비밀번호가 일치하지 않습니다.");
            }

            resp.sendRedirect("main");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/