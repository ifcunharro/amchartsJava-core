package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphSerialChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.PointPositionGraph;
import es.uvigo.esei.amchartsJava.core.constants.ShowAt;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.TypeValidator;



public abstract class AmGraphSerialChartController extends AmGraphController 
	implements IAmGraphSerialChartController{

	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 9098330065218597495L;
	
	@JsonProperty(value="behindColumns")
	public Boolean isBehindColumns(){
		return (Boolean) amGraph.getFeature("behindColumns");
	}
	
	public void setBehindColumns(Boolean behindColumns){
		amGraph.setFeature("behindColumns", behindColumns);
	}
	
	@JsonProperty(value="clustered")
	public Boolean isClustered(){
		return (Boolean) amGraph.getFeature("clustered");
	}
	
	public void setClustered(Boolean clustered){
		amGraph.setFeature("clustered", clustered);
	}
	
	public Double getColumnWidth(){
		Object columnWidth = amGraph.getFeature("columnWidth");
		
		return columnWidth != null ? ((Number)columnWidth).doubleValue() : null;
	}
	
	public void setColumnWidth(Number columnWidth) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(columnWidth, 0, 1)){
			amGraph.setFeature("columnWidth", columnWidth);
		}
	}
	
	public String getCornerRadiusTop(){
		return (String) amGraph.getFeature("cornerRadiusTop");
	}
	
	public void setCornerRadiusTop(String cornerRadiusTop) throws CoordException{
		if(TypeValidator.pixelOrPercent(cornerRadiusTop)){
			amGraph.setFeature("cornerRadiusTop", cornerRadiusTop);
		}
	}
	
	public Double getDashLength(){
		Object dashLength = amGraph.getFeature("dashLength");
		
		return dashLength != null ? ((Number)dashLength).doubleValue() : null;
	}
	
	public void setDashLength(Number dashLength){
		amGraph.setFeature("dashLength", dashLength);
	}
	
	public String getDashLengthField(){
		return (String) amGraph.getFeature("dashLengthField");
	}
	
	public void setDashLengthField(String dashLengthField){
		amGraph.setFeature("dashLengthField", dashLengthField);
		amGraph.addGraphField("dashLengthField", dashLengthField);
	}
	
	public Integer getFixedColumnWidth(){
		Object fixedColumnWidth = amGraph.getFeature("fixedColumnWidth");
		
		return fixedColumnWidth != null ? ((Number)fixedColumnWidth).intValue() : null;
	}
	
	public void setFixedColumnWidth(Number fixedColumnWidth) throws IntegerException{
		if(NumberValidator.integerValidator(fixedColumnWidth) && fixedColumnWidth.intValue()>1){
			amGraph.setFeature("fixedColumnWidth", fixedColumnWidth);
		}
	}
	
	public String getLineColor(){
		return (String) amGraph.getFeature("lineColor");
	}
	
	@JsonSetter
	public void setLineColor(ColorsAmCharts lineColor){
		amGraph.setFeature("lineColor", lineColor.toString());
	}
	
	public String getLineColorField(){
		return (String) amGraph.getFeature("lineColorField");
	}
	
	public void setLineColorField(String lineColorField){
		amGraph.setFeature("lineColorField", lineColorField);
		amGraph.addGraphField("lineColorField", lineColorField);
	}
	
	public Integer getLineThickness(){
		Object lineThickness = amGraph.getFeature("lineThickness");
		
		return lineThickness != null ? ((Number)lineThickness).intValue() : null;
	}
	
	public void setLineThickness(Number lineThickness) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(lineThickness, 0, 12)){
				amGraph.setFeature("lineThickness", lineThickness);
			}
		}else{
			amGraph.setFeature("lineThickness", lineThickness);
		}
	}
	
	public Double getNegativeLineAlpha(){
		Object negativeLineAlpha = amGraph.getFeature("negativeLineAlpha");
		
		return negativeLineAlpha != null ? ((Number)negativeLineAlpha).doubleValue() : null;
	}
	
	public void setNegativeLineAlpha(Number negativeLineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(negativeLineAlpha, 0, 1)){
			amGraph.setFeature("negativeLineAlpha", negativeLineAlpha);
		}
	}
	
	public String getNegativeLineColor(){
		return (String) amGraph.getFeature("negativeLineColor");
	}
	
	public void setNegativeLineColor(ColorsAmCharts negativeLineColor){
		amGraph.setFeature("negativeLineColor", negativeLineColor.toString());
	}
	
	@JsonProperty(value="newStack")
	public Boolean isNewStack(){
		return (Boolean) amGraph.getFeature("newStack");
	}
	
	public void setNewStack(Boolean newStack){
		amGraph.setFeature("newStack", newStack);
	}
	
	public String getOpenField(){
		return (String) amGraph.getFeature("openField");
	}
	
	public void setOpenField(String openField){
		amGraph.setFeature("openField", openField);
		amGraph.addGraphField("openField", openField);
	}
	
	public String getPointPosition(){
		return (String) amGraph.getFeature("pointPosition");
	}
	
	public void setPointPosition(PointPositionGraph pointPosition){
		amGraph.setFeature("pointPosition", pointPosition.toString());
	}
	
	public String getShowBalloonAt(){
		return (String) amGraph.getFeature("showBalloonAt");
	}
	
	public void setShowBalloonAt(ShowAt showBalloonAt){
		amGraph.setFeature("showBalloonAt", showBalloonAt.toString());
	}
	
	public Double getTopRadius(){
		Object topRadius = amGraph.getFeature("topRadius");
		
		return topRadius != null ? ((Number)topRadius).doubleValue() : null;
	}
	
	public void setTopRadius(Number topRadius) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeDoubleValidator(topRadius, 0, 2)){
				amGraph.setFeature("topRadius", topRadius);
			}
		}else{
			amGraph.setFeature("topRadius", topRadius);
		}
	}
	
	@JsonProperty(value="useNegativeColorIfDown")
	public Boolean isUseNegativeColorIfDown(){
		return (Boolean) amGraph.getFeature("useNegativeColorIfDown");
	}
	
	public void setUseNegativeColorIfDown(Boolean useNegativeColorIfDown){
		if(ColorValidator.canActivateNegativeColor(getType().toString())){
			amGraph.setFeature("useNegativeColorIfDown", useNegativeColorIfDown);
		}
	}

	
}
