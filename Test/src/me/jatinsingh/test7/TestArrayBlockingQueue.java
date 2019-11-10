package me.jatinsingh.test7;

import java.util.concurrent.ArrayBlockingQueue;

public class TestArrayBlockingQueue {

	public class Producer implements Runnable {
		
		ArrayBlockingQueue<Integer> abqLocal ;

		public Producer(ArrayBlockingQueue<Integer> abq ) {
			this.abqLocal = abq;
		}

		@Override
		public void run() {

			for(int i=0;i<100;i++) {
				try {
					abqLocal.put(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public class Consumer implements Runnable {
		
		ArrayBlockingQueue<Integer> abqLocal ;

		public Consumer(ArrayBlockingQueue<Integer> abq ) {
			this.abqLocal = abq;
		}
		
		@Override
		public void run() {
			for(int i=0;i<100;i++) {
				try {
					System.out.println(abqLocal.take());
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] agrs) {
		
		TestArrayBlockingQueue test = new TestArrayBlockingQueue();
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(1);

		Thread producer = new Thread(test.new Producer(abq));
		Thread consumer = new Thread(test.new Consumer(abq));

		producer.start();
		consumer.start();

	}
}