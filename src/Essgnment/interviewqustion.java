package Essgnment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class interviewqustion {

	public static void main(String[] args) {
//	1.	String 1 (a,c,e,k,h)
//		String 2 (a,b,c,d,e,k,f,g)
//		Output (a,b,c,d,e,f,g,h)
		 //2.set1: 4, 5, 6, 7, 8
	      // set2: 7,5,8,3,4
	      // write java code to verify set2 if is the same as set1.
		
//		 List<Integer>set1list= new ArrayList<Integer>(); 
//		 set1list.add(4);
//		 set1list.add(5);
//		 set1list.add(6);
//		 set1list.add(7);
//		 set1list.add(8);
//		 System.out.println(set1list);
////		 for(Integer e:set1list) {
////			 System.out.println(e);
////			 
////		 }
//		  
//		 List<Integer>set2list= new ArrayList<Integer>(); 
//		 set2list.add(7);
//		 set2list.add(5);
//		 set2list.add(8);
//		 set2list.add(3);
//		 set2list.add(4);
////		 for(Integer e1:set2list) {
////			 System.out.println(e1);
//		 System.out.println(set2list);
//		 
//			 Boolean compare =set1list.equals(set2list);
//System.out.println(compare);
//			
//		  
//	}
		 Set<Character>String1= new TreeSet<Character>(); 
		 String1.add('a');
		 String1.add('c');
		 String1.add('e');
		 String1.add('k');
		 String1.add('h');
		 //System.out.println(String1);
		 for(Character e:String1) {
			 System.out.println(e);
			 
		 }

		  Set<Character>String2= new TreeSet<Character>(); 
		 String2.add('a');
		 String2.add('b');
		 String2.add('c');
		 String2.add('d');
		 String2.add('e');
		 String2.add('k');
		 String2.add('f');
		 String2.add('g');

		 //System.out.println(String2);
		 for(Character e1:String2) {
			 System.out.println(e1);
			 
		 }
		 boolean sum=String2.remove(String1);
	
		System.out.println(sum);
		 

	}
}
			
		  
	



