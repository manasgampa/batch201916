package net.antra;

public class Child extends Parent{

	int childJ=87;
	int k=89;
	public void childM1() {
		/*super.parentI=56;
		super.parentM1();*/
		//System.out.println(super.k);
		System.out.println("in child m1 method");
	}
	
	public void commenMethod() {
		
		System.out.println("in child class common method");
	}
	
	/*public void m4() {
		System.out.println("in child m4");
	}
	
	public void m1() {
		System.out.println("in m1 of child");
	}*/
}
