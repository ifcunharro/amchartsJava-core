package es.uvigo.esei.amchartsJava.core.constants;


public final class CategoryBalloonTextConstant {
	
	private CategoryBalloonTextConstant(){
		
	}
	
	private static class InitSingleton{
		private static final CategoryBalloonTextConstant INSTANCE = new CategoryBalloonTextConstant();
	}
	
	public static CategoryBalloonTextConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum CategoryBalloonText{
		category, toCategory;
		
		private CategoryBalloonText(){
			
		}
		
		public String toString(){
			switch(this){
			case category:
				return "[[category]]";
			case toCategory:
				return "[[toCategory]]";
			}
			return null;
		}
	}
	
	
	public CategoryBalloonText getCategory(){
		return CategoryBalloonText.category;
	}
	
	public CategoryBalloonText getToCategory(){
		return CategoryBalloonText.toCategory;
	}
	
	public CategoryBalloonText[] values(){
		return CategoryBalloonText.values();
	}
}
