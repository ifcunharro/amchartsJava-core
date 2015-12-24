package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmRectangularChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.GradientAngle;
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
	
	public Integer getAngle(){
		Object angle = amchart.getFeature("angle");
		
		return angle != null ? ((Number)angle).intValue() : null;
	}
	
	public void setAngle(Number angle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(angle, 0, 360)){
			amchart.setFeature("angle", angle);
		}
	}
	
	public Integer getAutoMarginOffset(){
		Object autoMarginOffset = amchart.getFeature("autoMarginOffset");
		
		return autoMarginOffset != null ? ((Number)autoMarginOffset).intValue() : null;
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
	
	public Integer getDepth3D(){
		Object depth3D = amchart.getFeature("depth3D");
		
		return depth3D != null ? ((Number)depth3D).intValue() : null;
	}
	
	public void setDepth3D(Number depth3D) throws IntegerException{
		if(NumberValidator.integerValidator(depth3D)){
			amchart.setFeature("depth3D", depth3D);
		}
	}
	
	public Integer getMarginBottom(){
		Object marginBottom = amchart.getFeature("marginBottom");
		
		return marginBottom != null ? ((Number)marginBottom).intValue() : null;
	}
	
	public void setMarginBottom(Number marginBottom) throws IntegerException{
		if(NumberValidator.integerValidator(marginBottom)){
			amchart.setFeature("marginBottom", marginBottom);
		}
	}
	
	public Integer getMarginLeft(){
		Object marginLeft = amchart.getFeature("marginLeft");
		
		return marginLeft != null ? ((Number)marginLeft).intValue() : null;
	}
	
	public void setMarginLeft(Number marginLeft) throws IntegerException{
		if(NumberValidator.integerValidator(marginLeft)){
			amchart.setFeature("marginLeft", marginLeft);
		}
	}
	
	public Integer getMarginRight(){
		Object marginRight = amchart.getFeature("marginRight");
		
		return marginRight != null ? ((Number)marginRight).intValue() : null;
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
	
	public Integer getMarginTop(){
		Object marginTop = amchart.getFeature("marginTop");
		
		return marginTop != null ? ((Number)marginTop).intValue() : null;
	}
	
	public void setMarginTop(Number marginTop) throws IntegerException{
		if(NumberValidator.integerValidator(marginTop)){
			amchart.setFeature("marginTop", marginTop);
		}
	}
	
	public Double getPlotAreaBorderAlpha(){
		Object plotAreaBorderAlpha = amchart.getFeature("plotAreaBorderAlpha");
		
		return plotAreaBorderAlpha != null ? ((Number)plotAreaBorderAlpha).doubleValue() : null;
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
	
	public Double getZoomOutButtomAlpha(){
		Object zoomOutButtonAlpha = amchart.getFeature("zoomOutButtonAlpha");
		
		return zoomOutButtonAlpha != null ? ((Number)zoomOutButtonAlpha).doubleValue() : null;
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
	
	public Integer getZoomOutButtonImageSize(){
		Object zoomOutButtonImageSize = amchart.getFeature("zoomOutButtonImageSize");
		
		return zoomOutButtonImageSize != null ? ((Number)zoomOutButtonImageSize).intValue() : null;
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
	
	public Integer getZoomOutButtonPadding(){
		Object zoomOutButtonPadding = amchart.getFeature("zoomOutButtonPadding");
		
		return zoomOutButtonPadding != null ? ((Number)zoomOutButtonPadding).intValue() : null;
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
	
	public Double getZoomOutButtonRollOverAlpha(){
		Object zoomOutButtonRollOverAlpha = amchart.getFeature("zoomOutButtonRollOverAlpha");
		
		return zoomOutButtonRollOverAlpha != null ? ((Number)zoomOutButtonRollOverAlpha).doubleValue() : null;
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
