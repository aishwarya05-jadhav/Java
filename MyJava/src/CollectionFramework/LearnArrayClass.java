package CollectionFramework;

import java.util.Arrays;

//arraysclass is used to perform basic operations of arrays

public class LearnArrayClass {
	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};
		
		//we can directly perform binary search on array using arrayclass
		//works only array is sorted
		//Binary search works in O(logn)
		int index = Arrays.binarySearch(numbers, 6);
		
		System.out.println("index of element 6 in array is:" +index);
		
		//sorting
		
		int nums[] = {34, 89, 45, 12, 40};
		Arrays.sort(nums);  // applies quick sort
		
		// Arrays.fill(numbers, 15);  //fills 15 at all indexes in numbers array
		
		for(int i : nums) {
		System.out.println(i + " ");
		}
		
	}
}
