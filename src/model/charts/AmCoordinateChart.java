package model.charts;

import java.util.ArrayList;
import java.util.List;

import amcharts.model.Constants.ColorsChart;

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

}
