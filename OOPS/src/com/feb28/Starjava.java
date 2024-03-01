package com.feb28;

import java.util.Scanner;

public class Starjava {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		for(int i=num;i>=1;i--) {
			for(int j=num;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
