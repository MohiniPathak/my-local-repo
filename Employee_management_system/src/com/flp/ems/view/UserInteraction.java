
package com.flp.ems.view;

import java.util.*;

import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.service.IEmployeeService;
import com.flp.ems.util.Validate;

public class UserInteraction {
	
	/*private String Name; 
	private String Email_id; 
	private String Address; 
	private String Date_of_birth;
	private String Date_of_Joining;
	private String Department_id;
	private String Project_id; 
	private String Roles_id;
	private String Phone_no;
	private String Kin_Id;
	*/
	IEmployeeService empService;
	  UserInteraction()
	{
	   empService=new EmployeeServiceImpl();
	}
	static Scanner UserInput = new Scanner(System.in);
	
	 HashMap<String, String> in = new HashMap<String, String>();
	 
	 Validate vd = new Validate();
	 
		public void AddEmployee(){
			
			
			
			System.out.println("Enter name: ");
	
		     in.put("Name",UserInput.next());
			
			System.out.println("Enter Kin_Id: ");
			String Kin_Id = UserInput.next();
			in.put("Kin_Id",Kin_Id);
			
			System.out.println("Enter Email_id: ");
			String Email_id = UserInput.next();
			in.put("Email_id",Email_id);
			
			System.out.println("Enter Phone_no: ");
			String Phone_no = UserInput.next();
			in.put("Phone_no",Phone_no);
			
			System.out.println("Enter Address: ");
			String Address = UserInput.next();
			in.put("Address",Address);
			
			System.out.println("Enter Date_of_birth: ");
			String Date_of_birth = UserInput.next();
			boolean db = vd.valid_Date(Date_of_birth);
			
			
			System.out.println("Enter Date_of_Joining: ");
			String Date_of_joining = UserInput.next();
			boolean dj = vd.valid_Date(Date_of_joining);
			
			if(db&&dj){
				
				System.out.println("Date is validated");
				in.put("Date_of_birth", Date_of_birth);
				in.put("Date_of_Joining",Date_of_joining);
				}
			else {System.out.println("Date is invalid");}
			
		
			System.out.println("Enter Department id: ");
			String Department_id = UserInput.next();
			in.put("Department_id",Department_id);
			
			System.out.println("Enter Project id: ");
			String Project_id = UserInput.next();
			in.put("Project_id",Project_id);
			
			System.out.println("Enter Role id: ");
			String Role_id = UserInput.next();
			in.put("Role_id",Role_id);
			
			empService.AddEmployee(in);
		}

		public void ModifyEmployee(){
			
		}
		public void RemoveEmployee(){
			
		}
		public void SearchEmployee(){
			
		}
		public void getAllEmployee(){
			
		}
	}


