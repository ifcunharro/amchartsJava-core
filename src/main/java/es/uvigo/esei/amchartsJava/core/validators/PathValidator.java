package es.uvigo.esei.amchartsJava.core.validators;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

import es.uvigo.esei.amchartsJava.core.constants.ImageExtensions;
import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;

/**
 * This class contains validators to path.
 * @author Iago Fernández Cuñarro
 *
 */
public class PathValidator {
	
	private PathValidator(){
		
	}
	
	/**
	 * Check image exists in images folder.
	 * @param image Name of image file with or without file extension.
	 * @return String Name of image file with extension or empty string if doesn't exist.
	 */
	public static String imageExist(String image){
		if(image != null && !image.isEmpty()){
			URL resourcesPath = null;
			
			resourcesPath = PathValidator.class.getProtectionDomain()
										   .getCodeSource()
										   .getLocation();
	
			try {
				resourcesPath = new URL(URLDecoder.decode(resourcesPath.toString(),"UTF-8"));
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
			} catch (MalformedURLException | UnsupportedEncodingException e) {
				return "";
			}
		}
		
		return "";
		
	}
	
	/**
	 * Check icon exists in images folder.
	 * @param icon Name of icon with or without file extension.
	 * @return String Name of icon without extension or empty string if doesn't exist.
	 */
	public static String dragIconExist(String icon){
		if(icon != null && !icon.isEmpty()){
			URL resourcesPath = null;
			
			resourcesPath = PathValidator.class.getProtectionDomain()
										   .getCodeSource()
										   .getLocation();
	
			try {
				resourcesPath = new URL(URLDecoder.decode(resourcesPath.toString(),"UTF-8"));
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
			} catch (MalformedURLException | UnsupportedEncodingException e) {
				return "";
			}
		}
		
		return "";
		
	}
	
	/**
	 * Check theme exists in themes folder.
	 * @param theme Name of theme without extension.
	 * @return boolean Exist or doesn't exist in themes folder.
	 */
	public static boolean themeExist(String theme){
		if(theme != null && !theme.isEmpty()){
			URL resourcesPath = null;
			
			resourcesPath = PathValidator.class.getProtectionDomain()
										   .getCodeSource()
										   .getLocation();
			
			try {
				resourcesPath = new URL(URLDecoder.decode(resourcesPath.toString(),"UTF-8"));
				resourcesPath = new URL(resourcesPath,AmchartsJavaPaths.THEMES_PATH+theme+".js");			
			} catch (MalformedURLException | UnsupportedEncodingException e) {
				return false;
			}
			
			return new File(resourcesPath.getFile()).exists();
		}
		return false;
	}
	
	/**
	 * Check pattern exists in patterns folder.
	 * @param directoryPattern Folder into pattern folder where is pattern.
	 * @param pattern Name of pattern with or without extension.
	 * @return String Path complete to pattern or empty string if doesn't exist.
	 */
	public static String patternExist(String directoryPattern, String pattern){
		if(directoryPattern != null && pattern != null && !directoryPattern.isEmpty() && !pattern.isEmpty()){
			URL resourcesPath = null;
			
			resourcesPath = PathValidator.class.getProtectionDomain()
										   .getCodeSource()
										   .getLocation();
	
			try {
				resourcesPath = new URL(URLDecoder.decode(resourcesPath.toString(),"UTF-8"));
				resourcesPath = new URL(resourcesPath,AmchartsJavaPaths.URL_PATTERNS+directoryPattern+"/"+pattern);
				
				if(new File(resourcesPath.getFile()).exists()){
					return AmchartsJavaPaths.URL_PATTERNS+directoryPattern+"/"+pattern;
				}else if(pattern.lastIndexOf(".") != pattern.length()-4){
					
					
					for(ImageExtensions extension: ImageExtensions.values()){
						resourcesPath = new URL(resourcesPath,pattern+"."+extension.toString());
						if(new File(resourcesPath.getFile()).exists()){
							return AmchartsJavaPaths.URL_PATTERNS+directoryPattern+"/"+pattern+"."+extension;
						}
					}
					
					
				}
			} catch (MalformedURLException | UnsupportedEncodingException e) {
				return "";
			}
		}
		
		return "";
	}
	
	/**
	 * Check file exists in temp folder.
	 * @param jsonFile Name of json file with or without file extension.
	 * @return String path complete to temp file.
	 */
	public static String tempFileExist(String jsonFile){
		if(jsonFile != null && !jsonFile.isEmpty()){
			URL resourcesPath = null;
			
			resourcesPath = PathValidator.class.getProtectionDomain()
										   .getCodeSource()
										   .getLocation();
	
			try {
				resourcesPath = new URL(URLDecoder.decode(resourcesPath.toString(),"UTF-8"));
				resourcesPath = new URL(resourcesPath,AmchartsJavaPaths.TEMP_DIRECTORY+jsonFile);
				System.out.println(resourcesPath);
				if(new File(resourcesPath.getFile()).exists()){
					//se elimina protocolo file:/ al devolver la ruta completa
					return "/"+resourcesPath.toString().substring(6, resourcesPath.toString().length());
				}else if(jsonFile.lastIndexOf(".") != jsonFile.length()-5){
					
					resourcesPath = new URL(resourcesPath,jsonFile+".json");
					
					if(new File(resourcesPath.getFile()).exists()){
						return "/"+resourcesPath.toString().
								substring(6, resourcesPath.toString().length());
					}
					
				}
			} catch (MalformedURLException | UnsupportedEncodingException e) {
				return "";
			}
		}
		
		return "";
	}
	
	/**
	 * Check custom bullet or custom marker exists in images folder.
	 * @param custom Name of custom bullet or marker with or without file extension.
	 * @return Path of bullet/marker or empty string if doesn't exist.
	 */
	public static String customBulletOrMarkerExist(String custom){
		if(custom != null && !custom.isEmpty()){
			URL resourcesPath = null;
			
			resourcesPath = PathValidator.class.getProtectionDomain()
										   .getCodeSource()
										   .getLocation();
	
			try {
				resourcesPath = new URL(URLDecoder.decode(resourcesPath.toString(),"UTF-8"));
				resourcesPath = new URL(resourcesPath,AmchartsJavaPaths.IMAGES_PATH+custom);
				//se ha pasado bullet con extension
				if(new File(resourcesPath.getFile()).exists()){
					//se elimina protocolo file
					return resourcesPath.toString().substring(6);
				}else if(custom.lastIndexOf(".") != custom.length()-4){
					
					//se comprueba con todas las extensiones soportadas para imagen
					for(ImageExtensions extension: ImageExtensions.values()){
						resourcesPath = new URL(resourcesPath,custom+"."+extension.toString());
						if(new File(resourcesPath.getFile()).exists()){
							return resourcesPath.toString().substring(6);
						}
					}
				}
			} catch (MalformedURLException | UnsupportedEncodingException e) {
				return "";
			}
		}
		
		return "";
		
	}
		
}
