package es.uvigo.esei.amchartsJava.core.constants;


public final class GraphTypesConstant {
	
	private GraphTypesConstant(){
		
	}
	
	private static class InitSingleton{
		private static GraphTypesConstant INSTANCE = new GraphTypesConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return GraphTypesConstant instance of GraphTypesConstant
	 */
	public static GraphTypesConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum GraphType{
		line, column, step, smoothedLine, candlestick, ohlc;	
	}
	
	public GraphType getLine(){
		return GraphType.line;
	}
	
	public GraphType getColumn(){
		return GraphType.column;
	}
	
	public GraphType getStep(){
		return GraphType.step;
	}
	
	public GraphType getSmoothedLine(){
		return GraphType.smoothedLine;
	}
	
	public GraphType getCandleStick(){
		return GraphType.candlestick;
	}
	
	public GraphType getOhlc(){
		return GraphType.ohlc;
	}
	
	public GraphType[] values(){
		return GraphType.values();
	}
	
	
}
