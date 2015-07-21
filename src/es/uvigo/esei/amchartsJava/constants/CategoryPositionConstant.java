package es.uvigo.esei.amchartsJava.constants;


public final class CategoryPositionConstant {
	
	private CategoryPositionConstant(){
		
	}
	
	private static class InitSingleton{
		private static final CategoryPositionConstant INSTANCE = new CategoryPositionConstant();
	}
	
	public static CategoryPositionConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum CategoryPosition{
		start, middle;
	}
	
	
	public CategoryPosition getStart(){
		return CategoryPosition.start;
	}
	
	public CategoryPosition getMiddle(){
		return CategoryPosition.middle;
	}
	
	public CategoryPosition[] values(){
		return CategoryPosition.values();
	}
}
