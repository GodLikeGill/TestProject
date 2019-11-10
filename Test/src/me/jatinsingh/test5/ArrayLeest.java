package me.jatinsingh.test5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeest {
	
	public static void main(String args[]) {
		
		ArrayList<Student> al = new ArrayList<>();
		
		Student student1 = new Student("Jatin", 99);
		Student student2 = new Student("Akshay", 39);
		Student student3 = new Student("Akshit", 69);
		Student student4 = new Student("Gagan", 0);
		Student student5 = new Student("Madhav", 80);
		
		al.add(student1);
		al.add(student2);
		al.add(student3);
		al.add(student4);
		al.add(student5);
		
		Collections.sort(al);
		System.out.println(al);
	}
}
