package es.uvigo.esei.amchartsJava.core.api.graphs;

import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IAmGraphXyController extends IAmGraphSerialChartController {

	abstract String getBulletAxis();
	
	abstract void setBulletAxis(String bulletAxis) throws ChartException;
	
	abstract String getFillToAxis();
	
	abstract void setFillToAxis(String fillToAxis) throws ChartException;
	
	abstract Object getMaxBulletSize();

	abstract void setMaxBulletSize(Number maxBulletSize) throws OutOfRangeException;

	abstract Object getMinBulletSize();

	abstract void setMinBulletSize(Number minBulletSize) throws IntegerException;
	
	abstract String getXAxis();
	
	abstract void setXAxis(String xAxis) throws ChartException;
	
	abstract String getXField();

	abstract void setXField(String xField);
	
	abstract String getYAxis();
	
	abstract void setYAxis(String yAxis) throws ChartException;

	abstract String getYField();

	abstract void setYField(String yField);

}