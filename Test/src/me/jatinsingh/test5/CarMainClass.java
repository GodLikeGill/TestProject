package me.jatinsingh.test5;

public class CarMainClass {
	
	public static void main(String args[]) {
		
		InterfaceClass Car = null;
		
		int choice = 3 ;
		if(choice == 1) {
			Car = new Audi();
		}
		if(choice == 2) {
			Car = new BMW();
		}
		if(choice == 3) {
			Car = new Maruti();
		}
		Car.run();
	}
}
