package net.antra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExceptionEx {

	public static void main(String[] args)  {
		

		

		
		
		
		/*Employee emp=new Employee();
			FileInputStream fis=new FileInputStream("abc.txt");
			ObjectInputStream obji=new ObjectInputStream(fis);
			Employee e=(Employee)obji.readObject();
		
		System.out.println("other part");*/
		//Class.forName("net.antra.Child");
		
		/*System.out.println("in main method");
		System.out.println("before dostuff method");
		doStuff();
		System.out.println("after dostuff method");
		System.out.println("end of main method");*/
	}
	
	public static void doStuff() {
		System.out.println("in doStuff method before doMoreStuff");
		doMoreStuff();
		/*try {
		doMoreStuff();
		}catch(Exception e) {
			
		}*/
		
		System.out.println("in doStuff method after doMoreStuff");
	}
	
	public static void doMoreStuff() {
		
		System.out.println(1/0);
		
		System.out.println("in domore stuff ");
	}
}
