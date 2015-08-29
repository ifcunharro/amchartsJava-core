package es.uvigo.esei.amchartsJava.core.model;

import es.uvigo.esei.amchartsJava.core.controllers.ImageController;

public class TrendLine extends IModel{
	
	private ImageController finalImage;
	private ImageController initialImage;

	public ImageController getFinalImage() {
		return finalImage;
	}
	
	public ImageController getInitialImage(){
		return initialImage;
	}
	
	public void addFinalImage(ImageController imageController){
		finalImage = imageController;
	}
	
	public void addInitialImage(ImageController imageController){
		initialImage = imageController;
	}

}
