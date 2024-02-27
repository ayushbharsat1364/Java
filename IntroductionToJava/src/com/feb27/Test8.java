package com.feb27;
class Student{
	String name;
	int age;
	void disp(String n,int a) {
		name=n;
		age=a;
		System.out.println("Student name:"+name+"\nStudent age:"+age);
	}
}

public class Test8 {

	public static void main(String[] args) {
		 Student s1=new Student();
		 s1.disp("ayush",21);
		 s1.disp("gaurav",21);
		 s1.disp("chetan",5);
	}

}
