package net.antra;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapEx {

	public static void main(String[] args) {
		
		//HashMap hm=new HashMap();//un ordered//keys cannot be duplicated, values cannot be duplicated//hashtable Data structure
		//LinkedHashMap hm=new LinkedHashMap();//ordered//keys cannot be duplicated, values cannot be duplicated//HashTable and LinkedList
		//Hashtable hm=new Hashtable();
		ConcurrentHashMap hm=new ConcurrentHashMap();
		hm.put(51,"manas");
		hm.put(29, "Song Han");
		hm.put(43, "Tom");
		hm.put(40, "Bob");
		hm.put(235, "kenny");
		hm.put(65, "kumar");
		hm.put(31, "Ram");
		hm.put(78, "kumar");
		//hm.remove(235);
		//System.out.println(hm.get(65));
		Set set=hm.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(hm.get(it.next()));
			hm.put(4, "Hanzheng");
		}
		
		
	}
}
