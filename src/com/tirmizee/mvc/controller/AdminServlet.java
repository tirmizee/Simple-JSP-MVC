package com.tirmizee.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.tirmizee.mvc.model.UserRole;

@WebServlet("/Admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(AdminServlet.class);
       
    public AdminServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOGGER.debug("Admin doGet()");
		
		HttpSession httpSession = request.getSession(Boolean.TRUE);
		UserRole user = (UserRole) httpSession.getAttribute("user");
		
		if (user != null && "admin".equals(user.getRoleName())) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/admin/admin.jsp");
			dispatcher.forward(request, response);
			return;
		} 
		LOGGER.info(request.getContextPath());
		response.sendRedirect(request.getContextPath());
	}

}
