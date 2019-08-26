package net.antra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.ImmutableDescriptor;

import net.antra2.Test;

public  class Sample {//class name //identifier
	
	static int i=56;
	
	public static void main(String[] args)  {//identifier
		
		/*ThreadEx2 th2=new ThreadEx2();
		Thread tr1=new Thread(th2);
		tr1.start();
		*/
		/*ThreadEx1 tr1=new ThreadEx1();
		tr1.start();
		ThreadEx1 tr2=new ThreadEx1();
		tr2.start();*/
		/*Integer it=new Integer(6);
		int i=it;
		System.out.println(i);
		Employee emp=new Employee(1);*/
		
		//String str1=new String("manas");
		//String str2="kumar";
		
		
		/*
		StringBuffer sb1=new StringBuffer("manas");
		StringBuffer sb2=new StringBuffer("manas");
		String str3=sb1.toString();
		String str4=sb2.toString();
		if(str3.equals(str4)) {
			System.out.println("true");
		}else {
			
			System.out.println("false");
		}
		*/
		
		/*String str1=new String("manas");
		String str2=new String("manas");
		
		if(str1.equals(str2)) {
			System.out.println("true");
		}else {
			
			System.out.println("false");
		}*/
		
		
		/*StringBuffer sb=new StringBuffer("manas");
		sb.append(" kumar");
		System.out.println(sb);*/
		/*ImmutableEx ex=new ImmutableEx(3);
		int i=ex.getI();*/
		//System.out.println(i);
		/*String str=new String("manas");//immutable
		String str2=str.concat(" kumar");
		System.out.println(str2);*/
		
		/*Employee emp1=new Employee(12);
		Employee emp2=new Employee(12);
		int i=20;
		int j=20;
		
		System.out.println(emp1);
		System.out.println(emp2);
		if(emp1.equals(emp2)) {
			
			System.out.println("true");
		}else {
			System.out.println("false");
		}*/
		
		
		
		
		/*System.out.println(emp);*/
		//System.out.println(emp.toString());
		
		
		/*StudentNotFoundException sc=new StudentNotFoundException("no student found");
		
		
		throw new StudentNotFoundException("no student found");*/
		
		//throw new ArithmeticException();
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter i value:");
		int i=sc.nextInt();
		System.out.println("enter j value:");
		int j;
		
		try {
			j=sc.nextInt();
			int k=i/j;
			System.out.println("div:"+k);
		//	FileInputStream fis=new FileInputStream("abc.txt");
			int m=i+j;
			System.out.println("add:"+m);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("in arithemetic");
		}catch (InputMismatchException in) {
			System.out.println("in input mismatch");
		}finally {
			System.out.println("in finally");
		}*/
			
			
	//System.out.println("in last");
		
		
		/*Employee emp=new Employee(12);
		Employee emp1=new Employee(12,"manas");*/
		
		/*Parent p=new Child();		
		p.parentM1();
		p.commenMethod();
		*/
		//Child ch=new Parent();//not possible
		/*Parent pa=new Parent();
		Child ch=new Child();*/

		
		/*Employee emp=new Employee();
		emp.setEmployeeId(52);
		System.out.println(emp.getEmployeeId());*/
		
		/*String str=new String("manas");
		System.out.println(str.concat(" kumar"));*/
		
		/*Child ch=new Child();
		ch.childJ=56;
		ch.m4();*/
		
		
		//Employee e=new Employee();
		/*Employee e=new Employee();
		System.out.println(e.employeeId);*/
		
		/*BMW bmw=new BMW();
		bmw.i=67;
		*/
		/*Car c=new Car();
		System.out.println(c.i);
		c.m1();*/
		
		//int x=5;
		//int y=x++;//5 //6
		//x=x++;
		
		//System.out.println(x);
		//System.out.println(y);
		/*Child ch=new Child();
		ch.m1();
		ch.m4();
		
		Parent p=new Parent();
		p.m1();*/
		
		/*Parent p=new Parent();
		p.m1();
		p.m1(56);
		p.m1(45, "manas");*/
		
		
		/*Parent p=new Parent();
		System.out.println(p.parentI);
		//System.out.println(p.childJ);
		Child ch=new Child();
		System.out.println(ch.childJ);
		System.out.println(ch.parentI);*/
		/*Student st=new Student();
		System.out.println(st.studentId);*/
		
		/*int i=10;
		int j=20;
		System.out.println(i!=j);*/
		
		/*int i=10;
		int j=20;
		int k=30;
		int m=40;
		String str="manas";
		
		System.out.println(i+j+k+m+str);
		
		System.out.println(i+j+k+str+m);
		System.out.println(i+j+str+k+m);
		System.out.println(str+i+j+k+m);
		*/
		/*int x=2;
		x=x++;
		//int y=x--;//2->1
		
		System.out.println("x:"+x);
		//System.out.println("y:"+y);
*/		
		/*int k=9;
		System.out.println(k);*/
		/*Student st1=new Student();
		
		System.out.println(st1.marks);
		st1.marks=59;
		
		Student st2=new Student();
		System.out.println(st2.marks);*/
		
		/*Student.marks=59;
		System.out.println(i);
		System.out.println(Student.marks);
		System.out.println(Student.marks2);*/
		
		/*Student st1=new Student();
		System.out.println(st1.str);

		System.out.println(st1.studentId);
		st1.studentId=56;
		System.out.println(st1.studentId);
		
		st1.m1();
		
		Student st2=new Student();
		System.out.println(st2.studentId);
		st2.m1();*/
		/*Sample sm=new Sample();
		System.out.println(sm.i);
		sm.i=67;
		System.out.println(sm.i);*/
		
		/*int i[]=new int[3];
		i[0]=56;
		i[1]=62;
		i[2]=90;
		
		int k[]= {45,34,46,78,23,41};
		int m=45;*/
		
		/*for(int j:i) {
			System.out.println(j);
		}*/
		
		//System.out.println(i[2]);
		/*for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}*/
		
		
		
		/*boolean b=false;//no size// no range
		System.out.println(b);*/
		/*char ch='a';//2 byte //no range
		System.out.println(ch);*/
		/*double d=234.245;//8 bytes //14 to 15 decimal points
		System.out.println(d);*/
		/*float f=54.67f;//4 bytes//5 to 6 decimal point
		System.out.println(f);*/
		
		/*long l=34;//-2^63 to (2^63)-1// 8 bytes
		System.out.println(l);
		int i=45;//-2^31 to (2^31)-1// 4 bytes
		short s=45;//-32768 to 32767// 2 bytes
		System.out.println(s);*/
		/*byte b=(byte) 130;//-128 to 127//1 byte
		System.out.println(b);*/
		
		/*int i=10;//identifier
		int r5=56;//A to Z, a to z, 0 to 9, _ ,$
		int s_56=45;
		int ab$cd=234;
		int $=34;
		System.out.println(ab$cd);*/
	}
	
	
	
}
