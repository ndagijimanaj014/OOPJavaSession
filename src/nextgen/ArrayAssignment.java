package nextgen;

import java.util.Arrays;

public class ArrayAssignment {

	public static void main(String[] args) {
		String name[] = new String[5];
				name[0]="John";
		        name[1]="Paul";
		        name[2]="Ravi";
		        name[3]="Aline";
		        name[4]="veda";
		for(String e:name) {
			System.out.println(e);
			if(e.equals(name[0])) {
				System.out.println("our HR name is: "+name[0]);
				}
			else if(e.equals("Paul")) {
				System.out.println("Acc");
				}
			else if(e.equals(name[2])) {
				System.out.println("Admin");
				
				}
			else if(e.equals("Aline")) {
				System.out.println("It ");
				
				}
			else  {
				System.out.println("DEV");
				break;
				
			}
		       // for(int i=0;i<name.length;i++) {
		        	//System.out.println(i+"="+name[i]);
		        	
		        	
		        	
		        }
			//System.out.println(Arrays.toString(name));
			
		//}

	}

}
