package es.uvigo.esei.amchartsJava.core.constants;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;


/**
 * This class contains all constants used by app and constant log and visibility loaded from properties
 * @author Iago Fernández Cuñarro
 *
 */
public class AmchartsConstants {
	
	//not delete these two variables, if change name variables, update references in code
	public static final String LOGGING;
	public static final String IMPROVED_VISIBILITY;

	private AmchartsConstants(){
		
	}
	
	static{
		IMPROVED_VISIBILITY = Config.getString("enabledImprovedVisibility");
		LOGGING = Config.getString("log");
	}

	public static final String[] DATE_FORMAT = DateFormatConstant.getDateFormat();
	
	
	
	
}
