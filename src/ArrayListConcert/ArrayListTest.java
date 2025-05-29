package ArrayListConcert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer>marklist= new ArrayList<Integer>();
		List<Integer>list=Arrays.asList(1,4,3,5,6);
		System.out.println(list);
		marklist.add(8);
		marklist.add(10);
		marklist.add(9);
		System.out.println(marklist);//maintain insertion order based on index
		System.out.println(marklist.get(0));
		

	}

}
