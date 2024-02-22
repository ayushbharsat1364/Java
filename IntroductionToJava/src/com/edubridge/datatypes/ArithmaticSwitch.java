package com.edubridge.datatypes;

import java.util.Scanner;

public class ArithmaticSwitch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number a:");
		int a=s.nextInt();
		System.out.println("Enter number b:");
		int b=s.nextInt();
		System.out.println("Enter your choice:");
		int choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("addition is:"+(a+b));
				break;
			case 2:
				System.out.println("substraction:"+(a-b));
				break;
			case 3:
				System.out.println("multiplication is:"+(a*b));
				break;
			case 4:
				System.out.println("division:"+(a/b));
				break;
				default:
					System.out.println("Wrong choice");
			}

	}



	}


