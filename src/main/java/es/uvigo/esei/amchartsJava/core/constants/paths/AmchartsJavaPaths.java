package es.uvigo.esei.amchartsJava.core.constants.paths;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;

/**
 * Paths used by amcharts.
 * @author Iago Fernández Cuñarro
 *
 */
public final class AmchartsJavaPaths {
	
	/**
	 * Path to folder amcharts.
	 */
	public static final String AMCHARTS_PATH;
	/**
	 * Path to images folder, this path is used by pathToImages property, that property
	 * is deprecated but this path is used to validate that image exists in images folder.
	 */
	public static final String IMAGES_PATH;
	/**
	 * Path to themes folder.
	 */
	public static final String THEMES_PATH;
	/**
	 * Path to patterns folder
	 */
	public static final String URL_PATTERNS;
	/**
	 * Path to directory temp, used to save temp files of app.
	 */
	public static final String TEMP_DIRECTORY;
	/**
	 * Path to properties used to configure app.
	 */
	public static final String CONFIG_FILE_PATH;
	
	private AmchartsJavaPaths(){
		
	}
	
	static{
		if("debug".equals(Config.getString("mode"))){
			AMCHARTS_PATH = Config.getString("debugAmchartsPath");
			IMAGES_PATH = Config.getString("debugImagesPath");
			THEMES_PATH = Config.getString("debugThemesPath");
			URL_PATTERNS = Config.getString("debugUrlPatterns");
			TEMP_DIRECTORY = Config.getString("debugTempDirectory");
			CONFIG_FILE_PATH = Config.getString("debugConfigFilePath");
		}else{
			AMCHARTS_PATH = Config.getString("releaseAmchartsPath");
			IMAGES_PATH = Config.getString("releaseImagesPath");
			THEMES_PATH = Config.getString("releaseThemesPath");
			URL_PATTERNS = Config.getString("releaseUrlPatterns");
			TEMP_DIRECTORY = Config.getString("releaseTempDirectory");
			CONFIG_FILE_PATH = Config.getString("releaseConfigFilePath");
		}
	}

}
