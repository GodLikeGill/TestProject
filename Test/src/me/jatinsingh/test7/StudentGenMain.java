package me.jatinsingh.test7;

public class StudentGenMain {
	
	public static void main(String[] args) {
		
		StudentGen<String> student1 = new StudentGen<String>("" , "1 , Jatin Singh Gill");
		
		System.out.println(student1.totalmarks);
	}
}
