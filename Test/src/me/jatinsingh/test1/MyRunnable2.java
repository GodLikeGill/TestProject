package me.jatinsingh.test1;

import java.util.ArrayList;

public class MyRunnable2 implements Runnable {
	private ArrayList<Integer> sharedTemp;
	
	
	
	public void setSharedTemp(ArrayList<Integer> sharedTempList) {
		this.sharedTemp = sharedTempList;
	}
	
	int acPowerSetting = 1; // 0,1,2,3,4,5
	
	public void run() {		
		
		for(int i = 0 ; i < (i+1) ; i++) {
			
			setacpowersetting();
			System.out.print("AC Power Setting: " + acPowerSetting + "\n");
			
			try {
				Thread.sleep(11000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}// end run
	
	  public int setacpowersetting() {
	    	
	    	// 50-46 -> 5 , 45-41 -> 4 , 40-36 -> 3 , 35-31 -> 2 , 30-26 -> 1 , 25-21 -> 0
	    	
			if(sharedTemp.get(0) > 46) {
				acPowerSetting = 5;
				return acPowerSetting;
			}
			if(sharedTemp.get(0) > 41) {
				acPowerSetting = 4;
				return acPowerSetting;
			}
			if(sharedTemp.get(0) > 36) {
				acPowerSetting = 3;
				return acPowerSetting;
			}
			if(sharedTemp.get(0) > 31) {
				acPowerSetting = 2;
				return acPowerSetting;
			}
			if(sharedTemp.get(0) > 26) {
				acPowerSetting = 1;
				return acPowerSetting;
			}
			else {
				acPowerSetting = 0;
				return acPowerSetting;
			}
		}

}
