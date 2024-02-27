package com.edubridge.datatypes;

import java.util.Scanner;

public class Employee1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int id=s.nextInt();
		System.out.println("Enter Employee name:");
		String name=s.next();
		System.out.println("Enter Employee address:");
		String address=s.next();
		System.out.println("Enter Employee designation:");
		String  designation=s.next();
		System.out.println("Enter Employee salary:");
		int salary=s.nextInt();
		System.out.println("Employee id:"+id+"\nEmployee name:"+name+"\nEmployee address:"+address+"\nEmployee designation:"+designation+"\nEmployee salary:"+salary);
}
	
}
