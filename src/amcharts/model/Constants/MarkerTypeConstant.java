package amcharts.model.Constants;

import java.util.ArrayList;
import java.util.List;

public final class MarkerTypeConstant {
	
	private static MarkerTypeConstant instance;
	private List<String> types; 
	
	
	private MarkerTypeConstant(){
		
	}
	
	public static MarkerTypeConstant getInstance(){
		if(instance==null){
			instance = new MarkerTypeConstant(); 
			
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
		if(types==null){
			types = new ArrayList<String>();
			for(MarkerType type: MarkerType.values()){
				types.add(type.toString());
			}
		}
		
		return types;
	}
	
	
}
