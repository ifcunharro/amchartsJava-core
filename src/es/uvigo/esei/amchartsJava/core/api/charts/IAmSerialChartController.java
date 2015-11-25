package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.controllers.axis.CategoryAxisController;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

/**
 * 
 * Interface for controller of AmSerialChart. Details of AmSerialChart and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmSerialChartController extends IAmRectangularChartController<AmRectangularChart> {

	/**
	 * Get balloonDateFormat property.<br>
	 * Default: MMM DD, YYYY
	 * @return String Value for balloonDateFormat.
	 */
	abstract String getBalloonDateFormat();

	/**
	 * Set balloonDateFormat property.
	 * @param balloonDateFormat Value for balloonDateFormat.
	 * @see es.uvigo.esei.amchartsJava.core.constants.DateFormatConstant
	 */
	abstract void setBalloonDateFormat(String balloonDateFormat);

	/**
	 * Get categoryField property.
	 * @return String Value for categoryField.
	 */
	abstract String getCategoryField();

	/**
	 * Set categoryField property.
	 * @param categoryField Value for categoryField.
	 */
	abstract void setCategoryField(String categoryField);

	/**
	 * Get columnSpacing property.<br>
	 * Default: 5.
	 * @return Integer Value for columnSpacing.
	 */
	abstract Integer getColumnSpacing();

	/**
	 * Set columnSpacing property.
	 * @param columnSpacing Value for columnSpacing.
	 * @throws IntegerException Value for columnSpacing is not an integer number.
	 */
	abstract void setColumnSpacing(Number columnSpacing) throws IntegerException;

	/**
	 * Get columnSpacing3D property.<br>
	 * Default: 0.
	 * @return Integer Value for columnSpacing3D.
	 */
	abstract Integer getColumnSpacing3D();

	/**
	 * Set columnSpacing3D property.
	 * @param columnSpacing3D Value for columnSpacing3D.
	 * @throws IntegerException Value for columnSpacing3D is not an integer number.
	 */
	abstract void setColumnSpacing3D(Number columnSpacing3D)
			throws IntegerException;

	/**
	 * Get columnWidth property.<br>
	 * Default: 0.8.
	 * @return Double Value for columnWidth.
	 */
	abstract Double getColumnWidth();

	/**
	 * Set columnWidth property.
	 * @param columnWidth Value for columnWidth.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setColumnWidth(Number columnWidth) throws OutOfRangeException;

	/**
	 * Get dataDateFormat property.
	 * @return String Value for dataDateFormat.
	 */
	abstract String getDataDateFormat();

	/**
	 * Set dataDateFormat property.
	 * @param dataDateFormat Value for dataDateFormat
	 */
	abstract void setDataDateFormat(String dataDateFormat);

	/**
	 * Get maxSelectedSeries property.
	 * @return Integer Value for maxSelectedSeries.
	 */
	abstract Integer getMaxSelectedSeries();

	/**
	 * Set maxSelectedSeries property.
	 * @param maxSelectedSeries Value for maxSelectedSeries.
	 * @throws IntegerException Value for maxSelectedSeries is not an integer number.
	 */
	abstract void setMaxSelectedSeries(Number maxSelectedSeries)
			throws IntegerException;

	/**
	 * Get maxSelectedTime property.
	 * @return Integer Value for maxSelectedTime.
	 */
	abstract Integer getMaxSelectedTime();

	/**
	 * Set maxSelectedTime property.
	 * @param maxSelectedTime Value for maxSelectedTime
	 * @throws OutOfRangeException Value out of range admitted: 1000-259200000.
	 */
	abstract void setMaxSelectedTime(Number maxSelectedTime)
			throws OutOfRangeException;

	/**
	 * Get minSelectedTime property.
	 * Default: 0.
	 * @return Integer Value for minSelectedTime.
	 */
	abstract Integer getMinSelectedTime();

	/**
	 * Set minSelectedTime property.
	 * @param minSelectedTime Value for minSelectedTime.
	 * @throws OutOfRangeException Value out of range admitted: 0-10000.
	 */
	abstract void setMinSelectedTime(Number minSelectedTime)
			throws OutOfRangeException;

	/**
	 * Get mouseWheelScrollEnabled property.<br>
	 * Default: false.
	 * @return Boolean Value for mouseWheelScrollEnabled.
	 */
	abstract Boolean isMouseWheelScrollEnabled();

	/**
	 * Set mouseWheelScrollEnabled property.
	 * @param mouseWheelScrollEnabled Enable or disable mouseWheelScroll.
	 */
	abstract void setMouseWheelScrollEnabled(Boolean mouseWheelScrollEnabled);

	/**
	 * Get mouseWheelZoomEnabled property.<br>
	 * Default: false.
	 * @return Boolean Value for mouseWheelZoomEnabled.
	 */
	abstract Boolean isMouseWheelZoomEnabled();

	/**
	 * Set mouseWheelZoomEnabled property.
	 * @param mouseWheelZoomEnabled Enable or disable mouseWheelZoom.
	 */
	abstract void setMouseWheelZoomEnabled(Boolean mouseWheelZoomEnabled);

	/**
	 * Get rotate property.<br>
	 * Default: false.
	 * @return Boolean Value for rotate.
	 */
	abstract Boolean isRotate();

	/**
	 * Set rotate property.
	 * @param rotate Enable or disable rotate.
	 */
	abstract void setRotate(Boolean rotate);

	/**
	 * Get zoomOutOnDataUpdated property.<br>
	 * Default: true.
	 * @return Boolean Value for zoomOutOnDataUpdated.
	 */
	abstract Boolean isZoomOutOnDataUpdated();

	/**
	 * Set zoomOutOnDataUpdated property.
	 * @param zoomOutOnDataUpdated Enable or disable zoomOutOnDataUpdated.
	 */
	abstract void setZoomOutOnDataUpdated(Boolean zoomOutOnDataUpdated);

	/**
	 * Add a categoryAxis to chart.
	 * @param categoryAxisController Controller for categoryAxis.
	 */
	abstract void addCategoryAxis(CategoryAxisController categoryAxisController);

	/**
	 * Get categoryAxis property.
	 * @return CategoryAxisController Controller for categoryAxis.
	 */
	abstract CategoryAxisController getCategoryAxis();

}