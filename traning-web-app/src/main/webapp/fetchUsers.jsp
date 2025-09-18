<%@ page import="java.util.*" %>
<%@ page import="com.training.vo.User" %>
<html>
<body>
<table border="1">
<tr>
<th>UserName</th>
<th>Password</th>
</tr>
<%
    List<User> users = (List<User>) request.getAttribute("users");
    for(User user: users){
%>
<tr>
  <td><%= user.getName()%></td>
  <td><%= user.getPassword()%></td>
</tr>
<%
    }
%>
</table>
</body>
</html>