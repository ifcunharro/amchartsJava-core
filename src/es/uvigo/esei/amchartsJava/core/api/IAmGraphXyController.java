package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;

public interface IAmGraphXyController extends IAmGraphSerialController {

	public Object getMaxBulletSize();

	public void setMaxBulletSize(Number maxBulletSize) throws IntegerException;

	public Object getMinBulletSize();

	public void setMinBulletSize(Number minBulletSize) throws IntegerException;

	public Object getXField();

	public void setXField(String xField);

	public Object getYField();

	public void setYField(String yField);

}