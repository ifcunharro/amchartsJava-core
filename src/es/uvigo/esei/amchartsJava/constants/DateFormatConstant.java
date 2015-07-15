package es.uvigo.esei.amchartsJava.constants;


public final class DateFormatConstant {
	
	private final static String[] DateFormat = {"MMM DD,YYYY","DD-MMM-YYYY","MMM-DD-YYYY","YYYY",
			"MMM","hh","DD/MMM/YYYY"};
	
	private DateFormatConstant(){
		
	}

	public static String[] getDateFormat() {
		return DateFormat;
	}

	
}
