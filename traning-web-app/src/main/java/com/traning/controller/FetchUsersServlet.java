package com.traning.controller;

import com.traning.dao.UserDao;
import com.traning.vo.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class FetchUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao dao = new UserDao();
        List<User> users = dao.getAllUsers();
        req.setAttribute("users",users);

        RequestDispatcher rd = req.getRequestDispatcher("fetchUsers.jsp");
        rd.forward(req,resp);
    }
}
