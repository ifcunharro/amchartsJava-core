package es.uvigo.esei.amchartsJava.core.constants;


public final class ShowAtConstant {
	
	private ShowAtConstant(){
		
	}
	
	private static class InitSingleton{
		private static final ShowAtConstant INSTANCE = new ShowAtConstant();
	}
	
	public static ShowAtConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum ShowAt{
		open, close, high, low;
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
	
	public ShowAt[] values(){
		return ShowAt.values();
	}
}
