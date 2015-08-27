package es.uvigo.esei.amchartsJava.core.api.graphs;

import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IAmGraphXyController extends IAmGraphSerialChartController {

	public Object getBulletAxis();
	
	public void setBulletAxis(String bulletAxis) throws ChartException;
	
	public Object getFillToAxis();
	
	public void setFillToAxis(String fillToAxis) throws ChartException;
	
	public Object getMaxBulletSize();

	public void setMaxBulletSize(Number maxBulletSize) throws OutOfRangeException;

	public Object getMinBulletSize();

	public void setMinBulletSize(Number minBulletSize) throws IntegerException;
	
	public Object getXAxis();
	
	public void setXAxis(String xAxis) throws ChartException;
	
	public Object getXField();

	public void setXField(String xField);
	
	public Object getYAxis();
	
	public void setYAxis(String yAxis) throws ChartException;

	public Object getYField();

	public void setYField(String yField);

}