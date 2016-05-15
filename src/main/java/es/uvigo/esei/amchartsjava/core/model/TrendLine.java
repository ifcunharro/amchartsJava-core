package es.uvigo.esei.amchartsjava.core.model;

import es.uvigo.esei.amchartsjava.core.controllers.ImageController;

/**
 * Model class for TrendLine.
 * @author Iago Fernández Cuñarro
 *
 */
public class TrendLine extends IModel{
	
	private ImageController finalImage;
	private ImageController initialImage;

	/**
	 * Get finalImage.
	 * @return ImageController Controller for finalImage.
	 */
	public ImageController getFinalImage() {
		return finalImage;
	}
	
	/**
	 * Get initialImage.
	 * @return ImageController Controller for initialImage.
	 */
	public ImageController getInitialImage(){
		return initialImage;
	}
	
	/**
	 * Add a finalImage.
	 * @param imageController Controller for image.
	 */
	public void addFinalImage(ImageController imageController){
		finalImage = imageController;
	}
	
	/**
	 * Add a initialImage.
	 * @param imageController Controller for image.
	 */
	public void addInitialImage(ImageController imageController){
		initialImage = imageController;
	}

}
