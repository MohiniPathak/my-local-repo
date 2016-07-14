package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {
	
	static UserInteraction UI = new UserInteraction();
	
	static Scanner UserInput = new Scanner(System.in);

	public static void main(String[] args) {
	
		int choice;
		
		
		
		do
		{
		
		System.out.println("Please enter your choice:\n 1. AddEmployee \n 2. ModifyEmployee \n 3. RemoveEmployee \n "
				            + "4. SearchEmployee \n 5. getAllEmployee");
		
		choice = UserInput.nextInt();
		
		menuSelection(choice);
		
		}while(choice>0 && choice<=5);
	}
		public static void menuSelection(int choice){
		
		switch(choice)
		{
		case 1: UI.AddEmployee();
				break;
		case 2: UI.ModifyEmployee();
				break;
		case 3: UI.RemoveEmployee();
				break;
		case 4: UI.SearchEmployee();
				break;
		case 5: UI.getAllEmployee();
				break;
		default:System.out.println("You entered invalid choice!");	
				break;
				
		
		}
		
		
	} 

}
