package oopsinJava;

public class AnonymousClass {
	
	
	/* In Java, a class can contain another class known as nested class. It's possible to create a nested class
	 without giving any name.
	 
	   A nested class that doesn't have any name is known as an anonymous class
	   
	   Anonymous classes usually extend subclasses or implement interfaces.
	   Here, type can be
	   
	   1. a superclass that an anonymous class extends
	 
	   2. an interface that an anonymous class implements*/
	
	/*
	class Innerclass extends OuterClass{
		
	}*/
	//INSTEAD OF ABOVE TO MAKE CHILD CLASS OF BELOW CLASS WE CAN DO BELOW
	
	OuterClass obj = new OuterClass() {  //Anonymous class
		//to make child class of outer class without name ,first we will create obj of outerclass and then give {  };
		
		void sing() {
			
		}
	};  //This class is used only once
	
	Superinterface obj2 = new Superinterface() {
		//anonymous class
		
		@Override
		public void interfaceMethod() {
			// TODO Auto-generated method stub
			
		}
		
	};
	
}
class OuterClass{
	
	public void outermethod() {
		
	}
}
interface Superinterface{
	void interfaceMethod();
}
