package com.example.userapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/fetchUsers")
public class FetchUsersServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public static class User {
        public int id;
        public String username;
        public String password;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        List<User> users = new ArrayList<>();

        try (Connection conn = DBUtil.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, username, password FROM users");

            while (rs.next()) {
                User u = new User();
                u.id = rs.getInt("id");
                u.username = rs.getString("username");
                u.password = rs.getString("password");
                users.add(u);
            }

            request.setAttribute("users", users);
            request.getRequestDispatcher("fetchUsers.jsp").forward(request, response);
        } catch (Exception e) {
            throw new ServletException("DB fetch failed", e);
        }
    }
}
