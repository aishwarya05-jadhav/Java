package oopsinJava;


class Caaro{
	String model;
	int year;
	
	public Caaro(String model,int year) {  //Constructor
		this.model = model;
		this.year = year;
		
	}
	public String toString() {  //override
		return "Car ka model" + model +"and Car ka year"+year;
	}
	
}
public class Learn_ObjectClass {
	public static void main(String[] args) {
	Caaro obj = new Caaro("Honda", 2020);
	System.out.println(obj);    //prints package.classname@reference    by default
	//but if we want to change it's format we will have to override toString method
	//here even if write obj.toString result will be same, so we will override toString method as above
}
	}
