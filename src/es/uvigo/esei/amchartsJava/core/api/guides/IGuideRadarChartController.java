package es.uvigo.esei.amchartsJava.core.api.guides;

import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IGuideRadarChartController extends IGuideController {

	public Object getAngle();

	public void setAngle(Number angle) throws OutOfRangeException;

	public Object getToAngle();

	public void setToAngle(Number toAngle) throws OutOfRangeException;

}