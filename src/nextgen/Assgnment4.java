package nextgen;

public class Assgnment4 {
	public Boolean numbers(int a) {
		boolean flags = true;
		if(a%2==0) {
			System.out.println(a+" is the even number:");
			
		} else {
			System.out.println(a+" is the odd number:");
		}
		return flags;
		
		
	}

	public static void main(String[] args) {
		// def﻿ine a program to find out whether a given number is even or odd 
		//- return true/false.
		Assgnment4 ass = new Assgnment4();
		boolean results = ass.numbers(7);
		System.out.println(results);
		

	}

}
