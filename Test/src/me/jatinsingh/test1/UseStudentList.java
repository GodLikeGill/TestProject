package me.jatinsingh.test1;

import java.io.Serializable;
import java.util.ArrayList;

public class UseStudentList implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		
		ArrayList<Student> studentlist = new ArrayList<Student>();
		
		Student student1 = new Student();
		student1.setName("Jatin");
		student1.setID("1");
		student1.setNumber("1234567890");
		student1.setAddress("CHD");
		
		Student student2 = new Student();
		student2.setName("Gagan");
		student2.setID("2");
		student2.setNumber("1234567891");
		student2.setAddress("CHD");
		
		Student student3 = new Student();
		student3.setName("Akshay");
		student3.setID("3");
		student3.setNumber("1234567892");
		student3.setAddress("Mohali");
		
		Student student4 = new Student();
		student4.setName("Akshit");
		student4.setID("4");
		student4.setNumber("1234567893");
		student4.setAddress("Panchkula");
		
		studentlist.add(student1);
		studentlist.add(student2);
		studentlist.add(student3);
		studentlist.add(student4);
		
		for(int i=0;i<4;i++) {
			System.out.println(studentlist.get(i).toString());
		}
	}
}
