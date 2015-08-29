package es.uvigo.esei.amchartsJava.core.api.trendLines;

import java.sql.Date;

import es.uvigo.esei.amchartsJava.core.controllers.ImageController;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

public abstract interface ITrendLineSerialChartController {

	abstract void setChart(AmRectangularChart chart);

	abstract Object getDashLength();

	abstract void setDashLength(Number dashLength) throws OutOfRangeException;

	abstract String getFinalCategory();

	abstract void setFinalCategory(String finalCategory);

	abstract String getFinalDate();

	abstract void setFinalDate(Date finalDate);

	abstract Object getFinalValue();

	abstract void setFinalValue(Number finalValue);

	abstract String getId();

	abstract String getInitialCategory();

	abstract void setInitialCategory(String initialCategory);

	abstract String getInitialDate();

	abstract void setInitialDate(Date initialDate);

	abstract Object getInitialValue();

	abstract void setInitialValue(Number initialValue);

	abstract Object getLineAlpha();

	abstract void setLineAlpha(Number lineAlpha) throws OutOfRangeException;

	abstract String getLineColor();

	abstract void setLineColor(String lineColor) throws ColorException;

	abstract Object getLineThickness();

	abstract void setLineThickness(Number lineThickness)
			throws OutOfRangeException;

	abstract String getValueAxis();

	abstract void setValueAxis(String valueAxis) throws ChartException;

	abstract ImageController getFinalImage();

	abstract ImageController getInitialImage();

	abstract void addFinalImage(ImageController finalImage);

	abstract void addInitialImage(ImageController initialImage);

}