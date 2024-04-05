package org.example.jsp_first_test.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servlet-test03")
public class ServletTest03Redirect extends HttpServlet {
    @Override
    public void init() {
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.sendRedirect("servlet-test02?firstName=Jogo");
    }

    @Override
    public void destroy() {
    }
}