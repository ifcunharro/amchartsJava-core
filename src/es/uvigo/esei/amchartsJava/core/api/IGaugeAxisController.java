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
	 * Default: #000000.
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
	 * Get axisThickness property.<br>
	 * Default: 1.
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
	 * Get bandAlpha property.<br>
	 * Default: 1.
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
	 * Get bandOutlineAlpha property.<br>
	 * Default: 0.
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
	 * Get bandOutlineColor property.<br>
	 * Default: #000000
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
	 * Get bandOutlineThickness property.<br>
	 * Default: 0.
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
	 * Get bottomTextBold property.<br>
	 * Default: true.
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
	 * Set bottomTextFontSize property.With improvedVisibility enabled range activated.
	 * @param bottomTextFontSize Value for bottomTextFontSize.
	 * @throws OutOfRangeException Value out of range admitted: 0-36.
	 */
	abstract void setBottomTextFontSize(Number bottomTextFontSize)
			throws OutOfRangeException;

	/**
	 * Get bottomTextYOffset property.<br>
	 * Default: 0.
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
	 * Get centerX property.<br>
	 * Default: 0%.
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
	 * Get centerY property.<br>
	 * Default: 0%.
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
	 * Get endAngle property.<br>
	 * Default: 120.
	 * @return Object Value for endAngle is an integer number.
	 */
	abstract Object getEndAngle();

	/**
	 * Set endAngle property.
	 * @param endAngle Value for endAngle.
	 * @throws OutOfRangeException Value out of range admitted: -180 to 180. 
	 */
	abstract void setEndAngle(Number endAngle) throws OutOfRangeException;

	/**
	 * Get endValue proeperty.
	 * @return Object Value for endValue is an integer number.
	 */
	abstract Object getEndValue();

	/**
	 * Set endValue property.
	 * @param endValue Value for endValue.
	 * @throws IntegerException Value for endValue is not an integer number.
	 */
	abstract void setEndValue(Number endValue) throws IntegerException;

	/**
	 * Get gridCount property.<br>
	 * Default: 5.
	 * @return Object Value for gridCount is an integer number.
	 */
	abstract Object getGridCount();

	/**
	 * Set gridCount property.With improvedVisibility enabled range activated.
	 * @param gridCount Value for gridCount.
	 * @throws OutOfRangeException Value out of range admitted: 0-100.
	 */
	abstract void setGridCount(Number gridCount) throws OutOfRangeException;

	/**
	 * Get gridInside property.<br>
	 * Default: true.
	 * @return Boolean Value for gridInside.
	 */
	abstract Boolean isGridInside();

	/**
	 * Set gridInside property.
	 * @param gridInside Show grid inside or outside of axis.
	 */
	abstract void setGridInside(Boolean gridInside);

	/**
	 * Get id property.
	 * @return String GaugeAxis id.
	 */
	abstract String getId();

	/**
	 * Get inside property.<br>
	 * Default: true.
	 * @return Boolean Value for inside.
	 */
	abstract Boolean isInside();

	/**
	 * Set inside property.
	 * @param Show labels inside or outside of axis.
	 */
	abstract void setInside(Boolean inside);

	/**
	 * Get labelFrequency property.<br>
	 * Default: 1.
	 * @return Object Valie for labelFrequency is an integer number.
	 */
	abstract Object getLabelFrequency();

	/**
	 * Set labelFrequency property.With improvedVisibility enabled range activated.
	 * @param labelFrequency Value for labelFrequency.
	 * @throws OutOfRangeException Value out of range admitted: 1-5.
	 */
	abstract void setLabelFrequency(Number labelFrequency)
			throws OutOfRangeException;

	/**
	 * Get labelFunction property.
	 * @return String Value for labelFunction.
	 */
	abstract String getLabelFunction();

	/**
	 * Set labelFunction property.
	 * @param labelFunction Value for labelFunction.
	 */
	abstract void setLabelFunction(String labelFunction);

	/**
	 * Get labelOffset property.<br>
	 * Default: 15.
	 * @return Object Value for labelOffset is an integer number.
	 */
	abstract Object getLabelOffset();

	/**
	 * Set labelOffset property.
	 * @param labelOffset Value for labelOffset.
	 * @throws IntegerException Value for labelOffset is not an integer number.
	 */
	abstract void setLabelOffset(Number labelOffset) throws IntegerException;

	/**
	 * Get labelsEnabled property.<br>
	 * Default: true.
	 * @return Boolean Value for labelsEnabled.
	 */
	abstract Boolean isLabelsEnabled();

	/**
	 * Set labelsEnabled property.
	 * @param labelsEnabled Show or hide labels of axis.
	 */
	abstract void setLabelsEnabled(Boolean labelsEnabled);

	/**
	 * Get minorTickInterval property.
	 * @return Object Value for minorTickInterval is an integer number.
	 */
	abstract Object getMinorTickInterval();

	/**
	 * Set minorTickInterval property.With improvedVisibility enabled range activated.
	 * @param minorTickInterval Value for minorTickInterval.
	 * @throws OutOfRangeException Value out of range admitted: 1-5.
	 */
	abstract void setMinorTickInterval(Number minorTickInterval)
			throws OutOfRangeException;

	/**
	 * Get minorTickLength property.<br>
	 * Default: 5.
	 * @return Object Value for minorTickLength is an integer number.
	 */
	abstract Object getMinorTickLength();

	/**
	 * Set minorTickLength property.
	 * @param minorTickLength Value for minorTickLength.
	 * @throws OutOfRangeException Value out of range admitted: 1-10.
	 */
	abstract void setMinorTickLength(Number minorTickLength)
			throws OutOfRangeException;

	/**
	 * Get radius property.<br>
	 * Default: 95%.
	 * @return String Value for radius is an integer number or a percent.
	 */
	abstract String getRadius();

	/**
	 * Set radius property.
	 * @param radius Value for radius.
	 * @throws CoordException Value for radius is not an integer number or a percent.
	 */
	abstract void setRadius(String radius) throws CoordException;

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
	 * Get showLastLabel property.
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
	 * Get startAngle property.<br>
	 * Default: -120.
	 * @return Object Value for startAngle is an integer number.
	 */
	abstract Object getStartAngle();

	/**
	 * Set startAngle property.
	 * @param startAngle Value for startAngle.
	 * @throws OutOfRangeException Value out of range admitted: -180 to 180.
	 */
	abstract void setStartAngle(Number startAngle) throws OutOfRangeException;

	/**
	 * Get startValue property.<br>
	 * Default: 0.
	 * @return Object Value for startValue is an integer number.
	 */
	abstract Object getStartValue();

	/**
	 * Set startValue property.
	 * @param startValue Value for startValue.
	 * @throws IntegerException Value for startValue is not an integer number.
	 */
	abstract void setStartValue(Number startValue) throws IntegerException;

	/**
	 * Get tickAlpha property.<br>
	 * Default: 1.
	 * @return Object Value for tickAlpha is a double number.
	 */
	abstract Object getTickAlpha();

	/**
	 * Set tickAlpha property.
	 * @param tickAlpha Value for tickAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setTickAlpha(Number tickAlpha) throws OutOfRangeException;

	/**
	 * Get tickColor property.<br>
	 * Default: #555555
	 * @return String Value for tickColor.
	 */
	abstract String getTickColor();

	/**
	 * Set tickColor property.
	 * @param tickColor Value for tickColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setTickColor(String tickColor) throws ColorException;

	/**
	 * Get tickLength property.<br>
	 * Default: 10.
	 * @return Object Value for tickLength is an integer number.
	 */
	abstract Object getTickLength();

	/**
	 * Set tickLength property.With improvedVisibility enabled range activated.
	 * @param tickLength Value for tickLength.
	 * @throws OutOfRangeException Value out of range admitted: 0-15.
	 */
	abstract void setTickLength(Number tickLength) throws OutOfRangeException;

	/**
	 * Get tickThickness property.<br>
	 * Default: 1.
	 * @return Object Value for tickThickness is an integer number.
	 */
	abstract Object getTickThickness();

	/**
	 * Set tickThickness property.With improvedVisibility enabled range activated.
	 * @param tickThickness Value for tickThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-4.
	 */
	abstract void setTickThickness(Number tickThickness)
			throws OutOfRangeException;

	/**
	 * Get topText property.
	 * @return String Value for topText.
	 */
	abstract String getTopText();

	/**
	 * Set topText property.
	 * @param topText Value for topText.
	 */
	abstract void setTopText(String topText);

	/**
	 * Get topTextBold property.<br>
	 * Default: true.
	 * @return Boolean Value for topTextBold.
	 */
	abstract Boolean isTopTextBold();

	/**
	 * Set topTextBold property.
	 * @param Enable or disable bold for topText.
	 */
	abstract void setTopTextBold(Boolean topTextBold);

	/**
	 * Get topTextColor property.
	 * @return String Value for topTextColor.
	 */
	abstract String getTopTextColor();

	/**
	 * Set topTextColor property.
	 * @param topTextColor Value for topTextColor.
	 * @throws ColorExceptionb Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setTopTextColor(String topTextColor) throws ColorException;

	/**
	 * Get topTextFontSize property.
	 * @return Object Value for topTextFontSize is an integer number.
	 */
	abstract Object getTopTextFontSize();

	/**
	 * Set topTextFontSize property.
	 * @param topTextFontSize Value for topTextFontSize.
	 * @throws OutOfRangeException Value out of range admitted: 0-36.
	 */
	abstract void setTopTextFontSize(Number topTextFontSize)
			throws OutOfRangeException;

	/**
	 * Get topTextYOffset property.<br>
	 * Default: 0.
	 * @return Object Value for topTextYoffset is an integet number.
	 */
	abstract Object getTopTextYOffset();

	/**
	 * Set topTextYOffset property.
	 * @param topTextYOffset Value for topTextYOffset.
	 * @throws IntegerException Value for topTextYOffset is not an integer number.
	 */
	abstract void setTopTextYOffset(Number topTextYOffset)
			throws IntegerException;

	/**
	 * Get unit property.
	 * @return String Value for unit.
	 */
	abstract String getUnit();

	/**
	 * Set unit property.
	 * @param unit Value for unit.
	 * 
	 */
	abstract void setUnit(String unit);

	/**
	 * Get unitPosition property.<br>
	 * Default: right.
	 * @return String Value for unitPosition.
	 */
	abstract String getUnitPosition();

	/**
	 * Set unitPosition property.
	 * @param unitPosition Value for unitPosition.
	 */
	abstract void setUnitPosition(Position unitPosition);

	/**
	 * Get usePrefixes property.<br>
	 * Default: false.
	 * @return Boolean Value for usePrefixes.
	 */
	abstract Boolean isUsePrefixes();

	/**
	 * Set usePrefixes property.
	 * @param usePrefixes Enable or disable prefixes.
	 */
	abstract void setUsePrefixes(Boolean usePrefixes);

	/**
	 * Get valueInterval property.
	 * @return Object Value for valueInterval.
	 */
	abstract Object getValueInterval();

	/**
	 * Set valueInterval property.
	 * @param valueInterval Value for valueInterval.
	 */
	abstract void setValueInterval(Number valueInterval);

	/**
	 * Add a band to gaugeAxis.
	 * @param gaugeBandController Controller for gaugeBand.
	 */
	abstract void addBand(GaugeBandController gaugeBandController);

}