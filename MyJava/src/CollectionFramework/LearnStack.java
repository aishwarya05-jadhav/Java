package CollectionFramework;

import java.util.Stack; //LIFO

public class LearnStack {
	public static void main(String[] args) {
		Stack<String> animals = new Stack<>(); 
		
		//adding element in stack
		animals.push("lion");
		animals.push("tiger");
		animals.push("panda");
		animals.push("peacock");
		animals.push("kangaroo");
		
		System.out.println(animals);
		
		//stack is LIFO so to view the last element which will be at peak
		System.out.println(animals.peek()); //kangaroo
		
		animals.pop(); //pops element at top/peek
		System.out.println(animals.peek()); //peacock
		
	}
}
