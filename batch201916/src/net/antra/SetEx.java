package net.antra;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx {
	
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new SortEx());
		/*ts.add(34);
		ts.add(54.54f);
		ts.add("manas");*/
		ts.add(43);
		ts.add(12);
		ts.add(34);
		ts.add(8);
		ts.add(2);
		ts.add(45);
		ts.add(78);
		ts.add(3);
		ts.add(44);
		//System.out.println(ts);
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*//HashSet hs=new HashSet();//no duplicates are allowd//unorderd//hashtable Data structure
		LinkedHashSet hs=new LinkedHashSet();//no duplicates//ordered//Linked List and HashTable Data structure
		hs.add(45);
		hs.add(62);
		hs.add(21);
		hs.add(523);
		hs.add(912);
		hs.add(54);
		hs.add(45);
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(int i=0;i<hs.size();i++) {
			System.out.println(hs.get(i));
			
		}*/
		
		
	}

}
