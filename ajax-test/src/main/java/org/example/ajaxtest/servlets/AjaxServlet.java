package org.example.ajaxtest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

@WebServlet("/ajax-servlet")
public class AjaxServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");

        final int temperature = ThreadLocalRandom.current().nextInt(1000);
        final int pressure = ThreadLocalRandom.current().nextInt(1000);
        final String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

        final PrintWriter writer = resp.getWriter();
        writer.println("""
                {
                    "temperature":"%s\u2103",
                    "pressure":"%sPa",
                    "date":"%s"
                }
                """.formatted(temperature, pressure, date));
    }
}
