package com.edubridge.datatypes;
public class InstanceVariable
{
 int id = 101;
static int i=500;
static String name="ayush";

void disp(){
	String Company_Name="CS" ;//local variable// 
	System.out .println(Company_Name);
}

 void show(){
	 System.out.println(id);
 } 
public static void main(String[] args) {
	InstanceVariable v1=new InstanceVariable();
			v1.disp();
			v1.show();
			System.out.println(InstanceVariable.i);
			System.out.println(InstanceVariable.name);
}
}