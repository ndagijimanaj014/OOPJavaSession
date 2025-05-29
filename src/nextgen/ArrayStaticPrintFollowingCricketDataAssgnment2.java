package nextgen;

public class ArrayStaticPrintFollowingCricketDataAssgnment2 {

	public static void main(String[] args) {
		// Write a program to create a static Array, having following cricket data:
        // --name, age, team name, DOB, gender, Strike Rate
        //--Try to create multiple Object Arrays for different 
        // --Try to print all the values of each player on the console using for and for each loops
		
		Object cricketdata[]= new Object[6];
		cricketdata[0]="peter";
		cricketdata[1]=32;
		cricketdata[2]="Tiger";
		cricketdata[3]=5;
		cricketdata[4]='M';
		cricketdata[5]=5.4;
		//for(int i=0;i<6;i++) {
		//	System.out.println(cricketdata[i]);
		for(Object e:cricketdata) {
			System.out.println(e);
			
		}
		
				
				
		

	}

}
