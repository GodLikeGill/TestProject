package me.jatinsingh.test4;

import java.util.ArrayList;

public class FinalSum implements Runnable {
	
	ArrayList<Integer> AL;
	
	public FinalSum(ArrayList<Integer> AL) {
		this.AL = AL;
	}

	@Override
	public void run() {
		
		while(AL.size() <2) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		synchronized(AL) {
			System.out.println();
		}
	}

}
