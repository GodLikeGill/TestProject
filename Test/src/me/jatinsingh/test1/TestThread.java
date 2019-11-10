package me.jatinsingh.test1;

public class TestThread {
	
	public static void main(String[] args) {
		MyRunnable firstRunnable = new MyRunnable();
		Thread firstThread = new Thread(firstRunnable);
		firstThread.start();
		
		MyRunnable2 secondRunnable = new MyRunnable2();
		Thread secondThread = new Thread(secondRunnable);
		secondThread.start();
	}
}
