package es.uvigo.esei.amchartsJava.core.constants;


public final class LabelPositionConstant {
	
	private LabelPositionConstant(){
		
	}
	
	private static class InitSingleton{
		private static final LabelPositionConstant INSTANCE = new LabelPositionConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return LabelPositionConstant instance of LabelPositionConstant
	 */
	public static LabelPositionConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum LabelPosition{
		bottom, top, right, left, inside, middle;
	}
	
	
	public LabelPosition getBottom(){
		return LabelPosition.bottom;
	}
	
	public LabelPosition getTop(){
		return LabelPosition.top;
	}
	
	public LabelPosition getRight(){
		return LabelPosition.right;
	}
	
	public LabelPosition getLeft(){
		return LabelPosition.left;
	}
	
	public LabelPosition getInside(){
		return LabelPosition.inside;
	}
	
	public LabelPosition getMiddle(){
		return LabelPosition.middle;
	}
	
	public LabelPosition[] values(){
		return LabelPosition.values();
	}
}
