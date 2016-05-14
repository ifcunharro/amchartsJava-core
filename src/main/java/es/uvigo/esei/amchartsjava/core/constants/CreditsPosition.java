package es.uvigo.esei.amchartsjava.core.constants;

public enum CreditsPosition {
	topleft, topright, bottomleft, bottomright;
	
	public String toString(){
		switch(this){
			case topleft: return "top-left";
			case topright: return "top-right";
			case bottomleft: return "bottom-left";
			case bottomright: return "bottom-right";
		}
		return null;
	}
}
