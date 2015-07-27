package es.uvigo.esei.amchartsJava.core.model.charts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AmRectangularChart extends AmCoordinateChart {
	private List<String> plotAreaFillColors;
	
	{
		plotAreaFillColors = new ArrayList<String>();
	}
	
	
	public void addPlotAreaFillColors(String... colors){
		plotAreaFillColors.clear();
		plotAreaFillColors.addAll(Arrays.asList(colors));
	}

}
