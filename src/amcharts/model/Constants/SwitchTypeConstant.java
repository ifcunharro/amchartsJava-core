package amcharts.model.Constants;

import java.util.ArrayList;
import java.util.List;


public final class SwitchTypeConstant {
	
	private static SwitchTypeConstant instance;
	private List<String> types;
	
	
	private SwitchTypeConstant(){
		
	}
	
	public static SwitchTypeConstant getInstance(){
		if(instance==null){
			instance = new SwitchTypeConstant(); 
		}
		return instance;
	}
	
	public enum SwitchType{
		x, v;
	}
	
	public SwitchType getX(){
		return SwitchType.x;
	}
	
	public SwitchType getV(){
		return SwitchType.v;
	}
	
	public List<String> values(){
		if(types==null){
			types = new ArrayList<String>();
			for(SwitchType type: SwitchType.values()){
				types.add(type.toString());
			}
		}
		
		return types;
	}
	
	
}
