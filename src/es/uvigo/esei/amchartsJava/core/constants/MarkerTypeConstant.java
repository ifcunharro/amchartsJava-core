package es.uvigo.esei.amchartsJava.core.constants;

public final class MarkerTypeConstant {
	
	private MarkerTypeConstant(){
		
	}
	
	private static class InitSingleton{
		private static MarkerTypeConstant INSTANCE = new MarkerTypeConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return MarkerTypeConstant instance of MarkerTypeConstant
	 */
	public static MarkerTypeConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum MarkerType{
		square, circle, diamond, triangleUp, triangleDown, triangleLeft, 
		triangleRight, bubble, line, none;	
	}
	
	public MarkerType getSquare(){
		return MarkerType.square;
	}
	
	public MarkerType getCircle(){
		return MarkerType.circle;
	}
	
	public MarkerType getDiamond(){
		return MarkerType.diamond;
	}
	
	public MarkerType getTriangleUp(){
		return MarkerType.triangleUp;
	}
	
	public MarkerType getTriangleDown(){
		return MarkerType.triangleDown;
	}
	
	public MarkerType getTriangleLeft(){
		return MarkerType.triangleLeft;
	}
	
	public MarkerType getTriangleRight(){
		return MarkerType.triangleRight;
	}
	
	public MarkerType getBubble(){
		return MarkerType.bubble;
	}
	
	public MarkerType getLine(){
		return MarkerType.line;
	}
	
	public MarkerType getNone(){
		return MarkerType.none;
	}
	
	public MarkerType[] values(){
		return MarkerType.values();
	}
	
	
}
