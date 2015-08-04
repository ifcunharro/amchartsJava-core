package es.uvigo.esei.amchartsJava.core.constants;


public final class PointPositionAxisRadarConstant {
	
	private PointPositionAxisRadarConstant(){
		
	}
	
	private static class InitSingleton{
		private static final PointPositionAxisRadarConstant INSTANCE = new PointPositionAxisRadarConstant();
	}
	
	public static PointPositionAxisRadarConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum PointPositionAxisRadar{
		axis, middle;
	}
	
	public PointPositionAxisRadar getAxis(){
		return PointPositionAxisRadar.axis;
	}
	
	public PointPositionAxisRadar getMiddle(){
		return PointPositionAxisRadar.middle;
	}
	
	public PointPositionAxisRadar[] values(){
		return PointPositionAxisRadar.values();
	}
}
