package es.uvigo.esei.amchartsJava.core.constants.paths;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;

/**
 * Paths used by amcharts.
 * @author Iago Fernández Cuñarro
 *
 */
public final class AmchartsJavaPaths {
	

	private AmchartsJavaPaths(){
		
	}
	
	//path to folder amcharts.
	public static final String AMCHARTS_PATH;
	//para pathToImages, deprecated usar AMCHARTS_PATH en propieda path de amcharts,
	//se conserva para validar imagen en carpeta images
	public static final String IMAGES_PATH;
	//path to folder themes
	public static final String THEMES_PATH;
	//path to folder patterns
	public static final String URL_PATTERNS;
	//path to directory temp, used to save temp files of app
	public static final String TEMP_DIRECTORY;
	//path to properties
	public static final String CONFIG_FILE_PATH;
	//path to folder where save logs
	public static final String LOG_PATH;
	
	static{
		if("debug".equals(Config.getString("mode"))){
			AMCHARTS_PATH = Config.getString("debugAmchartsPath");
			IMAGES_PATH = Config.getString("debugImagesPath");
			THEMES_PATH = Config.getString("debugThemesPath");
			URL_PATTERNS = Config.getString("debugUrlPatterns");
			TEMP_DIRECTORY = Config.getString("debugTempDirectory");
			CONFIG_FILE_PATH = Config.getString("debugConfigFilePath");
			LOG_PATH = Config.getString("debugLogPath");
		}else{
			AMCHARTS_PATH = Config.getString("releaseAmchartsPath");
			IMAGES_PATH = Config.getString("releaseImagesPath");
			THEMES_PATH = Config.getString("releaseThemesPath");
			URL_PATTERNS = Config.getString("releaseUrlPatterns");
			TEMP_DIRECTORY = Config.getString("releaseTempDirectory");
			CONFIG_FILE_PATH = Config.getString("releaseConfigFilePath");
			LOG_PATH = Config.getString("releaseLogPath");
		}
	}

}
