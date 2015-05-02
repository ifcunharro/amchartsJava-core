package amcharts.model.Constants;

import java.util.ArrayList;
import java.util.List;

import amcharts.model.Constants.DurationUnitsConstant.DurationUnits;

public final class AlignConstant {
	
	private static AlignConstant instance;
	private static List<String> aligns;
	
	
	private AlignConstant(){
		
	}
	
	public static AlignConstant getInstance(){
		if(instance==null){
			instance = new AlignConstant();
			aligns = new ArrayList<String>();
		}
		return instance;
	}
	
	public enum Align{
		 left, center, right;	 
	}
	
	public Align getLeft(){
		return Align.left;
	}
	
	public Align getRight(){
		return Align.right;
	}
	
	public Align getCenter(){
		return Align.center;
	}
	
	public List<String> values(){
		for(DurationUnits unit: DurationUnits.values()){
			aligns.add(unit.toString());
		}
		
		return aligns;
	}
	
}

