package oopsinJava;

public class Polymorphism {
		/*
		 Java Heap space is used by java runtime to allocate memory to Objects and JRE classes.
		 Whenever we create an object, it's always created in the Heap space 
		 
		 Any object created in the heap space has global access and can be referenced from anywhere 
		 of the application
		 
		 Java Stack memory contains method-specific values that are short-lived and references to other objects
		 in the heap that is getting referred from the method
		 
		 Wheneveer a method is invoked, a new block is created in the stack memory for the method to hold local primitive value and reference to other objects
		 in the method. As soon as the method ends, the block becomes unused and becomes available for the next method. Stack memory size is very less compared to Heap memory
		 */
	
	//Object class
	/* 
	 Object class is present in java.lang package. Every class in Java is directly or indirectly derived from the Object class. If a class does not extend any other class then it 
	 is a direct child class of Object and if extends another class then it is indirectly derived. Therefore the Object class methods are available to all Java classes. Hence Object class acts as a root of 
	 the inheritance hierarchy in any Java Program 
	 
	 Object class => 
	 				getClass().....final method
	 				hashCode()
	 				wait()
	 				toString()
	 				clone()
	 				equals()
	 				finalize()......garbage collector
	 				notify()
	 				notifyall()
	 				*/
}
