package com.academy.controller;

import com.academy.manager.DataBaseManager;
import com.academy.model.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;


public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User userEntity = DataBaseManager.selectUser(username);


        if (userEntity != null && userEntity.getPassword().equals(password)) {
            // Add Attribute to whole session
            HttpSession session = request.getSession();
            session.setAttribute("userEntity", userEntity);

            // If user defined we redirect him to hello page
            response.sendRedirect("/site_name/hello");

        } else {
            // Processing wrong credentials
            request.setAttribute("message", "Incorrect password or username!!!");
            request.setAttribute("page_title", "Log-in");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("loginPage.jsp");
            requestDispatcher.forward(request, response);
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("page_title", "Log-in");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("loginPage.jsp");
        requestDispatcher.forward(request, response);


    }

}
