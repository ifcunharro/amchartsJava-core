package es.uvigo.esei.amchartsJava.core.model.charts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.api.deserializers.IJsonDeserializerColorCharts;
import es.uvigo.esei.amchartsJava.core.constants.ColorsSlicedCharts;
import es.uvigo.esei.amchartsJava.core.model.AmChart;

public class AmSlicedChart extends AmChart implements IJsonDeserializerColorCharts {
	
	private List<String> slicedColors;
	private List<Number> gradientRatio;
	
	{
		slicedColors = new ArrayList<String>();
		for(ColorsSlicedCharts color: ColorsSlicedCharts.values()){
			slicedColors.add(color.toString());
		}
	}
	
	public List<String> getColors(){
		return slicedColors;
	}
	
	//usado para deserializar json
	public void setColors(List<String> c){
		slicedColors = c;
	}
	
	public void changeColorsDefault(String... newColors){
		slicedColors.clear();
		slicedColors.addAll(Arrays.asList(newColors));
	}
	
	public void addColor(String color){
		slicedColors.add(color);
	}
	
	public Object getGradientRatio(){
		return gradientRatio;
	}
	
	public void setGradientRatio(Number... gradient){
		gradientRatio.clear();
		gradientRatio.addAll(Arrays.asList(gradient));
	}

}
