package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.constants.GraphTypesConstant.GraphType;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

public abstract interface IChartScrollBarController {

	abstract void setChart(AmRectangularChart chart);

	abstract Object isAutoGridCount();

	abstract void setAutoGridCount(Boolean autoGridCount);

	abstract Object getBackgroundAlpha();

	abstract void setBackgroundAlpha(Number backgroundAlpha)
			throws OutOfRangeException;

	abstract Object getBackgroundColor();

	abstract void setBackgroundColor(String backgroundColor)
			throws ColorException;

	abstract Object getColor();

	abstract void setColor(String color) throws ColorException;

	abstract Object getDragIcon();

	abstract void setDragIcon(String dragIcon);

	abstract Object getDragIconHeight();

	abstract void setDragIconHeight(Number dragIconHeight)
			throws OutOfRangeException;

	abstract Object getDragIconWidth();

	abstract void setDragIconWidth(Number dragIconWidth)
			throws OutOfRangeException;

	abstract Object isEnabled();

	abstract void setEnabled(Boolean enabled);

	abstract Object getGraph();

	abstract void setGraph(String graph);

	abstract Object getGraphFillAlpha();

	abstract void setGraphFillAlpha(Number graphFillAlpha)
			throws OutOfRangeException;

	abstract Object getGraphFillColor();

	abstract void setGraphFillColor(String graphFillCOlor)
			throws ColorException;

	abstract Object getGraphLineAlpha();

	abstract void setGraphLineAlpha(Number graphLineAlpha)
			throws OutOfRangeException;

	abstract Object getGraphLineColor();

	abstract void setGraphLineColor(String graphLineColor)
			throws ColorException;

	abstract Object getGraphType();

	abstract void setGraphType(GraphType graphType);

	abstract Object getGridAlpha();

	abstract void setGridAlpha(Number gridAlpha) throws OutOfRangeException;

	abstract Object getGridColor();

	abstract void setGridColor(String gridColor) throws ColorException;

	abstract Object getGridCount();

	abstract void setGridCount(Number gridCount) throws OutOfRangeException;

	abstract Object isHideResizeGrips();

	abstract void setHideResizeGrips(Boolean hideResizeGrips);

	abstract Object isIgnoreCustomColors();

	abstract void setIgnoreCustomColors(Boolean ignoreCustomColors);

	abstract Object getMaximum();

	abstract void setMaximum(Number maximum) throws IntegerException;

	abstract Object getMinimum();

	abstract void setMinimum(Number minimum) throws IntegerException;

	abstract Object getOffset();

	abstract void setOffset(Number offset) throws OutOfRangeException;

	abstract Object isOppositeAxis();

	abstract void setOppositeAxis(Boolean oppositeAxis);

	abstract Object isResizeEnabled();

	abstract void setResizeEnabled(Boolean resizeEnabled);

	abstract Object getScrollbarHeight();

	abstract void setScrollbarHeight(Number scrollbarHeight)
			throws OutOfRangeException;

	abstract Object getScrollDuration();

	abstract void setScrollbarDuration(Number scrollbarDuration)
			throws IntegerException;

	abstract Object getSelectedBackgroundAlpha();

	abstract void setSelectedBackgroundAlpha(Number selectedBackgroundAlpha)
			throws OutOfRangeException;

	abstract Object getSelectedBackgroundColor();

	abstract void setSelectedBackgroundColor(String selectedBackgroundColor)
			throws ColorException;

	abstract Object getSelectedGraphFillAlpha();

	abstract void setSelectedGraphFillAlpha(Number selectedGraphFillAlpha)
			throws OutOfRangeException;

	abstract Object getSelectedGraphFillColor();

	abstract void setSelectedGraphFillColor(String selectedGraphFillColor)
			throws ColorException;

	abstract Object getSelectedGraphLineAlpha();

	abstract void setSelectedGraphLineAlpha(Number selectedGraphLineAlpha)
			throws OutOfRangeException;

	abstract Object getSelectedGraphLineColor();

	abstract void setSelectedGraphLineColor(String selectedGraphLineColor)
			throws ColorException;

	abstract Object isUpdateOnReleaseOnly();

	abstract void setUpdateOnReleaseOnly(Boolean updateOnReleaseOnly);

}