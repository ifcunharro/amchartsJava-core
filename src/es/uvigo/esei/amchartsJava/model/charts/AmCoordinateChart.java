package es.uvigo.esei.amchartsJava.model.charts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uvigo.esei.amchartsJava.constants.ColorsChart;

public class AmCoordinateChart extends AmChart {
	private List<String> colors;
	
	{
		colors = new ArrayList<String>();
		for(ColorsChart color: ColorsChart.values()){
			colors.add(color.toString());
		}
	}
	
	public List<String> getColors(){
		return colors;
	}
	
	public void changeColorsDefault(String... newColors){
		colors.clear();
		colors.addAll(Arrays.asList(newColors));
	}
	
	public void addColor(String color){
		colors.add(color);
	}

}
