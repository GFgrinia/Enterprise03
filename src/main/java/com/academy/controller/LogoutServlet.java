package com.academy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;


public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Clear session user
        HttpSession session = request.getSession();
        session.invalidate();

        // Display main site page after Logging out
        response.sendRedirect("/site_name");
    }
}
