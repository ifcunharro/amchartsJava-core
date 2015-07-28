package es.uvigo.esei.amchartsJava.core.constants;


public final class OrientationConstant {
	
	private OrientationConstant(){
		
	}
	
	private static class InitSingleton{
		private static OrientationConstant INSTANCE = new OrientationConstant();
	}
	
	public static OrientationConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum Orientation{
		horizontal, vertical;
	}
	
	public Orientation getHorizontal(){
		return Orientation.horizontal;
	}
	
	public Orientation getVertical(){
		return Orientation.vertical;
	}
	
	public Orientation[] values(){
		return Orientation.values();
	}
	
	
}
