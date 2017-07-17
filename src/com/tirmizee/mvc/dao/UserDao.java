package com.tirmizee.mvc.dao;

import com.tirmizee.mvc.model.User;
import com.tirmizee.mvc.model.UserRole;
/**
 * @author tirmizee
 *
 */
public interface UserDao {
	
	public boolean isValid(User user);
	
	public UserRole findUSerByUserAndPass(String username,String password);
		
}
