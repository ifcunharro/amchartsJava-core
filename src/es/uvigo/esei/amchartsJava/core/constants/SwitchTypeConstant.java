package es.uvigo.esei.amchartsJava.core.constants;


public final class SwitchTypeConstant {
	

	private SwitchTypeConstant(){
		
	}
	
	private static class InitSingleton{
		private static final SwitchTypeConstant INSTANCE = new SwitchTypeConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return SwitchTypeConstant instance of SwitchTypeConstant
	 */
	public static SwitchTypeConstant getInstance(){
		return InitSingleton.INSTANCE;
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
