package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
	public static void main(String[] args) {
		//in maps data is stored in key- value par
		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("one", 1); // Here string values are key and thus always unique
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("four", 4);
		numbers.put("five", 5);
		
		numbers.put("one", 100); //one key was already their but now it will override
								//and take latest value entered
		
		//if you want to avoid putting elements again with same keys the use below
		
		if(!numbers.containsKey("four")) {//their is also containsValue
			numbers.put("four", 4);
		}
		//or
		numbers.putIfAbsent("five" , 5);
		
		System.out.println(numbers);
		
		numbers.remove("five");
		
		//Iterate
		
		for(Map.Entry<String, Integer> e : numbers.entrySet()) {
			//map.entry is class
			System.out.println(e);
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
		System.out.println(numbers.isEmpty());  //to check if map is empty
		
		
		//numbers.clear();
		
		
		/*In case of TreeMap it puts keys in  binary search tree and sort those keys
		 all operation in O(logn) */
		
		
		//in hashmap all operation in O(1)
	}
}

