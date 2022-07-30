package emailApp;

import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity;
	private String alternativeEmail;
	
	//first create the constructor to receive the first and last name
	public email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATE: " + this.firstName + " " + this.lastName);
		
		//Call a method asking  for the department
		this.department = setDepartment();
		System.out.println("Department "+ this.department);
	}
	
	
	
	//ask for department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code:");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if(depChoice == 1) {
			return "sales";
		}else if (depChoice == 2) {
			return "dev";
		}else if(depChoice == 3) {
			return "accounting";
		}else {
			return " ";
		}
	}
	
	
	
	//Then generate Random password
	
	
	//set the mailBoxCapacity
	
	//set the alternative email
	
	//after change the password

}
