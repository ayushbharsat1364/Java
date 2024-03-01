package com.feb29;

class Atmcard{
	void transactionHistory(int deposite) {
		System.out.println("Deposited Rs:"+deposite);
	}
	void transactionHistory(long withdraw) {
		System.out.println("withdraw amount Rs:"+withdraw);
	}
}



public class PolymorphismBankSystem {

	public static void main(String[] args) {
		
		Atmcard a1=new Atmcard();
		a1.transactionHistory(40000);
		a1.transactionHistory(50000L);

	}

}
