package es.uvigo.esei.amchartsJava.core.constants;


public final class GridTypesConstant {
	
	private GridTypesConstant(){
		
	}
	
	private static class InitSingleton{
		private static GridTypesConstant INSTANCE = new GridTypesConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return GridTypesConstant instance of GridTypesConstant
	 */
	public static GridTypesConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum GridType{
		polygons, circles;	
	}
	
	public GridType getPolygons(){
		return GridType.polygons;
	}
	
	public GridType getCircles(){
		return GridType.circles;
	}
	
	public GridType[] values(){
		return GridType.values();	
	}
		
}
