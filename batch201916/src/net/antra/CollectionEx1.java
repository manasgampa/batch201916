package net.antra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>(3);//Object Array Data structure//can retrive the array very fast
		//LinkedList al=new LinkedList();//double linkedlist Data structure//insertion and deletion are very fast
		//Vector al=new Vector();//Resizable array DS
		/*al.add(1);
		al.add(45.23f);
		al.add(new Student());
		al.add("manas");
		al.add(1);
		al.remove(1);
		al.add(1, 67.23f);*/
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
	
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		List li=Collections.unmodifiableList(al);
		li.add(65);
		
		/*for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}*/
		
		//
		//System.out.println(al);
		//Object obj=al.get(3);
		
		
		
	}

}
