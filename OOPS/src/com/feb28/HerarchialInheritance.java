package com.feb28;
class Students{
	String name="Chetan";
	int age=20;
	String Qualification="java fullstack";
	}
class Course extends Students{
	String planname="aws";
	int fees =10000;
	
}
class Placement{
	String companyname="infosys";
	int annualpackage=1000000;
}
public class HerarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course p1=new Course();
		System.out.println("name:"+p1.name+"\nage"+p1.age+"\nqualification:"+p1.Qualification+"\nplan name:"+p1.planname+"\nfees:"+p1.fees);

	}

}
