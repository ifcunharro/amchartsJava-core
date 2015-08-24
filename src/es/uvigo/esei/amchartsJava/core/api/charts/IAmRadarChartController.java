package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

public interface IAmRadarChartController extends IAmCoordinateChartController<AmCoordinateChart> {

	public Object getCategoryField();

	public void setCategoryField(String categoryField);

	public Object getMarginBottom();

	public void setMarginBottom(Number marginBottom) throws IntegerException;

	public Object getMarginLeft();

	public void setMarginLeft(Number marginLeft) throws IntegerException;

	public Object getMarginRight();

	public void setMarginRight(Number marginRight) throws IntegerException;

	public Object getMarginTop();

	public void setMarginTop(Number marginTop) throws IntegerException;

	public Object getRadius();

	public void setRadius(String radius) throws CoordException;

}