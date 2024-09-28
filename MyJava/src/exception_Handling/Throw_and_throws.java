package exception_Handling;
import java.util.Scanner;

public class Throw_and_throws {
	/*
	  We use the throws keyword in the method declaration to declare the type of exceptions that might occur within it.
	 
	  The throw keyword is used to explicitly throw a single exception
	 */
	public static void main(String[] args) throws MyException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		/*int age = sc.nextInt();
		
		if(age > 100) {
			
			throw new MyException("My Exception is this ");  //ya to isk handling jaise class ke samne throws MyException se hui hai waise ho sakti hai ya fir isko try-catch block mai dalkar bhi handle kr sakte hai
			
			System.out.println(e);
			
		}*/
		
	try{
		  int age = sc.nextInt();
		  if(age > 100) {
			throw new MyException("This is my Exception");
		  }
	} catch (Exception e){
		System.out.println(e);
	}
		   
		   
		   
	}
}
class MyException extends Exception{  //agar hume khud ka koi exception throw karna hai to hum usse extend karange with Exception class
	
	public MyException(String message) {
		super(message);
	}
	
	
}
