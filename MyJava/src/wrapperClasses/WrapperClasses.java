package wrapperClasses;

public class WrapperClasses {

	
	/*
	 A wrapper class in java is a class whose object wraps or contains primitive data types.
	 When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types
	 
	 PRIMITIVE DATA TYPE 				WRAPPER CLASS
	 
	 char									Character
	 byte									Byte
	 short									Short
	 int									Int
	 long									Long
	 float									Float
	 double									Double
	 boolean								Boolean
	
	
	
	NEED OF WRAPPER CLASSES
	
	1. The classes in java.util package handles only objects and hence wrapper classes help in this case also.
	2. Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types
	3. An object is needed to support synchronization in multithreading
	
	
	AUTOBOXING AND UNBOXING
	
	The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example - 
	conversion of int to Integer, long to Long, double to Double etc
	
	It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to it's corresponding primitive types is knwon
	as unboxing. For example - conversion of Integer to int, Long to long, Double to double etc
	
	 */
	public static void main(String[] args) {
		
		Integer obj1 = new Integer(12);
		
		Integer obj2 = Integer.valueOf(12);  //valueOf method mule jr input string madhe jari asla tari te Integer madhe convert houn jail even valueOf apan kontya pn wrapper class la use karu shakto
		//we can perform various operation here (+,-,* etc)
		
		Integer obj3 = 12;  //autoboxing  int value ko Integer mai assign kr rhe hai
		
		int age = obj1;  //unboxing  int madhe direct object assign kela
	}
}
