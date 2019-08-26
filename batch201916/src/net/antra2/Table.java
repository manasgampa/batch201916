package net.antra2;

public class Table {

	public synchronized void printTable(int j) {
		for(int i=1;i<=5;i++) {
		System.out.println(Thread.currentThread()+":"+i*j);
		}
	}
}
