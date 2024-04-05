package org.example.login.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = {"/restricted/*"})
public class RestrictedFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        HttpSession session = req.getSession();
        String sessionVariable = req.getServletContext().getInitParameter("session.variable");

        if(session.getAttribute(sessionVariable) == null) {
            res.sendRedirect(req.getServletContext().getContextPath() + "/login.jsp");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
