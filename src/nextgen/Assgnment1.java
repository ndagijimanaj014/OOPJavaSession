package nextgen;

public class Assgnment1 {
	public int twoNumbers(int a,int b) {
		
		
			/*System.out.println("Addition numbers are:"+(a+b));
			System.out.println("substraction numbers are:"+(a-b));
			System.out.println("division numbers are:"+(a/b));
			System.out.println("multiplication numbers are:"+(a*b));*/
		int sum=a+b;
		return sum;
			
	}

	public static void main(String[] args) {
		// 1.Write a program to print the addition/subtraction/division
		///multiplication of two numbers by defining your own method
		Assgnment1 obj= new Assgnment1();
		int result = obj.twoNumbers(5, 2);
		System.out.println("result are :"+result);
		
		
		

	}

}
