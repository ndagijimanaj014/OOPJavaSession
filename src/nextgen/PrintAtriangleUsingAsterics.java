package nextgen;

public class PrintAtriangleUsingAsterics {

	public static void main(String[] args) {
		//1.print a triangle using *
		/*int rows=7;
		for(int i=0;i<=rows;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+ " ");
				
			}
			System.out.println();
			
		}
		//2.print Alphabetic
		int alb=65;//A
		for(int i=0;i<=8;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alb+j) + " ");
				
			}
			System.out.println();
			
		}
		//3.print Alphabetic triangle in small letter
		int  a= 97;//a
		for(int i=0;i<=26;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(a+j)+ " ");
				
			}
			System.out.println();
			
			
		}
		*/
		//4.print numbers 1to 10 on square for 6rows
		int row=10;
		for(int i=0;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
			
		}
		/*
		//5.print triangle pattern on 10rows each row equal the same number
		int ro=10;
		for(int i=1;i<=ro;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print((row+j)+ " ");
				
			}
			System.out.println();
			
		}
		*/

	}

}
