package org.example.login.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.login.dao.LoginDAO;
import org.example.login.enums.MessageType;

import java.io.IOException;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    private LoginDAO dao;

    @Override
    public void init() throws ServletException {
        dao = new LoginDAO();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String userName = req.getParameter("userName");
        final String password = req.getParameter("password");
        String message;
        MessageType messageType;
        String dispatchName;

        if (!dao.checkUserExistence(userName, password)) {
            if (dao.registerUser(userName, password)) {
                message = "Registered successfully.";
                messageType = MessageType.INFO;
                dispatchName = "login.jsp";
            } else {
                message = "Something went wrong. Try again later.";
                messageType = MessageType.ERROR;
                dispatchName = "register.jsp";
            }
        } else {
            message = "User already exists.";
            messageType = MessageType.ERROR;
            dispatchName = "register.jsp";
        }

        req.setAttribute("message", message);
        req.setAttribute("message-type", messageType);
        req.getRequestDispatcher(dispatchName).forward(req, resp);
    }
}
