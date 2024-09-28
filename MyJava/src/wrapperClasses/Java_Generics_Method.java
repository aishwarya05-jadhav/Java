package wrapperClasses;

public class Java_Generics_Method {
	/*
	 Similar to the generics class, we can also create a method that can be used with any type of data. Such a class is known as Generics Method.
	 
	  Here, the type parameter <T> is inserted after the modifier public and before the return type void
	  
	  We can call the generics method by placing the actual type <String> and <Integer> inside the bracket before the method name
	  
	  Aisa kuch nhi hai ki generic method banane ke liye hame generic class banani hi padegi, hum withod generic class bhi generic method bana sakte hai*/

	public static void main(String[] args) {
		printData("hello");
		printData(123); //mg apan integer, string kahi pn pass karu shakto
		
		Java_Generics_Method g = new Java_Generics_Method();
		g.doubleData(123);
	}
//	static void printData(String data) {  ithun fkt string pass hou shakti
//		System.out.println(data);
//	}
	static <E> void printData(E data) {//method of parameterized datatype E
		System.out.println(data);
	}
	<E> void doubleData(E data) {
		
		System.out.println(data);
	}
//<E extends Number> void doubleData(E data) {  //matlab E sirf number ko extend karega , iske alawa koi aur E pass nhi kar sakte
//											number ko extend karta hai jaise int or double
//		System.out.println(data);
//	}
}
/*
 In general, the type parameter can accept any data types (except primitive types). However, if we want to use generics for some specific types(such as accept data of number types)
 only, then we can use bounded types.
 In the case of bounded types, we use the extends keyword.
 Here, GenericsClass is created with bounded type. This means GenericClass can only work with data types that are children of Number(Integer, Double, and so on) */
