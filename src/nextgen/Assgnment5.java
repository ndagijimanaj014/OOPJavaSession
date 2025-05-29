package nextgen;

public class Assgnment5 {
	public Boolean isEligible(int age) {
		boolean flags =true;
		if(age>=18) {
			System.out.println("is Eligible to vote");
			
		} else {
			System.out.println("is not  Eligible to vote");
			
		}
		return flags;
		
	}
	
	public static void main(String[] args) {
		// A person is eligible to vote if his/her age is greater than or equal to 18.

       //Define a method to find out if he/she is eligible to﻿ vote. - return true/false
Assgnment5 ass = new Assgnment5();
boolean results =ass.isEligible(15);
System.out.println(results);
	}

}
