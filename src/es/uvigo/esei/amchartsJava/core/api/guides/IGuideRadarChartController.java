package es.uvigo.esei.amchartsJava.core.api.guides;

import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IGuideRadarChartController extends IGuideController {

	abstract Object getAngle();

	abstract void setAngle(Number angle) throws OutOfRangeException;

	abstract Object getToAngle();

	abstract void setToAngle(Number toAngle) throws OutOfRangeException;

}