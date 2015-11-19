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
 *  their properties in AmCharts API
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
	 * @return Object Value for axisAlpha is a double number.
	 */
	abstract Object getAxisAlpha();

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
	 * @return Object Value for axisThickness is an integer number.
	 */
	abstract Object getAxisThickness();

	/**
	 * Set axisThickness property.
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
	 * @return Object Value for dashLength is an integer number.
	 */
	abstract Object getDashLength();

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
	 * @return Object Value for fillAlpha is a double number.
	 */
	abstract Object getFillAlpha();

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
	 * @return Object Value for fontSize is an integer number.
	 */
	abstract Object getFontSize();

	/**
	 * Set fontSize property.With improvedVisibility enabled range activated.
	 * @param fontSize Value for fontSize.
	 * @throws OutOfRangeException Value out of range admitted: 10-16.
	 */
	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	/**
	 * Get gridAlpha property.<br>
	 * Default: 0.15.
	 * @return Object Valeu for gridAlpha is a double number.
	 */
	abstract Object getGridAlpha();

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
	 * @return Object Value for gridCount is an integer number.
	 */
	abstract Object getGridCount();

	/**
	 * Set gridCount property.With improvedVisibility enabled range activated.
	 * @param gridCount Value for gridCount.
	 * @throws OutOfRangeException Value out of range admitted: 5-10.
	 */
	abstract void setGridCount(Number gridCount) throws OutOfRangeException;

	/**
	 * Get gridThickness property.<br>
	 * Default: 1.
	 * @return Object Value for gridThickness is an integer number.
	 */
	abstract Object getGridThickness();

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
	 * @return Object Value for labelFrequency is an integer number.
	 */
	abstract Object getLabelFrequency();

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
	 * @return Object Value for labelOffset is an integer number.
	 */
	abstract Object getLabelOffset();

	/**
	 * Set labelOffset property.With improvedVisibility enabled range activated.
	 * @param labelOffset Value for labelOffset.
	 * @throws OutOfRangeException Value out of range admitted: 0-5.
	 */
	abstract void setLabelOffset(Number labelOffset) throws OutOfRangeException;

	/**
	 * Get labelRotation property.<br>
	 * Default: 0.
	 * @return Object Value for labelRotation is an integer number.
	 */
	abstract Object getLabelRotation();

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
	 * ®return Object Value for minHorizontalGap is an integer number.
	 */
	abstract Object getMinHorizontalGap();

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
	 * @return Object Value for minorGridAlpha is a double number.
	 */
	abstract Object getMinorGridAlpha();

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
	 * @return Object Value for minorTickLength is an integer number.
	 */
	abstract Object getMinorTickLength();
	
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
	 * @return Object Value for minVerticalGap is an integer number.
	 */
	abstract Object getMinVerticalGap();

	/**
	 * Set minVerticalGap property.
	 * @param minVerticalGap Value for minVerticalGap.
	 */
	abstract void setMinVerticalGap(Number minVerticalGap);

	/**
	 * Get offset property.<br>
	 * Default: 0.
	 * @return Object Value for offset is an integer number.
	 */
	abstract Object getOffset();

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
	 * @return Object Value for tickLength is an integer number.
	 */
	abstract Object getTickLength();

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
	 * @return Object Value for titleFontSize is an integer number.
	 */
	abstract Object getTitleFontSize();

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
	 * @return Object Value for titleRotation.
	 */
	abstract Object getTitleRotation();
	
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
	 * @return Map<String,String> 
	 */
	abstract Map<String,String> getAxesFields();

}