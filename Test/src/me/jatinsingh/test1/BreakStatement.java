package me.jatinsingh.test1;

import java.util.Random;

public class BreakStatement {

	public static void main(String[] args) {
		
		int i = 0;
		
		for(;;) {
			
			i=i+1;
			
			Random rand = new Random();
			int number = rand.nextInt(20);
			
			System.out.print(number + ", ");
			
			if(number == 12) {
				
				System.out.print("\nNumber 12 found after " + i + " loops.");
				break;
			}
		}
	}
}
