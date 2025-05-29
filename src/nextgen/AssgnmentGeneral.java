package nextgen;

public class AssgnmentGeneral {
	public int factorialNumber() {
		int n=4;
		int fact=1;
		for(int i=1;i<n;i++) {
			fact= fact*i;
			System.out.println("the factorial number is:"+n);

		}
		return fact;
	}
	
     
	
		
public static void main(String[] args) {
	/*7. Write a program to print the factorial of a number by defining a method named 'Factorial'.

	Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-

	4! = 1*2*3*4 = 24

	3! = 3*2*1 = 6

	2! = 2*1 = 2 

	Also,

	1! = 1

	0! = 1*/
	AssgnmentGeneral n = new AssgnmentGeneral();
	int a = n.factorialNumber();
	//System.out.println("the factorial number is:"+a);
	
}
}
