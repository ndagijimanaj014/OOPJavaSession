package ArrayListConcert;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercices {

	public static void main(String[] args) {
		// Login = 1=Faith,2=Olivier,
		Map<Integer,String>Login= new HashMap<Integer,String>();
		Login.put(1,"Faith");
		Login.put(2,"olivier");
		Login.put(3,"John");
		Login.put(4,null);
		Login.put(null,null);
		System.out.println(Login.get(1));
		System.out.println(Login.get(Login));
		System.out.println(Login);
		System.out.println("........");
		
		System.out.println(Login.entrySet());
//	for(Map.Entry<Integer,String>b:Login.entrySet()){
//		System.out.println(b.getKey()+"="+b.getValue());
//		
//	}
		
		
		

	}

}
