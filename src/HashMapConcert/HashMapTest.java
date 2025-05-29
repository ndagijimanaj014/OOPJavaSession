package HashMapConcert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String,String[]>dropdownstate = new HashMap <String,String[]>();
		String dropdown[]= {"califonia","colorado","texas","utah","new mexico"};
		dropdownstate.put("US", dropdown);
		String region[]= dropdownstate.get("US");
		System.out.println(dropdownstate.get("US")[3]);
		System.out.println(dropdownstate.get("US")[1]);
		System.out.println(dropdownstate.get("US").length);
		System.out.println(Arrays.toString(region));
		for(int i=0;i<region.length;i++) {
			//System.out.println(i);
			if(region[i].equals("texas")) {
				region[i]="NY";
				
			}
			
		}
		System.out.println(Arrays.toString(region));
		
		

	}

}
