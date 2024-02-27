package com.edubridge.datatypes;

import java.util.Scanner;

public class ArrayUserSum {

	public static void main(String[] args) {
		 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		int elements=s.nextInt();
		
		int sum=0;
	
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			sum=arr[i]+sum;
			
		}
		System.out.println("your sum is:"+sum);

	}

}
