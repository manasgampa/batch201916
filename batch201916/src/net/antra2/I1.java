package net.antra2;

public interface I1{
	
	public void m1();
	
	public default void m2() {
		System.out.println("in java 8 default methods of I1");
	}

	public static void m3() {
		System.out.println("in java 8 static method");
	}
}
