package es.uvigo.esei.amchartsJava.core.constants;


public final class PointPositionGraphConstant {
	
	private PointPositionGraphConstant(){
		
	}
	
	private static class InitSingleton{
		private static final PointPositionGraphConstant INSTANCE = new PointPositionGraphConstant();
	}
	
	public static PointPositionGraphConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum PointPositionGraph{
		start, middle, end;
	}
	
	
	public PointPositionGraph getStart(){
		return PointPositionGraph.start;
	}
	
	public PointPositionGraph getMiddle(){
		return PointPositionGraph.middle;
	}
	
	public PointPositionGraph getEnd(){
		return PointPositionGraph.end;
	}
	
	public PointPositionGraph[] values(){
		return PointPositionGraph.values();
	}
}
