package me.jatinsingh.test7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileSerialization {
	
	public static void main(String[] args) {
		
		SerialStudent student1 = new SerialStudent("Jatin","Chandigarh");
		SerialStudent student2 = new SerialStudent("Akshit","Chandigarh");
		SerialStudent student3 = new SerialStudent("Akshay","Naya Gau");
		SerialStudent student4 = new SerialStudent("Gagan","Chandigarh");
		
		try {
			
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Jatin\\Desktop\\Test\\lol.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(student1);
			oos.writeObject(student2);
			oos.writeObject(student3);
			oos.writeObject(student4);
			
			oos.close();
			fos.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
