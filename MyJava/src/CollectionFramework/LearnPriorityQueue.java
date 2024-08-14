package CollectionFramework;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();  //if we want to give priority to large element
															//use PriorityQueue(Comparator.reverseOrder())
		
		//adding elements
		pq.offer(4);
		pq.offer(6);
		pq.offer(3);
		pq.offer(13);
		pq.offer(1);
		
		System.out.println(pq); //here min heap is created
								//priority goes to small elements
		
		pq.poll();  //removes element from head //FIFO
		System.out.println(pq);  //min heap
		
		pq.peek();  //next remove element
		
		
		
		
		
	}
}
