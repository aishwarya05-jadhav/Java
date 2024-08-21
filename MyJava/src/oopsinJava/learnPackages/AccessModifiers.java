package oopsinJava.learnPackages;

public class AccessModifiers {
	/* 
	 ACCESS MODIFIERS
	 
	 In java, access modifiers are used to set the accessibility(visibility) of classes, interfaces, 
	 variables, methods, constructors, data members, and the setter methods.
	 
	 TYPES OF ACCESS MODIFIERS
	 //Private => Only accessible inside class
	 //Default => not visible outside package
	 //Protected => Accessible to all subclasses in packages even if that subclass is in some other package
	 
	 Access	Modifier	Same Class		Same Package		Same package 		Difference package 		different package
	 									subclass			non-subclass		subclass				non-subclass
					
	 Default			yes				yes					yes					no						no
	(package private)
	 Private			yes				no					no					no						no
	 
	 Protected			yes				yes					yes					yes						no
	 
	 Public 			yes             yes  				yes 				yes					    yes             */
	public static void main(String[] args) {
		Myclass My = new Myclass();
		My.num = 4;   //accessible as it is public in Myclass
		//My.id = 123;   NOT ACCESSIBLE AS IT IS PRIVATE in Myclass
		My.word = "abc";   //default it will be not visible if try to access from outside package
	}
	
	
	
}
class Myclass{
	public int num;
	private int id;
	String word;   //default or package private
}

