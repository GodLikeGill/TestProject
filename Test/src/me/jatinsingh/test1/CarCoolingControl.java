package me.jatinsingh.test1;

import java.util.ArrayList;

public class CarCoolingControl {

	public static void main(String[] args) {
		
		ArrayList<Integer> sharedTempList = new ArrayList<Integer>();
		sharedTempList.add(0);
		
		MyRunnable firstRunnable = new MyRunnable();
		firstRunnable.setSharedTemp(sharedTempList);
		Thread firstThread = new Thread(firstRunnable);
		firstThread.start();
		
		
		MyRunnable2 secondRunnable = new MyRunnable2();
		secondRunnable.setSharedTemp(sharedTempList);
		Thread secondThread = new Thread(secondRunnable);
		secondThread.start();
		

	}

}
