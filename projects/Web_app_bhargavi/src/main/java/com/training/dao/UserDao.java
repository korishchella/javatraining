package com.training.dao;

import com.training.vo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    public Connection getConnection() {
        try {
            System.out.printf("========getConnection=======");
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=public";
            String userName = "admin";
            String passWord = "admin";
            return DriverManager.getConnection(url, userName, passWord);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int saveUser(User user) throws SQLException {
        Connection connection = getConnection();
        //int result = 0;
        try {
            System.out.printf("========saveUser=======");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into user(name,password) values(?,?)");
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassWord());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }

    }

}
