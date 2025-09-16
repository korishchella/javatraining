package com.training.controller;

import com.training.dao.UserDao;
import com.training.vo.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SignUpServlet extends HttpServlet {

    // post, get, put, delete, patch

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        User user = new User(userName,password);

        UserDao userDao = new UserDao();
       req.setAttribute("name", userName);
        try {
            int inserted = userDao.saveUser(user);
            if (inserted > 0) {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
                requestDispatcher.forward(req, resp);
            } /*else {
                // Insert failed, forward to error page
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("error.jsp");
                requestDispatcher.forward(req, resp);
            }*/

        } catch (Exception e) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("error.jsp");
            requestDispatcher.forward(req,resp);
        }

    }
}
