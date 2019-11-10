package me.jatinsingh.test6;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Thread1 implements Runnable {
	
	ArrayBlockingQueue<Integer> abq;
	
	public Thread1(ArrayBlockingQueue<Integer> abq) {
		this.abq = abq;
	}
	
	@Override
	public void run() {

		for(int i = 0; i < 100 ; i++ ) {
			
			Random rand = new Random();
			int number = rand.nextInt(101);
			try {
				abq.put(number);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
