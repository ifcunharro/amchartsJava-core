package es.uvigo.esei.amchartsJava.core.constants;


public final class AxisTypeConstant {
	
	private AxisTypeConstant(){
		
	}
	
	private static class InitSingleton{
		private static AxisTypeConstant INSTANCE = new AxisTypeConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return AxisTypeConstant instance of AxisTypeConstant
	 */
	public static AxisTypeConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum AxisType{
		numeric, date;	
	}
	
	public AxisType getNumeric(){
		return AxisType.numeric;
	}
	
	public AxisType getDate(){
		return AxisType.date;
	}
	
	public AxisType[] values(){
		return AxisType.values();	
	}
		
}
