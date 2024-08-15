package OOPSinJava;

public class JavaConstructors {
	public static void main(String[] args) {
		
		/* 
		 1. Constructors are invoked/call implicitly/automatically when object is created
		 
		 2. Two rules for creating a constructor are:
		 a.The name of the constructor should be the same as the name of class
		 b. A java constructor must not have a return type
		 
		 3. If a class doesn't have a constructor,java compiler automatically creates a default 
		 constructor during run-time. The default constructor initializes the instance variables with 
		 default values
		 
		  4. Default Constructor - a constructor that is automatically created by the java compiler if not explicitly defined
		  
		  5. A constructor cannot be abstract or static or final
		  //static means class ka part hona chaiye
		   
		  6. A constructor can be overloaded but not overridden
		  
		 */
		
		Complex obj = new Complex();		//here basically Complex() after new keyword  is default constructor
 		
		obj.myprint();
		
		Complex obj2 = new Complex(2,3);
		obj2.myprint();
		
		
		
		
		
	}
}
class Complex{
	
	int a,b;
	
	public Complex() {   //this is only the default constructor which is invoked automatically by java during runtime if not created
		int a = 0;		//values can be changed but only we can change 
		int b = 0;
	}	
	//we don't want the values constant that's why we will define another constructor
	
	public Complex(int real,int img) {
		a = real;
		b = img;
	}
	void myprint() {
		System.out.println(a +" +"+ b+"i");	
		}
	}
	

