package nextgen;

public class Assgnment6 {
	public static String  calculateGrade(int marks ) {
		if(marks>=91&& marks<=100) {
			return "AA";
			
	} else if(marks>=81&& marks<=90) {
		return "AB";
		
} else if(marks>=71&& marks<=80) {
	return "BB";
	
} else if(marks>=61&& marks<=70) {
	return "BC";
	
} else if(marks>=61&& marks<=50) {
	return "CD";
	
} else if(marks>=41&& marks<=50) {
	return "DD";
	

	} else if(marks<=40) {
		return "fail";
	}
		return null;
}

	public static void main(String[] args) {
		/*//6. Write a program which will ask the user to enter his/her marks (out of 100).
		  Define a method that will display grades according to the marks entered as below:

//Marks        Grade

//91-100         AA

//81-90          AB

71-80          BB﻿

61-70          BC

51-60          CD

41-50          DD

<=40          Fail*/
		String grades =calculateGrade(86);
		System.out.println(grades);
		
		
	}
}

		



