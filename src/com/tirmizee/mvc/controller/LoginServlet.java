package com.tirmizee.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import com.tirmizee.mvc.dao.UserDao;
import com.tirmizee.mvc.dao.UserDaolmp;
import com.tirmizee.mvc.model.User;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(LoginServlet.class);
	private UserDao userService;   
       
    public LoginServlet() {
        super();
        userService = new UserDaolmp(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOGGER.debug("Login doGet()");
		response.sendRedirect(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOGGER.debug("Login doPost()");
		
		User loginDto = new User();
		loginDto.setUserName(request.getParameter("username"));
		loginDto.setPassWord(request.getParameter("password"));
		
		boolean isUserValid = userService.isValid(loginDto);

		// return json data
		response.setContentType("application/json");
		response.getWriter().append("{\"status\": \"" + isUserValid + "\"}" );
		
	}
}