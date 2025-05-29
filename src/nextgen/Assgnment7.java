package nextgen;

public class Assgnment7 {
	public int Factorial() {
		int i,fact=1;  
		  int n=5;//It is the number to calculate factorial    
		  for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  }    
		  //System.out.println("Factorial of "+ n+" is: "+fact);
		return fact;    
		}
		
		
		
		
	

	public static void main(String[] args) {
		Assgnment7 ass = new Assgnment7();
		int results =ass.Factorial();
		System.out.println("the factorial of n is:"+results);

	}

}
