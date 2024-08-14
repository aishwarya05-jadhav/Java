package MyArray;

public class SortOfElements {
	public static void main(String[] args) {
		int arr[] = {5,6,4,7,9,3,};
		
		//Sorting in Ascending order
		int temp = 0;
		for(int i=0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i]; 
	                 arr[i] = arr[j]; 
	                 arr[j] = temp;
				}
			}
		}
		System.out.println("Sorting of elements in Ascending order:");
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] +",");
		}
		//Sorting in Descending order
		int temper = 0;
		for(int i=0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temper = arr[i]; 
	                 arr[i] = arr[j]; 
	                 arr[j] = temper;
				}
			}
		}
		System.out.println();
		System.out.println("Sorting of elements in descending order:");
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] +",");
		}
	}
}
