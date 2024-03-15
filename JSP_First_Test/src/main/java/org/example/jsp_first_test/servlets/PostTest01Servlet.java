package org.example.jsp_first_test.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/post-test01-servlet")
public class PostTest01Servlet extends HttpServlet {
    @Override
    public void init() {
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("""
                <html>
                <head><title>Resposta do Servlet</title></head>
                <body><p>Bem Vindo, %s!</p></body>
                </html>
                """.formatted(request.getParameter("name")));
    }

    @Override
    public void destroy() {
    }
}