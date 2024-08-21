package oopsinJava;

public class ThisKeyWord {
	int rollno;
	//String name;
	int marks;
	
	//constructor with parameter
	public ThisKeyWord(int rollno, int marks) {
		this.rollno = rollno;
		this.marks = marks;
		
	
	}
	public static void main(String[] args) {
		
		/*
		 1. In java, this keyword is used to refer to the current object inside a method or a constructor
		 
		  2. We mostly use this keyword to remove any Ambiguity in variable names
		  we can also use this to invoke methods of the current class or to invoke a constructor 
		  of the current class 
		  
		  The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with 
		  the same name (because a class attribute is shadowed by a method or constructor parameter).*/
		
		//usage of this keyword
		
		//1. this can be used to refer current class instance variable
		//2.this can be used to invoke current class method (implicitly)
		//3. this can be used to refer current class instance variable
		//4. this can be passed as an argument in the method call
		//5. this can be passed as an argument in the constructor call
		//6. this can be used to return the current class instance from the method
		
		//1. this can be used to refer current class instance variable
		
		
		ThisKeyWord obj = new ThisKeyWord(3, 400);
		System.out.println(obj.rollno);
		System.out.println(obj.marks);
		
		
		
	}
}
