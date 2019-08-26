package net.antra2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import net.antra.Student;
import net.antra.ThreadEx1;
import net.antra.ThreadEx2;

public class Test {
	
	
	/*public static void m2() {
		
		System.out.println("this is m2");
	}*/
	
	
	public static void main(String[] args) {
		
	/*	Runnable r=()->{for(int i=0;i<10;i++) {
			System.out.println("in runnable");
		}};*/
		
		//Runnable r=Sample::m1;//static method reference
		/*Sample sm=new Sample();
		I3 r=sm::m1;
		Thread th=new Thread(r);
		th.start();*/
		
		
		/*List al=new ArrayList();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);*/
		//al.parallelStream().forEach(i->System.out.println(i));
		//al.stream().forEach(i->System.out.println(i));
		List<Person> list=Arrays.asList(new Person("Sara","F",20),
				new Person("Sara","F",27),
				new Person("Bob","M",20),
				new Person("Paula","F",32),
				new Person("Paul","M",32),
				new Person("Jack","M",2),
				new Person("Jack","M",72),
				new Person("Jill","F",12)
				);
		List<Person> list1=list.stream().filter(p->p.getAge()>30).map(p->{p.setName(p.getName()+" hi"); return p;}).collect(Collectors.toList());
		list1.stream().forEach(p->System.out.println(p.getName()));
		/*List<Person> al=list.stream().map(p->{p.setAge(p.getAge()+5);
		return p;}).collect(Collectors.toList());
		
		al.stream().forEach(per->System.out.println(per.getAge()));
		*/
		
		/*List li=new ArrayList();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			Person per=(Person)obj;
			int age=per.getAge();
			age=age+5;
			per.setAge(age);
				li.add(per);
		}
		for(int i=0;i<li.size();i++) {
			Person per=(Person)li.get(i);
			System.out.println(per.getAge());
		}*/
		
		/*List<Person> li=list.stream().filter(per->per.getAge()>30).collect(Collectors.toList());
		li.stream().forEach(per->System.out.println(per.getName()));*/
		
		
		
		//list.stream().forEach(i->System.out.println(i));
		
		/*for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}*/
		
			
		/*List li=new ArrayList();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			Person per=(Person)obj;
			if(per.getAge()>30) {
				li.add(per);
			}
			
		}
		
		for(int i=0;i<li.size();i++) {
			Person per=(Person)li.get(i);
			System.out.println(per.getName());
		}*/
		/*List al=new ArrayList();
		al.add(new Person("Manas","M",20));
		al.add(new Person("kumar","M",52));*/
		
		/*int i[]= {1,2,3,4,5,6,7};
		List li=Arrays.asList(i);*/
		
		
		
		/*Runnable r=()->{System.out.println("in runnable");};
		Thread th=new Thread(r);
		th.start();*/
		
		/*BiFunction<Integer, Integer, Integer> bi=(i,j)->{return i+j;};  
		System.out.println(bi.apply(10, 20));*/
		/*Function<Integer,Integer> fun=(i)->i+1;
		System.out.println(fun.apply(1));*/
		
		/*I3 i3=i->i+1;
		
		int j=i3.add(10);
		System.out.println(j);
		*/
		
		/*Test2 t2=new Test2();
		t2.m2();
		
		I1.m3();*/
		
		
		/*Test te=new Test();
		I1 i1=Test::m2;
		i1.m1();*/
		/*Test2 t2=new Test2();
		t2.m2();
		I1.m3();*/
		
		/*Table t=new Table();
		Thread1Ex th1=new Thread1Ex(t);
		Thread2Ex th2=new Thread2Ex(t);
		th1.setName("manas");
		th2.setName("kumar");
		th2.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		th2.start();*/
		
		/*int i=0;
		 i = 
		  i++ //0
		  + //1
		  i++ //1
		  + //2
		  ++i //3
		  +//3 
		  ++i //4
		  + //4
		  i++;//4 
		 System.out.println(i);*/
		/*String str="manas";
		str.toUpperCase();
		System.out.println(str);
		int x=3;
		x=x++; 
		System.out.println(x);
		System.out.println(x);
		System.out.println(x++);*/
		/*I1 i1=i->i=i+1;
		System.out.println(i1.m1(123));*/
		/*int arr[]= {34,12,34,4,5,221,13,12,34,42,56,67,221,53};
		for(int i=0;i<arr.length;i++) {//--------n+1=n
			for(int j=i+1;j<arr.length;j++) {//---n(n+1)=n^2
				if(arr[i]>=arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
					int k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}				
			}
		}
		for(int i=0;i<arr.length-1;i++) { //n
			if(arr[i]==arr[i+1]) {
				arr[i]=0;
			}
		}
		System.out.println(Arrays.toString(arr));*/
		//Student st=new Student();
		//System.out.println(st.studentId);
	}
}
