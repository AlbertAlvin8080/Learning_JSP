package org.example.jsp_first_test.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

// Beware: this is the <url-pattern>, not the <servlet-name>
@WebServlet("/servlet-test06")
public class ServletTest06JSON extends HttpServlet {
    @Override
    public void init() {
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("application/json");

        HttpSession session = request.getSession();
        Object temperature = session.getAttribute("temperature");

        Cookie[] cookies = request.getCookies();
        String pressure = null;
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("app.pressure")) {
                pressure = cookie.getValue();
                break;
            }
        }

        PrintWriter writer = response.getWriter();
        writer.println("""
                {
                    "temperature":"%s",
                    "pressure":"%s"
                }
                """.formatted(temperature, pressure));
    }

    @Override
    public void destroy() {
    }
}