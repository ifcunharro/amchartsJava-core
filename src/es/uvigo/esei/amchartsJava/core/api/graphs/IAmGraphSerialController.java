package es.uvigo.esei.amchartsJava.core.api.graphs;

import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;


public interface IAmGraphSerialController extends IAmGraphSerialChartController {

	public Object isConnect();

	public void setConnect(Boolean connect);
	
	abstract Object getFillColors();

	public void setFillColors(ColorsAmCharts fillColors);

	public Object getFillColorsField();

	public void setFillColorsField(String fillColorsField);

	public void setGapField(String gapField);

	public Object getGapField(String gapField);


}