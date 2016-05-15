package es.uvigo.esei.amchartsJava.core.constants;

public enum Separator {
	dot, colon;
	
	public String toString(){
		switch(this){
			case dot: return ".";
			case colon: return ",";
		}
		return null;
	}
}
