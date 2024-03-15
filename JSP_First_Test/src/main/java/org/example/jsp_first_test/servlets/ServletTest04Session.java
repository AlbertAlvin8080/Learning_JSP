package org.example.jsp_first_test.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/servlet-test04")
public class ServletTest04Session extends HttpServlet {
    @Override
    public void init() {
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        session.setAttribute("temperature", "50\u2103");
        response.sendRedirect("servlet-test06");
    }

    @Override
    public void destroy() {
    }
}