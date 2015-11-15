package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmRectangularChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.GradientAngleConstant.GradientAngle;
import es.uvigo.esei.amchartsJava.core.controllers.ChartCursorController;
import es.uvigo.esei.amchartsJava.core.controllers.ChartScrollbarController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PathValidator;

@JsonInclude(Include.NON_NULL)
public abstract class AmRectangularChartController<G extends AmRectangularChart> 
				extends AmCoordinateChartController<G> implements IAmRectangularChartController<AmRectangularChart>{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3477512389234890479L;

	protected AmRectangularChartController(G chart) {
		super(chart);
	}
	
	public Object getAngle(){
		return amchart.getFeature("angle");
	}
	
	public void setAngle(Number angle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(angle, 0, 360)){
			amchart.setFeature("angle", angle);
		}
	}
	
	public Object getAutoMarginOffset(){
		return amchart.getFeature("autoMarginOffset");
	}
	
	public void setAutoMarginOffset(Number autoMarginOffset) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(autoMarginOffset, 0, 10)){
				amchart.setFeature("autoMarginOffset", autoMarginOffset);
			}
		}else{
			amchart.setFeature("autoMarginOffset", autoMarginOffset);
		}
	}
	
	@JsonProperty(value="autoMargins")
	public Boolean isAutoMargins(){
		return (Boolean) amchart.getFeature("autoMargins");
	}
	
	public void setAutoMargins(Boolean autoMargins){
		amchart.setFeature("autoMargins", autoMargins);
	}
	
	public Object getDepth3D(){
		return amchart.getFeature("depth3D");
	}
	
	public void setDepth3D(Number depth3D) throws IntegerException{
		if(NumberValidator.integerValidator(depth3D)){
			amchart.setFeature("depth3D", depth3D);
		}
	}
	
	public Object getMarginBottom(){
		return amchart.getFeature("marginBottom");
	}
	
	public void setMarginBottom(Number marginBottom) throws IntegerException{
		if(NumberValidator.integerValidator(marginBottom)){
			amchart.setFeature("marginBottom", marginBottom);
		}
	}
	
	public Object getMarginLeft(){
		return amchart.getFeature("marginLeft");
	}
	
	public void setMarginLeft(Number marginLeft) throws IntegerException{
		if(NumberValidator.integerValidator(marginLeft)){
			amchart.setFeature("marginLeft", marginLeft);
		}
	}
	
	public Object getMarginRight(){
		return amchart.getFeature("marginRight");
	}
	
	public void setMarginRight(Number marginRight) throws IntegerException{
		if(NumberValidator.integerValidator(marginRight)){
			amchart.setFeature("marginRight", marginRight);
		}
	}
	
	@JsonProperty(value="marginsUpdated")
	public Boolean isMarginsUpdated(){
		return (Boolean) amchart.getFeature("marginsUpdated");
	}
	
	public void setMarginsUpdated(Boolean marginsUpdated){
		amchart.setFeature("marginsUpdated", marginsUpdated);
	}
	
	public Object getMarginTop(){
		return amchart.getFeature("marginTop");
	}
	
	public void setMarginTop(Number marginTop) throws IntegerException{
		if(NumberValidator.integerValidator(marginTop)){
			amchart.setFeature("marginTop", marginTop);
		}
	}
	
	public Object getPlotAreaBorderAlpha(){
		return amchart.getFeature("plotAreaBorderAlpha");
	}
	
	public void setPlotAreaBorderAlpha(Number plotAreaBorderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(plotAreaBorderAlpha, 0, 1)){
			amchart.setFeature("plotAreaBorderAlpha", plotAreaBorderAlpha);
		}
	}
	
	public String getPlotAreaBorderColor(){
		return (String) amchart.getFeature("plotAreaBorderColor");
	}
	
	public void setPlotAreaBorderColor(String plotAreaBorderColor) throws ColorException{
		if(ColorValidator.checkFormatColor(plotAreaBorderColor)){
			amchart.setFeature("plotAreaBorderColor", plotAreaBorderColor);
		}
	}
	
	public List<Number> getPlotAreaFillAlphas(){
		return amchart.getPlotAreaFillAlphas();
	}
	
	public void setPlotAreaFillAlphas(Number... plotAreaFillAlphas) throws DoubleException{
		if(NumberValidator.checkArrayDoubles(plotAreaFillAlphas)){
			amchart.addPlotAreaFillAlphas(plotAreaFillAlphas);
		}
	}
	
	public List<String> getPlotAreaFillColors(){
		return amchart.getPlotAreaFillColors();
	}
	
	public void setPlotAreaFillColors(String... plotAreaFillColors) throws ColorException{
		if(ColorValidator.checkFormatColors(plotAreaFillColors)){
			amchart.addPlotAreaFillColors(plotAreaFillColors);
		}
	}
	
	public String getPlotAreaGradientAngle(){
		return (String) amchart.getFeature("plotAreaGradientAngle");
	}
	
	public void setPlotAreaGradientAngle(GradientAngle plotAreaGradientAngle){
		amchart.setFeature("plotAreaGradientAngle", plotAreaGradientAngle.getNumber());
	}
	
	//trendLines
	
	public Object getZoomOutButtomAlpha(){
		return amchart.getFeature("zoomOutButtonAlpha");
	}
	
	public void setZoomOutButtonAlpha(Number zoomOutButtonAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(zoomOutButtonAlpha, 0, 1)){
			amchart.setFeature("zoomOutButtonAlpha", zoomOutButtonAlpha);
		}
	}
	
	public String getZoomOutButtonColor(){
		return (String) amchart.getFeature("zoomOutButtonColor");
	}
	
	public void setZoomOutButtonColor(String zoomOutButtonColor) throws ColorException{
		if(ColorValidator.checkFormatColor(zoomOutButtonColor)){
			amchart.setFeature("zoomOutButtonColor", zoomOutButtonColor);
		}
	}
	
	public String getZoomOutButtonImage(){
		return (String) amchart.getFeature("zoomOutButtonImage");
	}
	
	//debe existir en /amcharts/images
	public void setZoomOutButtonImage(String zoomOutButtonImage){
		String zoomOutButtonImageValidated = PathValidator.imageExist(zoomOutButtonImage);
		if(zoomOutButtonImageValidated.length()>0){
			amchart.setFeature("zoomOutButtonImage", zoomOutButtonImageValidated);
		}
	}
	
	public Object getZoomOutButtonImageSize(){
		return amchart.getFeature("zoomOutButtonImageSize");
	}
	
	public void setZoomOutButtonImageSize(Number zoomOutButtonImageSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(zoomOutButtonImageSize, 10, 26)){
				amchart.setFeature("zoomOutButtonImageSize", zoomOutButtonImageSize);
			}
		}else{
			amchart.setFeature("zoomOutButtonImageSize", zoomOutButtonImageSize);
		}
	}
	
	public Object getZoomOutButtonPadding(){
		return amchart.getFeature("zoomOutButtonPadding");
	}
	
	public void setZoomOutButtonPadding(Number zoomOutButtonPadding) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(zoomOutButtonPadding, 5, 20)){
				amchart.setFeature("zoomOutButtonPadding", zoomOutButtonPadding);
			}
		}else{
			amchart.setFeature("zoomOutButtonPadding", zoomOutButtonPadding);
		}
	}
	
	public Object getZoomOutButtonRollOverAlpha(){
		return amchart.getFeature("zoomOutButtonRollOverAlpha");
	}
	
	public void setZoomOutButtonRollOverAlpha(Number zoomOutButtonRollOverAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(zoomOutButtonRollOverAlpha, 0, 1)){
			amchart.setFeature("zoomOutButtonRollOverAlpha", zoomOutButtonRollOverAlpha);
		}
	}
	
	public String getZoomOutText(){
		return (String) amchart.getFeature("zoomOutText");
	}
	
	public void setZoomOutText(String zoomOutText){
		amchart.setFeature("zoomOutText", zoomOutText);
	}
	
	//methods
	
	public ChartCursorController getChartCursor(){
		return amchart.getChartCursor();
	}
	
	public ChartScrollbarController getChartScrollbar(){
		return amchart.getChartScrollbar();
	}
	
	public Object getTrendLines(){
		return amchart.getTrendLines();
	}
	
	@JsonSetter(value="chartCursor")
	public void addChartCursor(ChartCursorController chartCursorController){
		amchart.addChartCursor(chartCursorController);
	}
	
	@JsonSetter(value="chartScrollbar")
	public void addChartScrollbar(ChartScrollbarController chartScrollbarController){
		amchart.addChartScrollbar(chartScrollbarController);
	}
	
	public <T extends TrendLineSerialChartController> void addTrendLine(T trendLineController) throws NotSupportedException{
		amchart.addTrendLine(trendLineController);
	}
	
	public void removeChartCursor(){
		amchart.removeChartCursor();
	}
	
	public void removeChartScrollbar(){
		amchart.removeChartScrollbar();
	}
	
	public void removeTrendLine(String trendLine){
		if(amchart.existTrendLine(trendLine)){
			amchart.removeTrendLine(trendLine);
		}
	}
	
}
