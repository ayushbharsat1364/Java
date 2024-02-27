package com.edubridge.datatypes;

import java.util.Scanner;

public class MenuDrivenApp {

	public static void main(String[] args) {
		System.out.println("  Student management system");
		int choice=0;
	
	do {
		System.out.println("1.student info:");
		System.out.println("2.student course rating:");
		System.out.println("3.student eligibility:");
		System.out.println("4.Exit");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter choice:");
		choice=s.nextInt();
		switch(choice) {

						case 1:
							System.out.println("student name:");
							String name=s.next();
							System.out.println("student age");
							int age=s.nextInt();
							System.out.println("student address:");
							String address=s.next();
							System.out.println("student name:"+name+"\nstudent age:"+age+"\nstudent address:"+address);
						break;
						case 2:
							System.out.println("Enter your course rating:");
							double rating=s.nextDouble();
							if (rating>=4) {
								System.out.println("Good");
								}
	else {
		System.out.println("Need to Improve");
	}
	break;
case 3:
	System.out.println("Enter your score:");
	int score=s.nextInt();
	if(score>=50) {
	System.out.println("Eligible");
	}
	else {
		System.out.println("not eligible");
	}
	
	break;                                    
case 4:
	System.out.println("Exit!");
	break;
default :
	System.out.println("wrong input");

}
	}while(choice != 4);
	

	}
}