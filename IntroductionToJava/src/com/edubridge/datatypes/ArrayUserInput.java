package com.edubridge.datatypes;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter size of array");
		int size=s.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter elements of array");
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=s.nextInt();
		}
			System.out.println("array elements:");
			for (int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
		}

	}

}
