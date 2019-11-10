package me.jatinsingh.test1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ExceptionMain {

	public static void main(String[] args) {
		
		int a=1,b=0,c;
		
		try{
			
			c=a/b;
			@SuppressWarnings("unused")
			BufferedImage img = ImageIO.read(new File("c:/test_data/test_img2.jpg"));
			System.out.println(c);
		}
		catch(IOException e) {
			System.out.println("Got IO Exception");
		}
		catch(ArithmeticException e) {
			System.out.println("Got Arithmatic Exception");
		}
		catch(Exception e) {
			System.out.println("Got Exception");
		}
		finally {
			System.out.println("Hello , im finally");
		}
	}
}
