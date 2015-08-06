package es.uvigo.esei.amchartsJava.core.validators;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsJava.core.filters.ImageExtensions;

public class PathValidator {
	
	private PathValidator(){
		
	}
	
	public static String imageExist(String image){
		
		URL resourcesPath = null;
		
		resourcesPath = StringValidator.class.getProtectionDomain()
									   .getCodeSource()
									   .getLocation();

		try {
			resourcesPath = new URL(resourcesPath,AmchartsJavaPaths.IMAGES_PATH+image);
			//se ha pasado image con extension
			if(new File(resourcesPath.getFile()).exists()){
				return image;
			}else if(image.lastIndexOf(".") != image.length()-4){
				
				//se comprueba con todas las extensiones soportadas para imagen
				for(ImageExtensions extension: ImageExtensions.values()){
					resourcesPath = new URL(resourcesPath,image+"."+extension.toString());
					if(new File(resourcesPath.getFile()).exists()){
						return image+"."+extension.toString();
					}
				}
			}
		} catch (MalformedURLException e) {
			return "";
		}
		
		return "";
		
	}
	
	public static String dragIconExist(String icon){
		
		URL resourcesPath = null;
		
		resourcesPath = StringValidator.class.getProtectionDomain()
									   .getCodeSource()
									   .getLocation();

		try {
			resourcesPath = new URL(resourcesPath,AmchartsJavaPaths.IMAGES_PATH+icon);
			//se ha pasado icon con extension
			if(new File(resourcesPath.getFile()).exists()){
				return icon.substring(0, icon.length()-4);
			}else if(icon.lastIndexOf(".") != icon.length()-4){
				
				//se comprueba con todas las extensiones soportadas para imagen
				for(ImageExtensions extension: ImageExtensions.values()){
					resourcesPath = new URL(resourcesPath,icon+"."+extension.toString());
					if(new File(resourcesPath.getFile()).exists()){
						return icon;
					}
				}
			}
		} catch (MalformedURLException e) {
			return "";
		}
		
		return "";
		
	}
	
	//theme es nombre de javascript file sin extensión
	public static boolean themeExist(String theme){
		
		URL resourcesPath = null;
		
		resourcesPath = StringValidator.class.getProtectionDomain()
									   .getCodeSource()
									   .getLocation();
		
		try {
			resourcesPath = new URL(resourcesPath,AmchartsJavaPaths.THEMES_PATH+theme+".js");			
		} catch (MalformedURLException e) {
			return false;
		}
		
		return new File(resourcesPath.getFile()).exists();
	}

}
