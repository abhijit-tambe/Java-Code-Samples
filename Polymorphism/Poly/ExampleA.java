//package Poly;
//import poly.morph.HasTail;;
//cloning object with polymorphism
// method overloading is compiletime polymorphism, earlybinding ,compiletime binding
//method overriding is runtime polymorphism, latebinding ,runtime binding
class A {
	private int num;
	private String name;
	public A() { 
		System.out.println("i am A constructor");
	}
	
	public A(int no) {  //constructor overloading
		System.out.println("From A constructor" +no);
	}
	
	public void myName() {        //method overriding
		System.out.println("i am A");
	}
	
	public static void myName(String na) {        //method overriding | with static keyword method hiding 
		System.out.println("from A myName method" +na);
	}
}

class B extends A{
	public B() {
	 System.out.println("i am B constructor");
	}	
	 
	public B(int no) {     // constructor overloading 
//		super(no);		
		System.out.println("From B"+no);
		ExampleA h = new ExampleA() {
		public boolean isTailStripped(){	
		 return true;
		 }
		};
//		
		
		System.out.println(h.isTailStripped());
	}
	
	public void myName() {      //method overriding    this child class overrides parent class
//		super.myName();
		System.out.println("i am B");
	}
	
	public static void myName(String na) { 
		System.out.println("from B myName method "+na);
	}
	
}
public class ExampleA implements HasTail{
	
	public boolean isTailStripped() {
	    return	false;
	    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		A ref = new B(100);
	    ref.myName("abhijit");
	    System.out.println(ref.getClass().getName());
		
//		ref.myName();
	   
		
	    
		
		
	}

}
