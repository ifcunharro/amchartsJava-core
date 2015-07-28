package es.uvigo.esei.amchartsJava.core.constants;


public final class LegendPositionConstant {
	
	private LegendPositionConstant(){
		
	}
	
	private static class InitSingleton{
		private static final LegendPositionConstant INSTANCE = new LegendPositionConstant();
	}
	
	public static LegendPositionConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum LegendPosition{
		bottom, top, left, right, absolute;
	}
	
	
	public LegendPosition getBottom(){
		return LegendPosition.bottom;
	}
	
	public LegendPosition getTop(){
		return LegendPosition.top;
	}
	
	public LegendPosition getLeft(){
		return LegendPosition.left;
	}
	
	public LegendPosition getRight(){
		return LegendPosition.right;
	}
	
	public LegendPosition getAbsolute(){
		return LegendPosition.absolute;
	}
	
	public LegendPosition[] values(){
		return LegendPosition.values();
	}
}
