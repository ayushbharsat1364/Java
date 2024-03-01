package com.feb29;

 class Test11 {
	void add(int a,int b){
		System.out.println(a+b);
	}
	void add(int a,int b,int c){
		System.out.println(a+b);
	}
	void add(String a,String b){
		System.out.println(a+b);
	}
 
 }
public class Maths {
	
	public static void main(String[] args) {
		
		Test11 m1=new Test11();
		
		m1.add(10, 20);
		m1.add("hello","hi");
		m1.add(10, 20, 30);
	}
}
		
		
			
		
		
	


