package MyArray;



public class Avg_of_all_Elements {
	public static void main(String[] args) {
		 int arra[] = {2,3,45,5,7,8,9,6} ;
		 int n = arra.length;
		 int sum = 0;
		
		
		for(int i=0; i<n ; i++) {
			sum += arra[i];
		}
		System.out.println("Sum is:"+sum);
		System.out.println("Average of elements of array is:"+(sum)/n);
	}
}
