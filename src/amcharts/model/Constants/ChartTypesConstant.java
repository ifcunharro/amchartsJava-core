package amcharts.model.Constants;

import java.util.ArrayList;
import java.util.List;

public final class ChartTypesConstant {
	
	private static ChartTypesConstant instance;
	private List<String> types; 
	
	
	private ChartTypesConstant(){
		
	}
	
	public static ChartTypesConstant getInstance(){
		if(instance==null){
			instance = new ChartTypesConstant(); 
		}
		return instance;
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
	
	public List<String> values(){
		if(types==null){
			types = new ArrayList<String>();
			for(ChartType type: ChartType.values()){
				types.add(type.toString());
			}
		}
		
		return types;
	}
	
	
}
