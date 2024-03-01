package com.feb29;

class Employee{
	void show(String name) {
		System.out.println("Employee name:"+name);
	}
}
class Company{
	void show(String name) {
		System.out.println("Company name:"+name);
	}
}

public class Overiding {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Company c1=new Company();
		
		e1.show("ayush");
		c1.show("google ");
	}

}
