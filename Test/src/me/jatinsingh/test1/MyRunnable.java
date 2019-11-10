package me.jatinsingh.test1;

import java.util.ArrayList;
import java.util.Random;

public class MyRunnable implements Runnable {

	private ArrayList<Integer> sharedTemp;
	
	
	
	public void setSharedTemp(ArrayList<Integer> sharedTempList) {
		this.sharedTemp = sharedTempList;
	}



	public void run() {	
		
		Random rand = new Random(); 
        
        for (;;) {
        	
        	sharedTemp.set(0, 30 + rand.nextInt(21));
        	
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	System.out.print("Temp: " + sharedTemp + "\n");
        }
	}

}
