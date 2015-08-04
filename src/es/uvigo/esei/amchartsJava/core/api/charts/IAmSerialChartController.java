package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IAmSerialChartController extends IAmRectangularChartController {

	public Object getBalloonDateFormat();

	public void setBalloonDateFormat(String balloonDateFormat);

	public Object getCategoryField();

	public void setCategoryField(String categoryField);

	public Object getColumnSpacing();

	public void setColumnSpacing(Number columnSpacing) throws IntegerException;

	public Object getColumnSpacing3D();

	public void setColumnSpacing3D(Number columnSpacing3D)
			throws IntegerException;

	public Object getColumnWidth();

	public void setColumnWidth(Number columnWidth) throws OutOfRangeException;

	public Object getDataDateFormat();

	public void setDataDateFormat(String dataDateFormat);

	public Object getMaxSelectedSeries();

	public void setMaxSelectedSeries(Number maxSelectedSeries)
			throws IntegerException;

	public Object getMaxSelectedTime();

	public void setMaxSelectedTime(Number maxSelectedTime)
			throws OutOfRangeException;

	public Object getMinSelectedTime();

	public void setMinSelectedTime(Number minSelectedTime)
			throws OutOfRangeException;

	public Object isMouseWheelScrollEnabled();

	public void setMouseWheelScrollEnabled(Boolean mouseWheelScrollEnabled);

	public Object isMouseWheelZoomEnabled();

	public void setMouseWheelZoomEnabled(Boolean mouseWheelZoomEnabled);

	public Object isRotate();

	public void setRotate(Boolean rotate);

	public Object isZoomOutOnDataUpdated();

	public void setZoomOutOnDataUpdated(Boolean zoomOutOnDataUpdated);

}