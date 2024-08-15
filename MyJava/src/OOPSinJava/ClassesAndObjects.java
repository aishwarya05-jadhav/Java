package OOPSinJava;


//If we want to solve real world problems we need object oriented programming
//and java is ne of oop language
//java is 99% oop language


//Class is a blueprint which defines some properties and behaviours and object is an instance of class which has
//those properties and behaviours attached

//class is not allocated memory when it is defined and an object is allocated memory when it is declared(objects are stored in heap memory)
//class is logical entity and object is physical entity
//class is declared only once.on the other hand, we can create multiple objects of class

//kisi bhi program mai public class ek hi rahegi aur uska naam wahi rahega jo file ka naam hai and we can create other classes


//execution of code starts from main method of public class

public class ClassesAndObjects {
	
	public static void main(String[] args) {
		//first check dog class then come here
		//inorder to view things from dog class we need to make it's object
		
		Dog d1 = new Dog();  
		d1.bark();
		d1.name = "tom";  //we can set variables
	}
}
class Dog{
	int age;			//all these are it's properties
	String name;
	String color;
	
	void walk() {   //behaviour
		System.out.println("Dog is walking");
	}
	void bark() {  //behaviour
		System.out.println("Dog is barking"); 
	}
	//so all those thing which are properties we declare them as variables
	//and all those things which are behaviour we declare them as methods
	
	
	
	
	
	
}
