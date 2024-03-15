package org.example.ajaxtest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

@WebServlet("/ajax2-servlet")
public class Ajax2Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String password = req.getParameter("password");

        boolean check = false;
        if(password.equals("1234")) {
            check = true;
        }

        resp.setContentType("application/json");

        System.out.println(check);
        final PrintWriter writer = resp.getWriter();
        writer.println("""
                {
                    "check":"%s"
                }
                """.formatted(check));
    }
}
