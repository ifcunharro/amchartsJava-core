package es.uvigo.esei.amchartsJava.core.constants;


public final class DurationConstant {
	
	
	private DurationConstant(){
		
	}
	
	private static class InitSingleton{
		private static final DurationConstant INSTANCE = new DurationConstant();
	}
	
	public static DurationConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum Duration{
		DD, hh, mm, ss;
	}
	
	public Duration getDays(){
		return Duration.DD;
	}
	
	public Duration getHours(){
		return Duration.hh;
	}
	
	public Duration getMinutes(){
		return Duration.mm;
	}
	
	public Duration getSeconds(){
		return Duration.ss;
	}
	
	public Duration[] values(){
		return Duration.values();
	}
	
	
}
