package es.uvigo.esei.amchartsJava.core.api.trendLines;

import java.sql.Date;

import es.uvigo.esei.amchartsJava.core.controllers.ImageController;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

/**
 * 
 * Interface for TrendLineSerialChartController. This interface contains properties of TrendLine only used by serial charts. 
 * Details of TrendLine and its properties in AmCharts API.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface ITrendLineSerialChartController {

	/**
	 * Set chart that use trendLine.
	 * @param chart Chart ow of trendLine.
	 */
	abstract void setChart(AmRectangularChart chart);

	/**
	 * Get dashLength property.<br>
	 * Default: 0.
	 * @return Value of dashLength.
	 */
	abstract Integer getDashLength();

	/**
	 * Set dashLength property.With improvedVisibility enabled, range activated.
	 * @param dashLength Value for dashLength.
	 * @throws OutOfRangeException Value out of range admitted: 0-16.
	 */
	abstract void setDashLength(Number dashLength) throws OutOfRangeException;

	/**
	 * Get finalCategory property.
	 * @return Value of finalCategory.
	 */
	abstract String getFinalCategory();

	/**
	 * Set finalCategory property.
	 * @param finalCategory Value for finalCategory.
	 */
	abstract void setFinalCategory(String finalCategory);

	/**
	 * Get finalDate property.
	 * @return Value of finalDate.
	 */
	abstract String getFinalDate();

	/**
	 * Set finalDate property.
	 * @param finalDate Value for finalDate.
	 */
	abstract void setFinalDate(Date finalDate);

	/**
	 * Get finalValue property.
	 * @return Value of finalValue.
	 */
	abstract Double getFinalValue();

	/**
	 * Set finalValue property.
	 * @param finalValue Value for finalVaalue.
	 */
	abstract void setFinalValue(Number finalValue);

	/**
	 * Get id property.
	 * @return TrendLine id.
	 */
	abstract String getId();

	/**
	 * Get initialCategory property.
	 * @return Value of initialCategory.
	 */
	abstract String getInitialCategory();

	/**
	 * Set initialCategory property.
	 * @param initialCategory Value for initialCategory.
	 */
	abstract void setInitialCategory(String initialCategory);

	/**
	 * Get initialDate property.
	 * @return Value of initialDate.
	 */
	abstract String getInitialDate();

	/**
	 * Set initialDate property.
	 * @param initialDate Value for initialDate.
	 */
	abstract void setInitialDate(Date initialDate);

	/**
	 * Get initialValue property.
	 * @return Value of initialValue.
	 */
	abstract Double getInitialValue();

	/**
	 * Set initialValue property.
	 * @param initialValue Value for initialValue.
	 */
	abstract void setInitialValue(Number initialValue);

	/**
	 * Get lineAlpha property.
	 * @return Value of lineAlpha.
	 */
	abstract Double getLineAlpha();

	/**
	 * Set lineAlpha property.<br>
	 * Default: 1.
	 * @param lineAlpha Value for lineAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setLineAlpha(Number lineAlpha) throws OutOfRangeException;

	/**
	 * Get lineColor property.<br>
	 * Default: #00cc00.
	 * @return Value of lineColor.
	 */
	abstract String getLineColor();

	/**
	 * Set lineColor property.
	 * @param lineColor Value for lineColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setLineColor(String lineColor) throws ColorException;

	/**
	 * Get lineThickness property.<br>
	 * Default: 1.
	 * @return Value of lineThickness.
	 */
	abstract Integer getLineThickness();

	/**
	 * Set lineThickness property.With improvedVisibility enabled, range activated.
	 * @param lineThickness Value for lineThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setLineThickness(Number lineThickness)
			throws OutOfRangeException;

	/**
	 * Get valueAxis property.
	 * @return ValueAxis id.
	 */
	abstract String getValueAxis();

	/**
	 * Set valueAxis property.
	 * @param valueAxis ValueAxis id.
	 * @throws ChartException Chart that use this trendLine doesn't contain a ValueAxis with id equals to valueAxis.
	 */
	abstract void setValueAxis(String valueAxis) throws ChartException;

	/**
	 * Get finalImage property.
	 * @return ImageController Controller for image.
	 */
	abstract ImageController getFinalImage();

	/**
	 * Get initialImage property.
	 * @return ImageController Controller for image.
	 */
	abstract ImageController getInitialImage();

	/**
	 * Add an image to end of trendLine.
	 * @param finalImage Controller for finalImage.
	 */
	abstract void addFinalImage(ImageController finalImage);

	/**
	 * Add an image to start of trendLine.
	 * @param initialImage Controller for initialImage.
	 */
	abstract void addInitialImage(ImageController initialImage);

}