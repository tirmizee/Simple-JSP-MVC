package com.tirmizee.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.tirmizee.mvc.dao.UserDao;
import com.tirmizee.mvc.dao.UserDaolmp;
import com.tirmizee.mvc.model.UserRole;

@WebServlet("/Authen")
public class AuthenServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	static final Logger LOGGER = Logger.getLogger(AuthenServlet.class);
	private UserDao userService; 

	public AuthenServlet() {
		super();
		userService = new UserDaolmp();
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOGGER.debug("Authen doPost()");

		// map request param to object
		String username = request.getParameter("username"),
			   password = request.getParameter("password");
		UserRole userRole = userService.findUSerByUserAndPass(username, password);
		if (userRole != null) { 
			// set session
			HttpSession httpSession = request.getSession(Boolean.TRUE);
			httpSession.setAttribute("user", userRole);
			// re direct to role page
			if ("admin".equals(userRole.getRoleName())) {
				response.sendRedirect(request.getContextPath() + "/Admin");
			}else{
				response.sendRedirect(request.getContextPath() + "/User");
			}
		}else{
			LOGGER.debug("Authen doPost() invalid");
			response.sendRedirect(request.getContextPath());
		}
	}
}
