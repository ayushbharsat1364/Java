package com.edubridge.datatypes;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
	
		System.out.println("Employee Management System");
		int choice=0;
		
		do {
			System.out.println("1.Employee has to enter name");
			System.out.println("2.Employee has to enter designation");
			System.out.println("3.Employee has to enter specialisation");
			System.out.println("4.Exit");
			Scanner s=new Scanner(System.in);
			choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter name:");
				String name=s.next();
				System.out.println("Employee name:"+name);
				break;
			case 2:
				System.out.println("Enter designation:");
				String designation=s.next();
				System.out.println("Employee designation:"+designation);
				break;
			case 3:
				System.out.println("Enter specialisation:");
				String specialisation=s.next();
				System.out.println("Employee specialisation:"+specialisation);
				break;
			case 4:
				System.out.println("Exit");
				
				break;
				default:
					System.out.println("Wrong input!");
					break;
			}
		}while(choice !=4);
	
	}

}
