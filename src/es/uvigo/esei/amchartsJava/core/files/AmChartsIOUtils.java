package es.uvigo.esei.amchartsJava.core.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

import es.uvigo.esei.amchartsJava.core.validators.PathValidator;

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
		
		FileInputStream fis = new FileInputStream(tempFile);
	    String content = IOUtils.toString(fis, Charset.defaultCharset());
	    content = content.replaceAll("AmCharts.exportCFG", "\"AmCharts.exportCFG\"");
	    
	    FileOutputStream fos = new FileOutputStream(tempFile);
	    IOUtils.write(content, fos, Charset.defaultCharset());
	    fis.close();
	    fos.close();
		
	}
	
	/**
	 * Clear temp directory.
	 */
	public static void clearTempDirectory() {
		File path = new File(PathValidator.getJsonDirectoryToSave());
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
		File path = new File(tempFile);
	    path.delete();    
	}
	
	

}
