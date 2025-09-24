package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class StudentServlet extends HttpServlet {

    private Connection conn;

    public void init() throws ServletException {
        try {
            /*Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "yourpassword"
            );*/
            Class.forName("org.postgresql.Driver");
            //String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=public";
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/studentdb?currentSchema=public", "admin", "admin"
            );

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String id = request.getParameter("id");

        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE id=?");
            ps.setInt(1, Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();

            out.println("<html><body>");
            if (rs.next()) {
                out.println("<h2>Student Details</h2>");
                out.println("ID: " + rs.getInt("id") + "<br>");
                out.println("Name: " + rs.getString("name") + "<br>");
                out.println("Email: " + rs.getString("email") + "<br>");
            } else {
                out.println("<h3>No student found with ID: " + id + "</h3>");
            }
            out.println("</body></html>");
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }

    public void destroy() {
        try {
            if (conn != null) conn.close();
        } catch (Exception e) { }
    }
}
