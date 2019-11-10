package me.jatinsingh.test6;

import java.util.concurrent.ArrayBlockingQueue;

public class Thread3 implements Runnable {
	
	ArrayBlockingQueue<Integer> abq;
	
	public Thread3(ArrayBlockingQueue<Integer> abq) {
		this.abq = abq;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 100 ; i++ ) {
			
			try {
				System.out.println(abq.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("______");
		}
	}
}
