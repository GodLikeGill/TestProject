package me.jatinsingh.test4;

import java.util.Scanner;

public class Numbers {
	
	public int scanfirstno() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Starting Number : ");
		int firstno = scanner.nextInt();
		
		return firstno;
	}
	public int getfirstno() {
		return 0;
		
	}
	
	public int getlastno() {
		
		return 0;
	}
	public int scanlastno() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Last Number : ");
		int lastno = scanner.nextInt();
		
		return lastno;	
	}
	
	public int gett1end() {
		int t1end = getlastno()/2;
		return t1end;
	}	
	public int gett2start() {
		int t2start= getlastno() + 1;
		return t2start;
	}
}
