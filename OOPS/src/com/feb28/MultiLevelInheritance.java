package com.feb28;
class bike{
	double speed(double s) {
		return s;
	}
	
}
class bike1 extends bike{
	String colour(String c) {
		return c;
	}
}
class bike2 extends bike1{
	int price(int p) {
		return p;
	}
}
class bike3 extends bike2{
	String exshowroom(String ex) {
		return ex;
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike3 v1=new bike3();
		
		System.out.println("Bike Top Speed:"+v1.speed(18.99)+"\nBike colour:"+v1.colour("black")+"\nBike price:"+v1.price(1001001)+"\nEx-showroom:"+v1.exshowroom("nerul"));

	}

}
