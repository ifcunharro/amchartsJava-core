package es.uvigo.esei.amchartsJava.core.api;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.constants.AxisPositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeBandController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of GaugeAxis. Details of GaugeAxis and 
 *  their properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IGaugeAxisController {

	/**
	 * Get axisAlpha property.
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
	 * Get axisColor property.
	 * @return String Value for axisColor.
	 */
	abstract String getAxisColor();

	/**
	 * Set axisColor property.
	 * @param axisColor Value for axisColor.
	 * @throws ColorException Forma of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setAxisColor(String axisColor) throws ColorException;

	/**
	 * Get axisThickness property.
	 * @return Object Value for axisThickness is an integer number.
	 */
	abstract Object getAxisThickness();

	/**
	 * Set axisThickness property.With improvedVisibility enabled range activated.
	 * @param axisThickness Value for axisThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-5.
	 */
	abstract void setAxisThickness(Number axisThickness)
			throws OutOfRangeException;

	/**
	 * Get bandAlpha property.
	 * @return Object Value for bandAlpha is a double number.
	 */
	abstract Object getBandAlpha();

	/**
	 * Set bandAlpha property.
	 * @param bandAlpha Value for bandAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBandAlpha(Number bandAlpha) throws OutOfRangeException;

	/**
	 * Get bandOutlineAlpha property.
	 * @return bandOutlineAlpha Value for bandOutlineAlpha is a double number.
	 */
	abstract Object getBandOutlineAlpha();

	/**
	 * Set bandOutlineAlpha property.
	 * @param bandOutlineAlpha Value for bandOutlineAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBandOutlineAlpha(Number bandOutlineAlpha)
			throws OutOfRangeException;

	/**
	 * Get bandOutlineColor property.
	 * @return String Value for bandOutlineColor.
	 */
	abstract String getBandOutlineColor();

	/**
	 * Set bandOutlineColor property.
	 * @param bandOutlineColor Value for bandOutlineColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setBandOutlineColor(String bandOutlineColor)
			throws ColorException;

	/**
	 * Get bandOutlineThickness property.
	 * @return Object Value for bandOutlineThickness is an integer number.
	 */
	abstract Object getBandOutlineThickness();

	/**
	 * Set bandOutlineThickness property.With improvedVisibility enabled range activated.
	 * @param bandOutlineThickness Value for bandOutlineThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setBandOutlineThickness(Number bandOutlineThickness)
			throws OutOfRangeException;

	/**
	 * Get bands property.
	 * @return List<GaugeBandController> List of GaugeBands.
	 */
	abstract List<GaugeBandController> getBands();

	/**
	 * Get bottomText property.
	 * @return String Value for bottomText.
	 */
	abstract String getBottomText();

	/**
	 * Set bottomText property.
	 * @param bottomText Value for bottomText.
	 */
	abstract void setBottomText(String bottomText);

	/**
	 * Get bottomTextBold property.
	 * @return Boolean Value for bottomTextBold.
	 */
	abstract Boolean isBottomTextBold();

	/**
	 * Set bottomTextBold property.
	 * @param bottomTextBold Enable or disable bold fo bottom text.
	 */
	abstract void setBottomTextBold(Boolean bottomTextBold);

	/**
	 * Get bottomTextColor property.
	 * @return String Value for bottomTextColor.
	 */
	abstract String getBottomTextColor();

	/**
	 * Set bottomTextColor property.
	 * @param bottomTextColor Value for bottomTextColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setBottomTextColor(String bottomTextColor)
			throws ColorException;

	/**
	 * Get bottomTextFontSize property.
	 * @return Object Value for bottomTextFontSize is an integer number.
	 */
	abstract Object getBottomTextFontSize();

	/**
	 * Set bottomTextFontSize property.
	 * @param bottomTextFontSize Value for bottomTextFontSize.
	 * @throws OutOfRangeException Value out of range admitted: 0-36.
	 */
	abstract void setBottomTextFontSize(Number bottomTextFontSize)
			throws OutOfRangeException;

	/**
	 * Get bottomTextYOffset property.
	 * @return Object Value for bottomTextYOffset is an integer number.
	 */
	abstract Object getBottomTextYOffset();

	/**
	 * Set bottomTextYOffset property.
	 * @param bottomTextYOffset Value for bottomTextYOffset.
	 * @throws IntegerException Value for bottomTextYOffset is not an integer number.
	 */
	abstract void setBottomTextYOffset(Number bottomTextYOffset)
			throws IntegerException;

	/**
	 * Get centerX property.
	 * @return String Value for centerX is an integer number or a percent.
	 */
	abstract String getCenterX();

	/**
	 * Set centerX property.
	 * @param centerX Value for centerX.
	 * @throws CoordException Value for centerX is not an integer number or a percent.
	 */
	abstract void setCenterX(String centerX) throws CoordException;

	/**
	 * Get centerY property.
	 * @return String Value for centerY is an integer number or a percent.
	 */
	abstract String getCenterY();

	/**
	 * Set centerY property.
	 * @param centerY Value for centerY.
	 * @throws CoordException Value for centerY is not an integer number or a percent.
	 */
	abstract void setCenterY(String centerY) throws CoordException;

	/**
	 * Get endAngle property.
	 * @return Object Value for endAngle is an integer number.
	 */
	abstract Object getEndAngle();

	abstract void setEndAngle(Number endAngle) throws OutOfRangeException;

	abstract Object getEndValue();

	abstract void setEndValue(Number endValue) throws IntegerException;

	abstract Object getGridCount();

	abstract void setGridCount(Number gridCount) throws OutOfRangeException;

	abstract Boolean isGridInside();

	abstract void setGridInside(Boolean gridInside);

	abstract String getId();

	abstract Boolean isInside();

	abstract void setInside(Boolean inside);

	abstract Object getLabelFrequncy();

	abstract void setLabelFrequency(Number labelFrequency)
			throws OutOfRangeException;

	abstract String getLabelFunction();

	abstract void setLabelFunction(String labelFunction);

	abstract Object getLabelOffset();

	abstract void setLabelOffset(Number labelOffset) throws IntegerException;

	abstract Boolean isLabelsEnabled();

	abstract void setLabelsEnabled(Boolean labelsEnabled);

	abstract Object getMinorTickInterval();

	abstract void setMinorTickInterval(Number minorTickInterval)
			throws OutOfRangeException;

	abstract Object getMinorTickLength();

	abstract void setMinorTickLength(Number minorTickLength)
			throws OutOfRangeException;

	abstract String getRadius();

	abstract void setRadius(String radius) throws CoordException;

	abstract Boolean isShowFirstLabel();

	abstract void setShowFirstLabel(Boolean showFirstLabel);

	abstract Boolean isShowLastLabel();

	abstract void setShowLastLabel(Boolean showLastLabel);

	abstract Object getStartAngle();

	abstract void setStartAngle(Number startAngle) throws OutOfRangeException;

	abstract Object getStartValue();

	abstract void setStartValue(Number startValue) throws IntegerException;

	abstract Object getTickAlpha();

	abstract void setTickAlpha(Number tickAlpha) throws OutOfRangeException;

	abstract String getTickColor();

	abstract void setTickColor(String tickColor) throws ColorException;

	abstract Object getTickLength();

	abstract void setTickLength(Number tickLength) throws OutOfRangeException;

	abstract Object getTickThickness();

	abstract void setTickThickness(Number tickThickness)
			throws OutOfRangeException;

	abstract String getTopText();

	abstract void setTopText(String topText);

	abstract Boolean isTopTextBold();

	abstract void setTopTextBold(Boolean topTextBold);

	abstract String getTopTextColor();

	abstract void setTopTextColor(String topTextColor) throws ColorException;

	abstract Object getTopTextFontSize();

	abstract void setTopTextFontSize(Number topTextFontSize)
			throws OutOfRangeException;

	abstract Object getTopTextYOffset();

	abstract void setTopTextYOffset(Number topTextYOffset)
			throws IntegerException;

	abstract String getUnit();

	abstract void setUnit(String unit);

	abstract String getUnitPosition();

	abstract void setUnitPosition(Position unitPosition);

	abstract Boolean isUsePrefixes();

	abstract void setUsePrefixes(Boolean usePrefixes);

	abstract Object getValueInterval();

	abstract void setValueInterval(Number valueInterval);

	abstract void addBand(GaugeBandController gaugeBandController);

}