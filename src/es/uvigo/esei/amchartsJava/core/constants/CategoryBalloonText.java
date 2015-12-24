package es.uvigo.esei.amchartsJava.core.constants;

public enum CategoryBalloonText {
	category, toCategory;
	
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
