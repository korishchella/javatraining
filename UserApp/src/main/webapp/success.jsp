<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <h2>User Registered Successfully!</h2>
    <p>Welcome, <b>${username}</b></p>
    <form action="fetchUsers" method="get">
        <button type="submit">View All Users</button>
    </form>
</body>
</html>
