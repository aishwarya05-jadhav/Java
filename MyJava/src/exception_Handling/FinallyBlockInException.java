package exception_Handling;

public class FinallyBlockInException {
	/* Try-catch-finally block 
	  
	  In Java, we can also use the finally block after the try...catch block.
	  In this case, the finally block is always executed whether there is an exception inside the try block or not.
	  
	  It is a good practice to use finally block to include important cleanup code like closing a file or connection
	  
	  NOTE: There are some cases when a finally block does not execute:
	  *Use of System.exit() method
	  *An exception occurs in the finally block
	  *The death of a thread

	 */
	public static void main(String[] args) {
		
		 int a[] = new int[5];
		 
		 System.out.println("Hello world");
		 
		 try {
			System.out.println(a[8]); 
		 }catch(Exception e) {
			 System.out.println("Exceptions handled"); 
		 }finally {
			 System.out.println("I will run always");
		 }
		 
		 System.out.println("byeee");
	}
}
