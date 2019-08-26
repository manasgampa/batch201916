package net.antra;

public class ThreadEx1 extends Thread {

	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("in thread class"+i);
		}
	}
}
