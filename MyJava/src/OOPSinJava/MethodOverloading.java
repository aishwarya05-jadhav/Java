package OOPSinJava;

public class MethodOverloading {
	public static void main(String[] args) {
		
		//Method Overloading
		
		/* 
		 1.Two or more methods can have same name inside the same class if they accepy
		 different arguments. This feature is known as method overloading  
		 
		 2.Method overloading is achieved by either:
		 a.changing the no. of arguments
		 b.or changing the data type of arguments
		 
		 3.It is not method overloading if we only change the return type of methods
		 there must be difference in no of parameters
		 */
		Greet gt = new Greet();
		gt.greetings();
		gt.greetings("Aish");
		
	}
}
class Greet{
	
	void greetings() {
		System.out.println("Hello, Good morning");
	}
	void greetings(String name) {
		System.out.println("Hello,"+name +" Good morning");
	}
}
