package com.academy.controller.servlets;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;


public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // TODO find user and password in UserDB

        // Hardcode for single user
        if ("username".equals(username) && "password".equals(password)) {
            request.setAttribute("name", username);


            // Add Attribute to whole session
            HttpSession session = request.getSession();
            session.setAttribute("user", username);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("hello.jsp");
            requestDispatcher.forward(request, response);

        } else {

            // Processing wrong credentials
            request.setAttribute("message", "Incorrect password or username!!!");
            RequestDispatcher req = request.getRequestDispatcher("loginPage.jsp");
            req.forward(request, response);
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("loginPage.jsp");
        requestDispatcher.forward(request, response);


    }

}
