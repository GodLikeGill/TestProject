package me.jatinsingh.test2;

import java.io.Serializable;
import java.util.HashMap;

public class ClassStudentMain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		HashMap<Integer,ClassStudent> lol = new HashMap<Integer,ClassStudent>();
		
		lol.put(101, new ClassStudent(1, "Jatin", "GCET"));
		lol.put(102, new ClassStudent(2, "Gagan", "PEC"));
		lol.put(103, new ClassStudent(3, "Akshay", "CGC"));
		lol.put(104, new ClassStudent(4, "Navpreet", "GCET"));
		lol.put(105, new ClassStudent(5, "Nikhil", "PEC"));
		lol.put(106, new ClassStudent(6, "Abhishek", "PEC"));
		lol.put(107, new ClassStudent(7, "Madhav", "DAV"));
		lol.put(108, new ClassStudent(8, "Aman", "DAV"));
		lol.put(109, new ClassStudent(9, "John Cena", "WWE"));
		lol.put(110, new ClassStudent(10, "Brock Lesner", "WWE"));
		
		for(int i = 101 ; i < 110 ; i++ ) {
			System.out.println(lol.get(i));
		}
	}
}
