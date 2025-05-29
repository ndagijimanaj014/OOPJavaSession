package GenericArrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTreverse {

	public static void main(String[] args) {
		ArrayList<Integer>marklist = new ArrayList<Integer>();
		marklist.add(800);
		marklist.add(500);
		marklist.add(400);
		marklist.add(600);
		System.out.println(marklist);
		System.out.println(marklist.size());
		System.out.println(marklist.get(0));
		System.out.println(marklist.get(marklist.size()-1));
		Collections.sort(marklist);
		System.out.println(marklist);//ASC
		Collections.sort(marklist,Collections.reverseOrder());//DESC
		System.out.println(marklist);
		marklist.add(0,900);
		System.out.println(marklist);
		marklist.remove(3);
		System.out.println(marklist);
		
		

	}

}
