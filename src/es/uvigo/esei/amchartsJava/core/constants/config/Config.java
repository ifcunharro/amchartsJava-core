package es.uvigo.esei.amchartsJava.core.constants.config;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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
			URL localURL = Config.class.getProtectionDomain().getCodeSource()
					.getLocation();
			try {
				//localURL = new URL(new URL(localURL.toString().replace("amchartsRunnable.jar", "")) + "resources/configuration.properties" );
					
					localURL = new URL(localURL,"../"+AmchartsJavaPaths.CONFIG_FILE_PATH );
					
				try {
					CONFIG.load(localURL.openStream());
				} catch (IOException e) {
					throw new RuntimeException(
							I18n.get("propertiesException"));
				}
			} catch (MalformedURLException localMalformedURLException) {
				throw new RuntimeException(
						I18n.get("propertiesException")
								+ " "+localURL.getFile());
			}
		} catch (NullPointerException localNullPointerException) {
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
		try {
			BasicConfigurator.configure(new FileAppender(
					new PatternLayout(logPattern), 
					AmchartsJavaPaths.LOG_PATH+fileLog));
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	}
	
    /**
     * Default configuration for log.
     */
	public static void defaultConfigureLog(){
		try {
			BasicConfigurator.configure(new FileAppender(
					new PatternLayout("[%d{HH:mm:ss,SSS}] [%t] %-5p %c %x - %m%n"), 
					AmchartsJavaPaths.LOG_PATH+"AMCHARTS.log"));
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	}

}