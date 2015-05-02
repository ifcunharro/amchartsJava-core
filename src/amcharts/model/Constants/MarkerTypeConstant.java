package amcharts.model.Constants;

import java.util.ArrayList;
import java.util.List;

public final class MarkerTypeConstant {
	
	private static MarkerTypeConstant instance;
	private static List<String> types; 
	
	
	private MarkerTypeConstant(){
		
	}
	
	public static MarkerTypeConstant getInstance(){
		if(instance==null){
			instance = new MarkerTypeConstant(); 
			types = new ArrayList<String>();
		}
		return instance;
	}
	
	public enum MarkerType{
		square, circle, diamond, triangleUp, triangleDown, triangleLeft, 
		triangleRight, bubble, line, none;	
	}
	
	public MarkerType getSquare(){
		return MarkerType.square;
	}
	
	public MarkerType getCircle(){
		return MarkerType.circle;
	}
	
	public MarkerType getDiamond(){
		return MarkerType.diamond;
	}
	
	public MarkerType getTriangleUp(){
		return MarkerType.triangleUp;
	}
	
	public MarkerType getTriangleDown(){
		return MarkerType.triangleDown;
	}
	
	public MarkerType getTriangleLeft(){
		return MarkerType.triangleLeft;
	}
	
	public MarkerType getTriangleRight(){
		return MarkerType.triangleRight;
	}
	
	public MarkerType getBubble(){
		return MarkerType.bubble;
	}
	
	public MarkerType getLine(){
		return MarkerType.line;
	}
	
	public MarkerType getNone(){
		return MarkerType.none;
	}
	
	public List<String> values(){
		for(MarkerType unit: MarkerType.values()){
			types.add(unit.toString());
		}
		
		return types;
	}
	
	
}
