<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List, com.example.userapp.FetchUsersServlet.User" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Users</title>
</head>
<body>
    <h2>Registered Users</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Password</th>
        </tr>
        <%
            List<User> users = (List<User>) request.getAttribute("users");
            if (users != null) {
                for (User u : users) {
        %>
                    <tr>
                        <td><%= u.id %></td>
                        <td><%= u.username %></td>
                        <td><%= u.password %></td>
                    </tr>
        <%
                }
            }
        %>
    </table>
</body>
</html>
