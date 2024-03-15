package org.example.jsp_first_test.servlets;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/cookies-form-servlet")
public class CookiesFormServlet extends HttpServlet {
    @Override
    public void init() {
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/cookies/cookie-language-form.html");
        dispatcher.forward(request, response);
    }

    @Override
    public void destroy() {
    }
}