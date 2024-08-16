package MyArray;

import java.util.Arrays;
public class SecondSmallest {
	public static void main(String[] args) {
		int arr[] = {3,7,1,9,4,8,2};
		// method 1
		Arrays.sort(arr);
		System.out.println("Second smallest element in  array is:"+arr[1]);
		//but not an optimal way complexity is O(N^2)  OR O(NLOGN)
		
		//METHOD 2   O(N)
		int min = 1000;
		int secmin = 1000;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			else if(arr[i] < secmin) {
				secmin = arr[i];
			}
		}
		System.out.println("Second min element is:"+secmin);
		
		
		
		
	}
}
