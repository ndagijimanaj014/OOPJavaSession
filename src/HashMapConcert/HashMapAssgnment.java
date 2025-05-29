package HashMapConcert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapAssgnment {
	public static String usercredentials(String role) {
		Map<String,String> userRole= new HashMap<String,String>();//generating Hashcode based on key provided
		//Map<String,String> userroles= new TreeMap<String,String>();//when you want sorted based on your key(ASC)(maintain Alphabetic order,null key is not allow(NPEXCEPTION)
		//Map<String,String> userroles= new LinkedHashMap<String,String>();//maintain insertion order
		userRole.put("admin","admin@gmail.com:admin734");  
		userRole.put("partner","partner@gmail.com:partner456");
		userRole.put("seller","seller@gmail.com:seller@123");
		userRole.put("distributor","distributor@gmail.com:distributor345!");
		userRole.put("vendor","vendor@gmail.com:vendor@901");
		userRole.put("user","user@gmail.com:user@561");
		
		return userRole.get(role) ;
	}
		public static void dologin(String username,String password) {
			System.out.println("login with:"+username+":"+password);
		}
		
	

	public static void main(String[] args) {
		// use cases for HashMap
		//1.RBAC(user roles)::seller,partner,distributor,vendor,user,admin.:seller@gmail.com,seller@123.
		String a= usercredentials("vendor");
		//System.out.println(a);
		String[]c=a.split(":");
		System.out.println(Arrays.toString(c));
		String username=c[0];
		String password=c[1];
		dologin(username,password);

	}

}
