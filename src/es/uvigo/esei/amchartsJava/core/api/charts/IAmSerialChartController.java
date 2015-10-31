package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.controllers.axis.CategoryAxisController;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

public abstract interface IAmSerialChartController extends IAmRectangularChartController<AmRectangularChart> {

	abstract String getBalloonDateFormat();

	abstract void setBalloonDateFormat(String balloonDateFormat);

	abstract String getCategoryField();

	abstract void setCategoryField(String categoryField);

	abstract Object getColumnSpacing();

	abstract void setColumnSpacing(Number columnSpacing) throws IntegerException;

	abstract Object getColumnSpacing3D();

	abstract void setColumnSpacing3D(Number columnSpacing3D)
			throws IntegerException;

	abstract Object getColumnWidth();

	abstract void setColumnWidth(Number columnWidth) throws OutOfRangeException;

	abstract String getDataDateFormat();

	abstract void setDataDateFormat(String dataDateFormat);

	abstract Object getMaxSelectedSeries();

	abstract void setMaxSelectedSeries(Number maxSelectedSeries)
			throws IntegerException;

	abstract Object getMaxSelectedTime();

	abstract void setMaxSelectedTime(Number maxSelectedTime)
			throws OutOfRangeException;

	abstract Object getMinSelectedTime();

	abstract void setMinSelectedTime(Number minSelectedTime)
			throws OutOfRangeException;

	abstract Boolean isMouseWheelScrollEnabled();

	abstract void setMouseWheelScrollEnabled(Boolean mouseWheelScrollEnabled);

	abstract Boolean isMouseWheelZoomEnabled();

	abstract void setMouseWheelZoomEnabled(Boolean mouseWheelZoomEnabled);

	abstract Boolean isRotate();

	abstract void setRotate(Boolean rotate);

	abstract Boolean isZoomOutOnDataUpdated();

	abstract void setZoomOutOnDataUpdated(Boolean zoomOutOnDataUpdated);

	abstract void addCategoryAxis(CategoryAxisController categoryAxisController);

	abstract CategoryAxisController getCategoryAxis();

}