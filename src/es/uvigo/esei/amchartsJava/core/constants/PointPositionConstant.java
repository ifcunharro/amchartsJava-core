package es.uvigo.esei.amchartsJava.core.constants;


public final class PointPositionConstant {
	
	private PointPositionConstant(){
		
	}
	
	private static class InitSingleton{
		private static final PointPositionConstant INSTANCE = new PointPositionConstant();
	}
	
	public static PointPositionConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum PointPosition{
		start, middle, end;
	}
	
	
	public PointPosition getStart(){
		return PointPosition.start;
	}
	
	public PointPosition getMiddle(){
		return PointPosition.middle;
	}
	
	public PointPosition getEnd(){
		return PointPosition.end;
	}
	
	public PointPosition[] values(){
		return PointPosition.values();
	}
}
