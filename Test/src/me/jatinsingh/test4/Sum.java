package me.jatinsingh.test4;

import java.util.ArrayList;

public class Sum implements Runnable {
	
	ArrayList<Integer> AL;
	
	int a,b;
	
	public Sum(ArrayList<Integer> AL, int a,int b) {
		this.AL = AL;
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		
		int sum=0;
		
		for(int i=a;i<=b;i++) {
			sum=sum+i;
		}
		AL.add(sum);
		System.out.println(sum);
	}
}
