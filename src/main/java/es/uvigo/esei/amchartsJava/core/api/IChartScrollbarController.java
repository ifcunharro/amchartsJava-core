package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.constants.GraphType;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

/**
 * Interface for controller of ChartScrollbar. Details of ChartScrollbar and 
 *  its properties in AmCharts API
 *  
 * @author Iago Fernández Cuñarro
 */
public abstract interface IChartScrollbarController {

	/**
	 * Set chart thar use chartScrollbar.
	 * @param chart Chart own of chartScrollbar
	 */
	abstract void setChart(AmRectangularChart chart);

	/**
	 * Get autoGridCount property.<br>
	 * Default: false.
	 * @return Value of autoGridCount.
	 */
	abstract Boolean isAutoGridCount();

	/**
	 * Set autoGridCount property.
	 * @param autoGridCount Enable or disable autoGridCount.
	 */
	abstract void setAutoGridCount(Boolean autoGridCount);

	/**
	 * Get backgroundAlpha property.<br>
	 * Default: 1.
	 * @return Value of backgroundAlpha.
	 */
	abstract Double getBackgroundAlpha();

	/**
	 * Set backgroundAlpha property.
	 * @param backgroundAlpha Value for backgroundAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBackgroundAlpha(Number backgroundAlpha)
			throws OutOfRangeException;

	/**
	 * Get backgroundColor property.<br>
	 * Default: #d4d4d4
	 * @return Value of backgroundColor.
	 */
	abstract String getBackgroundColor();

	/**
	 * Set backgroundColor property.
	 * @param backgroundColor Value for backgroundColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setBackgroundColor(String backgroundColor)
			throws ColorException;

	/**
	 * Get color property.<br>
	 * Default: #ffffff
	 * @return Value of color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setColor(String color) throws ColorException;

	/**
	 * Get dragIcon property.<br>
	 * Default: dragIconRoundBig.
	 * @return Value of dragIcon.
	 */
	abstract String getDragIcon();

	/**
	 * Set dragIcon property.If dragIcon doesn't exist in images folder, amcharts try load dragIconRoundBig icon,
	 * if that icon doesn't exist, no icon be show.
	 * @param dragIcon Value for dragIcon. 
	 * @see es.uvigo.esei.amchartsJava.core.constants.DragIcon
	 * @see es.uvigo.esei.amchartsJava.core.constants.ImageExtensions
	 */
	abstract void setDragIcon(String dragIcon);

	/**
	 * Get dragIconHeight property.<br>
	 * Default: 35.
	 * @return Value of dragIconHeight.
	 */
	abstract Integer getDragIconHeight();

	/**
	 * Set dragIconHeight property.
	 * @param dragIconHeight Value for dragIconHeight.
	 * @throws OutOfRangeException Value out or range admitted: 10-35.
	 */
	abstract void setDragIconHeight(Number dragIconHeight)
			throws OutOfRangeException;

	/**
	 * Get dragIconWidth property.<br>
	 * Default: 35.
	 * @return Value of dragIconWidth.
	 */
	abstract Integer getDragIconWidth();

	/**
	 * Set dragIconHeight property.With improvedVisibility enabled range activated.
	 * @param dragIconWidth Value for dragIconWidth.
	 * @throws OutOfRangeException Value out of range admitted: 16-35.
	 */
	abstract void setDragIconWidth(Number dragIconWidth)
			throws OutOfRangeException;

	/**
	 * Get enabled property.<br>
	 * Default: true.
	 * @return Value of enabled.
	 */
	abstract Boolean isEnabled();

	/**
	 * Set enabled property.
	 * @param enabled Enable or disable chartScrollbar.
	 */
	abstract void setEnabled(Boolean enabled);

	/**
	 * Get graph property.
	 * @return Graph id.
	 */
	abstract String getGraph();

	/**
	 * Set graph property.
	 * @param graph Value for graph.
	 * @throws ChartException Chart doesn't contains a graph with id equals to graph.
	 */
	abstract void setGraph(String graph) throws ChartException;

	/**
	 * Get graphFillAlpha property.<br>
	 * Default: 1.
	 * @return Value of graphFillAlpha.
	 */
	abstract Double getGraphFillAlpha();

	/**
	 * Set graphFillAlpha property.
	 * @param graphFillAlpha Value for graphFillAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setGraphFillAlpha(Number graphFillAlpha)
			throws OutOfRangeException;

	/**
	 * Get graphFillColor property.<br>
	 * Default: #bbbbbb
	 * @return Value of graphFillColor.
	 */
	abstract String getGraphFillColor();

	/**
	 * Set graphFillColor property.
	 * @param graphFillColor Value for graphFillColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setGraphFillColor(String graphFillColor)
			throws ColorException;

	/**
	 * Get graphLineAlpha property.<br>
	 * Default: 0.
	 * @return Value of graphLineAlpha.
	 */
	abstract Double getGraphLineAlpha();

	/**
	 * Set graphLineAlpha property.
	 * @param graphLineAlpha Value for graphLineAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setGraphLineAlpha(Number graphLineAlpha)
			throws OutOfRangeException;

	/**
	 * Get graphLineColor property.<br>
	 * Default: #bbbbbb
	 * @return Value of graphLineColor.
	 */
	abstract String getGraphLineColor();

	/**
	 * Set graphLineColor property.
	 * @param graphLineColor Value for graphLineColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setGraphLineColor(String graphLineColor)
			throws ColorException;

	/**
	 * Get graphType property.<br>
	 * Default: graph type.
	 * @return Value of graphType.
	 */
	abstract String getGraphType();

	/**
	 * Set graphType property.
	 * @param graphType Value for graphType.
	 */
	abstract void setGraphType(GraphType graphType);

	/**
	 * Get gridAlpha property.<br>
	 * Default: 1.
	 * @return Value of gridAlpha.
	 */
	abstract Double getGridAlpha();

	/**
	 * Set gridAlpha property.
	 * @param gridAlpha Value for gridAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setGridAlpha(Number gridAlpha) throws OutOfRangeException;

	/**
	 * Get gridColor property.<br>
	 * Default: #ffffff
	 * @return Value of gridColor.
	 */
	abstract String getGridColor();

	/**
	 * Set gridColor property.
	 * @param gridColor Value for gridColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setGridColor(String gridColor) throws ColorException;

	/**
	 * Get gridCount property.<br>
	 * Default: 0.
	 * @return Value of gridCount.
	 */
	abstract Integer getGridCount();

	/**
	 * Set gridCount property.With improvedVisibility enabled range activated.
	 * @param gridCount Value for gridCount.
	 * @throws OutOfRangeException Value out of range admitted: 0-15.
	 */
	abstract void setGridCount(Number gridCount) throws OutOfRangeException;

	/**
	 * Get hideResizeGrips property.<br>
	 * Default: false.
	 * @return Value of hideResizeGrips.
	 */
	abstract Boolean isHideResizeGrips();

	/**
	 * Set hideResizeGrips property.
	 * @param hideResizeGrips Show or hide resizeGrips.
	 */
	abstract void setHideResizeGrips(Boolean hideResizeGrips);

	/**
	 * Get ignoreCustomColors property.<br>
	 * Default: false.
	 * @return Value of ignoreCustomColors.
	 */
	abstract Boolean isIgnoreCustomColors();

	/**
	 * Set ignoreCustomColors property.
	 * @param ignoreCustomColors Ignore or don't ignore customColors.
	 */
	abstract void setIgnoreCustomColors(Boolean ignoreCustomColors);

	/**
	 * Get maximum property.
	 * @return Value of maximum.
	 */
	abstract Integer getMaximum();

	/**
	 * Set maximum property.
	 * @param maximum Value for maximum.
	 * @throws IntegerException Value for maximum is not an integer number.
	 */
	abstract void setMaximum(Number maximum) throws IntegerException;

	/**
	 * Get minimum property.
	 * @return Value of minimum.
	 */
	abstract Integer getMinimum();

	/**
	 * Set minimum property.
	 * @param minimum Value for minimum.
	 * @throws IntegerException Value for minimum is not an integer number.
	 */
	abstract void setMinimum(Number minimum) throws IntegerException;

	/**
	 * Get offset property.<br>
	 * Default: 0.
	 * @return Value of offset.
	 */
	abstract Integer getOffset();

	/**
	 * Set offset property.With improvedVisibility enabled range activated.
	 * @param offset Value for offset.
	 * @throws OutOfRangeException Value out of range admitted: 0-80.
	 */
	abstract void setOffset(Number offset) throws OutOfRangeException;

	/**
	 * Get oppositeAxis property.<br>
	 * Default: true.
	 * @return Value of oppositeAxis.
	 */
	abstract Boolean isOppositeAxis();

	/**
	 * Set oppositeAxis property.
	 * @param oppositeAxis Enable or disable position opposite to axis.
	 */
	abstract void setOppositeAxis(Boolean oppositeAxis);

	/**
	 * Get resizeEnabled property.<br>
	 * Default: true.
	 * @return Value of resizeEnabled.
	 */
	abstract Boolean isResizeEnabled();

	/**
	 * Set resizeEnabled property.
	 * @param resizeEnabled Enable or disable resize.
	 */
	abstract void setResizeEnabled(Boolean resizeEnabled);

	/**
	 * Get scrollbarHeight property.<br>
	 * Default: 20.
	 * @return Value of scrollbarHeight.
	 */
	abstract Integer getScrollbarHeight();

	/**
	 * Set scrollbarHeight property.With improvedVisibility enabled range activated.
	 * @param scrollbarHeight Value for scrollbarHeight.
	 * @throws OutOfRangeException Value out of range admitted: 10-30.
	 */
	abstract void setScrollbarHeight(Number scrollbarHeight)
			throws OutOfRangeException;

	/**
	 * Get scrollDuration property.<br>
	 * Default: 1.
	 * @return Value of scrollDuration.
	 */
	abstract Integer getScrollDuration();

	/**
	 * Set scrollDuration property.
	 * @param scrollDuration Value for scrollDuration.
	 * @throws IntegerException Value for scrollDuration is not an integer number.
	 */
	abstract void setScrollDuration(Number scrollDuration)
			throws IntegerException;

	/**
	 * Get selectedBackgroundAlpha.<br>
	 * Default: 1.
	 * @return Value of selectedBackgroundAlpha.
	 */
	abstract Double getSelectedBackgroundAlpha();

	/**
	 * Set selectedBackgroundAlpha property.
	 * @param selectedBackgroundAlpha Value for selectedBackgroundAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setSelectedBackgroundAlpha(Number selectedBackgroundAlpha)
			throws OutOfRangeException;

	/**
	 * Get selectedBackgroundColor property.<br>
	 * Default: #efefef
	 * @return Value of selectedBackgroundColor.
	 */
	abstract String getSelectedBackgroundColor();

	/**
	 * Set selectedBackgroundColor property.
	 * @param selectedBackgroundColor Value for selectedBackgroundColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setSelectedBackgroundColor(String selectedBackgroundColor)
			throws ColorException;

	/**
	 * Get selectedGraphFillAlpha property.<br>
	 * Default: 1.
	 * @return Value of selectedGraphFillAlpha.
	 */
	abstract Double getSelectedGraphFillAlpha();

	/**
	 * Set selectedGraphFillAlpha property.
	 * @param selectedGraphFillAlpha Value for selectedGraphFillAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setSelectedGraphFillAlpha(Number selectedGraphFillAlpha)
			throws OutOfRangeException;

	/**
	 * Get selectedGraphFillColor property.<br>
	 * Default: #888888
	 * @return Value of selectedGraphFillColor.
	 */
	abstract String getSelectedGraphFillColor();

	/**
	 * Set selectedGraphFillColor property.
	 * @param selectedGraphFillColor Value for selectedGraphFillColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setSelectedGraphFillColor(String selectedGraphFillColor)
			throws ColorException;

	/**
	 * Get selectedGraphLineAlpha property.<br>
	 * Default: 0.
	 * @return Value of selectedGraphLineAlpha.
	 */
	abstract Double getSelectedGraphLineAlpha();

	/**
	 * Set selectedGraphLineAlpha property.
	 * @param selectedGraphLineAlpha Value for selectedGraphLineAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0. 
	 */
	abstract void setSelectedGraphLineAlpha(Number selectedGraphLineAlpha)
			throws OutOfRangeException;

	/**
	 * Get selectedGraphLineColor property.<br>
	 * Default: #888888
	 * @return Value of selectedGraphLineColor.
	 */
	abstract String getSelectedGraphLineColor();

	/**
	 * Set selectedGraphLineColor property.
	 * @param selectedGraphLineColor Value for selectedGraphLineColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setSelectedGraphLineColor(String selectedGraphLineColor)
			throws ColorException;

	/**
	 * Get updateOnReleaseOnly property.<br>
	 * Default: false.
	 * @return Value of updateOnReleaseOnly.
	 */
	abstract Boolean isUpdateOnReleaseOnly();

	/**
	 * Set updateOnReleaseOnly property.
	 * @param updateOnReleaseOnly Enable or disable update on release only.
	 */
	abstract void setUpdateOnReleaseOnly(Boolean updateOnReleaseOnly);

}