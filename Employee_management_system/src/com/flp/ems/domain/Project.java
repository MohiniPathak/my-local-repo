package com.flp.ems.domain;

public class Project {

	private String Project_id;
	private String Project_Name;
	private String Description;
	private String Department_id;
	
	public String getProject_id() {
		return Project_id;
	}
	public void setProject_id(String project_id) {
		Project_id = project_id;
	}
	public String getProject_Name() {
		return Project_Name;
	}
	public void setProject_Name(String name) {
		Project_Name = Project_Name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getDepartment_id() {
		return Department_id;
	}
	public void setDepartment_id(String department_id) {
		Department_id = department_id;
	}
	@Override
	public String toString() {
		return "Project [Project_id=" + Project_id + ", Project_Name=" + Project_Name + ", Description=" + Description
				+ ", Department_id=" + Department_id + "]";
	}
	
	

}
