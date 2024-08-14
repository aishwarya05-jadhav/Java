package CollectionFramework;

import java.util.ArrayList;	//basically dynamic array
import java.util.List;

public class LearnArrayList {
	public static void main(String[] args) {
		//Creating empty arraylist
		ArrayList<String> StudentsName = new ArrayList<>();
		
		//Various methods on arraylist
		
		StudentsName.add("Aish");
		//when first memory is allocated then "n" memory is generated
		//when that "n" memory is finished it increases from "n" to "n + n/2 + 1"
		
		List<Integer> List = new ArrayList<>();
		List.add(1); 
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		List.add(6);
		System.out.println(List);
		
		List.add(7); //this will add 7 to the end of list  // adding element time complexity is O(n) because others will need to shift
		System.out.println(List);
		
		//to add element at particular location
		List.add(2,34);		//2 is index and 34 is value
	
		List<Integer> newList = new ArrayList<>();		//creating another list
		List.add(100);
		List.add(90);
		List.add(66);
		
		//Merging both lists
		
		List.addAll(newList);
		System.out.println(List);
		
		//Access particular element
		System.out.println(List.get(5)); //element at 5th index
		
		//removing element from list
		List.remove(3); //removes the element in list at 3rd index   time complexity = O(n)
		System.out.println(List);
		
		//removing element by value
		List.remove(Integer.valueOf(100));
		System.out.println(List);
		
		//removing all element from list
		//List.clear();
		//System.out.println(List);
		
		
		// change element at particular location
		List.set(2, 344);  //index,value  //O(1)  directly go at position and change value
		System.out.println(List);
		
		//checking element present or not
		List.contains(33);  //boolean
		System.out.println(List);  //O(n)
		
		//want to travel arraylist one by one
		for(int i=0; i<List.size(); i++) {  //list.size tells how many element in list
			System.out.println("element is "+List.get(i));
		}
		
		//Iterator
		//Iterator<Integer> it = List.it();
	
	
	}
}
