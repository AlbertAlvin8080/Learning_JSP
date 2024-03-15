package org.example.jsp_first_test.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servlet-test05")
public class ServletTest05Cookie extends HttpServlet {
    @Override
    public void init() {
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.addCookie(new Cookie("app.pressure", "950Pa"));
        response.sendRedirect("servlet-test06");
    }

    @Override
    public void destroy() {
    }
}