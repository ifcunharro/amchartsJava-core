package es.uvigo.esei.amchartsJava.core.constants.config;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.PatternLayout;

import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;


/**
 * 
 * This class load properties with params config and configure log.
 * @author Iago Fernández Cuñarro
 *
 */
public final class Config {

    private static final Properties CONFIG = new Properties();

    static {
    		
			try {
				//load url properties independent mode debug/release
				String OS = System.getProperty("os.name").toLowerCase();
				URL localURL;
				if(OS.indexOf("win")>=0){
					localURL = new URL(URLDecoder.decode("file:/"+Paths.get(".").toAbsolutePath().normalize().toString() + "\\resources\\configuration.properties","UTF-8" ));
				}
				else{
					localURL = new URL(URLDecoder.decode("file:"+Paths.get(".").toAbsolutePath().normalize().toString() + "/resources/configuration.properties" ,"UTF-8"));
					
				}
				try {
					CONFIG.load(localURL.openStream());
				} catch (IOException e) {
					throw new RuntimeException(
							I18n.get("propertiesException"));
				}
			} catch (MalformedURLException | UnsupportedEncodingException URLException) {
				throw new RuntimeException(
						I18n.get("propertiesException"));
			}
		
	}

    /**
     * Get parameter of configuration.
     * @param key Name of parameter of configuration.
     * @return String Value asociated to parameter of configuration.
     */
    public static String getString(final String key) {
        if (CONFIG.containsKey(key))
            return CONFIG.getProperty(key);

        throw new RuntimeException(
            "'" + key + "' "+I18n.get("ConfigKeyException")
        );
    }
    
    /**
     * Configure log using pattern for log.
     * @param logPattern Pattern for entry log.
     * @param fileLog File of log.
     */
    public static void configureLog(String logPattern,String fileLog){
    	URL logURL = null;
		logURL = Config.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			logURL = new URL(URLDecoder.decode(logURL.toString(),"UTF-8"));
			logURL = new URL(logURL,AmchartsJavaPaths.LOG_PATH+fileLog);
		} catch (MalformedURLException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		try {
			BasicConfigurator.configure(new FileAppender(
					new PatternLayout(logPattern), 
					"/"+logURL.toString().substring(6,logURL.toString().length())));
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	}
	
    /**
     * Default configuration for log.
     */
	public static void defaultConfigureLog(){
		URL logURL = null;
		logURL = Config.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			logURL = new URL(URLDecoder.decode(logURL.toString(),"UTF-8"));
			logURL = new URL(logURL,AmchartsJavaPaths.LOG_PATH+"AMCHARTS.log");
		} catch (MalformedURLException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		try {
			BasicConfigurator.configure(new FileAppender(
					new PatternLayout("[%d{HH:mm:ss,SSS}] [%t] %-5p %c %x - %m%n"), 
					"/"+logURL.toString().substring(6,logURL.toString().length())));
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	}

}