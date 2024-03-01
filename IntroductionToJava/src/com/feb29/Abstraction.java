package com.feb29;
abstract class bag{
	String type="fastrack";
	abstract void show();
		
	
	void color(String c) {
		System.out.println("bag color:"+c);
	}
}
class bagInfo extends bag{

	@Override
	void show() {

		// TODO Auto-generated method stub
		System.out.println("this is a popular brand");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		bagInfo b1=new bagInfo();
		System.out.println(b1.type);
		b1.color("blue");
		b1.show();
       
	}

}
