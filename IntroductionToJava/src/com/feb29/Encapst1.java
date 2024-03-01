package com.feb29;
class Product{
	private int pId;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	private String pname;
	private int prise;
	
}
public class Encapst1 {

	public static void main(String[] args) {
		
   Product p1=new Product();
   p1.setpId(101);
   p1.setPname("television");
   p1.setPrise(50000);
   
   System.out.println(p1.getpId()+" "+p1.getPname()+" "+p1.getPrise()+" ");
	}

}
