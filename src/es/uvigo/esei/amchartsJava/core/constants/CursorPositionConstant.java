package es.uvigo.esei.amchartsJava.core.constants;



public final class CursorPositionConstant {
	
	private CursorPositionConstant(){
		
	}
	
	private static class InitSingleton{
		private static final CursorPositionConstant INSTANCE = new CursorPositionConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return CursorPositionConstant instance of CursorPositionConstant
	 */
	public static CursorPositionConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum CursorPosition{
		start, middle, mouse;
	}
	
	
	public CursorPosition getStart(){
		return CursorPosition.start;
	}
	
	public CursorPosition getMiddle(){
		return CursorPosition.middle;
	}
	
	public CursorPosition getMouse(){
		return CursorPosition.mouse;
	}
	
	public CursorPosition[] values(){
		return CursorPosition.values();
	}
}
