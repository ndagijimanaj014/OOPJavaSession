package nextgen;

public class ArrayPrintElementAssgnment {

	public static void main(String[] args) {
		// Print all the elements of this array using for, for each, while and do-while loop:

        int p[] = {1,3,4,5,22,56,89,90};
		//for(int i=0;i<p.length;i++) {
			//System.out.println(p[i]);
			
		//}
//        for(int e:p) {
//        	System.out.println(e);
//        	
//        }
//        int i=0;
//        
//        while(i<p.length) {
//        	System.out.println(p[i]);
//        	i++;
//        }
        int i=0;
        do {
        	System.out.println(p[i]);
        	i++;
        }while(i<p.length);

	}

}
