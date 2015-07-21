package es.uvigo.esei.amchartsJava.constants;


public final class PositionConstant {
	
	private PositionConstant(){
		
	}
	
	private static class InitSingleton{
		private static PositionConstant INSTANCE = new PositionConstant();
	}
	
	public static PositionConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum Position{
		left, right;	
	}
	
	public Position getLeft(){
		return Position.left;
	}
	
	public Position getRight(){
		return Position.right;
	}
	
	public Position[] values(){
		return Position.values();	
	}
		
}
