package ArrayListConcert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExercices {

	public static void main(String[] args) {
		//Set<String>EmplNum= new HashSet<String>();
		Set<String>EmplNum= new LinkedHashSet<String>();
		//Set<String>EmplNum= new TreeSet<String>();
		
		EmplNum.add("ab");
		EmplNum.add("78");
		EmplNum.add("John");
		EmplNum.add("Annie");
		EmplNum.add("Olive");
		EmplNum.add("ab");
		System.out.println(EmplNum);
		System.out.println("...................");
//	for(String e:EmplNum) {
//		System.out.println(e);
//	}
//		
ArrayList<String>list= new ArrayList<String>(EmplNum);
System.out.println(list);

	}

}
