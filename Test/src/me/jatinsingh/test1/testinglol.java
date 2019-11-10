package me.jatinsingh.test1;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
public class testinglol {

	


	
	  public static void main(String[] args) throws Exception {
	    BufferedImage img = ImageIO.read(new File("C:\\Users\\Jatin\\Desktop\\download.jpg"));
	    
	    int height = img.getHeight();
	    int width = img.getWidth();

	    //System.out.println(height + "  " + width + " " + img.getRGB(30, 30));

	    for (int h = 1; h < height; h++) {   // row
	      for (int w = 1; w < width; w++) {   // col
	        int rgb = img.getRGB(w, h);
	        int red = (rgb >> 16) & 0x000000FF;
	        int green = (rgb >> 8) & 0x000000FF;
	        int blue = (rgb) & 0x000000FF;

	        
	        //111111111111111111111111111111111111111111111111
	        
	        
	        if (red < 220 && green < 220 && blue < 220) {
	           System.out.print("#" + " ");
	        }else {
	        	System.out.print("." + " ");
	        }
	        Thread.sleep(1);
	      }
	      System.out.print("\n");
	    }
	  }
	
	
}