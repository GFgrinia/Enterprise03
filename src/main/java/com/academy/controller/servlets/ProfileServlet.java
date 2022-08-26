package com.academy.controller.servlets;

import com.academy.controller.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("user");


        // Find profile info according to current username
        UserService userService = new UserService();
        request.setAttribute("fullname", userService.getFullName(username));
        request.setAttribute("email", userService.getEmail(username));
        request.setAttribute("reg-date", userService.getRegDate(username));


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("profile.jsp");
        requestDispatcher.forward(request, response);


    }

}
