package com.tirmizee.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tirmizee.mvc.model.UserRole;

@WebServlet("/User")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
    public UserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession httpSession = request.getSession(Boolean.TRUE);
		UserRole user = (UserRole) httpSession.getAttribute("user");
		if ( user != null && "user".equals(user.getRoleName())){
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/user/user.jsp");
			dispatcher.forward(request, response);
			return;
		} 
		response.sendRedirect(request.getContextPath());
	}

	

}
