package com.flp.ems.service;

import java.util.Map;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.dao.IemployeeDao;
import com.flp.ems.domain.*;

public class EmployeeServiceImpl implements IEmployeeService {
      EmployeeDaoImplForList empDao;
     
      {
    	  empDao=new EmployeeDaoImplForList();
      }
	Employee employee = new Employee();
	Department department = new Department();
	Project project = new Project();
	Role role = new Role();
	
	public void AddEmployee(Map in){
		
	employee.setName((String) in.get("Name"));
	employee.setEmail_id((String) in.get("Email_id"));
	employee.setPhone_no((String) in.get("Phone_no"));
	employee.setAddress((String) in.get("Address"));
	employee.setDate_of_birth((String) in.get("Date_of_birth"));
	employee.setDate_of_Joining((String) in.get("Date_of_Joining"));
	
	department.setDepartment_id((String) in.get("Department_id"));
	department.setDescription((String) in.get("Description"));
	department.setDepartment_Name((String) in.get("Department_Name"));
	
	project.setProject_Name((String) in.get("Project_Name"));
	project.setProject_id((String) in.get("Project_Name"));
	project.setDescription((String) in.get("Description"));
	
	role.setRole_id((String) in.get("Role_id"));
	role.setRole_Name((String) in.get("Role_Name"));
	role.setDescription((String) in.get("Description"));
	empDao.addEmployee(employee);
  
}
	
	public void ModifyEmployee(int a){
		
	}
	public void RemoveEmployee(int y){
		
	}
	public void SearchEmployee(){
		
	}
	public void getAllEmployee(){
		
	}

	@Override
	public void SearchEmployee(int z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee(int x) {
		// TODO Auto-generated method stub
		
	}
}