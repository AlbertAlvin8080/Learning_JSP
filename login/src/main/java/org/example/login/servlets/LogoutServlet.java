package org.example.login.servlets;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(urlPatterns = {"/logoutServlet"})
public class LogoutServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.removeAttribute(req.getServletContext().getInitParameter("session.variable"));
        session.invalidate();
//      se colocar a barra '/' antes do 'login.jsp', terá de colocar também o context path
        resp.sendRedirect("login.jsp");
//        resp.sendRedirect(req.getServletContext().getContextPath() + "/login.jsp");
    }
}
