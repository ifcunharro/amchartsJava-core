package es.uvigo.esei.amchartsJava.core.constants;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;


/**
 * This class contains constant log and visibility loaded from properties and format of dates
 * @author Iago Fernández Cuñarro
 *
 */
public class AmchartsConstants {
	
	//not delete this variable, if change name variable, update references in code
	public static final String IMPROVED_VISIBILITY;

	private AmchartsConstants(){
		
	}
	
	static{
		IMPROVED_VISIBILITY = Config.getString("enabledImprovedVisibility");
	}

	/**
	 * DateFormat used by amcharts
	 */
	public static final String[] DATE_FORMAT = DateFormatConstant.getDateFormat();
	
	
	
	
}
