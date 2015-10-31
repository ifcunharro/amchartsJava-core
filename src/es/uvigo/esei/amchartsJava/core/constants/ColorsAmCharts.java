package es.uvigo.esei.amchartsJava.core.constants;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ColorsAmCharts{
	//nombres de colores inventados, puestos por semejanza visual
	ORANGE("#ff6600"),YELLOW("#fcd202"),LIME("#b0de09"),BLUE("#0d8ecf"),
	INDIGO("#2a0cd0"),PINK("#cd0d74"),RED("#cc0000"),GRASS("#00cc00"),
	NAVY("#0000cc"),GRAY("#dddddd"),STEEL("#999999"),DARKGRAY("#333333"),DARKRED("#990000");
	
	private String color;
	
	private ColorsAmCharts(String nombre){
		color = nombre;
	}
	
	public String toString(){
		return color;
	}
	
	@JsonValue
	private String getColorAmCharts(){
		return color;
	}
	
	@JsonSetter
	private void setColorAmCharts(String nombre){
		color = nombre.toLowerCase();
	}
	
}