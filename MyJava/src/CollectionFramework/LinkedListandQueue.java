package CollectionFramework;

import java.util.Queue;  //FIFO
import java.util.LinkedList;

public class LinkedListandQueue {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();  //linkedlist implements queue
		
		//adding elements in queue
		queue.offer(1);  // insert the specified element in the queue.if the task is 
						//successful returns true, if not it returns false
		queue.offer(2);
		queue.offer(3);
		queue.offer(3);
		queue.offer(4);
		
		//we can also add elements in queue using add method
		queue.add(100); //but this is dangerous method, insert the specified element in the queue.if the task is 
						//successful returns true, if not it throws exception
		
		System.out.println(queue);
		
		//removing elements from queue
		System.out.println(queue.poll()); //FIFO
		
		//for removing an element we can also use remove()
		queue.remove();  //throws exception if queue is empty
		//checking head of queue
		System.out.println(queue.peek()); //which element will pop next
											//returns null if queue is empty
		
		//we can also check head by element() method
		queue.element(); //throws an exception if queue is empty
		
		
		
		
		
	}
}
