package es.uvigo.esei.amchartsJava.constants;


public final class DurationUnitsConstant {
	
	
	private DurationUnitsConstant(){
		
	}
	
	private static class InitSingleton{
		private static final DurationUnitsConstant INSTANCE = new DurationUnitsConstant();
	}
	
	public static DurationUnitsConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum DurationUnits{
		DD, hh, mm, ss;
	}
	
	public DurationUnits getDays(){
		return DurationUnits.DD;
	}
	
	public DurationUnits getHours(){
		return DurationUnits.hh;
	}
	
	public DurationUnits getMinutes(){
		return DurationUnits.mm;
	}
	
	public DurationUnits getSeconds(){
		return DurationUnits.ss;
	}
	
	public DurationUnits[] values(){
		return DurationUnits.values();
	}
	
	
}
