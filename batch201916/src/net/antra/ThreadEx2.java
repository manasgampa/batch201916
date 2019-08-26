package net.antra;

public class ThreadEx2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("in thread2:"+i);
		}
	}

}
