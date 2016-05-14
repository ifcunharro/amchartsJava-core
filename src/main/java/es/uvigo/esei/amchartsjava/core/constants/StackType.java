package es.uvigo.esei.amchartsjava.core.constants;

public enum StackType {
	none, regular, onehundredpercent, threed;	
	
	public String toString(){
		switch(this){
			case none: return "none";
			case regular: return "regular";
			case onehundredpercent: return "100%";
			case threed: return "3d";
		}
		return null;
	}
}
