package es.uvigo.esei.amchartsJava.core.constants;



public final class PeriodConstant {
	
	private PeriodConstant(){
		
	}
	
	private static class InitSingleton{
		private static PeriodConstant INSTANCE = new PeriodConstant();
	}
	

	/**
	 * Method to get a instance of this class
	 * 
	 * @return PeriodConstant instance of PeriodConstant
	 */
	public static PeriodConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum Period{
		fff, ss, mm, hh, DD, WW, MM, YYYY;
	}
	
		
	public Period getfff(){
		return Period.fff;
	}
	
	public Period getSeconds(){
		return Period.ss;
	}
	
	public Period getMinutes(){
		return Period.mm;
	}
	
	public Period getHours(){
		return Period.hh;
	}
	
	public Period getDays(){
		return Period.DD;
	}
	
	public Period getWeeks(){
		return Period.WW;
	}
	
	public Period getMonths(){
		return Period.MM;
	}
	
	public Period getYears(){
		return Period.YYYY;
	}
	
	public Period[] values(){
		return Period.values();
	}
		
}
