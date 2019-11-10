package me.jatinsingh.test3;

import java.util.ArrayList;

public class Producer implements Runnable {
	
	ArrayList<Integer> sharedArrayList;
	
	public Producer(ArrayList<Integer> sharedArrayList) {
		this.sharedArrayList = sharedArrayList ;
	}

	public void run() {
		
		for(int i=0; i<10;i++) {
			synchronized (sharedArrayList){
				sharedArrayList.add(i);
				
				System.out.println(sharedArrayList);
			}	
		}	
	}
}
