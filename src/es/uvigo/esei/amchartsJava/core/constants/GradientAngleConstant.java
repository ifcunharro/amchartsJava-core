package es.uvigo.esei.amchartsJava.core.constants;



public final class GradientAngleConstant {
	
	private GradientAngleConstant(){
		
	}
	
	private static class InitSingleton{
		private static final GradientAngleConstant INSTANCE = new GradientAngleConstant();
	}
	
	public static GradientAngleConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum GradientAngle{
		EAST(0), WEST(180), NORTH(90), SOUTH(270);
		
		private final Number number;
	
		
	
		private GradientAngle(Number num){
			number = num;
			
		}
		
		public Number getNumber(){
			return number;
		}
		
		
	}
	
	public GradientAngle get90Degrees(){
		return GradientAngle.NORTH;
	}
	
	public GradientAngle get180Degrees(){
		return GradientAngle.WEST;
	}
	
	public GradientAngle getZeroDegrees(){
		return GradientAngle.EAST;
	}
	
	public GradientAngle get270Degrees(){
		return GradientAngle.SOUTH;
	}
	
	
	
	public GradientAngle[] values(){
		return GradientAngle.values();
	}
}
