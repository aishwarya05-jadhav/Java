package oopsinJava;

public class Functionalinterfaces {
	public static void main(String[] args) {
	/* An interface that contains exactly one abstract method is known as a functional interface.
	  
	 Functional interfaces introduced in Java 8 allows us to use a lambda expression initiate the interface's method and avoid using lengthy code for the anonymous
	  class implementation
	  */
	
	//we want to use below interface using lambda expression
	
	Walkable obj = (int steps) -> {
		System.out.print("walked"+ steps+"steps");
		return steps;
	};
	obj.walk(5);
}
}
interface Walkable{
	
	int walk(int steps);
	
}
