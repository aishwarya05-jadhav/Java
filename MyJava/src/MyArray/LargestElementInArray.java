package MyArray;

import java.util.Scanner;

public class LargestElementInArray {
	public static void main(String args[]) {
		int arr[] = {1, 2, 6, 5, 10, 3};
		
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) 
			{
				max = arr[i];
			}
		}
		System.out.println("Maximum element in an array is: "+max);
	


//By taking input from user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements in array: ");
		
		int n = sc.nextInt();
		int myarray[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < n; i++) {
			myarray[i] = sc.nextInt();
		}
		System.out.print("Array is:");
		for(int i = 0; i < n; i++) {
			System.out.print(myarray[i] +",");
		}
		System.out.print("\n");
		int maxi = myarray[0];
		for(int i = 0; i < myarray.length; i++) {
			if(myarray[i] > maxi) 
			{
				maxi = myarray[i];
			}
		}
		System.out.println("Maximum element in an array is: "+maxi);
		
		

	}
}