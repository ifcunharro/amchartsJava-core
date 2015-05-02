package amcharts.model.Constants;

import java.util.ArrayList;
import java.util.List;

import amcharts.model.Constants.MarkerTypeConstant.MarkerType;

public final class CreditsPositionConstant {
	
	private static CreditsPositionConstant instance;
	private static List<String> credits;
	
	
	private CreditsPositionConstant(){
		
	}
	
	public static CreditsPositionConstant getInstance(){
		if(instance==null){
			instance = new CreditsPositionConstant();
			credits = new ArrayList<String>();
		}
		return instance;
	}
	
	public enum CreditsPosition{
		topleft, topright, bottomleft, bottomright;
	
		
	
		private CreditsPosition(){
			
		}
		
		public String toString(){
			switch(this){
				case topleft: return "top-left";
				case topright: return "top-right";
				case bottomleft: return "bottom-left";
				case bottomright: return "bottom-right";
			}
			return null;
		}
	}
	
	
	
	public CreditsPosition getTopLeft(){
		return CreditsPosition.topleft;
	}
	
	public CreditsPosition getTopRight(){
		return CreditsPosition.topright;
	}
	
	public CreditsPosition getBottomLeft(){
		return CreditsPosition.bottomleft;
	}
	
	public CreditsPosition getBottomRight(){
		return CreditsPosition.bottomright;
	}
	
	public List<String> values(){
		for(MarkerType unit: MarkerType.values()){
			credits.add(unit.toString());
		}
		
		return credits;
	}
}