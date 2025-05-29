package nextgen;

public class LoopPrintAsciiValueAtoZAssment {

	public static void main(String[] args) {
		//diffent between while loop and for loop with example?
		//A.while loop use case:when number of itelations/cycles are not fixed.
		//eg:1.wait element on page10,5,20,15,2,6
		 //  calendar handling
		  // 3.page scrolling,.and.
		  // B.for loop use case:when number of itelations/cycles are fixed.
		  // e.g:month drop down 1to 12
		   //    menu and submenu items,.and.
		//1.print console a table of char and their ascii value
		for(char ch='a';ch<='z';ch++) {
			//System.out.println((int)ch);
			System.out.println(ch+"= "+(int)ch);
			
			
		}
		System.out.println(".............");

	}

}
