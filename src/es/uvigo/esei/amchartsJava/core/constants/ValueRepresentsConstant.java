package es.uvigo.esei.amchartsJava.core.constants;




public final class ValueRepresentsConstant {
	
	
	private ValueRepresentsConstant(){
		
	}
	
	private static class InitSingleton{
		private static final ValueRepresentsConstant INSTANCE = new ValueRepresentsConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return ValueRepresentsConstant instance of ValueRepresentsConstant
	 */
	public static ValueRepresentsConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	
	public enum ValueRepresents{
		 height, area;	 
	}
	
	public ValueRepresents getHeight(){
		return ValueRepresents.height;
	}
	
	public ValueRepresents getArea(){
		return ValueRepresents.area;
	}
	
	public ValueRepresents[] getValueRepresents(){
		return ValueRepresents.values();
	}
	
}

