package es.uvigo.esei.amchartsJava.core.api.graphs;

import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;

public interface IAmGraphXyController extends IAmGraphSerialChartController {

	public Object getBulletAxis();
	
	public void setBulletAxis(String bulletAxis);
	
	public Object getFillToAxis();
	
	public void setFillToAxis(String fillToAxis);
	
	public Object getMaxBulletSize();

	public void setMaxBulletSize(Number maxBulletSize) throws IntegerException;

	public Object getMinBulletSize();

	public void setMinBulletSize(Number minBulletSize) throws IntegerException;
	
	public Object getXAxis();
	
	public void setXAxis(String xAxis);
	
	public Object getXField();

	public void setXField(String xField);
	
	public Object getYAxis();
	
	public void setYAxis(String yAxis);

	public Object getYField();

	public void setYField(String yField);

}