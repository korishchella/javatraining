package com.traning.dao;

import com.traning.vo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
        public Connection getDbConnection(){
            try {

                Class.forName("org.postgresql.Driver");
                String url = "jdbc:postgresql://localhost:5432/training";
                String userName = "postgres";
                String password = "9010991007";
                    return DriverManager.getConnection(url,userName,password);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public int saveUser(User user){

            Connection connection = getDbConnection();
            int result =0;
            try {
                PreparedStatement ps = connection.prepareStatement("insert into users(name,password)values(?,?)");
                ps.setString(1,user.getName());
                ps.setString(2,user.getPassword());
                return ps.executeUpdate();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        public List<User> getAllUsers(){
            Connection connection = getDbConnection();

            try {
                PreparedStatement ps = connection.prepareStatement("select * from users");
                ResultSet rs = ps.executeQuery();
                List<User> users = new ArrayList<>();
                while(rs.next()){
                    User user = new User();
                    user.setName(rs.getString(2));
                    user.setPassword(rs.getString(3));
                    users.add(user);

                }
                return users;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
}
