package es.uvigo.esei.amchartsJava.core.constants;

public enum ColorsSlicedCharts {
	//nombres de colores inventados, puestos por semejanza visual
	RED("#FF0F00"),ORANGE("#FF6600"),LIGHTORANGE("#FF9E01"),YELLOW("#FCD202"),
	BRIGHTYELLOW("#F8FF01"),LIME("#B0DE09"),GRASS("#04D215"),ELECTRICBLUE("#0D8ECF"),
	SAPPHIRE("#0D52D1"),DARKBLUE("#2A0CD0"),DARKVIOLET("#8A0CCF"),DOGWOODROSE("#CD0D74"),
	MAJORELLEBLUE("#754DEB"),GAINSBORO("#DDDDDD"),MOUNTAINMIST("#999999"),MINESHAFT("#333333"),
	BLACK("#000000"),BORDEAUX("#57032A"),NUGGET("#CA9726"),CRIMSOMRED("#990000"),CABSAV("#4B0C25");
	
	private String color;
	
	private ColorsSlicedCharts(String nombre){
		color = nombre;
	}
	
	public String toString(){
		return color;
	}
}
