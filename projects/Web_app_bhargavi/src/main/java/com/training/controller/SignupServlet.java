package com.training.controller;

import com.training.dao.UserDao;
import com.training.vo.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/singup")
public class SignupServlet extends HttpServlet {

    public SignupServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        System.out.print("========SignupServlet=======");
       String userName = String.valueOf(req.getAttribute("userName"));
       String passWord = String.valueOf(req.getAttribute("passWord"));
       User user = new User(userName,passWord);
        UserDao userDao = new UserDao();
        try {
            int result = userDao.saveUser(user);
            if (result>0){
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
                requestDispatcher.forward(req,resp);
            }
        }catch (Exception e){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("error.jsp");
            requestDispatcher.forward(req,resp);
        }

    }
}
