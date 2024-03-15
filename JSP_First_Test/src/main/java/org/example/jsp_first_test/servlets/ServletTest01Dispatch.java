package org.example.jsp_first_test.servlets;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/servlet-test01")
public class ServletTest01Dispatch extends HttpServlet {
    @Override
    public void init() {
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // only works with request dispatches
        request.setAttribute("firstName", "Hanami");
        RequestDispatcher dispatcher = request.getRequestDispatcher("servlet-test02?firstName=Mahito");
        dispatcher.forward(request, response);
    }

    @Override
    public void destroy() {
    }
}