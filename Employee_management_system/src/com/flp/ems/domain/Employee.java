package com.flp.ems.domain;


public class Employee {

	private String Name; 
	private String Email_id; 
	private String Address; 
	private String Date_of_birth;
	private String Date_of_Joining;
	private String Department_id;
	private String Project_id; 
	private String Roles_id;
	private String Phone_no;
	private String Kin_Id;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDate_of_birth() {
		return Date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		Date_of_birth = date_of_birth;
	}
	public String getDate_of_Joining() {
		return Date_of_Joining;
	}
	public void setDate_of_Joining(String date_of_Joining) {
		Date_of_Joining = date_of_Joining;
	}
	public String getDepartment_id() {
		return Department_id;
	}
	public void setDepartment_id(String department_id) {
		Department_id = department_id;
	}
	public String getProject_id() {
		return Project_id;
	}
	public void setProject_id(String project_id) {
		Project_id = project_id;
	}
	public String getRoles_id() {
		return Roles_id;
	}
	public void setRoles_id(String roles_id) {
		Roles_id = roles_id;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}
	public String getKin_Id() {
		return Kin_Id;
	}
	public void setKin_Id(String kin_Id) {
		Kin_Id = kin_Id;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Email_id=" + Email_id + ", Address=" + Address + ", Date_of_birth="
				+ Date_of_birth + ", Date_of_Joining=" + Date_of_Joining + ", Department_id=" + Department_id
				+ ", Project_id=" + Project_id + ", Roles_id=" + Roles_id + ", Phone_no=" + Phone_no + ", Kin_Id="
				+ Kin_Id + "]";
	}
	

	

}
