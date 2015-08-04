package es.uvigo.esei.amchartsJava.core.validators;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsJava.core.filters.ImageExtensions;

public class PathValidator {
	
	private PathValidator(){
		
	}
	
	public static boolean imageExist(String image){
		
		URL resourcesPath = null;
		
		resourcesPath = StringValidator.class.getProtectionDomain()
									   .getCodeSource()
									   .getLocation();

		try {
			resourcesPath = new URL(resourcesPath,AmchartsJavaPaths.IMAGES_PATH+image);
			//se ha pasado image con extension
			if(new File(resourcesPath.getFile()).exists()){
				return true;
			}else if(image.lastIndexOf(".") != image.length()-4){
				
				//se comprueba con todas las extensiones soportadas para imagen
				for(ImageExtensions extension: ImageExtensions.values()){
					resourcesPath = new URL(resourcesPath,image+"."+extension.toString());
					System.out.println(resourcesPath.toString());
					if(new File(resourcesPath.getFile()).exists()){
						return true;
					}
				}
			}
		} catch (MalformedURLException e) {
			return false;
		}
		
		return false;
		
	}
	
	//theme es nombre de javascript file sin extensión
	public static boolean themeExist(String theme){
		
		URL resourcesPath = null;
		
		resourcesPath = StringValidator.class.getProtectionDomain()
									   .getCodeSource()
									   .getLocation();
		
		try {
			resourcesPath = new URL(resourcesPath,AmchartsJavaPaths.THEMES_PATH+theme);
			//si se ha pasado con extension
			if(new File(resourcesPath.getFile()).exists()){
				return true;
			}
			//se pone la extension en caso de no llevarla
			resourcesPath = new URL(resourcesPath,AmchartsJavaPaths.THEMES_PATH+theme+".js");
		} catch (MalformedURLException e) {
			return false;
		}
		
		return new File(resourcesPath.getFile()).exists();
	}

}
