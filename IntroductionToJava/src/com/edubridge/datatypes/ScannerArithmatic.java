package com.edubridge.datatypes;
import java.util.Scanner;
public class ScannerArithmatic {
public static void main (String[] args) {

Scanner s= new Scanner (System.in);
System.out.println("enter the value of a:");
System.out.println("enter the value of b:");
int a =s.nextInt();
int b =s.nextInt();

System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);
}
}