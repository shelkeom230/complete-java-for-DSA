package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class learnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> numbers=new TreeMap<String, Integer>();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("four",4);
		numbers.put("five", 5);
		
		if(!numbers.containsKey("two"))
		{			
			numbers.put("two", 50);
		}
		numbers.putIfAbsent("five", 50);
		System.out.println(numbers);
		
		for(Map.Entry<String, Integer> e:numbers.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		for(String key: numbers.keySet()) {
			System.out.println(key);
		}
		
		System.out.println(numbers.containsValue(3));
		System.out.println(numbers.isEmpty());
		
		numbers.remove(3);
	}

}
