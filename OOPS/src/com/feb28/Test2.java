package com.feb28;
class AccountHolder{
	void info1(String name,int accno){
		System.out.println("Account Number:"+accno+"\nAccount Holder Name:"+name);
	}
	
}
class BankInfo extends AccountHolder{
	void info2(double roi) {
		System.out.println("Bank intrest:"+roi);
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankInfo b1=new BankInfo();
		b1.info2(560.332);
		b1.info1("chetan",10021);
	}

}
