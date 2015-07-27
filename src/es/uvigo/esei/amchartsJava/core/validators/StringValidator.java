package es.uvigo.esei.amchartsJava.core.validators;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;

public class StringValidator {
	
	private StringValidator(){
		
	}
	
	public static boolean pixelOrPercent(String coord) throws CoordException{
		if(Pattern.matches("[0-9]+%?", coord)){
			return true;
		}
		throw new CoordException("");
		
	}
	
	public static boolean imageExist(String image){
	
		URL resourcesPath = null;
		
		resourcesPath = StringValidator.class.getProtectionDomain()
									   .getCodeSource()
									   .getLocation();
		
		try {
			resourcesPath = new URL(resourcesPath,"../"+AmchartsJavaPaths.IMAGES_PATH+image);
		} catch (MalformedURLException e) {
			return false;
		}
		
		return new File(resourcesPath.getFile()).exists();
		
		
	}
	

}
