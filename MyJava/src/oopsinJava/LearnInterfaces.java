package oopsinJava;

public class LearnInterfaces {
	public static void main(String[] args) {
		Monkey m = new Monkey();
		m.eats();
		System.out.println(Animal.Legs);
		m.speak();
	}
}
interface Animal{
	
	public static final int Legs = 4;		//public static final by default hota hai toh keyword hata bhi sakte hai
	
	//we can define abstract methods inside interface
	public abstract void eats();   //interface mai bydefault methods already abstract hi hote hai,that's why abstract keyword nikal bhi diya toh chalega
									//similarly methods are public by default so usko bhi nikala toh chalega
	
	//now if in future humne yaha aur functions impement kiye, toh wo sare functions unn sab class mai dene padange jaha Animal implement hua hai
	//their can be many such classes and sab mai individual change karna padega
	
	//That's why Java also have default implementation for interfaces, toh default use karne se future mai jo bhi class usko use kar rhi hai wo use bydefault override kr sakti hai
	
	default void speak() {
		// default method ki body banani padegi
		System.out.println("Animal is walking");
	}
	
}

interface Human{
	void walk();
}

//class Monkey implements Animal{
//
//	@Override
//	public void eats() {
//		// TODO Auto-generated method stub
//		System.out.println("eat banana");
//	}
//	
//}
class Monkey implements Animal, Human{  //We can use multiple interfaces here
										//multiple interitance was not allowed in abstract class as well as inheritance
	@Override
	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("eat banana");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
}
//ADVANTAGES OF JAVA INTERFACES

//Similar to abstract classes, interfaces help us to achieve abstraction in Java
//Interfaces are also used to achieve multiple interitance in Java

/* Java mai multiple inheritance nhi hota kyunki 2 classes milkar agar hum ek classes mai inherit kr rhe hai and unn dono classes mai same naam ke methods hai
 to child class confuse hojayega ki kiska method interit karna hai
 
 But in case of java interfaces mai sirf decleration hota hai and implementation is in child class itself so no confusion*/
//NOTE- All the methods inside an interface are implicitly public and all fields are implicitly public static final
