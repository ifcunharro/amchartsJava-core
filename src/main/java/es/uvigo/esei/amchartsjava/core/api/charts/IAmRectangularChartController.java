package es.uvigo.esei.amchartsjava.core.api.charts;


import java.util.List;

import es.uvigo.esei.amchartsjava.core.constants.GradientAngle;
import es.uvigo.esei.amchartsjava.core.controllers.ChartCursorController;
import es.uvigo.esei.amchartsjava.core.controllers.ChartScrollbarController;
import es.uvigo.esei.amchartsjava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsjava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsjava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsjava.core.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsjava.core.model.charts.AmRectangularChart;

/**
 * 
 * Interface for controller of AmRectangularChart. Details of AmRectangularChart and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmRectangularChartController<G extends AmRectangularChart> extends IAmCoordinateChartController<AmCoordinateChart> {

	/**
	 * Get angle property.<br>
	 * Default: 0.
	 * @return Value of angle.
	 */
	abstract Integer getAngle();

	/**
	 * Set angle property.
	 * @param angle Value for angle.
	 * @throws OutOfRangeException Value out of range admitted: 0-360.
	 */
	abstract void setAngle(Number angle) throws OutOfRangeException;

	/**
	 * Get autoMarginOffset property.<br>
	 * Default: 10.
	 * @return Value of autoMarginOffset.
	 */
	abstract Integer getAutoMarginOffset();

	/**
	 * Set autoMarginOffset property.With improvedVisibility enabled range activated.
	 * @param autoMarginOffset Value for autoMarginOffset.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setAutoMarginOffset(Number autoMarginOffset)
			throws OutOfRangeException;

	/**
	 * Get autoMargins property.<br>
	 * Default: true.
	 * @return Value of autoMargins.
	 */
	abstract Boolean isAutoMargins();

	/**
	 * Set autoMargins property.
	 * @param autoMargins Enable or disable autoMargins.
	 */
	abstract void setAutoMargins(Boolean autoMargins);

	/**
	 * Get depth3D property.<br>
	 * Default: 0.
	 * @return Value of depth3D.
	 */
	abstract Integer getDepth3D();

	/**
	 * Set depth3D property.
	 * @param depth3D Value for depth3D.
	 * @throws IntegerException Value for depth3D is not an integer number.
	 */
	abstract void setDepth3D(Number depth3D) throws IntegerException;

	/**
	 * Get marginBottom property.<br>
	 * Default: 20.
	 * @return Value of marginBottom.
	 */
	abstract Integer getMarginBottom();

	/**
	 * Set marginBottom property.
	 * @param marginBottom Value for marginBottom.
	 * @throws IntegerException Value for marginBottom is not an integer number.
	 */
	abstract void setMarginBottom(Number marginBottom) throws IntegerException;

	/**
	 * Get marginLeft property.<br>
	 * Default: 20.
	 * @return Value of marginLeft.
	 */
	abstract Integer getMarginLeft();

	/**
	 * Set marginLeft property.
	 * @param marginLeft Value for marginLeft.
	 * @throws IntegerException Value for marginLeft is not an integer number.
	 */
	abstract void setMarginLeft(Number marginLeft) throws IntegerException;

	/**
	 * Get marginRight property.<br>
	 * Default: 20.
	 * @return Value of marginRight.
	 */
	abstract Integer getMarginRight();

	/**
	 * Set marginRight property.
	 * @param marginRight Value for marginRight.
	 * @throws IntegerException Value for marginRight is not an integer number.
	 */
	abstract void setMarginRight(Number marginRight) throws IntegerException;

	/**
	 * Get marginsUpdated property.<br>
	 * Default: false.
	 * @return Value of marginsUpdated.
	 */
	abstract Boolean isMarginsUpdated();

	/**
	 * Set marginsUpdated property.
	 * @param marginsUpdated Enable or disable marginsUpdated.
	 */
	abstract void setMarginsUpdated(Boolean marginsUpdated);

	/**
	 * Get marginTop property.<br>
	 * Default: 20.
	 * @return Value of marginTop.
	 */
	abstract Integer getMarginTop();

	/**
	 * Set marginTop property.
	 * @param marginTop Value for marginTop.
	 * @throws IntegerException Value for marginTop is no an integer number.
	 */
	abstract void setMarginTop(Number marginTop) throws IntegerException;

	/**
	 * Get plotAreaBorderAlpha property.<br>
	 * Default: 0.
	 * @return Value of plotAreaBorderAlpha.
	 */
	abstract Double getPlotAreaBorderAlpha();

	/**
	 * Set plotAreaBorderAlpha property.
	 * @param plotAreaBorderAlpha Value for plotAreaBorderAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setPlotAreaBorderAlpha(Number plotAreaBorderAlpha)
			throws OutOfRangeException;

	/**
	 * Get plotAreaBorderColor property.<br>
	 * Default: #000000
	 * @return Value of plotAreaBorderColor.
	 */
	abstract String getPlotAreaBorderColor();

	/**
	 * Set plotAreaBorderColor property.
	 * @param plotAreaBorderColor Value for plotAreaBorderColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setPlotAreaBorderColor(String plotAreaBorderColor)
			throws ColorException;

	/**
	 * Get plotAreaFillAlphas property.<br>
	 * Default: 0.
	 * @return List of alphas to generate gradients.
	 */
	abstract List<Number> getPlotAreaFillAlphas();

	/**
	 * Set plotAreaFillAlphas property.
	 * @param plotAreaFillAlphas Values for alphas.
	 * @throws DoubleException Any value of alpha is not a double number.
	 */
	abstract void setPlotAreaFillAlphas(Number... plotAreaFillAlphas)
			throws DoubleException;
	
	/**
	 * Get plotAreaFillColors property.<br>
	 * Default: #ffffff
	 * @return List of colors to generate gradients.
	 */
	abstract List<String> getPlotAreaFillColors();

	/**
	 * Set plotAreaFillColors property.
	 * @param plotAreaFillColors Values for colors.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setPlotAreaFillColors(String... plotAreaFillColors)
			throws ColorException;

	/**
	 * Get plotAreaGradientAngle property.<br>
	 * Default: 0.
	 * @return Value of plotAreaGradientAngle.
	 */
	abstract String getPlotAreaGradientAngle();

	/**
	 * Set plotAreaGradientAngle property.
	 * @param plotAreaGradientAngle Value for plotAreaGradientAngle.
	 */
	abstract void setPlotAreaGradientAngle(GradientAngle plotAreaGradientAngle);

	/**
	 * Get zoomOutButtomAlpha property.<br>
	 * Default: 0.
	 * @return Value of zoomOutButtomAlpha.
	 */
	abstract Double getZoomOutButtomAlpha();

	/**
	 * Set zoomOutButtonAlpha property.
	 * @param zoomOutButtonAlpha property.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setZoomOutButtonAlpha(Number zoomOutButtonAlpha)
			throws OutOfRangeException;

	/**
	 * Get zoomOutButtonColor property.<br>
	 * Default: #e5e5e5.
	 * @return Value of zoomOutButtonColor.
	 */
	abstract String getZoomOutButtonColor();

	/**
	 * Set zoomOutButtonColor property.
	 * @param zoomOutButtonColor Value for zoomOutButtonColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setZoomOutButtonColor(String zoomOutButtonColor)
			throws ColorException;

	/**
	 * Get zoomOutButtonImage property.<br>
	 * Default: lens.png.
	 * @return Value of zoomOutButtonImage.
	 */
	abstract String getZoomOutButtonImage();

	/**
	 * Set zoomOutButtonImage property.
	 * @param zoomOutButtonImage Value for zoom image, must be in image folder.
	 * @see es.uvigo.esei.amchartsjava.core.constants.paths.AmchartsJavaPaths
	 */
	abstract void setZoomOutButtonImage(String zoomOutButtonImage);

	/**
	 * Get zoomOutButtonImageSize property.<br>
	 * Default: 17.
	 * @return Value of zoomOutButtonImageSize.
	 */
	abstract Integer getZoomOutButtonImageSize();

	/**
	 * Set zoomOutButtonImageSize property.With improvedVisibility enabled range activated.
	 * @param zoomOutButtonImageSize Value for zoomOutButtonImageSize.
	 * @throws OutOfRangeException Value out of range admitted: 10-26.
	 */
	abstract void setZoomOutButtonImageSize(Number zoomOutButtonImageSize)
			throws OutOfRangeException;

	/**
	 * Get zoomOutButtonPadding property.<br>
	 * Default: 8.
	 * @return Value of zoomOutButtonPadding.
	 */
	abstract Integer getZoomOutButtonPadding();

	/**
	 * Set zoomOutButtonPadding property.With improvedVisibility enabled range activated.
	 * @param zoomOutButtonPadding Value for zoomOutButtonPadding.
	 * @throws OutOfRangeException Value out of range admitted: 5-20.
	 */
	abstract void setZoomOutButtonPadding(Number zoomOutButtonPadding)
			throws OutOfRangeException;

	/**
	 * Get zoomOutButtonRollOverAlpha property.<br>
	 * Default: 1.
	 * @return Value of zoomOutButtonRollOverAlpha.
	 */
	abstract Double getZoomOutButtonRollOverAlpha();

	/**
	 * Set zoomOutButtonRollOverAlpha property.
	 * @param zoomOutButtonRollOverAlpha Value for zoomOutButtonRollOverAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setZoomOutButtonRollOverAlpha(
			Number zoomOutButtonRollOverAlpha) throws OutOfRangeException;

	/**
	 * Get zoomOutText property.<br>
	 * Default: Show all.
	 * @return Value of zoomOutText.
	 */
	abstract String getZoomOutText();

	/**
	 * Set zoomOutText property.
	 * @param zoomOutText Value for zoomOutText.
	 */
	abstract void setZoomOutText(String zoomOutText);

	/**
	 * Get chartCursor property.
	 * @return ChartCursorController Controller for ChartCursor.
	 */
	abstract ChartCursorController getChartCursor();
	
	/**
	 * Get chartScrollbar property.
	 * @return ChartScrollbarController Controller for ChartScrollbar.
	 */
	abstract ChartScrollbarController getChartScrollbar();
	
	/**
	 * Get trendLines property.
	 * @return List of Trendlines. Use {@link es.uvigo.esei.amchartsjava.core.validators.TrendLineValidator TrendLineValidator} to obtain list of trendLines and
	 * concrete trendLine.
	 */
	abstract Object getTrendLines();
	
	/**
	 * Add a chartCursor to chart.
	 * @param chartCursorController Controller for ChartCursor.
	 */
	abstract void addChartCursor(ChartCursorController chartCursorController);

	/**
	 * Add a chartScrollbar to chart.
	 * @param chartScrollbarController Controller for ChartScrollbar. 
	 */
	abstract void addChartScrollbar(ChartScrollbarController chartScrollbarController);
	
	/**
	 * Add a trendline to chart.
	 * @param <T> Type of TrendLine.
	 * @param trendLineController Controller of some type of trendline.
	 * @throws NotSupportedException Trendline not supported by that chart.
	 */
	abstract <T extends TrendLineSerialChartController> void addTrendLine(
			T trendLineController) throws NotSupportedException;
	
	/**
	 * Remove ChartCursor from chart.
	 */
	abstract void removeChartCursor();
	
	/**
	 * Remove ChartScrollbar from chart.
	 */
	abstract void removeChartScrollbar();
	
	/**
	 * Remove trendLine from chart.
	 * @param trendLine Trendline id.
	 */
	abstract void removeTrendLine(String trendLine);
	
}