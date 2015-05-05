package es.uvigo.esei.amchartsJava.constants;

import java.util.ArrayList;
import java.util.List;


public final class LegendPositionConstant {
	
	private static LegendPositionConstant instance;
	private List<String> positions;
	
	
	private LegendPositionConstant(){
		
	}
	
	public static LegendPositionConstant getInstance(){
		if(instance==null){
			instance = new LegendPositionConstant(); 
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
		if(positions==null){
			positions = new ArrayList<String>();
			for(LegendPosition position: LegendPosition.values()){
				positions.add(position.toString());
			}
		}
		
		return positions;
	}
}
