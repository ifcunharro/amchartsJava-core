package es.uvigo.esei.amchartsJava.core.api.graphs;

import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;


public abstract interface IAmGraphSerialController extends IAmGraphSerialChartController {

	abstract Boolean isConnect();

	abstract void setConnect(Boolean connect);
	
	abstract String getFillColors();

	abstract void setFillColors(ColorsAmCharts fillColors);

	abstract String getFillColorsField();

	abstract void setFillColorsField(String fillColorsField);

	abstract void setGapField(String gapField);

	abstract String getGapField(String gapField);


}