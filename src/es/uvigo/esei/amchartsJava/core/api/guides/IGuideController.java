package es.uvigo.esei.amchartsJava.core.api.guides;

import java.sql.Date;

import es.uvigo.esei.amchartsJava.core.constants.PositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

/**
 * 
 * Interface for controller of Guide. Details of Guide and 
 *  its properties in AmCharts API.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IGuideController {

	/**
	 * Set chart that use Guide.
	 * @param Chart own of Guide.
	 */
	abstract void setChart(AmCoordinateChart c);

	/**
	 * Get above property.<br>
	 * Default: false.
	 * @return Boolean Value for above. 
	 */
	abstract Boolean isAbove();

	/**
	 * Set above property.
	 * @param above Enable or disable above.
	 */
	abstract void setAbove(Boolean above);

	/**
	 * Get balloonColor property.
	 * @return String Value for balloonColor.
	 */
	abstract String getBalloonColor();

	/**
	 * Set balloonColor property.
	 * @param balloonColor Value for balloonColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setBalloonColor(String balloonColor) throws ColorException;

	/**
	 * Get balloonText property.
	 * @return String Value for balloonText.
	 */
	abstract String getBalloonText();

	/**
	 * Set balloonText property.
	 * @param balloonText Value for balloonText.
	 */
	abstract void setBalloonText(String balloonText);

	/**
	 * Get boldLabel property.<br>
	 * Default: false.
	 * @return Boolean Value for boldLabel.
	 */
	abstract Boolean isBoldLabel();

	/**
	 * Set boldLabel property.
	 * @param boldLabel Enable or disable bold for label.
	 */
	abstract void setBoldLabel(Boolean boldLabel);

	/**
	 * Get color property.
	 * @return String Value for color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setColor(String color) throws ColorException;

	/**
	 * Get dashLength property.
	 * @return Integer Value for dashLength.
	 */
	abstract Integer getDashLength();

	/**
	 * Set dashLength property.With improvedVisibility enabled, range activated.
	 * @param dashLength Value for dashLength.
	 * @throws OutOfRangeException Value out of range admitted: 0-36.
	 */
	abstract void setDashLength(Number dashLength) throws OutOfRangeException;

	/**
	 * Get fillAlpha property.
	 * @return Double Value for fillAlpha.
	 */
	abstract Double getFillAlpha();

	/**
	 * Set fillAlpha property.
	 * @param fillAlpha Value for fillAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setFillAlpha(Number fillAlpha) throws OutOfRangeException;

	/**
	 * Get fillColor property.
	 * @return String Value for fillColor.
	 */
	abstract String getFillColor();

	/**
	 * Set fillColor property.
	 * @param fillColor Value for fillColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setFillColor(String fillColor) throws ColorException;

	/**
	 * Get fontSize property.
	 * @return Integer Value for fontSize.
	 */
	abstract Integer getFontSize();

	/**
	 * Set fontSize property.With improvedVisibility enabled, range activated.
	 * @param fontSize Value for fontSize.
	 * @throws OutOfRangeException Value out of range admitted: 8-20.
	 */
	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	/**
	 * Get id property.
	 * @return String Guide id.
	 */
	abstract String getId();

	/**
	 * Get inside property.
	 * @return Boolean Value for inside.
	 */
	abstract Boolean isInside();
	
	/**
	 * Set inside property.
	 * @param inside Enable or disable inside.
	 */
	abstract void setInside(Boolean inside);

	/**
	 * Get label property
	 * @return String Value for label.
	 */
	abstract String getLabel();

	/**
	 * Set label property.
	 * @param label Value for label.
	 */
	abstract void setLabel(String label);

	/**
	 * Get labelRotation property.
	 * @return Integer Value for labelRotation.
	 */
	abstract Integer getLabelRotation();

	/**
	 * Set labelRotation property.
	 * @param labelRotation Value for labelRotation.
	 * @throws OutOfRangeException Value out of range admitted: 0-360.
	 */
	abstract void setLabelRotation(Number labelRotation)
			throws OutOfRangeException;

	/**
	 * Get lineAlpha property.
	 * @return Double Value for lineAlpha.
	 */
	abstract Double getLineAlpha();

	/**
	 * Set lineAlpha property.
	 * @param lineAlpha Value for lineAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setLineAlpha(Number lineAlpha) throws OutOfRangeException;

	/**
	 * Get lineColor property.
	 * @return String Value for lineColor.
	 */
	abstract String getLineColor();

	/**
	 * Set lineColor property.
	 * @param lineColor Value for lineColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setLineColor(String lineColor) throws ColorException;

	/**
	 * Get lineThickness property.
	 * @return Integer Value for lineThickness.
	 */
	abstract Integer getLineThickness();

	/**
	 * Set lineThickness property.With imrpovedVisibility enabled, range activated.
	 * @param lineThickness Value for lineThickness.
	 * @throws OutOfRangeException Value out of range admitted: 1-20.
	 */
	abstract void setLineThickness(Number lineThickness)
			throws OutOfRangeException;

	/**
	 * Get position property.
	 * @return String Value for position.
	 */
	abstract String getPosition();

	/**
	 * Set position property.
	 * @param position Value for position.
	 */
	abstract void setPosition(Position position);

	/**
	 * Get tickLength property.
	 * @return Integer Value for tickLength.
	 */
	abstract Integer getTickLength();

	/**
	 * Set tickLength property.
	 * @param tickLength Value for tickLength.
	 * @throws OutOfRangeException Value out of range admitted: 0-5.
	 */
	abstract void setTickLength(Number tickLength) throws OutOfRangeException;

	/**
	 * Get toDate property.
	 * @return String Value for toDate.
	 */
	abstract String getToDate();

	/**
	 * Set toDate property.
	 * @param toDate Value for toDate.
	 */
	abstract void setToDate(Date toDate);

	/**
	 * Get valueAxis property.
	 * @return String ValueAxis id.
	 */
	abstract String getValueAxis();

	/**
	 * Set valueAxis property.
	 * @param valueAxis ValueAxis id.
	 * @throws ChartException Chart that use guide doesn't contain a ValueAxis with id equals to valueAxis.
	 */
	abstract void setValueAxis(String valueAxis) throws ChartException;

}