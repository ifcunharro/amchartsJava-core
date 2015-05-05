package es.uvigo.esei.amchartsJava.constants;

public enum ColorsChart {
	//nombres de colores inventados, puesto por semejanza visual
	ORANGE("#FF6600"),YELLOW("#FCD202"),LIME("#B0DE09"),BLUE("#0D8ECF"),
	INDIGO("#2A0CD0"),PINK("#CD0D74"),RED("#CC0000"),GRASS("#00CC00"),
	NAVY("#0000CC"),GRAY("#DDDDDD"),STEEL("#999999"),DARKGRAY("#333333"),DARKRED("#990000");
	
	private String color;
	
	private ColorsChart(String nombre){
		color = nombre;
	}
	
	public String toString(){
		return color;
	}
}
