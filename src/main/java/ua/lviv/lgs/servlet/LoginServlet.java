package ua.lviv.lgs.servlet;

import ua.lviv.lgs.domain.User;
import ua.lviv.lgs.service.UserService;
import ua.lviv.lgs.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserService userService = UserServiceImpl.getUserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("login");
        String password = request.getParameter("password");

        User user = userService.getUserByEmail(email);

        if (user == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }else if (user.getPassword().equals(password)){
            request.setAttribute("email", email);
            request.getRequestDispatcher("cabinet.jsp").forward(request,response);

        }else request.getRequestDispatcher("login.jsp").forward(request,response);


    }
}
