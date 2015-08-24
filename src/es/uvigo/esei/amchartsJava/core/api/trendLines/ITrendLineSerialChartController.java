package es.uvigo.esei.amchartsJava.core.api.trendLines;

import java.sql.Date;

import es.uvigo.esei.amchartsJava.core.controllers.ImageController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

public interface ITrendLineSerialChartController {

	public void setChart(AmRectangularChart chart);

	public Object getDashLength();

	public void setDashLength(Number dashLength) throws OutOfRangeException;

	public Object getFinalCategory();

	public void setFinalCategory(String finalCategory);

	public Object getFinalDate();

	public void setFinalDate(Date finalDate);

	public Object getFinalValue();

	public void setFinalValue(Number finalValue);

	public Object getId();

	public Object getInitialCategory();

	public void setInitialCategory(String initialCategory);

	public Object getInitialDate();

	public void setInitialDate(Date initialDate);

	public Object getInitialValue();

	public void setInitialValue(Number initialValue);

	public Object getLineAlpha();

	public void setLineAlpha(Number lineAlpha) throws OutOfRangeException;

	public Object getLineColor();

	public void setLineColor(String lineColor) throws ColorException;

	public Object getLineThickness();

	public void setLineThickness(Number lineThickness)
			throws OutOfRangeException;

	public Object getValueAxis();

	public void setValueAxis(String valueAxis);

	public Object getFinalImage();

	public Object getInitialImage();

	public void addFinalImage(ImageController finalImage);

	public void addInitialImage(ImageController initialImage);

}