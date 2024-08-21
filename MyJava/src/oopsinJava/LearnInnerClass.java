package oopsinJava;

public class LearnInnerClass {
	
	//INNER CLASSES AND NESTED STATIC CLASS IN JAVA
	
	//A non-static nested class is a class within another class.It has access to members of the enclosing class(outer class).It is commonly known as inner class
	
	//Since the inner class exists within the outer class, you must instantiate the outer class first, in order to instantiate the inner class
	
	//using the nested class makes your code more readable and provide better encapsulation
	
	//Unlike inner class, a static nested class cannot access the member variables of the outer class. It is because the static nested class doesn't require you to create an instance of the outer class
		
	class Toy{  //inner class  as it is non-static
		private int price;
	}
	static class Playstation{//nested class
		int price;
	}
	
	public static void main(String[] args) {
		//Toy t = new Toy();   // gives error because hum static class ke andar non-static class ko uska object banake access nhi kr sakte
							//i.e hume Toy class ka nhi LearnInnerClass ka object banana padega
		
		LearnInnerClass Lic = new LearnInnerClass();
		Toy t = Lic.new Toy();
		t.price = 8;
		
		Playstation play = new LearnInnerClass.Playstation();
		play.price = 8;
	}
}
