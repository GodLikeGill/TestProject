package me.jatinsingh.test1;

public class CarGame {

	public static void main(String[] args) {
		
		Audi myCar = new Audi();
		
		for(int i = 0 ; i < 10 ; i++) {
			
			myCar.incSpeed();
			
			myCar.printSpeed();	
			
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			
			myCar.applybreak();
			
			myCar.printSpeed();
		}
		
		myCar.environmentRandomize();
	}
}
