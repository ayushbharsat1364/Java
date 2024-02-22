package com.edubridge.datatypes;
import java.util.Scanner;
public class StudentClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter your id:");
        int id = s.nextInt();
        System.out.println("Enter your name:");
        String name = s.next();
        System.out.println("Enter your marks1:");
        int marks1=s.nextInt();
        System.out.println("Enter your marks2:");
        int marks2=s.nextInt();
        System.out.println("Enter your marks3:");
        int marks3=s.nextInt();
        System.out.println("Total marks:"+(marks1+marks2+marks3));
        System.out.println(" Average: "+((marks1+marks2+marks3)/3));
        int total = (marks1+marks2+marks3);
        double avg = (total/3);
        if(avg>=90) {
        System.out.println("A grade");
        }
        else if(avg>=59) {
        System.out.println("B grade");
        }
        else if(avg>=35) {
        System.out.println("C grade");
        }
        else {
        System.out.println("fail");
        }
	}

}
