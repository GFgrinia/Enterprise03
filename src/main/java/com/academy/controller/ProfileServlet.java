package com.academy.controller;

import com.academy.model.entity.User;
import com.academy.service.UserService;

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
        User user = (User) session.getAttribute("userEntity");


        if (user != null) {
            UserService userService = new UserService();
            request.setAttribute("fullname", userService.getFullName(user));
            request.setAttribute("email", userService.getEmail(user));
            request.setAttribute("reg_date", userService.getRegDate(user));
            request.setAttribute("page_title", "Profile");

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("profile.jsp");
            requestDispatcher.forward(request, response);

        } else {
            response.sendRedirect("/site_name/login");
        }

    }

}
