package oopsinJava;

public class StaticKeyword {

	
	/*If we want to access class members without creating an instance of the class,
	  we need to declare the class members static
	  
	  static keyword se kisi class ka object banaye bina hi hum uske instances access kr sakte hai
	 
	 Static variables can be accessed by calling the class name of the class.
	 There is no need to create an instance of the class for accessing the static variables
	 because static variables are the class variables and are shared among all the class instances  
	 
	 STATIC VARIABLES
	 
	 * Only a single copy of the static variable is created and shared among all the instances of the class
	 
	 * Bacause it is a class-level variable, memory allocation of such variables only happens once when the class is loaded in the memory
	  
	 * If an object modifies the value of a static variable, the change is reflected across all objects
	  
	 * Static variables can be used in any types of method: static or non-static.
	  
	 * Non-static variables cannot be used inside static methods.It would throw a compile time error
	 because uska object banana padega 
	 
	 *The static members and methods belong to the class rather than the instance of the class. When the implementation of the particular methods is not dependent
	 on the instance variables and instance methods, Inthis case, we can make that method to be static.
	 
	 * They are accessed by the name of the class
	 
	 * The keywords such as this and super are not used in the body of the static method
	 
	 * The modification of the static field value is not allowed*/
}
