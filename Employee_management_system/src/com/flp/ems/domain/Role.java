package com.flp.ems.domain;

public class Role {

	private String Role_id;
	private String Role_Name;
	private String Description;
	public String getRole_id() {
		return Role_id;
	}
	public void setRole_id(String role_id) {
		Role_id = role_id;
	}
	public String getRole_Name() {
		return Role_Name;
	}
	public void setRole_Name(String name) {
		Role_Name = Role_Name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "Role [Role_id=" + Role_id + ", Role_Name=" + Role_Name + ", Description=" + Description + "]";
	}
	
	

}
