package CollectionFramework;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


//we can do basic operations like finding min, max, frequency using collectionclass

public class LearnCollectionClass {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(23);
		list.add(55);
		list.add(67);
		list.add(34);
		list.add(78);
		
		//check min element
		System.out.println("min element" +Collections.min(list));
		System.out.println("max element" +Collections.max(list));
		System.out.println("frequency of element" +Collections.frequency(list, 55));
		
		
		//sorting list
		Collections.sort(list);    //if want to sort in decreasing order give (list, Comparator.reverseOrder())
		System.out.println(list);
		
		
		
	}
}
