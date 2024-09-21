package exception_Handling;

public class Exception_Handling {

	/*An exception is an unexpected event that occurs during program execution.
	 It affects the flow of the program instructions which can cause the program to terminate abnormally.
	 
	 An exception can occur for many reasons. Some of them are:
	 
	 *Invalid user input
	 *Device failure
	 *loss of network connection
	 *Physical limitations(out of disk memory)
	 *Code errors
	 *Opening an unavailable file
	 
	 
	 TYPES OF EXCEPTIONS
	 
	 1. Java Runtime Exceptions
	 2. Java IOException Exceptions
	 
	 
	 Java Runtime Exceptions
	 
	 A runtime exception happens due to a programming error. They are also known as unchecked exceptions.
	 These exceptions are not checked at comile-time but run-time. Some of the common runtime exceptions are:
	 
	 *Null pointer access (missing the initialization of a variable)- NullPointerException
	 *Out-of-bounds array access - ArrayIndexOutOfBoundsException
	 *Dividing a number by 0- ArithmeticException
	 
	We can think about it in this way. "If it is a runtime exception, it is your fault. "
	
	Java IOException Exceptions
	
	An IOException is also known as a checked exception. They are checked by the compiler at the compile-time and the programmer is
	prompted to handle these exceptions.
	
	Some of the examples of checked exceptions are:
	
	*Trying to open a file that doesn't exist results in FileNotFoundException
	*Trying to read past the end of a file
	
	
	Try-catch block
	
	The try...catch block in Java is used to handle exceptions and prevents the abnormal termination of the program.
	
	try{
	
	//code
	 
	}
	catch(exception){
	//code
	 }
	  
	*/
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		System.out.println("Hello world");
		
		try {
			
			System.out.println(a[8]);	
			int result = 5/0;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Tried to access the out of bound element");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("Bye world");
		
		
		//OR WE CAN KEEP COMMON CATCH FOR BOTH WITH COMMON STATEMENT
		
		//OR WE CAN DO AS FOLLOWS
		
		try {
			int result = 5/0;
			System.out.println(a[8]);	
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Handling the exception");
		}
		
		//Aur agar exception ka naam nhi likhna hai aur konse bhi type ka exception ho handle karna hai then go as follows
		
//		catch(Exception e) {
//			System.out.println("All exception handle");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
