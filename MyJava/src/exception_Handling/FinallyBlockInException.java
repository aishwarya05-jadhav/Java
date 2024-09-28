package exception_Handling;

public class FinallyBlockInException {
	/* Try-catch-finally block 
	  
	  In Java, we can also use the finally block after the try...catch block.
	  In this case, the finally block is always executed whether there is an exception inside the try block or not.
	  
	  finally block ek hi baar lagta hai, multiple times finally block nhi hota
	  
	  It is a good practice to use finally block to include important cleanup code like closing a file or connection
	  
	  finally block madhe connection close hota, exception ala nhi ala tari connection close hota
	  
	  NOTE: There are some cases when a finally block does not execute:
	  *Use of System.exit() method  ===> Jb bhi koi programm run hota hai toh uske corresponding ek process banti hai
	  humne agar System.exit() likha matlab humne wo process hi terminate kar di, toh hamara program wahi ke wahi khatam hojayega
	  uss case mai finally wagera kuch bhi execute nhi hoga
	  
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
		 
		 try {
		 getNumberFromArray(a);
		 }catch(Exception e){
			System.out.println("catched the exception" +e.getMessage()); 
		 }
	}
	static  int getNumberFromArray(int a[]) throws ArithmeticException{ //ye wala method arithmetic exception throw kr sakta hai toh usko throws mai likhna hai
															//aur jab  ye method call hogi tab fir usko try-catch block kr andar dalna hai
		return a[8];
	}
}
