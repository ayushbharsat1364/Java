package com.edubridge.decisionmaking;
import java.util.Scanner;
public class CascadedIfElseStatement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age1=s.nextInt();
		int age2=s.nextInt();
		int age3=s.nextInt();
		if (age1>=age2)
			System.out.println("ayush is elder");
		else if (age2>=age3)
		{
			System.out.println("chetan is elder");
		}
		else 
			System.out.println("gaurav is elder");
		
	}

}
