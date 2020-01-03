package com.deloitte.designation.main;
import java.util.*;

import com.deloitte.designation.model.PersonalDetails;
import com.deloitte.designation.personalservices.PersonalDetailsImplementation;




public class PersonalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr =new Scanner(System.in);
		ArrayList<PersonalDetails> perlist = new ArrayList<PersonalDetails>();
		while(true) {
		System.out.println("Please enter 1 to add new student"
		+" option 2 to display a Student"
		+" option 3 to login"		
		+" option 4 exit");
		PersonalDetailsImplementation perdetimpl = new PersonalDetailsImplementation();
		
		String option =scr.next();

		switch(option) {
		case "1":
			System.out.println("Enter userid of student");
			String userid = scr.next();
			System.out.println("Enter email-id of student");
			String emailid = scr.next();
			System.out.println("Enter name of student");
			String name = scr.next();
			System.out.println("Enter Fathername of student");
			String fathername = scr.next();
			System.out.println("Enter Mothername of student");
			String mothername = scr.next();
			System.out.println("Enter Address of student");
			String address = scr.next();
			System.out.println("Enter Contact no of student");
			String contactno = scr.next();
			System.out.println("Enter gender of student");
			String gender = scr.next();
			System.out.println("Enter password of student");
			String password = scr.next();
			perdetimpl.addPerDetails(userid, emailid, name, fathername, mothername, address, contactno, gender, password);
			break;
			
			
		case "2":
			perlist=perdetimpl.displayPerDet();
			for(PersonalDetails pdobj:perlist) {
				System.out.println(pdobj);
			}
			break;
			
		case "3":
			System.out.println("Enter userid");
			String userId = scr. next();
			System.out.println("Enter password");
			String password1 = scr. next();
			perdetimpl.loginDet(userId, password1);
			
			break;
			
		case "4":
			System.exit(0);
			}
		}
		
			
		}
		

	}


