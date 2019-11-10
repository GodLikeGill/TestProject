package me.jatinsingh.test2;

import java.util.LinkedList;

public class LinkedListMainSeperate {
	
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		System.out.println("List          :  " + list);
		System.out.println("Remove        :  " + list.remove());
		System.out.println("List          :  " + list);
		System.out.println("First Element :  " + list.getFirst());
		System.out.println("Last Element  :  " + list.getLast());
	}
}
