package amcharts.model.Constants;

import java.util.ArrayList;
import java.util.List;

import amcharts.model.Constants.DurationUnitsConstant.DurationUnits;


public final class LegendPositionConstant {
	
	private static LegendPositionConstant instance;
	private static List<String> positions;
	
	
	private LegendPositionConstant(){
		
	}
	
	public static LegendPositionConstant getInstance(){
		if(instance==null){
			instance = new LegendPositionConstant(); 
			positions = new ArrayList<String>();
		}
		return instance;
	}
	
	public enum LegendPosition{
		bottom, top, left, right, absolute;
	}
	
	
	public LegendPosition getBottom(){
		return LegendPosition.bottom;
	}
	
	public LegendPosition getTop(){
		return LegendPosition.top;
	}
	
	public LegendPosition getLeft(){
		return LegendPosition.left;
	}
	
	public LegendPosition getRight(){
		return LegendPosition.right;
	}
	
	public LegendPosition getAbsolute(){
		return LegendPosition.absolute;
	}
	
	public List<String> values(){
		for(DurationUnits unit: DurationUnits.values()){
			positions.add(unit.toString());
		}
		
		return positions;
	}
}
