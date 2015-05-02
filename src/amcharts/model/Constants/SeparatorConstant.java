package amcharts.model.Constants;

import java.util.ArrayList;
import java.util.List;

public final class SeparatorConstant {
	
	private static SeparatorConstant instance;
	private List<String> separators;
	
	
	private SeparatorConstant(){
		
	}
	
	public static SeparatorConstant getInstance(){
		if(instance==null){
			instance = new SeparatorConstant(); 
		}
		return instance;
	}
	
	public enum Separator{
		dot, colon;
		
		private Separator(){
			
		}
		
		public String toString(){
			switch(this){
				case dot: return ".";
				case colon: return ",";
			}
			return null;
		}
	}
	
	public Separator getDot(){
		return Separator.dot;
	}
	
	public Separator getColon(){
		return Separator.colon;
	}
	
	public List<String> values(){
		if(separators==null){
			separators = new ArrayList<String>();
			for(Separator sep: Separator.values()){
				separators.add(sep.toString());
			}
		}
		
		return separators;
	}
	
	
}
