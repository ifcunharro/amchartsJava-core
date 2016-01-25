package es.uvigo.esei.amchartsJava.core.constants.config;

import es.uvigo.esei.amchartsJava.core.constants.Align;
import es.uvigo.esei.amchartsJava.core.constants.Bullet;
import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.AxisPosition;
import es.uvigo.esei.amchartsJava.core.controllers.LabelController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmXyChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphCandleController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * This class contains default configuration to charts of amcharts.
 * @author Iago Fernández Cuñarro
 *
 */
public class DefaultConfigCharts {
	
	//used by GRUBBS, LEVENE, BARLETT Y KRUSKAL-WALLIS en BEW
	/**
	 * Create default CandleStickGraph(boxplot)
	 * @return AmSerialChartController Controller for AmSerialChart just configured.
	 */
	public static AmSerialChartController initDefaultCandleStickGraphToBEW(){
		
		AmSerialChartController chart = new AmSerialChartController();
		chart.setCategoryField("category");
		try {
			chart.setAngle(20);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		try {
			chart.setDepth3D(20);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		
		try {
			chart.setPlotAreaBorderAlpha(0.21);
		} catch (OutOfRangeException e) {
			
			e.printStackTrace();
		}
		
		try {
			chart.setPlotAreaBorderColor("#CC0000");
		} catch (ColorException e) {
		
			e.printStackTrace();
		}
		
		try {
			chart.setPlotAreaFillAlphas(0.4);
		} catch (DoubleException e) {
			
			e.printStackTrace();
		}
		
		try {
			chart.setBorderAlpha(0.37);
		} catch (OutOfRangeException e) {
			
			e.printStackTrace();
		}
		
		try {
			chart.setPrecision(2);
		} catch (OutOfRangeException e1) {
			
			e1.printStackTrace();
		}
		
		ValueAxisController axis = new ValueAxisController();
		
		axis.setUseScientificNotation(true);
		
		try {
			chart.addValueAxis(axis);
		} catch (NotSupportedException e) {
			
			e.printStackTrace();
		}
		//configuración para un candle se necesita replicar cambiando value para fields y
		//lo que muestra balloonText
		AmGraphCandleController candle = new AmGraphCandleController();
		
		candle.setBalloonText("Open:<b>[[open]]</b><br>Quartile:<b>[[step]]</b><br>Close:<b>[[close]]</b><br>");
		candle.setCloseField("close");
		try {
			candle.setColumnWidth(0.54);
		} catch (OutOfRangeException e) {
			
			e.printStackTrace();
		}
		
		try {
			candle.setFillAlphas(0.63);
		} catch (OutOfRangeException e) {
			
			e.printStackTrace();
		}
		
		candle.setOpenField("open");
		
		try {
			chart.addGraph(candle);
		} catch (NotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
		AmGraphStepController step = new AmGraphStepController();
		
		step.setBehindColumns(false);
		try {
			step.setColumnWidth(0.57);
		} catch (OutOfRangeException e) {
			
			e.printStackTrace();
		}
		
		step.setLineColor(ColorsAmCharts.DARKGRAY);
		try {
			step.setLineThickness(2);
		} catch (OutOfRangeException e) {
		
			e.printStackTrace();
		}
		
		step.setNoStepRisers(true);
		step.setShowBalloon(false);
		step.setSwitchable(false);
		step.setVisibleInLegend(false);
		step.setValueField("step");
		
		try {
			chart.addGraph(step);
		} catch (NotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
		return chart;
		
	}
	
	/**
	 * Create default AmXyChart with trendLine.
	 * @param titleAxisX Text for axisX.
	 * @param titleAxisY Text for axisY.
	 * @param titlePlot Title of plot.
	 * @return AmXyChartController Controller for AmXyChart just configured.
	 */
	public static AmXyChartController initDefaultXYGraphToBew(
			String titleAxisX, String titleAxisY, String titlePlot){
		
		AmXyChartController chart = new AmXyChartController();
		try {
			chart.setMarginTop(35);
		} catch (IntegerException e) {
			
			e.printStackTrace();
		}
		
		try {
			chart.setStartDuration(1.5);
		} catch (OutOfRangeException e) {
			
			e.printStackTrace();
		}
		
		//necesita saber con posterioridad valores para trendLine:
		//finalValue,finalXValue y InitialXValue, initialValue siempre
		//es cero, initialXValue es la x del 1º quartile, finalXValue la
		//x del 3º quartile y finalValue es restar last x - x 1º quartile
		TrendLineXyChartController trendLine = new TrendLineXyChartController();
		
		trendLine.setInitialValue(0);
		try {
			trendLine.setLineColor("#ff6600");
		} catch (ColorException e) {
			
			e.printStackTrace();
		}
		
		try {
			chart.addTrendLine(trendLine);
		} catch (NotSupportedException e) {
			
			e.printStackTrace();
		}
		
		AmGraphXyController xyGraph = new AmGraphXyController();
		
		xyGraph.setBalloonText("x:<b>[[x]]</b> y:<b>[[y]]</b>");
		xyGraph.setBullet(Bullet.diamond);
		xyGraph.setBulletColor(ColorsAmCharts.LIME);
		try {
			xyGraph.setLineAlpha(0);
		} catch (OutOfRangeException e) {
			
			e.printStackTrace();
		}
		
		xyGraph.setVisibleInLegend(false);
		xyGraph.setXField("ax");
		xyGraph.setYField("ay");
		
		try {
			chart.addGraph(xyGraph);
		} catch (NotSupportedException e) {
			
			e.printStackTrace();
		}
		
		ValueAxisController axisY = new ValueAxisController();
		
		try {
			axisY.setAxisAlpha(0);
		} catch (OutOfRangeException e) {
			
			e.printStackTrace();
		}
		
		axisY.setTitle(titleAxisY);
		
		try {
			axisY.setTitleColor("#FF6400");
		} catch (ColorException e) {
			
			e.printStackTrace();
		}
		
		try {
			axisY.setFontSize(13);
		} catch (OutOfRangeException e) {
			
			e.printStackTrace();
		}
		
		try {
			chart.addValueAxis(axisY);
		} catch (NotSupportedException e) {
			
			e.printStackTrace();
		}
		
		ValueAxisController axisX = new ValueAxisController();
		
		axisX.setPosition(AxisPosition.bottom);
		try {
			axisX.setAxisAlpha(0);
		} catch (OutOfRangeException e) {
			
			e.printStackTrace();
		}
		
		axisX.setTitle(titleAxisX);
		try {
			axisX.setTitleColor("#FF6400");
		} catch (ColorException e) {
		
			e.printStackTrace();
		}
		
		try {
			axisX.setTitleFontSize(13);
		} catch (OutOfRangeException e) {
			
			e.printStackTrace();
		}
		
		try {
			chart.addValueAxis(axisX);
		} catch (NotSupportedException e) {
		
			e.printStackTrace();
		}
		
		LabelController titleLabel = new LabelController();
		
		titleLabel.setAlign(Align.center);
		titleLabel.setBold(true);
		try {
			titleLabel.setColor("#ff0000");
		} catch (ColorException e) {
			
			e.printStackTrace();
		}
		
		try {
			titleLabel.setSize(16);
		} catch (OutOfRangeException e) {
			
			e.printStackTrace();
		}
		
		titleLabel.setText(titlePlot);
		
		chart.addLabel(titleLabel);
		
		return chart;
	}
	

}
