package es.uvigo.esei.amchartsJava.core.constants;

public enum TagsText {
	value, description, percents, open, category;
	
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
