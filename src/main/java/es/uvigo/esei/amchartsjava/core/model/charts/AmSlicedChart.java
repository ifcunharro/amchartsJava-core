package es.uvigo.esei.amchartsjava.core.model.charts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uvigo.esei.amchartsjava.core.constants.ColorsSlicedCharts;
import es.uvigo.esei.amchartsjava.core.model.AmChart;

/**
 * Model class for AmSlicedChart.
 * @author Iago Fernández Cuñarro
 *
 */
public class AmSlicedChart extends AmChart {
	
	private List<String> slicedColors;
	private List<Number> gradientRatio;
	
	{
		slicedColors = new ArrayList<String>();
		for(ColorsSlicedCharts color: ColorsSlicedCharts.values()){
			slicedColors.add(color.toString());
		}
		gradientRatio = new ArrayList<Number>();
	}
	
	/**
	 * Get colors.
	 * @return List of colors.
	 */
	public List<String> getColors(){
		return slicedColors;
	}
	
	//used to deserialize json
	/**
	 * Set colors from json.
	 * @param c List of colors.
	 */
	public void setColors(List<String> c){
		slicedColors = c;
	}
	
	/**
	 * Change defualt colors.
	 * @param newColors Values for colors.
	 */
	public void changeColorsDefault(String... newColors){
		slicedColors.clear();
		slicedColors.addAll(Arrays.asList(newColors));
	}
	
	/**
	 * Add a color.
	 * @param color Value for color.
	 */
	public void addColor(String color){
		slicedColors.add(color);
	}
	
	/**
	 * Get gradientRatio.
	 * @return Values for gradient.
	 */
	public List<Number> getGradientRatio(){
		return gradientRatio;
	}
	
	/**
	 * Set gradientRatio.
	 * @param gradient Values for gradient.
	 */
	public void setGradientRatio(Number... gradient){
		gradientRatio.clear();
		gradientRatio.addAll(Arrays.asList(gradient));
	}

}
