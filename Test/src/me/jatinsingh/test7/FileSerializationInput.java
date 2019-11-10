package me.jatinsingh.test7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileSerializationInput {
	
	public static void main(String[] args) {
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\Jatin\\Desktop\\Test\\lol.txt");

			ObjectInputStream in = new ObjectInputStream(fis); 

			SerialStudent student1 = (SerialStudent) in.readObject();

			in.close(); 
			fis.close(); 
			
			System.out.println(student1.getName());
			System.out.println(student1.getAddress());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
