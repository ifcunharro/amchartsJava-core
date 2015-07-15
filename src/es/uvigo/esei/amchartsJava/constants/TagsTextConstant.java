package es.uvigo.esei.amchartsJava.constants;


public final class TagsTextConstant {
	
	private TagsTextConstant(){
		
	}
	
	private static class InitSingleton{
		private static final TagsTextConstant INSTANCE = new TagsTextConstant();
	}
	
	public static TagsTextConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum TagsText{
		value, description, percents, open, category;
	
		
	
		private TagsText(){
			
		}
		
		public String toString(){
			switch(this){
				case value: return "[[value]]";
				case description: return "[[description]]";
				case percents: return "[[percents]]";
				case open: return "[[open]]";
				case category: return "[[category]]";
			}
			return null;
		}
	}
	
	
	
	public TagsText getValue(){
		return TagsText.value;
	}
	
	public TagsText getDescription(){
		return TagsText.description;
	}
	
	public TagsText getPercents(){
		return TagsText.percents;
	}
	
	public TagsText getOpen(){
		return TagsText.open;
	}
	
	public TagsText getCategory(){
		return TagsText.category;
	}
	
	public TagsText[] values(){
		return TagsText.values();
	}
}
