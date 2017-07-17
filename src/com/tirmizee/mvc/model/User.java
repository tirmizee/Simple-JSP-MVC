package com.tirmizee.mvc.model;

import java.io.Serializable;
/**
 * @author tirmizee
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 6458624118329647888L;
	
	private Long userID;
	private String userName;
	private String passWord;
	private String firstName;
	private String lastName;
	
	public User() {
	}
	
	public User(Long userID, String userName, String passWord, String firstName, String lastName) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.passWord = passWord;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
