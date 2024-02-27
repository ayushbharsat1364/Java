package com.edubridge.datatypes;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[]arr=new int[] {1,3,6,8,9,9};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
			
		}
         System.out.println("The sum of array elements is:"+sum);
	}

}
