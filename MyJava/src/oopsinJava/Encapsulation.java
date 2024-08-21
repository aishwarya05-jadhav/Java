package oopsinJava;


class person{
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
	
	/*Encapsulation refers to the bundling of fields and methods inside a single class.
	 It prevents outer classes from accessing and changing fields and methods of a class.
	 This also helps to achieve data hiding 
	 
	 DATA HIDING
	 
	 Data hiding is a way of restricting the access of out data members by hiding the implementation details.
	 Encapsulation also provides a way for data hiding.
	 
	 We can use access modifiers to achieve data hiding
	 
	 NOTE: People also consider encapsulation as data hiding, but that's not entirely true.
	 Encapsulation refers to the bundling of related fields and methods together. This can be used to achieve data hiding.
	 Encapsulation in itself is not data hiding.*/
		
		//In encapsulation we can control access
	
	person p1 = new person();
	p1.setAge(3);   //this is accessible bcoz of encapsulation
	
	System.out.println(p1.getAge());  //agar print karna ho toh get method ka use karna padega

}	
	
}
