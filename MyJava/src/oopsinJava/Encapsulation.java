package oopsinJava;

public class Encapsulation {
	/* 
	 JAVA PACKAGES
	 A package is simply a container that groups related types(Java classes, interfaces,
	 enumerations, and annotations)
	 
	 To define a package in Java, you use the keyword package.
	 Java uses file system directories to store packages
	 
	 IMPORTING A PACKAGE
	 
	 Java has an important statement that allows you to import an entire
	 package(as in earlier examples), or use only certain classes and interfaces defined in the package
	 
	 Eg---- import java.util.Date;		//imports only Date class
	 --------import java.io.*;          //imports everything inside java.io package
	 
	 In java, the import statement is written directly after the package statement and before the class definition
	 
	 */
	
	
	/* 
	 ACCESS MODIFIERS
	 
	 In java, access modifiers are used to set the accessibility(visibility) of classes, interfaces, 
	 variables, methods, constructors, data members, and the setter methods.
	 
	 TYPES OF ACCESS MODIFIERS
	 //Default => package not visible outside package
	 //Protected => only child can access parent class,dusrya package madhe gela tari
	 Access	Modifier	Same Class		Same Package		Same package 		Difference package 		different package
	 									subclass			non-subclass		subclass				non-subclass
	
	 Default			yes				yes					yes					no						no
	(package private)
	 Private			yes				no					no					no						no
	 
	 Protected			yes				yes					yes					yes						no
	 
	 Public 			yes             yes  				yes 				yes					    yes             */
}
