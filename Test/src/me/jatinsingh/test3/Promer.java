package me.jatinsingh.test3;

import java.util.ArrayList;

public class Promer {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> sharedArrayList = new ArrayList<Integer>();
		
		Thread producer = new Thread(new Producer(sharedArrayList ));
		Thread consumer = new Thread(new Consumer(sharedArrayList ));
		
		producer.start();
		consumer.start();
	}
}
