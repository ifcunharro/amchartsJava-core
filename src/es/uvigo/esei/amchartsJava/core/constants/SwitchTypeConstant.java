package es.uvigo.esei.amchartsJava.core.constants;


public final class SwitchTypeConstant {
	
	private static SwitchTypeConstant instance;
	
	
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
	
	public SwitchType[] values(){
		return SwitchType.values();
	}
	
	
}
