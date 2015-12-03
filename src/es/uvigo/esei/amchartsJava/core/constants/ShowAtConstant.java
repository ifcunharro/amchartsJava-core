package es.uvigo.esei.amchartsJava.core.constants;


public final class ShowAtConstant {
	
	private ShowAtConstant(){
		
	}
	
	private static class InitSingleton{
		private static final ShowAtConstant INSTANCE = new ShowAtConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return ShowAtConstant instance of ShowAtConstant
	 */
	public static ShowAtConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum ShowAt{
		open, close, high, low, top, bottom;
	}
	
	
	public ShowAt getOpen(){
		return ShowAt.open;
	}
	
	public ShowAt getClose(){
		return ShowAt.close;
	}
	
	public ShowAt getHigh(){
		return ShowAt.high;
	}
	
	public ShowAt getLow(){
		return ShowAt.low;
	}
	
	public ShowAt getTop(){
		return ShowAt.top;
	}
	
	public ShowAt getBottom(){
		return ShowAt.bottom;
	}
	
	public ShowAt[] values(){
		return ShowAt.values();
	}
}
