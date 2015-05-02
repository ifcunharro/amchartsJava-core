package amcharts.model.Constants;

import java.util.ArrayList;
import java.util.List;


public final class DurationUnitsConstant {
	
	private static DurationUnitsConstant instance;
	private static List<String> units;
	
	
	private DurationUnitsConstant(){
		
	}
	
	public static DurationUnitsConstant getInstance(){
		if(instance==null){
			instance = new DurationUnitsConstant();
			units = new ArrayList<String>();
		}
		return instance;
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
	
	public List<String> values(){
		for(DurationUnits unit: DurationUnits.values()){
			units.add(unit.toString());
		}
		
		return units;
	}
	
	
}
