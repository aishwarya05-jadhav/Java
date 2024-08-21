package oopsinJava;

public class AbstractClass {
	public static void main(String[] args) {
		/*
		 The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes).
		 We use the abstract keyword to declare an abstract class.
		 
		 1. An abstract class can have both the regular methods and abstract methods
		 
		 2. A method that doesn't have it's body is known as an abstract method
		 
		 3. Though abstract classes cannot be instantiated, we can create subclasses from it. We can then access members of the abstract 
		 class using the object of the subclass
		 
		 4. If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass must provide the implementation 
		 of the abstract method*/

		//Truck v = new Truck();    cannot make obj of abstract class
		
		Car c = new Car();   // we can make objects of it's subclass 
		c.accelerate();			//and then we can use it's methods
		c.breakes();
		c.honks();
	}
}
abstract class Truck{
	abstract void accelerate();   //abstract method don't have body
	abstract void breakes();
	void honks() {
		System.out.println("Honks");   //we can make non-abstract method in abstract class
	}
}

class Car extends Truck{

	@Override   //annotations , we can remove it, ye check karta hai ki particular method parent class mai hai ki nhi
	void accelerate() {
		// TODO Auto-generated method stub	
		System.out.println("Car is accelerating");
	}

	@Override
	void breakes() {
		// TODO Auto-generated method stub	
	}
	
}
