package me.jatinsingh.test2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageProcessingMain {

	public static void main(String[] args) throws IOException {
		
		try {
	    	 
			BufferedImage img = ImageIO.read(new File("C:\\Users\\Jatin\\Desktop\\Class\\download.jpg"));
			
			BWImage a;
			a=new ImageProcessingImpl();
			BufferedImage img2 = (BufferedImage) a.blackAndwhite(img);
			
			ImageIO.write(img2, "jpg", new File("C:\\Users\\Jatin\\Desktop\\Class\\download_bg.jpg"));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
	    	 
			BufferedImage img = ImageIO.read(new File("C:\\Users\\Jatin\\Desktop\\Class\\download.jpg"));
			
			BWImage a;
			a=new ImageProcessingImpl();
			BufferedImage img2 = (BufferedImage) a.resizeImage(img);
			
			ImageIO.write(img2, "jpg", new File("C:\\Users\\Jatin\\Desktop\\Class\\download_rs.jpg"));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
