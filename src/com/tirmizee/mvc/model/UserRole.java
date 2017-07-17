package com.tirmizee.mvc.model;

import java.io.Serializable;

/**
 * @author tirmizee
 *
 */
public class UserRole extends User implements Serializable {

	private static final long serialVersionUID = 6246364935182054786L;
	private Long role_Id;
	private String roleName;
	private String roleDescription;
	
	public UserRole() {
	}
	
	public UserRole(Long role_Id, String roleName, String roleDescription) {
		this.role_Id = role_Id;
		this.roleName = roleName;
		this.roleDescription = roleDescription;
	}
	
	public Long getRole_Id() {
		return role_Id;
	}
	public void setRole_Id(Long role_Id) {
		this.role_Id = role_Id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
	
}
