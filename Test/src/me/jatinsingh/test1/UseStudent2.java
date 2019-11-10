package me.jatinsingh.test1;

public class UseStudent2 {
	
	public static void main(String args[]) {
		
		StudentEnc student1 = new StudentEnc("0123" , "Jatin", "1");
		student1.setNumber("9876543210");
		student1.setAddress("Chandigarh");
		
		StudentEnc student2 = new StudentEnc("0124" , "Gagan", "2");
		student2.setNumber("9876543211");
		student2.setAddress("Kharar");
		
		StudentEnc student3 = new StudentEnc("0126" , "Akshay", "3");
		student3.setNumber("9876543212");
		student3.setAddress("Mohali");
		
		StudentEnc student4 = new StudentEnc("0128" , "Akshit", "4");
		student4.setNumber("9876543218");
		student4.setAddress("Panchkula");
		
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		
	}
}
