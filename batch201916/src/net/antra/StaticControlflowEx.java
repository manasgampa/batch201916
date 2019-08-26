package net.antra;

public class StaticControlflowEx {

	 // initializing static integer a=100 
    static int a = 100; 
  
    // static main method 
    public static void main(String[] args) 
    { 
        // calling static method print() 
        print(); 
        System.out.println("Main method has finished its execution"); 
    } 
  
    // first static block 
    static
    { 
        // displaying value of a 
        System.out.println(a); 
  
        // calling static method print() 
        print(); 
        System.out.println("Inside First Static Block"); 
    } 
  
    // static method print() 
    public static void print() 
    { 
        // displaying value of b 
        System.out.println(b); 
    } 
  
    // second static block 
    static
    { 
        System.out.println("Inside Second Static Block"); 
    } 
  
    // initializing static integer b=200 
    static int b = 200; 

	/*static {
		System.out.println(i);
		System.out.println("in static block 1");
	}
	static int i=56;
	public static void main(String[] args) {
		m1();
		System.out.println("in main method");
	
	}
	static {
		
		System.out.println("in static block 2");
	}
	public static void m1() {
		
		System.out.println("in static m1");
	}*/
}
