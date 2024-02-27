package com.feb27;

public class StringVowels {

	public static void main(String[] args) {
		
		String str="the rain in the spain";
		System.out.println("The String is:"+str);
		
		int vcount=0,ccount=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)	
	{
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
		vcount++;
		else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
			ccount++;
	}
		System.out.println("the total number of vowels are:"+vcount);
		System.out.println("the total number of consonant are:"+ccount);

	}

}
