package wrapperClasses;

public class Learn_Generics {
	/*
	 Generics means parameterized types. Using Generics, it is possible to create classes that work
	 with different data types. An entity such as class, interface or method that operates on a parameterized
	  type is a generic entity */
	
	public static void main(String[] args) {
		//Dog d1 = new Dog("123");
		
		Dog<String> d = new Dog<>("123");  //ithe fkt angular bracket madhe sangun deicha konta datatype vaparnar ahe 
		//string type cha E id supported ahe
		
		Dog<Integer> d2 = new Dog<>(123);
		System.out.println(d2.getId());
	}										
	
	
}
//class Dog{
//	
//	String id;
//	
//	public Dog(String id) {
//		this.id = id;
//	}
//}

class Dog<E>{ // ya madhe multiple parameters pn taku shakto comma karun
	
	E id;  //generic banvaila datatype cha jagi konta pn captial letter vapru shakto
	
	public Dog(E id) {
		this.id = id;
	}
	
	E getId() {
		return id;  // method banavli jyicha return type E ahe
	}
}
