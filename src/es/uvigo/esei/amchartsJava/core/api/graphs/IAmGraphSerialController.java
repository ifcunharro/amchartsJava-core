package es.uvigo.esei.amchartsJava.core.api.graphs;

import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;


public interface IAmGraphSerialController extends IAmGraphSerialChartController {

	public Object isConnect();

	public void setConnect(Boolean connect);
	
	abstract Object getFillColors();

	abstract void setFillColors(ColorsAmCharts fillColors);

	abstract Object getFillColorsField();

	abstract void setFillColorsField(String fillColorsField);


}