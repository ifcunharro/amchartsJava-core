package es.uvigo.esei.amchartsJava.core.controllers.charts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


import es.uvigo.esei.amchartsJava.core.constants.GradientAngleConstant.GradientAngle;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

@JsonInclude(Include.NON_NULL)
public abstract class AmRectangularChartController<V extends AmRectangularChart> 
				extends AmCoordinateChartController<V> {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3477512389234890479L;

	protected AmRectangularChartController(V chart) {
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
		return amchart.getFeature("autoMarginsOffset");
	}
	
	public void setAutoMarginsOffset(Number autoMarginsOffset) throws IntegerException{
		if(NumberValidator.integerValidator(autoMarginsOffset)){
			amchart.setFeature("autoMarginsOffset", autoMarginsOffset);
		}
	}
	
	@JsonProperty(value="autoMargins")
	public Object isAutoMargins(){
		return amchart.getFeature("autoMargins");
	}
	
	public void setAutoMargins(Boolean autoMargins){
		amchart.setFeature("autoMargins", autoMargins);
	}
	
	//chartCursor
	
	//chartScrollbar
	
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
	public Object isMarginsUpdated(){
		return amchart.getFeature("marginsUpdated");
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
		if(NumberValidator.rangeFloatValidator(plotAreaBorderAlpha, 0, 1)){
			amchart.setFeature("plotAreaBorderAlpha", plotAreaBorderAlpha);
		}
	}
	
	public Object getPlotAreaBorderColor(){
		return amchart.getFeature("plotAreaBorderColor");
	}
	
	public void setPlotAreaBorderColor(String plotAreaBorderColor) throws ColorException{
		if(ColorValidator.checkFormatColor(plotAreaBorderColor)){
			amchart.setFeature("plotAreaBorderColor", plotAreaBorderColor);
		}
	}
	
	public Object getPlotAreaFillColors(){
		return amchart.getFeature("plotAreaFillColors");
	}
	
	public void setPlotAreaFillColors(String... plotAreaFillColors) throws ColorException{
		if(ColorValidator.checkFormatColors(plotAreaFillColors)){
			amchart.addPlotAreaFillColors(plotAreaFillColors);
		}
	}
	
	public Object getPlotAreaGradientAngle(){
		return amchart.getFeature("plotAreaGradientAngle");
	}
	
	public void setPlotAreaGradientAngle(GradientAngle plotAreaGradientAngle){
		amchart.setFeature("plotAreaGradientAngle", plotAreaGradientAngle.getNumber());
	}
	
	//trendLines
	
	public Object getZoomOutButtomAlpha(){
		return amchart.getFeature("zoomOutButtonAlpha");
	}
	
	public void setZoomOutButtonAlpha(Number zoomOutButtonAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(zoomOutButtonAlpha, 0, 1)){
			amchart.setFeature("zoomOutButtonAlpha", zoomOutButtonAlpha);
		}
	}
	
	public Object getZoomOutButtonColor(){
		return amchart.getFeature("zoomOutButtonColor");
	}
	
	public void setZoomOutButtonColor(String zoomOutButtonColor) throws ColorException{
		if(ColorValidator.checkFormatColor(zoomOutButtonColor)){
			amchart.setFeature("zoomOutButtonColor", zoomOutButtonColor);
		}
	}
	
	public Object getZoomOutButtonImage(){
		return amchart.getFeature("zoomOutButtonImage");
	}
	
	//debe existir en /amcharts/images
	public void setZoomOutButtonImage(String zoomOutButtonImage){
		amchart.setFeature("zoomOutButtonImage", zoomOutButtonImage);
	}

}