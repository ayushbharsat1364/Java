package com.edubridge.datatypes;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number to print table");
		int number=s.nextInt();
		
		int i=1;
		
		while(i<=10) {
			System.out.println(number+"x"+i+"="+number*i);
			i++;
		}

	}

}
