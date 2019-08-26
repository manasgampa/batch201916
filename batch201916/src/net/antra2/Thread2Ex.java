package net.antra2;

public class Thread2Ex extends Thread{
	Table t;
	
	Thread2Ex(Table t){
		this.t=t;
	}
	public void run() {
		
		t.printTable(100);
	}
	
	
}
