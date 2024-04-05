package org.example.jsp_first_test.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.jsp_first_test.model.Student;

import java.io.IOException;
import java.util.List;

@WebServlet("/jstl-servlet")
public class JSTLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var students = List.of(
                new Student(1L, "Sunuka", "Culinary"),
                new Student(1L, "Mahito", "Art"),
                new Student(1L, "Jogo", "Geography")
        );

        System.out.println(
                req.getSession().getAttribute("pageContextTest")
        );

        req.setAttribute("students", students);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/JSTL/jstl-core.jsp");
        dispatcher.forward(req, resp);
    }
}
