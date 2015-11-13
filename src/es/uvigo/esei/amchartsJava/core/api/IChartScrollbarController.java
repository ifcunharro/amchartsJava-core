package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.constants.GraphTypesConstant.GraphType;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

/**
 * Interface for controller of ChartScrollbar. Details of ChartScrollbar and 
 *  their properties in AmCharts API
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
	 * Get autoGridCount property.
	 * @return Boolean Value for autoGridCount.
	 */
	abstract Boolean isAutoGridCount();

	/**
	 * Set autoGridCount property.
	 * @param autoGridCount Enable or disable autoGridCount.
	 */
	abstract void setAutoGridCount(Boolean autoGridCount);

	/**
	 * Get backgroundAlpha property.
	 * @return Object Value for backgroundAlpha is a double number.
	 */
	abstract Object getBackgroundAlpha();

	/**
	 * Set backgroundAlpha property.
	 * @param backgroundAlpha Value for backgroundAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBackgroundAlpha(Number backgroundAlpha)
			throws OutOfRangeException;

	/**
	 * Get backgroundColor property.
	 * @return String Value for backgroundColor.
	 */
	abstract String getBackgroundColor();

	/**
	 * Set backgroundColor property.
	 * @param backgroundColor Value for backgroundColor.
	 * @throws ColorException Format of color don't admitted, format admitted: #ffffff
	 */
	abstract void setBackgroundColor(String backgroundColor)
			throws ColorException;

	/**
	 * Get color property.
	 * @return String Value for color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 * @throws ColorException Format of color don't admitted, format admitted: #ffffff
	 */
	abstract void setColor(String color) throws ColorException;

	/**
	 * Get dragIcon property.
	 * @return String Value for dragIcon.
	 */
	abstract String getDragIcon();

	/**
	 * Set dragIcon property.If icon don't exist in images folder, amcharts try load dragIconRoundBig icon,
	 * if that icon don't exist, no icon be show.
	 * @param dragIcon Value for dragIcon. 
	 * @see poner constant icon
	 */
	abstract void setDragIcon(String dragIcon);

	abstract Object getDragIconHeight();

	abstract void setDragIconHeight(Number dragIconHeight)
			throws OutOfRangeException;

	abstract Object getDragIconWidth();

	abstract void setDragIconWidth(Number dragIconWidth)
			throws OutOfRangeException;

	abstract Boolean isEnabled();

	abstract void setEnabled(Boolean enabled);

	abstract String getGraph();

	abstract void setGraph(String graph) throws ChartException;

	abstract Object getGraphFillAlpha();

	abstract void setGraphFillAlpha(Number graphFillAlpha)
			throws OutOfRangeException;

	abstract String getGraphFillColor();

	abstract void setGraphFillColor(String graphFillColor)
			throws ColorException;

	abstract Object getGraphLineAlpha();

	abstract void setGraphLineAlpha(Number graphLineAlpha)
			throws OutOfRangeException;

	abstract String getGraphLineColor();

	abstract void setGraphLineColor(String graphLineColor)
			throws ColorException;

	abstract String getGraphType();

	abstract void setGraphType(GraphType graphType);

	abstract Object getGridAlpha();

	abstract void setGridAlpha(Number gridAlpha) throws OutOfRangeException;

	abstract String getGridColor();

	abstract void setGridColor(String gridColor) throws ColorException;

	abstract Object getGridCount();

	abstract void setGridCount(Number gridCount) throws OutOfRangeException;

	abstract Boolean isHideResizeGrips();

	abstract void setHideResizeGrips(Boolean hideResizeGrips);

	abstract Boolean isIgnoreCustomColors();

	abstract void setIgnoreCustomColors(Boolean ignoreCustomColors);

	abstract Object getMaximum();

	abstract void setMaximum(Number maximum) throws IntegerException;

	abstract Object getMinimum();

	abstract void setMinimum(Number minimum) throws IntegerException;

	abstract Object getOffset();

	abstract void setOffset(Number offset) throws OutOfRangeException;

	abstract Boolean isOppositeAxis();

	abstract void setOppositeAxis(Boolean oppositeAxis);

	abstract Boolean isResizeEnabled();

	abstract void setResizeEnabled(Boolean resizeEnabled);

	abstract Object getScrollbarHeight();

	abstract void setScrollbarHeight(Number scrollbarHeight)
			throws OutOfRangeException;

	abstract Object getScrollDuration();

	abstract void setScrollDuration(Number scrollDuration)
			throws IntegerException;

	abstract Object getSelectedBackgroundAlpha();

	abstract void setSelectedBackgroundAlpha(Number selectedBackgroundAlpha)
			throws OutOfRangeException;

	abstract String getSelectedBackgroundColor();

	abstract void setSelectedBackgroundColor(String selectedBackgroundColor)
			throws ColorException;

	abstract Object getSelectedGraphFillAlpha();

	abstract void setSelectedGraphFillAlpha(Number selectedGraphFillAlpha)
			throws OutOfRangeException;

	abstract String getSelectedGraphFillColor();

	abstract void setSelectedGraphFillColor(String selectedGraphFillColor)
			throws ColorException;

	abstract Object getSelectedGraphLineAlpha();

	abstract void setSelectedGraphLineAlpha(Number selectedGraphLineAlpha)
			throws OutOfRangeException;

	abstract String getSelectedGraphLineColor();

	abstract void setSelectedGraphLineColor(String selectedGraphLineColor)
			throws ColorException;

	abstract Boolean isUpdateOnReleaseOnly();

	abstract void setUpdateOnReleaseOnly(Boolean updateOnReleaseOnly);

}