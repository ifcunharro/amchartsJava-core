package es.uvigo.esei.amchartsJava.core.api.charts;


import java.util.List;

import es.uvigo.esei.amchartsJava.core.constants.GradientAngleConstant.GradientAngle;
import es.uvigo.esei.amchartsJava.core.controllers.ChartCursorController;
import es.uvigo.esei.amchartsJava.core.controllers.ChartScrollbarController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

public abstract interface IAmRectangularChartController<G extends AmRectangularChart> extends IAmCoordinateChartController<AmCoordinateChart> {

	abstract Object getAngle();

	abstract void setAngle(Number angle) throws OutOfRangeException;

	abstract Object getAutoMarginOffset();

	abstract void setAutoMarginOffset(Number autoMarginOffset)
			throws OutOfRangeException;

	abstract Boolean isAutoMargins();

	abstract void setAutoMargins(Boolean autoMargins);

	abstract Object getDepth3D();

	abstract void setDepth3D(Number depth3D) throws IntegerException;

	abstract Object getMarginBottom();

	abstract void setMarginBottom(Number marginBottom) throws IntegerException;

	abstract Object getMarginLeft();

	abstract void setMarginLeft(Number marginLeft) throws IntegerException;

	abstract Object getMarginRight();

	abstract void setMarginRight(Number marginRight) throws IntegerException;

	abstract Boolean isMarginsUpdated();

	abstract void setMarginsUpdated(Boolean marginsUpdated);

	abstract Object getMarginTop();

	abstract void setMarginTop(Number marginTop) throws IntegerException;

	abstract Object getPlotAreaBorderAlpha();

	abstract void setPlotAreaBorderAlpha(Number plotAreaBorderAlpha)
			throws OutOfRangeException;

	abstract String getPlotAreaBorderColor();

	abstract void setPlotAreaBorderColor(String plotAreaBorderColor)
			throws ColorException;

	abstract List<Number> getPlotAreaFillAlphas();

	abstract void setPlotAreaFillAlphas(Number... plotAreaFillAlphas)
			throws DoubleException;
	
	abstract List<String> getPlotAreaFillColors();

	abstract void setPlotAreaFillColors(String... plotAreaFillColors)
			throws ColorException;

	abstract String getPlotAreaGradientAngle();

	abstract void setPlotAreaGradientAngle(GradientAngle plotAreaGradientAngle);

	abstract Object getZoomOutButtomAlpha();

	abstract void setZoomOutButtonAlpha(Number zoomOutButtonAlpha)
			throws OutOfRangeException;

	abstract String getZoomOutButtonColor();

	abstract void setZoomOutButtonColor(String zoomOutButtonColor)
			throws ColorException;

	abstract String getZoomOutButtonImage();

	//debe existir en /amcharts/images
	abstract void setZoomOutButtonImage(String zoomOutButtonImage);

	abstract Object getZoomOutButtonImageSize();

	abstract void setZoomOutButtonImageSize(Number zoomOutButtonImageSize)
			throws OutOfRangeException;

	abstract Object getZoomOutButtonPadding();

	abstract void setZoomOutButtonPadding(Number zoomOutButtonPadding)
			throws OutOfRangeException;

	abstract Object getZoomOutButtonRollOverAlpha();

	abstract void setZoomOutButtonRollOverAlpha(
			Number zoomOutButtonRollOverAlpha) throws OutOfRangeException;

	abstract String getZoomOutText();

	abstract void setZoomOutText(String zoomOutText);

	abstract ChartCursorController getChartCursor();
	
	abstract ChartScrollbarController getChartScrollbar();
	
	abstract Object getTrendLines();
	
	abstract void addChartCursor(ChartCursorController chartCursorController);

	abstract void addChartScrollbar(ChartScrollbarController chartScrollbarController);
	
	abstract <T extends TrendLineSerialChartController> void addTrendLine(
			T trendLineController) throws NotSupportedException;
	
	abstract void removeChartCursor();
	
	abstract void removeChartScrollbar();
	
	abstract void removeTrendLine(String trendLine);
	
}