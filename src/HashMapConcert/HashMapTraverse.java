package HashMapConcert;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTraverse {

	public static void main(String[] args) {
		Map<String,String>employMapRole=new HashMap<>();
		employMapRole.put("Annie","manager");
		employMapRole.put("Olivier","dev");
		employMapRole.put("John","admin");
		employMapRole.put("Veda","Qa");
		employMapRole.put("1Test","trainings");
		employMapRole.put("aaOffice","helpdesk");
		//K,V: KeySet(EntrySet)
		for(Map.Entry<String,String>entry:employMapRole.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		System.out.println("..........................");
		//foreach method using lambda:
		employMapRole.forEach((k,v)->{System.out.println(k+":"+v);});
		

	}

}
