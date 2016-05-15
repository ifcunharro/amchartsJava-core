package es.uvigo.esei.amchartsjava.core.constants;


/**
 * Class that contains dateFormat used by amcharts.
 * @author Iago Fernández Cuñarro
 *
 */
public final class DateFormatConstant {
	
	private final static String[] DATEFORMAT = {"MMM DD,YYYY","DD-MMM-YYYY","MMM-DD-YYYY","YYYY",
			"MMM","hh","DD/MMM/YYYY"};
	
	private DateFormatConstant(){
		
	}

	/**
	 * Get dateFormat values.
	 * @return String[] dateFormat values.
	 */
	static String[] getDateFormat() {
		return DATEFORMAT;
	}

	
}
