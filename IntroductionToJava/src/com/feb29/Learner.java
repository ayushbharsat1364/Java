package com.feb29;

public class Learner {

	public static void main(String[] args) {
		
		Info i1=new Info();
		i1.setName("ayush");
		i1.setAddress("kalyan");
		i1.setContact(321316464);
		i1.setEmail("ab@gmail.com");
		
		System.out.println("Learner Name:"+i1.getName()+"\nLearner Address:"+i1.getAddress()+"\nLearner Contact:"+i1.getContact()+"\nLearner email:"+i1.getEmail());

	}

}
