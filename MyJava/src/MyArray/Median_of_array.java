package MyArray;

public class Median_of_array {
	public static void main(String[] args) {
		
		int array[] = {2,4,1,3,5};
		
		int temp = 0;
		for(int i=0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i]; 
	                 array[i] = array[j]; 
	                 array[j] = temp;
				}
			}
		}
		System.out.println("Sorting of elements in Ascending order:");
		for(int i=0; i< array.length; i++) {
			System.out.print(array[i] +",");
		}
		System.out.println("\nMedian of elements in array is:");
		if(array.length % 2 == 0) {
			int ind = array.length/2-1;
			int index = array.length/2;
			
			System.out.println((ind+index)/2);
		}else {
			int inde = array.length/2;
			//System.out.println(array[array.length/2]);
			System.out.println(array[inde]);
		}
		
		
		
	}
}
