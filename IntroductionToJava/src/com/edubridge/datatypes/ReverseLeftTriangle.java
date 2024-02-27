package com.edubridge.datatypes;

import java.util.Scanner;

public class ReverseLeftTriangle {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			
			System.out.println("Enter rows:");
			int row=s.nextInt();
			
			for(int i=row;i>=1;i--) {
				for(int j=row;j>=i;j--) {
					System.out.print(" ");
				}
			
				for(int k=1;k<=i;k++) {
					System.out.print(" -*");
				}
				System.out.println();
		}

	}

}
