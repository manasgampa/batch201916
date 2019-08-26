package net.antra2;

public class Thread1Ex extends Thread{
	Table t;
	
	Thread1Ex(Table t){
		this.t=t;
		
	}
	public void run() {
		
		t.printTable(5);
	}
	
}
