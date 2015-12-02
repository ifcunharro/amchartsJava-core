package es.uvigo.esei.amchartsJava.core.constants;

public final class ChartTypesConstant {
	
	private ChartTypesConstant(){
		
	}
	
	private static class InitSingleton{
		private static ChartTypesConstant INSTANCE = new ChartTypesConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return ChartTypesConstant instance of ChartTypesConstant
	 */
	public static ChartTypesConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum ChartType{
		serial, pie, xy, radar, funnel, gauge, gantt;	
	}
	
	public ChartType getSerial(){
		return ChartType.serial;
	}
	
	public ChartType getPie(){
		return ChartType.pie;
	}
	
	public ChartType getXY(){
		return ChartType.xy;
	}
	
	public ChartType getRadar(){
		return ChartType.radar;
	}
	
	public ChartType getFunnel(){
		return ChartType.funnel;
	}
	
	public ChartType getGauge(){
		return ChartType.gauge;
	}
	
	public ChartType getGantt(){
		return ChartType.gantt;
	}
	
	public ChartType[] values(){
		return ChartType.values();
		
	}
	
	
}
