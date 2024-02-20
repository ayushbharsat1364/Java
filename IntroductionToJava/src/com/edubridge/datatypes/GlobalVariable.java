package com.edubridge.datatypes;

public class GlobalVariable {

		 String ename="ayush";
		 
		 void info1() {
         int empid=101;
         System.out.println(ename+"  "+empid);
			  }
         void info2() {
        String empdesignation="java developer";
        System.out.println(ename+"    "+empdesignation);
         }
        public static void main (String[] args) {
        	GlobalVariable G1=new GlobalVariable();
        	
        	G1.info1();
        	G1.info2();
        	
        
       
	}

}
