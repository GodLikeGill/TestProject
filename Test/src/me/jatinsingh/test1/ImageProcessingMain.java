package me.jatinsingh.test1;

import java.awt.image.BufferedImage;

public class ImageProcessingMain {

	public static void main(String[] args) {
		
		int IncomingSystem = 1;
		
		ImageProcessing a;
		
		if(IncomingSystem == 1) {
			a = new ImageProcessingImpl();
		}
		else {
			a = new ImageProcessingImpl2();
		}
		
		a.blackAndwhite(new BufferedImage(1, 1, 1));
	}
}
