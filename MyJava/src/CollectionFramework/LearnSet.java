package CollectionFramework;

import java.util.Set;
import java.util.HashSet;

public class LearnSet {
	public static void main(String[] args) {
		//In set duplicate elements are not allowed
		
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		
		System.out.println(set);  //order does'nt matter in set
		
		set.remove(2);
		System.out.println(set);
		
		System.out.println(set.contains(8));  //boolean
		
		System.out.println(set.isEmpty());  //boolean
		
		System.out.println(set.size()); //no of elements in set
		
		//set.clear();  //clear all elements in set
		
		/* LinkedHashSet is same as HashSet but additionaly it will also 
		  show property of linkedlist and elements will be not added randomly 
		  they will be added in given order*/
		
		/*  TreeSet is also similar to HashSet but in a sorted way
		 * means it do it's implementation in form Binarysearch tree and also have properties of set
		 * all operation in O(logn) time bcoz implemented using BST*/
		
		//in HashSet all operation in O(1) time
	}
}
