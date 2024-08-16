package oopsinJava;


class Vehicle{
	int wheelsCount;
	
	void start() {
		System.out.println("Vehicle is starting");
		
	}
}
public class Inheritance extends Vehicle {
	public static void main(String[] args) {
		/* 
		 1. Inheritance is one of the key featured of OOP that allows us to create a 
		 new class from an existing class
		 
		 2. The new class that is created is known as child or subclass or derived class
		  and existing class from where the child class is derived is known as superclass or parentclass or baseclass
		  
		   */
	
		//Inheritance is achieve using "extends" keyword
		
		//Single level Inheritance
		//Multilevel Inheritance
		//Hybrid  //hierarchy
		//Multiple Inheritance is not allowed in Java
		
		/*
		Inheritance obj = new Inheritance();
		obj.wheelsCount = 4;
		obj.start();
	*/
		
}
}

