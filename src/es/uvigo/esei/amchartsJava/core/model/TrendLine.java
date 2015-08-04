package es.uvigo.esei.amchartsJava.core.model;

import es.uvigo.esei.amchartsJava.core.api.IImageController;

public class TrendLine extends IModel{
	
	private IImageController finalImage;
	private IImageController initialImage;

	public Object getFinalImage() {
		return finalImage;
	}
	
	public Object getInitialImage(){
		return initialImage;
	}
	
	public void addFinalImage(IImageController imageController){
		finalImage = imageController;
	}
	
	public void addInitialImage(IImageController imageController){
		initialImage = imageController;
	}

}
