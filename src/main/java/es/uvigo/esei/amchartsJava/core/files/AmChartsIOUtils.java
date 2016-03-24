package es.uvigo.esei.amchartsJava.core.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsJava.core.validators.PropertyValidator;

/**
 * This class contains methods to manipulate temp files
 * @author Iago Fernández Cuñarro
 *
 */
public class AmChartsIOUtils {
	
	/**
	 * Change raw value for export in json file to String 
	 * @param tempFile path to json file
	 * @throws IOException -
	 */
	public static void changeExport(String tempFile) throws IOException{
		if(PropertyValidator.isValidString(tempFile)){
			FileInputStream fis = new FileInputStream(tempFile);
		    String content = IOUtils.toString(fis, StandardCharsets.UTF_8);
		    content = content.replaceAll("AmCharts.exportCFG", "\"AmCharts.exportCFG\"");
		    
		    FileOutputStream fos = new FileOutputStream(tempFile);
		    IOUtils.write(content, fos, StandardCharsets.UTF_8);
		    fis.close();
		    fos.close();
		}
		
	}
	
	/**
	 * Clear temp directory.
	 */
	public static void clearTempDirectory() {
		File path = new File(AmChartsIOUtils.getJsonDirectoryToSave());
		File[] files = path.listFiles();
	    for(int i=0; i<files.length; i++) {
	    	if(!files[i].isDirectory()) {
	    		files[i].delete();
	        }
	     }
	}
	
	/**
	 * Delete temp file.
	 * @param tempFile Path to directory
	 */
	public static void deleteTempFile(String tempFile) {
		if(PropertyValidator.isValidString(tempFile)){
			File path = new File(tempFile);
		    path.delete();   
		}
	}

	/**
	 * Get path to temp folder.
	 * @return path to temp folder.
	 */
	public static String getJsonDirectoryToSave(){
		URL resourcesPath = null;
		
		resourcesPath = PropertyValidator.class.getProtectionDomain()
									   .getCodeSource()
									   .getLocation();
	
		try {
			resourcesPath = new URL(URLDecoder.decode(resourcesPath.toString(),"UTF-8"));
			resourcesPath = new URL(resourcesPath,AmchartsJavaPaths.TEMP_DIRECTORY);
		} catch (MalformedURLException | UnsupportedEncodingException e) {
				e.printStackTrace();
		}
			
		return "/"+resourcesPath.toString().substring(6, resourcesPath.toString().length());
		
	}

}
