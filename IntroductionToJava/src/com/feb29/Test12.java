package com.feb29;
class Vehicle{
	void disp(int speed) {
		System.out.println("Speed is:"+speed);
	}
}
class car extends Vehicle{
	void disp(int speed) {
		System.out.println(" car Speed is:"+speed);
	}
	
}
class bus extends Vehicle{
	void disp(int speed) {
		System.out.println(" bus Speed is:"+speed);
	}
}
class bycycle extends Vehicle{
	void disp(int speed) {
		System.out.println("bycycle Speed is:"+speed);
	}
}
public class Test12 {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		v1.disp(70);
		
		
		Vehicle c1,b1,a1;
		
		c1=new car();
		b1=new bus();
		a1=new bycycle();
		
		c1.disp(40);
		b1.disp(50);
		a1.disp(60);
	}

}
