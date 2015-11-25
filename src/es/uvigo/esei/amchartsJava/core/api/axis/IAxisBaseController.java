package es.uvigo.esei.amchartsJava.core.api.axis;


import java.util.Map;

import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.AxisPositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of AxisBase. Details of AxisBase and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAxisBaseController {

	/**
	 * Get autoGridCount property.<br>
	 * Default: true.
	 * @return Boolean Value for autoGridCount.
	 */
	abstract Boolean isAutoGridCount();

	/**
	 * Set autoGridCount property.
	 * @param Enable or disable autoGridCount.
	 */
	abstract void setAutoGridCount(Boolean autoGridCount);

	/**
	 * Get axisAlpha property.<br>
	 * Default: 1.
	 * @return Double Value for axisAlpha.
	 */
	abstract Double getAxisAlpha();

	/**
	 * Set axisAlpha property.
	 * @param axisAlpha Value for axisAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setAxisAlpha(Number axisAlpha) throws OutOfRangeException;

	/**
	 * Get axisColor property.<br>
	 * Default: #000000
	 * @return String Value for axisColor.
	 */
	abstract String getAxisColor();

	/**
	 * Set axisColor property.
	 * @param axisColor Value for axisColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setAxisColor(String axisColor) throws ColorException;

	/**
	 * Get axisThickness property.<br>
	 * Default: 1.
	 * @return Integer Value for axisThickness.
	 */
	abstract Integer getAxisThickness();

	/**
	 * Set axisThickness property.With improvedVisibility enabled range activated.
	 * @param Value for axisThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-2.
	 */
	abstract void setAxisThickness(Number axisThickness)
			throws OutOfRangeException;

	/**
	 * Get boldLabels property.<br>
	 * Default: false.
	 * @return Boolean Value for boldLabels.
	 */
	abstract Boolean isBoldLabels();

	/**
	 * Set boldLabels property.
	 * @param boldLabels Enable or disable bold for labels.
	 */
	abstract void setBoldLabels(Boolean boldLabels);
	
	/**
	 * Get centerLabels property.<br>
	 * Default: false.
	 * @return Boolean Value for centerLabels.
	 */
	abstract Boolean isCenterLabels();
	
	/**
	 * Set centerLabels property.
	 * @param centerLabels Center or don't center labels.
	 */
	abstract void setCenterLabels(Boolean centerLabels);

	/**
	 * Get color property.
	 * @return String Value for color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 */
	abstract void setColor(ColorsAmCharts color);

	/**
	 * Get dashLength property.<br>
	 * Default: 0.
	 * @return Integer Value for dashLength.
	 */
	abstract Integer getDashLength();

	/**
	 * Set dashLength property.With improvedVisibility enabled range activated.
	 * @param dashLength Value for dashLength.
	 * @throws OutOfRangeException Value out of range admitted: 0-100.
	 */
	abstract void setDashLength(Number dashLength) throws OutOfRangeException;

	/**
	 * Get dateFormats property.
	 * @return String[] Format of dates.
	 */
	abstract String[] getDateFormats();

	/**
	 * Get fillAlpha property.<br>
	 * Default: 0.
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
	 * Get fillColor property.<br>
	 * Default: #ffffff.
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
	 * Set fontSize property.With improvedVisibility enabled range activated.
	 * @param fontSize Value for fontSize.
	 * @throws OutOfRangeException Value out of range admitted: 10-16.
	 */
	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	/**
	 * Get gridAlpha property.<br>
	 * Default: 0.15.
	 * @return Double Value for gridAlpha.
	 */
	abstract Double getGridAlpha();

	/**
	 * Set gridAlpha property.
	 * @param Value for gridAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setGridAlpha(Number gridAlpha) throws OutOfRangeException;

	/**
	 * Get gridColor property.<br>
	 * Default: #000000.
	 * @return String Value for gridColor.
	 */
	abstract String getGridColor();

	/**
	 * Set gridColor property.
	 * @param gridColor Value for gridColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setGridColor(String gridColor) throws ColorException;

	/**
	 * Get gridCount property.<br>
	 * Default: 5.
	 * @return Integer Value for gridCount.
	 */
	abstract Integer getGridCount();

	/**
	 * Set gridCount property.With improvedVisibility enabled range activated.
	 * @param gridCount Value for gridCount.
	 * @throws OutOfRangeException Value out of range admitted: 5-10.
	 */
	abstract void setGridCount(Number gridCount) throws OutOfRangeException;

	/**
	 * Get gridThickness property.<br>
	 * Default: 1.
	 * @return Integer Value for gridThickness.
	 */
	abstract Integer getGridThickness();

	/**
	 * Set gridThickness property.With improvedVisibility enabled range activated.
	 * @param gridThickness Value for gridThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-2.
	 */
	abstract void setGridThickness(Number gridThickness) throws OutOfRangeException;

	/**
	 * Get ignoreAxisWidth property.<br>
	 * Default: false.
	 * @return Boolean Value for ignoreAxisWidth.
	 */
	abstract Boolean isIgnoreAxisWidth();

	/**
	 * Set ignoreAxisWidth property.
	 * @param ignoreAxisWidth Ignore or don't ignore axisWidth.
	 */
	abstract void setIgnoreAxisWidth(Boolean ignoreAxisWidth);

	/**
	 * Get inside property.<br>
	 * Default: false.
	 * @return Boolean Value for inside.
	 */
	abstract Boolean isInside();

	/**
	 * Set inside property.
	 * @param inside Values inside or outside of plot area.
	 */
	abstract void setInside(Boolean inside);

	/**
	 * Get labelFrequency property.<br>
	 * Default: 1.
	 * @return Integer Value for labelFrequency.
	 */
	abstract Integer getLabelFrequency();

	/**
	 * Set labelFrequency property.With improvedVisibility enabled range activated.
	 * @param labelFrequency.
	 * @throws OutOfRangeException Value out of range admitted: 1-10.
	 */
	abstract void setLabelFrequency(Number labelFrequency)
			throws OutOfRangeException;

	/**
	 * Get labelOffset property.<br>
	 * Default: 0.
	 * @return Integer Value for labelOffset.
	 */
	abstract Integer getLabelOffset();

	/**
	 * Set labelOffset property.With improvedVisibility enabled range activated.
	 * @param labelOffset Value for labelOffset.
	 * @throws OutOfRangeException Value out of range admitted: 0-5.
	 */
	abstract void setLabelOffset(Number labelOffset) throws OutOfRangeException;

	/**
	 * Get labelRotation property.<br>
	 * Default: 0.
	 * @return Integer Value for labelRotation.
	 */
	abstract Integer getLabelRotation();

	/**
	 * Set labelRotation property.
	 * @param labelRotation Value for labelRotaion.
	 * @throws OutOfRangeException Value out of range admitted: -90 to 90.
	 */
	abstract void setLabelRotation(Number labelRotation)
			throws OutOfRangeException;

	/**
	 * Get labelsEnabled property.<br>
	 * Default: true.
	 * @return Boolean Value for labelsEnabled.
	 */
	abstract Boolean isLabelsEnabled();

	/**
	 * Set labelsEnabled property.
	 * @param labelsEnabled Show or hide labels. 
	 */
	abstract void setLabelsEnabled(Boolean labelsEnabled);

	/**
	 * Get minHorizontalGap property.<br>
	 * Default: 75.
	 * ®return Integer Value for minHorizontalGap.
	 */
	abstract Integer getMinHorizontalGap();

	/**
	 * Set minHorizontalGap property.
	 * @param minHorizontalGap Value for minHorizontalGap.
	 * @throws IntegerException Value for minHorizontalGap is not an integer number.
	 */
	abstract void setMinHorizontalGap(Number minHorizontalGap)
			throws IntegerException;

	/**
	 * Get minorGridAlpha property.<br>
	 * Default: 0.07.
	 * @return Double Value for minorGridAlpha.
	 */
	abstract Double getMinorGridAlpha();

	/**
	 * Set minorGridAlpha property.
	 * @param minorGridAlpha Value for minorGridAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setMinorGridAlpha(Number minorGridAlpha)
			throws OutOfRangeException;

	/**
	 * Get minorGridEnabled property.<br>
	 * Default: false.
	 * @return Boolean Value for minorGridEnabled.
	 */
	abstract Boolean isMinorGridEnabled();

	/**
	 * Set minorGridEnabled property.
	 * @param minorGridEnabled Enable or disable minorGrid.
	 */
	abstract void setMinorGridEnabled(Boolean minorGridEnabled);
	
	/**
	 * Get minorTickLength property.<br>
	 * Default: 0.
	 * @return Integer Value for minorTickLength.
	 */
	abstract Integer getMinorTickLength();
	
	/**
	 * Set minorTickLength property.With improvedVisibility enabled range activated.
	 * @param minorTickLength Value for minorTickLength.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setMinorTickLength(Number minorTickLength) 
			throws OutOfRangeException;

	/**
	 * Get minVerticalGap property.<br>
	 * Default: 35.
	 * @return Integer Value for minVerticalGap .
	 */
	abstract Integer getMinVerticalGap();

	/**
	 * Set minVerticalGap property.
	 * @param minVerticalGap Value for minVerticalGap.
	 * @throws IntegerException Value for minVerticalGap is not an integer number.
	 */
	abstract void setMinVerticalGap(Number minVerticalGap) throws IntegerException;

	/**
	 * Get offset property.<br>
	 * Default: 0.
	 * @return Integer Value for offset.
	 */
	abstract Integer getOffset();

	/**
	 * Set offset property.With improvedVisibility enabled range activated.
	 * @param offset Value for offset.
	 * @throws OutOfRangeException Value out of range admitted: 4-10.
	 */
	abstract void setOffset(Number offset) throws OutOfRangeException;

	/**
	 * Get position property.<br>
	 * Default: bottom.
	 * @return String Value for position.
	 */
	abstract String getPosition();

	/**
	 * Set position property.
	 * @param position Value for position.
	 */
	abstract void setPosition(Position position);

	/**
	 * Get showFirstLabel property.<br>
	 * Default: true.
	 * @return Boolean Value for showFirstLabel.
	 */
	abstract Boolean isShowFirstLabel();

	/**
	 * Set showFirstLabel property.
	 * @param showFirstLabel Show or hide first label.
	 */
	abstract void setShowFirstLabel(Boolean showFirstLabel);

	/**
	 * Get showLastLabel property.<br>
	 * Default: true.
	 * @return Boolean Value for showLastLabel.
	 */
	abstract Boolean isShowLastLabel();

	/**
	 * Set showLastLabel property.
	 * @param showLastLabel Show or hide last label.
	 */
	abstract void setShowLastLabel(Boolean showLastLabel);

	/**
	 * Get tickLength property.<br>
	 * Default: 5.
	 * @return Integer Value for tickLength.
	 */
	abstract Integer getTickLength();

	/**
	 * Set tickLength property.With improvedVisibility enabled range activated.
	 * @param tickLength Value for tickLength.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.  
	 */
	abstract void setTickLength(Number tickLength) throws OutOfRangeException;

	/**
	 * Get title property.
	 * @return String Axis title.
	 */
	abstract String getTitle();

	/**
	 * Set title property.
	 * @param title Value for title.
	 */
	abstract void setTitle(String title);

	/**
	 * Get titleBold property.<br>
	 * Default: true.
	 * @return Boolean Value for titleBold.
	 */
	abstract Boolean isTitleBold();

	/**
	 * Set titleBold property.
	 * @param titleBold Enable or disable bold for title.
	 */
	abstract void setTitleBold(Boolean titleBold);

	/**
	 * Get titleColor property.
	 * @return String Value for titleColor.
	 */
	abstract String getTitleColor();

	/**
	 * Set titleColor property.
	 * @param titleColor Value for titleColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setTitleColor(String titleColor) throws ColorException;

	/**
	 * Get titleFontSize property.
	 * @return Integer Value for titleFontSize.
	 */
	abstract Integer getTitleFontSize();

	/**
	 * Set titleFontSize property.With improvedVisibility enabled range activated.
	 * @param titleFontSize Value for titleFontSize.
	 * @throws OutOfRangeException Value out of range admitted: 10-18.
	 */
	abstract void setTitleFontSize(Number titleFontSize)
			throws OutOfRangeException;
	
	/**
	 * Get titleRotation property.<br>
	 * Default: 0.
	 * @return Integer Value for titleRotation.
	 */
	abstract Integer getTitleRotation();
	
	/**
	 * Set titleRotation property.
	 * @param titleRotation Value for titleRotation.
	 * @throws OutOfRangeException Value out of range admitted: 0-360.
	 */
	abstract void setTitleRotation(Number titleRotation) throws OutOfRangeException;

	/**
	 * Relate nameField of axes amcharts with nameField of axes used by user.
	 * @param axesFields key is nameField, value is value give to nameField by user. 
	 */
	abstract void setAxesFields(Map<String,String> axesFields);

	/**
	 * Get user axesFields.
	 * @return Map<String,String> Nameof axesFields used by user.
	 */
	abstract Map<String,String> getAxesFields();

}