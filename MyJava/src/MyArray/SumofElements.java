package MyArray;

public class SumofElements {
	public static void main(String[] args) {
	int arr[]= {2, 4, 6, 4, 7,1};
	
	int sum = 0;
	for(int i=0; i<arr.length; i++) {
		sum = sum + arr[i];
	}
	System.out.print("Sum of elements in array is: "+sum);
}
}