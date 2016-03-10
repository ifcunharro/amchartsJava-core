package es.uvigo.esei.amchartsJava.core.api;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.constants.Position;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeBandController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of GaugeAxis. Details of GaugeAxis and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IGaugeAxisController {

	/**
	 * Get axisAlpha property.<br>
	 * Default: 1.
	 * @return Value of axisAlpha.
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
	 * Default: #000000.
	 * @return Value of axisColor.
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
	 * @return Value of axisThickness.
	 */
	abstract Integer getAxisThickness();

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
	 * @return Value of bandAlpha.
	 */
	abstract Double getBandAlpha();

	/**
	 * Set bandAlpha property.
	 * @param bandAlpha Value for bandAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBandAlpha(Number bandAlpha) throws OutOfRangeException;

	/**
	 * Get bandOutlineAlpha property.<br>
	 * Default: 0.
	 * @return Value of bandOutlineAlpha.
	 */
	abstract Double getBandOutlineAlpha();

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
	 * @return Value of bandOutlineColor.
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
	 * @return Value of bandOutlineThickness.
	 */
	abstract Integer getBandOutlineThickness();

	/**
	 * Set bandOutlineThickness property.With improvedVisibility enabled range activated.
	 * @param bandOutlineThickness Value for bandOutlineThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setBandOutlineThickness(Number bandOutlineThickness)
			throws OutOfRangeException;

	/**
	 * Get bands property.
	 * @return List of GaugeBands.
	 */
	abstract List<GaugeBandController> getBands();

	/**
	 * Get bottomText property.
	 * @return Value of bottomText.
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
	 * @return Value of bottomTextBold.
	 */
	abstract Boolean isBottomTextBold();

	/**
	 * Set bottomTextBold property.
	 * @param bottomTextBold Enable or disable bold fo bottom text.
	 */
	abstract void setBottomTextBold(Boolean bottomTextBold);

	/**
	 * Get bottomTextColor property.
	 * @return Value of bottomTextColor.
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
	 * @return Value of bottomTextFontSize.
	 */
	abstract Integer getBottomTextFontSize();

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
	 * @return Value of bottomTextYOffset.
	 */
	abstract Integer getBottomTextYOffset();

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
	 * @return Value of centerX.
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
	 * @return Value of centerY.
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
	 * @return Value of endAngle.
	 */
	abstract Integer getEndAngle();

	/**
	 * Set endAngle property.
	 * @param endAngle Value for endAngle.
	 * @throws OutOfRangeException Value out of range admitted: -180 to 180. 
	 */
	abstract void setEndAngle(Number endAngle) throws OutOfRangeException;

	/**
	 * Get endValue property.
	 * @return Value of endValue.
	 */
	abstract Integer getEndValue();

	/**
	 * Set endValue property.
	 * @param endValue Value for endValue.
	 * @throws IntegerException Value for endValue is not an integer number.
	 */
	abstract void setEndValue(Number endValue) throws IntegerException;

	/**
	 * Get gridCount property.<br>
	 * Default: 5.
	 * @return Value of gridCount.
	 */
	abstract Integer getGridCount();

	/**
	 * Set gridCount property.With improvedVisibility enabled range activated.
	 * @param gridCount Value for gridCount.
	 * @throws OutOfRangeException Value out of range admitted: 0-100.
	 */
	abstract void setGridCount(Number gridCount) throws OutOfRangeException;

	/**
	 * Get gridInside property.<br>
	 * Default: true.
	 * @return Value of gridInside.
	 */
	abstract Boolean isGridInside();

	/**
	 * Set gridInside property.
	 * @param gridInside Show grid inside or outside of axis.
	 */
	abstract void setGridInside(Boolean gridInside);

	/**
	 * Get id property.
	 * @return GaugeAxis id.
	 */
	abstract String getId();

	/**
	 * Get inside property.<br>
	 * Default: true.
	 * @return Value of inside.
	 */
	abstract Boolean isInside();

	/**
	 * Set inside property.
	 * @param inside Show labels inside or outside of axis.
	 */
	abstract void setInside(Boolean inside);

	/**
	 * Get labelFrequency property.<br>
	 * Default: 1.
	 * @return Value of labelFrequency.
	 */
	abstract Integer getLabelFrequency();

	/**
	 * Set labelFrequency property.With improvedVisibility enabled range activated.
	 * @param labelFrequency Value for labelFrequency.
	 * @throws OutOfRangeException Value out of range admitted: 1-5.
	 */
	abstract void setLabelFrequency(Number labelFrequency)
			throws OutOfRangeException;

	/**
	 * Get labelFunction property.
	 * @return Value of labelFunction.
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
	 * @return Value of labelOffset.
	 */
	abstract Integer getLabelOffset();

	/**
	 * Set labelOffset property.
	 * @param labelOffset Value for labelOffset.
	 * @throws IntegerException Value for labelOffset is not an integer number.
	 */
	abstract void setLabelOffset(Number labelOffset) throws IntegerException;

	/**
	 * Get labelsEnabled property.<br>
	 * Default: true.
	 * @return Value of labelsEnabled.
	 */
	abstract Boolean isLabelsEnabled();

	/**
	 * Set labelsEnabled property.
	 * @param labelsEnabled Show or hide labels of axis.
	 */
	abstract void setLabelsEnabled(Boolean labelsEnabled);

	/**
	 * Get minorTickInterval property.
	 * @return Value of minorTickInterval.
	 */
	abstract Integer getMinorTickInterval();

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
	 * @return Value of minorTickLength.
	 */
	abstract Integer getMinorTickLength();

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
	 * @return Value of radius.
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
	 * @return Value of showFirstLabel.
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
	 * @return Value of showLastLabel.
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
	 * @return Value of startAngle.
	 */
	abstract Integer getStartAngle();

	/**
	 * Set startAngle property.
	 * @param startAngle Value for startAngle.
	 * @throws OutOfRangeException Value out of range admitted: -180 to 180.
	 */
	abstract void setStartAngle(Number startAngle) throws OutOfRangeException;

	/**
	 * Get startValue property.<br>
	 * Default: 0.
	 * @return Value of startValue.
	 */
	abstract Integer getStartValue();

	/**
	 * Set startValue property.
	 * @param startValue Value for startValue.
	 * @throws IntegerException Value for startValue is not an integer number.
	 */
	abstract void setStartValue(Number startValue) throws IntegerException;

	/**
	 * Get tickAlpha property.<br>
	 * Default: 1.
	 * @return Value of tickAlpha.
	 */
	abstract Double getTickAlpha();

	/**
	 * Set tickAlpha property.
	 * @param tickAlpha Value for tickAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setTickAlpha(Number tickAlpha) throws OutOfRangeException;

	/**
	 * Get tickColor property.<br>
	 * Default: #555555
	 * @return Value of tickColor.
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
	 * @return Value of tickLength.
	 */
	abstract Integer getTickLength();

	/**
	 * Set tickLength property.With improvedVisibility enabled range activated.
	 * @param tickLength Value for tickLength.
	 * @throws OutOfRangeException Value out of range admitted: 0-15.
	 */
	abstract void setTickLength(Number tickLength) throws OutOfRangeException;

	/**
	 * Get tickThickness property.<br>
	 * Default: 1.
	 * @return Value of tickThickness.
	 */
	abstract Integer getTickThickness();

	/**
	 * Set tickThickness property.With improvedVisibility enabled range activated.
	 * @param tickThickness Value for tickThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-4.
	 */
	abstract void setTickThickness(Number tickThickness)
			throws OutOfRangeException;

	/**
	 * Get topText property.
	 * @return Value of topText.
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
	 * @return Value of topTextBold.
	 */
	abstract Boolean isTopTextBold();

	/**
	 * Set topTextBold property.
	 * @param topTextBold Enable or disable bold for topText.
	 */
	abstract void setTopTextBold(Boolean topTextBold);

	/**
	 * Get topTextColor property.
	 * @return Value of topTextColor.
	 */
	abstract String getTopTextColor();

	/**
	 * Set topTextColor property.
	 * @param topTextColor Value for topTextColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setTopTextColor(String topTextColor) throws ColorException;

	/**
	 * Get topTextFontSize property.
	 * @return Value of topTextFontSize.
	 */
	abstract Integer getTopTextFontSize();

	/**
	 * Set topTextFontSize property.With improvedVisibility enabled range activated.
	 * @param topTextFontSize Value for topTextFontSize.
	 * @throws OutOfRangeException Value out of range admitted: 0-36.
	 */
	abstract void setTopTextFontSize(Number topTextFontSize)
			throws OutOfRangeException;

	/**
	 * Get topTextYOffset property.<br>
	 * Default: 0.
	 * @return Value of topTextYoffset.
	 */
	abstract Integer getTopTextYOffset();

	/**
	 * Set topTextYOffset property.
	 * @param topTextYOffset Value for topTextYOffset.
	 * @throws IntegerException Value for topTextYOffset is not an integer number.
	 */
	abstract void setTopTextYOffset(Number topTextYOffset)
			throws IntegerException;

	/**
	 * Get unit property.
	 * @return Value of unit.
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
	 * @return Value of unitPosition.
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
	 * @return Value of usePrefixes.
	 */
	abstract Boolean isUsePrefixes();

	/**
	 * Set usePrefixes property.
	 * @param usePrefixes Enable or disable prefixes.
	 */
	abstract void setUsePrefixes(Boolean usePrefixes);

	/**
	 * Get valueInterval property.
	 * @return Value of valueInterval.
	 */
	abstract Double getValueInterval();

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