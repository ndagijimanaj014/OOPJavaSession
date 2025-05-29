package HashSetConcert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashsetTraverse {

	public static void main(String[] args) {
		//Set<String>browserset= new HashSet<>();//can not have duplicate value //does not maintain order,//no index.
		Set<String>browserset= new TreeSet<>();//maintain Alphabetic order(sorted order
		//Set<String>browserset= new LinkedHashSet<>();//maintain insertion order    
		browserset.add("opera");
		browserset.add("firefox");
		browserset.add("edge");
		browserset.add("chrome");
		browserset.add("chrome");
		//browserset.add(null);
		System.out.println(browserset);
		//System.out.println(browserset.contains("safari"));
		//1.foreachloop(traverse):
		for(String e:browserset) {
			System.out.println(e);
			
		}
	//	System.out.println(".....................");
		//2.itelator:
//		Iterator<String>it=browserset.iterator();
//		while(it.hasNext()) {
//			String br=it.next();
//			System.out.println(br);
//			System.out.println("**********");
//			//3.set to list:
//			List<String>list= new ArrayList<>(browserset);
//			System.out.println(list);
//			
			
	
		}
		
		
		
		
		

	}


