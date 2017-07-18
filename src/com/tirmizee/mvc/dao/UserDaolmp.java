package com.tirmizee.mvc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang.StringUtils;

import com.tirmizee.db.config.DBUtil;
import com.tirmizee.mvc.model.User;
import com.tirmizee.mvc.model.UserRole;

/**
 * @author tirmizee
 *
 */

public class UserDaolmp extends DBUtil implements UserDao {

	public UserDaolmp() {

	}

	@Override
	public boolean isValid(User loginDto) {
		
		StringBuilder sql = new StringBuilder("SELECT * FROM user ")
					.append(" where USER_USERNAME = ? ")
					.append(" and USER_PASSWORD = ? ");
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql.toString())){
		    preparedStatement.setString(1, StringUtils.trimToEmpty(loginDto.getUserName()));
		    preparedStatement.setString(2, StringUtils.trimToEmpty(loginDto.getPassWord()));
		    return preparedStatement.executeQuery().next();    
		} catch (SQLException e) {
		    e.printStackTrace();
		} 
		return false;
		
	}

	@Override
	public UserRole findUSerByUserAndPass(String username,String password) {
		UserRole userRole = null;
		StringBuilder sql = new StringBuilder("SELECT ")
				.append("USER_USERNAME,")
				.append("USER_PASSWORD,")
				.append("USER_FIRSTNAME,")
				.append("USER_LASTNAME,")
				.append("ROLE_NAME,")
				.append("ROLE_DESCRIPTION ")
				.append(" from user join role ")
				.append(" on user.ROLE_ID_FK = role.ROLE_ID")
				.append(" where USER_USERNAME = ? ")
				.append(" and USER_PASSWORD = ? ;");
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql.toString())){
	        preparedStatement.setString(1, StringUtils.trimToEmpty(username));
	        preparedStatement.setString(2, StringUtils.trimToEmpty(password));
	        ResultSet rs = preparedStatement.executeQuery();
	        while (rs.next()) {
	        	userRole = new UserRole();
	        	userRole.setFirstName(rs.getString("USER_FIRSTNAME"));
	        	userRole.setLastName(rs.getString("USER_LASTNAME"));
	        	userRole.setUserName(rs.getString("USER_USERNAME"));
	        	userRole.setPassWord(rs.getString("USER_PASSWORD"));
	        	userRole.setRoleName(rs.getString("ROLE_NAME"));
	        	userRole.setRoleDescription(rs.getString("ROLE_DESCRIPTION"));
			}
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 
		return userRole;
	}

}


