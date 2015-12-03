package es.uvigo.esei.amchartsJava.core.constants;


public final class PositionConstant {
	
	private PositionConstant(){
		
	}
	
	private static class InitSingleton{
		private static PositionConstant INSTANCE = new PositionConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return PositionConstant instance of PositionConstant
	 */
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
