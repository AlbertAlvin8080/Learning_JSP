package org.example.jsp_first_test.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// Beware: this is the <url-pattern>, not the <servlet-name>
//@WebServlet("/servlet-test02")
public class ServletTest02JSON extends HttpServlet {
    @Override
    public void init() {
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("application/json");

        String firstName = request.getParameter("firstName");
        String contextParam = getServletContext().getInitParameter("file.path");
        Object firstNameAttr = request.getAttribute("firstName");
        String initParameter = getServletConfig().getInitParameter("unique.file.path");

        PrintWriter writer = response.getWriter();
        writer.println("""
                {
                    "firstName":"%s",
                    "firstNameAttr:"%s",
                    "file.path":"%s",
                    "unique.file.path":"%s"
                }
                """.formatted(firstName, firstNameAttr, contextParam, initParameter));
    }

    @Override
    public void destroy() {
    }
}