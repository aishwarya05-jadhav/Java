package MyArray;

//Count frequency of each element in array

public class CountFrequency {
	public static void main(String[] args) {
	/*	int arr[] = {2,4,5,2,7,3,3,5};
		int freq[] = new int[arr.length];
		int visited = -1;
		
		
		for(int i=0; i<arr.length; i++) {
			int count = 1;
			for(int j=i+1; j<arr.length; j++)
			if(arr[i] == arr[j]) {
				count++;
				freq[j] = visited;
			}	
			if(freq[i] != visited) {
				freq[i] = count;
			}
			
			}
		for(int i=0; i<arr.length; i++) {
			if(freq[i] != visited) {
				System.out.println("Element | Frequency");
				System.out.println(arr[i] +"|" +freq[i]);
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(freq[i] < freq[j]) {
					System.out.println();
				}
			}
		}*/
		
		int arr[] = {10,40,30,23,10,23,40,40,50,30};
		
		for(int i=0; i<arr.length; ++i) {
			int x = arr[i];
			int count = 0;
			if(x==-1)continue;
			
			for(int j=0; j<arr.length; ++j) {
				if(x == arr[j]) {
					++count;
					arr[j] = -1;
				}
			}
			System.out.println("Frequency of "+x +" is "+count);
			
		}
		}
		
		
	}

