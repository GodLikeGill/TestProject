package me.jatinsingh.test1;

import java.util.Random;

public class Audi extends Cars {
	
	private int temp = 0;
	private int humidity = 0;
	private int acPowerSetting = 1; // 0,1,2,3,4,5
	private int acHumidityControlSetting = 1; // 1...10
	
	static int HUMIDITY = 80;
	static int TEMPERATURE = 25;
	
	public int getTemp() {
		
		return temp;
	}
	
	public int getHumidity() {
		
		return humidity;
	}
	
	
    public int setacpowersetting(int temp) {
    	
    	// 50-46 -> 5 , 45-41 -> 4 , 40-36 -> 3 , 35-31 -> 2 , 30-26 -> 1 , 25-21 -> 0
    	
		if(temp > 46) {
			acPowerSetting = 5;
			return acPowerSetting;
		}
		if(temp > 41) {
			acPowerSetting = 4;
			return acPowerSetting;
		}
		if(temp > 36) {
			acPowerSetting = 3;
			return acPowerSetting;
		}
		if(temp > 31) {
			acPowerSetting = 2;
			return acPowerSetting;
		}
		if(temp > 26) {
			acPowerSetting = 1;
			return acPowerSetting;
		}
		else {
			acPowerSetting = 0;
			return acPowerSetting;
		}
	}
	
	public int setachumiditysetting() {
		
		return acHumidityControlSetting;
	}
	
	
	public int getacpowersetting() {
		
		return acPowerSetting;
	}
	
	public int getachumiditysetting() {
		
		return acHumidityControlSetting;
	}
	
	public void environmentRandomize() {
		
		Random rand = new Random(); 
		int[] tempRandArray = new int[100];
        
        for (int i=0; i<10; i++) {
        	tempRandArray[i] = 30 + rand.nextInt(21);
        	temp = tempRandArray[i];
        	System.out.print("Temp: " + temp + " , AcPower: " + setacpowersetting(temp) + "\n");
        }
         
        int[] humidityRandArray = new int[100];
        
        for (int i=0; i<10; i++) {
        	humidityRandArray[i] = 70 + rand.nextInt(30);
        }
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Audi details {"+ "temp = " + temp + " | humidity = " + humidity + "}";
	}
	
	
}
