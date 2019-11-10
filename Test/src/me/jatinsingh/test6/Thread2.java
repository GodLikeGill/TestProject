package me.jatinsingh.test6;

import java.util.concurrent.ArrayBlockingQueue;

public class Thread2 implements Runnable {
	
	ArrayBlockingQueue<Integer> abq;
	
	public Thread2(ArrayBlockingQueue<Integer> abq) {
		this.abq = abq;
	}
	
	@Override
	public void run() {

		for(int i = 0; i < 100 ; i++ ) {
			
			if(!abq.isEmpty()){
				int a = abq.peek();
				System.out.println(abq.peek());
				a = a+1;
				try {
					abq.put(a);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
