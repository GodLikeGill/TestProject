package me.jatinsingh.test2;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class ImageProcessingImpl implements BWImage{

	

	@Override
	public Image blackAndwhite(Image img) {

		        BufferedImage buffImg = (BufferedImage) img; // type cast
		        
			    int height = buffImg.getHeight();
			    int width = buffImg.getWidth();

			    //System.out.println(height + "  " + width + " " + img.getRGB(30, 30));

			    for (int h = 1; h < height; h++) {   // row
			      for (int w = 1; w < width; w++) {   // co
			    	 
			        int rgb = buffImg.getRGB(w, h);
			        int red = (rgb >> 16) & 0x000000FF;
			        int green = (rgb >> 8) & 0x000000FF;
			        int blue = (rgb) & 0x000000FF;

			        
			        
			        //111111111111111111111111111111111111111111111111
			        
			        
			        if (red < 180 && green < 160 && blue < 160) {
			        	 buffImg.setRGB(w, h, 0);
			        }else {
			        	 buffImg.setRGB(w, h, 16777215);
			        }
//			        try {
//						Thread.sleep(2);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
			      }
			      System.out.print("\n");
			    }

		return buffImg;
	}

	@Override
	public Image resizeImage(Image img) {

	        BufferedImage inputImage = (BufferedImage) img;
	 
	        // creates output image
	        BufferedImage outputImage = new BufferedImage(50,
	                50, inputImage.getType());
	 
	        // scales the input image to the output image
	        Graphics2D g2d = outputImage.createGraphics();
	        g2d.drawImage(inputImage, 0, 0, 20, 50, null);
	        g2d.dispose();
	
	        return outputImage;
	
	    }

}