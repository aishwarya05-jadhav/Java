package CollectionFramework;

import java.util.ArrayDeque;

//dequeue is a queue in which we can add and remove elements from both sides
public class LearnArrayDeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(1);
		adq.offer(2);
		adq.offer(3);
		adq.offer(1);
		adq.offer(5);
		
		adq.offerFirst(0);  //offer works as worked normally in queue i.e add element at last
							//offerFirst adds element to head
		adq.offerLast(100); //works same as offer
		
		System.out.println(adq);
		
		//similarly we can have peek(), peekFirst(), and peekLast()
		//similarly we can have poll(), pollFirst(), and pollLast()
	}
	
}
