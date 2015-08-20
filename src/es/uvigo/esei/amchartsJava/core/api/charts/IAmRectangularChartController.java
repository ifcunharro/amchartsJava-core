package es.uvigo.esei.amchartsJava.core.api.charts;


import es.uvigo.esei.amchartsJava.core.constants.GradientAngleConstant.GradientAngle;
import es.uvigo.esei.amchartsJava.core.controllers.ChartCursorController;
import es.uvigo.esei.amchartsJava.core.controllers.ChartScrollBarController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

public interface IAmRectangularChartController<G extends AmRectangularChart> extends IAmCoordinateChartController<AmCoordinateChart> {

	abstract Object getAngle();

	abstract void setAngle(Number angle) throws OutOfRangeException;

	abstract Object getAutoMarginOffset();

	abstract void setAutoMarginsOffset(Number autoMarginsOffset)
			throws OutOfRangeException;

	abstract Object isAutoMargins();

	abstract void setAutoMargins(Boolean autoMargins);

	abstract Object getDepth3D();

	abstract void setDepth3D(Number depth3D) throws IntegerException;

	abstract Object getMarginBottom();

	abstract void setMarginBottom(Number marginBottom) throws IntegerException;

	abstract Object getMarginLeft();

	abstract void setMarginLeft(Number marginLeft) throws IntegerException;

	abstract Object getMarginRight();

	abstract void setMarginRight(Number marginRight) throws IntegerException;

	abstract Object isMarginsUpdated();

	abstract void setMarginsUpdated(Boolean marginsUpdated);

	abstract Object getMarginTop();

	abstract void setMarginTop(Number marginTop) throws IntegerException;

	abstract Object getPlotAreaBorderAlpha();

	abstract void setPlotAreaBorderAlpha(Number plotAreaBorderAlpha)
			throws OutOfRangeException;

	abstract Object getPlotAreaBorderColor();

	abstract void setPlotAreaBorderColor(String plotAreaBorderColor)
			throws ColorException;

	abstract Object getPlotAreaFillColors();

	abstract void setPlotAreaFillColors(String... plotAreaFillColors)
			throws ColorException;

	abstract Object getPlotAreaGradientAngle();

	abstract void setPlotAreaGradientAngle(GradientAngle plotAreaGradientAngle);

	abstract Object getZoomOutButtomAlpha();

	abstract void setZoomOutButtonAlpha(Number zoomOutButtonAlpha)
			throws OutOfRangeException;

	abstract Object getZoomOutButtonColor();

	abstract void setZoomOutButtonColor(String zoomOutButtonColor)
			throws ColorException;

	abstract Object getZoomOutButtonImage();

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

	abstract Object getZoomOutText();

	abstract void setZoomOutText(String zoomOutText);

	abstract Object getChartCursor();
	
	abstract Object getChartScrollBar();
	
	abstract Object getTrendLines();
	
	abstract void addChartCursor(ChartCursorController chartCursorController);

	abstract void addChartScrollBar(ChartScrollBarController chartScrollBarController);
	
	abstract <P extends TrendLineSerialChartController> void addTrendLine(
			P trendLineController) throws NotSupportedException;
	
	abstract void removeChartCursor();
	
	abstract void removeChartScrollBar();
	
	abstract void removeTrendLine(String trendLine);
	
}