package me.jatinsingh.test1;

public abstract class Cars implements Vehicle{
	
	private int speed = 0;
	private String test = "";
	
	public void incSpeed() {
		speed = speed+1;
		test = test + "*";
	}
	public void applybreak() {
		speed = speed-1;
		test = test.substring(0, speed);
	}
	public void printSpeed() {
		
		System.out.print(test  + "\n");
		
	}
}
