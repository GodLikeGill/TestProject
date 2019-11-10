package me.jatinsingh.test4;

import java.util.ArrayList;

public class SumMain {
	
	public static void main(String[] args) {
		
		Numbers no =  new Numbers();
		
		int a = no.getfirstno();
		int b = no.gett1end();
		int c = no.gett2start();
		int d = no.getlastno();
		
		ArrayList<Integer> AL = new ArrayList<Integer>();
		
		Thread Sum1 = new Thread(new Sum(AL, a, b));
		Thread Sum2 = new Thread(new Sum(AL, c, d));
				
		Sum1.start();
		Sum2.start();

	}
}
