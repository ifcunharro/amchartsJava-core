package es.uvigo.esei.amchartsJava.constants;


public final class AxisPositionConstant {
	
	private AxisPositionConstant(){
		
	}
	
	private static class InitSingleton{
		private static final AxisPositionConstant INSTANCE = new AxisPositionConstant();
	}
	
	public static AxisPositionConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum Position{
		bottom, top, right, left;
	}
	
	
	public Position getBottom(){
		return Position.bottom;
	}
	
	public Position getTop(){
		return Position.top;
	}
	
	public Position getRight(){
		return Position.right;
	}
	
	public Position getLeft(){
		return Position.left;
	}
	
	public Position[] values(){
		return Position.values();
	}
}
