package me.jatinsingh.test3;

import java.util.ArrayList;
import java.util.Scanner;

public class Consumer implements Runnable {
	
	ArrayList<Integer> sharedArrayList;

	public Consumer(ArrayList<Integer> sharedArrayList ) {
		this.sharedArrayList = sharedArrayList ;
	}
	
	int count=0;
	
	public void run() {
		for(;;) {
			synchronized (sharedArrayList){
				if(!sharedArrayList.isEmpty()){
					System.out.println(sharedArrayList.remove(0));
					count++;
				}					
			}
			if(count>=10) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Producer's Name :");
				String input = scanner.nextLine();
				System.out.print("The Producer Name Entered is : " + input);
				scanner.close();
				break;
			}
		}
	}
}
