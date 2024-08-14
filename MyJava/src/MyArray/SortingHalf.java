package MyArray;

//First half in ascending order and second half in descending order

public class SortingHalf {
	public static void main(String[] args) {
		int arr[] = {3,2,5,9,6,8,7,1};
		//int n = arr.length;
		
		int temp = 0;
		
		for(int i=0; i< arr.length-1;i++) {
			//for first half
			for(int j=0; j< arr.length/2; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			//for second half
			for(int j=arr.length/2; j< arr.length-1; j++) {
				if(arr[j] < arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
	}
}
