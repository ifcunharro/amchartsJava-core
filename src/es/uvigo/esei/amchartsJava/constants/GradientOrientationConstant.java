package es.uvigo.esei.amchartsJava.constants;


public final class GradientOrientationConstant {
	
	private GradientOrientationConstant(){
		
	}
	
	private static class InitSingleton{
		private static GradientOrientationConstant INSTANCE = new GradientOrientationConstant();
	}
	
	public static GradientOrientationConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum GradientOrientation{
		horizontal, vertical;
	}
	
	public GradientOrientation getHorizontal(){
		return GradientOrientation.horizontal;
	}
	
	public GradientOrientation getVertical(){
		return GradientOrientation.vertical;
	}
	
	public GradientOrientation[] values(){
		return GradientOrientation.values();
	}
	
	
}
