package org.example.login.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.login.dao.LoginDAO;
import org.example.login.enums.MessageType;

import java.io.IOException;

@WebServlet("/loginController")
public class LoginController extends HttpServlet {
    private LoginDAO dao;

    @Override
    public void init() throws ServletException {
        dao = new LoginDAO();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String message;
        MessageType messageType;
        String dispatchName;

        if (userName.isEmpty() || password.isEmpty()) {
            message = "Empty User/Password";
            messageType = MessageType.ERROR;
            dispatchName = "login.jsp";
        }
        else if (!dao.checkUserExistence(userName, password)) {
            message = "User/Password incorrect.";
            messageType = MessageType.ERROR;
            dispatchName = "login.jsp";
        }
        else {
            HttpSession session = req.getSession();
            session.setAttribute("userName", userName);
            resp.sendRedirect(req.getServletContext().getContextPath() + "/restricted/welcome.jsp");
            return;
        }

        req.setAttribute("message", message);
        req.setAttribute("message-type", messageType);
        req.getRequestDispatcher(dispatchName).forward(req, resp);
    }
}
