package amcharts.model.Constants;

import java.util.ArrayList;
import java.util.List;

import amcharts.model.Constants.MarkerTypeConstant.MarkerType;


public final class DecimalSeparatorConstant {
	
	private static DecimalSeparatorConstant instance;
	private static List<String> separators;
	
	
	private DecimalSeparatorConstant(){
		
	}
	
	public static DecimalSeparatorConstant getInstance(){
		if(instance==null){
			instance = new DecimalSeparatorConstant(); 
			separators = new ArrayList<String>();
		}
		return instance;
	}
	
	public enum DecimalSeparator{
		dot, colon;
	}
	
	public DecimalSeparator getDot(){
		return DecimalSeparator.dot;
	}
	
	public DecimalSeparator getColon(){
		return DecimalSeparator.colon;
	}
	
	public List<String> values(){
		for(MarkerType unit: MarkerType.values()){
			separators.add(unit.toString());
		}
		
		return separators;
	}
	
	
}
