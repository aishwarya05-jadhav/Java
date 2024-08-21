package oopsinJava;

class Man{
	public void sound() {
	System.out.println("humans speak");
	}
	Man(){//constructor
		System.out.println("Creating a Man instance");
	}
}

public class SuperKeyword extends Man {
	
	public void sound() {
		super.sound();
	}
	SuperKeyword(){//constructor
		System.out.println("superrrrr");
		
	}
	
	public static void main(String[] args) {
		/*
		 Super is a special keyword in Java that is used to refer to the instance 
		 of the immediate parent class
		 
		  USES OF SUPERKEYWORD IN JAVA
		  
		  1.It is used to refer to an instance variable of the immediate parent class
		  2.It is used to invoke a method of the immediate parent class
		  3.It is used to invoke a constructor of the immediate parent class
		  
		  */
		SuperKeyword obj = new SuperKeyword();  //pehle upar wale class ke matlab parent class ke default constructor call honge
		obj.sound();
		
		
		
	}
	}