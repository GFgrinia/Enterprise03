package com.academy.controller;

import com.academy.model.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("userEntity");

        if (user != null) {
            session.setAttribute("name", user.getUsername());
            request.setAttribute("page_title", "Hello!!!");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("hello.jsp");
            requestDispatcher.forward(request, response);

        } else {
            response.sendRedirect("/site_name/login");
        }

    }
}
