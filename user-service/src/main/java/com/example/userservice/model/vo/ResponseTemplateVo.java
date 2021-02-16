package com.example.userservice.model.vo;

import com.example.userservice.model.User;

public class ResponseTemplateVo {

	private User user;
	private DepartmentVo department;
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the department
	 */
	public DepartmentVo getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(DepartmentVo department) {
		this.department = department;
	}
}
