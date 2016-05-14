package es.uvigo.esei.amchartsjava.core.constants;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Default colors used by AmSlicedChart
 * @author Iago Fernández Cuñarro
 *
 */
public enum ColorsSlicedCharts {
	RED("#FF0F00"),ORANGE("#FF6600"),LIGHTORANGE("#FF9E01"),YELLOW("#FCD202"),
	BRIGHTYELLOW("#F8FF01"),LIME("#B0DE09"),GRASS("#04D215"),ELECTRICBLUE("#0D8ECF"),
	SAPPHIRE("#0D52D1"),DARKBLUE("#2A0CD0"),DARKVIOLET("#8A0CCF"),DOGWOODROSE("#CD0D74"),
	MAJORELLEBLUE("#754DEB"),GAINSBORO("#DDDDDD"),MOUNTAINMIST("#999999"),MINESHAFT("#333333"),
	BLACK("#000000"),BORDEAUX("#57032A"),NUGGET("#CA9726"),CRIMSOMRED("#990000"),CABSAV("#4B0C25");
	
	private String color;
	
	private ColorsSlicedCharts(final String nombre){
		color = nombre;
	}
	
	public String toString(){
		return color;
	}
	
	@JsonValue
	private String getColorSlicedCharts(){
		return color;
	}
	
	@JsonSetter
	private void setColorSlicedCharts(final String nombre){
		color = nombre.toLowerCase();
	}
}
