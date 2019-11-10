package me.jatinsingh.test6;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadMain {

	public static void main(String[] args) {
		
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(1);
		
		Thread T1 = new Thread(new Thread1(abq));
		Thread T2 = new Thread(new Thread2(abq));
		Thread T3 = new Thread(new Thread3(abq));
		
		T1.start();
		T2.start();
		T3.start();
		
	}
}
