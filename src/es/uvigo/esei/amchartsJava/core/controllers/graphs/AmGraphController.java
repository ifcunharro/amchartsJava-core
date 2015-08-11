package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphController;
import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.BulletConstant.Bullet;
import es.uvigo.esei.amchartsJava.core.constants.OrientationConstant.Orientation;
import es.uvigo.esei.amchartsJava.core.constants.GraphTypesConstant.GraphType;
import es.uvigo.esei.amchartsJava.core.constants.LabelAnchorConstant.LabelAnchor;
import es.uvigo.esei.amchartsJava.core.constants.LabelPositionConstant.LabelPosition;
import es.uvigo.esei.amchartsJava.core.constants.LegendPeriodValueTextConstant.LegendPeriodValueText;
import es.uvigo.esei.amchartsJava.core.constants.MarkerTypeConstant.MarkerType;
import es.uvigo.esei.amchartsJava.core.constants.TagsTextConstant.TagsText;
import es.uvigo.esei.amchartsJava.core.constants.UrlTargetConstant.UrlTarget;
import es.uvigo.esei.amchartsJava.core.exceptions.FloatException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AmGraph;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.StringValidator;




@JsonInclude(Include.NON_NULL)
public  class AmGraphController implements Observer, Serializable, IAmGraphController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5885650666487286522L;
	protected AmGraph amGraph;
	//chart que usa el graph
	protected AmCoordinateChart amchart;
	
	
	{
		amGraph = new AmGraph();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setId("AmGraph-"+arg.toString());
		this.setTitle("AmGraph-"+arg.toString());
	}
	
	@JsonIgnore
	public void setChart(AmCoordinateChart chart){
		amchart = chart;
	}
	
	public Object getId(){
		return amGraph.getFeature("id");
	}
	
	private void setId(String id) {
		amGraph.setFeature("id", id);	
	}
	
	public Object getAlphaField(){
		return amGraph.getFeature("alphaField");
	}
	
	public void setAlphaField(String alphaField){
		amGraph.setFeature("alphaField", alphaField);
	}
	
	@JsonProperty(value="animationPlayed")
	public Object isAnimationPlayed(){
		return amGraph.getFeature("animationPlayed");
	}
	
	public void setAnimationPlayed(Boolean animationPlayed){
		amGraph.setFeature("animationPlayed", animationPlayed);
	}
	
	public Object getBalloonColor(){
		return amGraph.getFeature("balloonColor");
	}
	
	public void setBalloonColor(ColorsAmCharts balloonColor){
		amGraph.setFeature("balloonColor", balloonColor.toString());
	}
	
	public Object getBalloonFunction(){
		return amGraph.getFeature("balloonFunction");
	}
	
	public void setBalloonFunction(String balloonFunction){
		amGraph.setFeature("balloonFunction", balloonFunction);
	}
	
	public Object getBullet(){
		return amGraph.getFeature("bullet");
	}
	
	public void setBullet(Bullet bullet){
		amGraph.setFeature("bullet", bullet.toString());
	}
	
	public Object getBulletAlpha(){
		return amGraph.getFeature("bulletAlpha");
	}
	
	public void setBulletAlpha(Number bulletAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(bulletAlpha, 0, 1)){
			amGraph.setFeature("bulletAlpha", bulletAlpha);
		}
	}
	
	public Object getBulletBorderAlpha(){
		return amGraph.getFeature("bulletBorderAlpha");
	}
	
	public void setBulletBorderAlpha(Number bulletBorderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(bulletBorderAlpha, 0, 1)){
			amGraph.setFeature("bulletBorderAlpha", bulletBorderAlpha);
		}
	}
	
	public Object getBulletBordeColor(){
		return amGraph.getFeature("bulletBorderColor");
	}
	
	public void setBulletBorderColor(ColorsAmCharts bulletBorderColor){
		amGraph.setFeature("bulletBorderColor", bulletBorderColor.toString());
	}
	
	public Object getBulletBorderThickness(){
		return amGraph.getFeature("bulletBorderThickness");
	}
	
	public void setBulletBorderThickness(Number bulletBorderThickness) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(bulletBorderThickness, 0, 5)){
			amGraph.setFeature("bulletBorderThickness", bulletBorderThickness);
		}
	}
	
	public Object getBulletColor(){
		return amGraph.getFeature("bulletColor");
	}
	
	public void setBulletColor(ColorsAmCharts bulletColor){
		amGraph.setFeature("bulletColor", bulletColor.toString());
	}
	
	public Object getBulletField(){
		return amGraph.getFeature("bulletField");
	}
	
	public void setBulletField(String bulletField){
		amGraph.setFeature("bulletField", bulletField);
	}
	
	public Object getBulletOffset(){
		return amGraph.getFeature("bulletOffset");
	}
	
	public void setBulletOffset(Number bulletOffset) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(bulletOffset, 0, 10)){
			amGraph.setFeature("bulletOffset", bulletOffset);
		}
	}
	
	public Object getBulletSize(){
		return amGraph.getFeature("bulletSize");
	}
	
	public void setBulletSize(Number bulletSize) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(bulletSize, 5, 36)){
			amGraph.setFeature("bulletSize", bulletSize);
		}
	}
	
	public Object getBulletSizeField(){
		return amGraph.getFeature("bulletSizeField");
	}
	
	public void setBulletSizeField(String bulletSizeField){
		amGraph.setFeature("bulletSizeField", bulletSizeField);
	}
	
	public Object getCloseField(){
		return amGraph.getFeature("closeField");
	}
	
	public void setCloseField(String closeField){
		amGraph.setFeature("closeField", closeField);
	}
	
	public Object getColor(){
		return amGraph.getFeature("color");
	}
	
	public void setColor(ColorsAmCharts color){
		amGraph.setFeature("color", color.toString());
	}
	
	public Object getColorField(){
		return amGraph.getFeature("colorField");
	}
	
	public void setColorField(String colorField){
		amGraph.setFeature("colorField", colorField);
	}
	
	public Object getCursorBulletAlpha(){
		return amGraph.getFeature("cursorBulletAlpha");
	}
	
	public void setCursorBulletAlpha(Number cursorBulletAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(cursorBulletAlpha, 0, 1)){
			amGraph.setFeature("cursorBulletAlpha", cursorBulletAlpha);
		}
	}
	//path to image custom bullet
	public Object getCustomBullet(){
		return amGraph.getFeature("customBullet");
	}
	//FALTA VALIDAR PATH
	public void setCustomBullet(String customBullet){
		amGraph.setFeature("customBullet", customBullet);
	}
	
	public Object getCustomBulletField(){
		return amGraph.getFeature("customBulletField");
	}
	
	public void setCustomBulletField(String customBulletField){
		amGraph.setFeature("customBulletField", customBulletField);
	}
	
	public Object getCustomMarker(){
		return amGraph.getFeature("customMarker");
	}
	
	public void setCustomMarker(String customMarker){
		amGraph.setFeature("customMarker", customMarker);
	}
	
	public Object getDateFormat(){
		return amGraph.getFeature("dateFormat");
	}
	
	//escogido de DateFormatConstant, filtrar a nivel interfaz, 
	// si se usa sin interfaz propia o sin ninguna interfaz no se realiza ningún cambio
	public void setDateFormat(String dateFormat){
		if(StringValidator.checkDateFormat(dateFormat)){
			amGraph.setFeature("dateFormat", dateFormat);
		}
	}
	
	public Object getDescriptionField(){
		return amGraph.getFeature("descriptionField");
	}
	
	public void setDescriptionField(String descriptionField){
		amGraph.setFeature("descriptionField", descriptionField);
	}
	
	public Object getErrorField(){
		return amGraph.getFeature("errorField");
	}
	
	public void setErrorField(String errorField){
		amGraph.setFeature("errorField", errorField);
	}
	
	public Object getFillAlphas(){
		return amGraph.getFeature("fillAlphas");
	}
	
	public void setFillAlphas(Number fillAlphas) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(fillAlphas, 0, 1)){
			amGraph.setFeature("fillAlphas",fillAlphas);
		}
	}
	
	public Object getFillToGraph(){
		return amGraph.getFeature("fillToGraph");
	}
	
	//debe ser el id de otro graph
	public void setFillToGraph(String fillToGraph){
		if(amchart.existGraph(fillToGraph)){
			amGraph.setFeature("fillToGraph", fillToGraph);
		}
	}
	
	public Object getFontSize(){
		return amGraph.getFeature("fontSize");
	}
	
	public void setFontSize(Number fontSize) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(fontSize, 10, 36)){
			amGraph.setFeature("fontSize", fontSize);
		}
	}
	
	public Object getGapPeriod(){
		return amGraph.getFeature("gapPeriod");
	}
	
	public void setGapPeriod(Number gapPeriod) throws FloatException{
		if(NumberValidator.floatValidator(gapPeriod)){
			amGraph.setFeature("gapPeriod", gapPeriod);
		}
	}
	
	public Object getGradientOrientation(){
		return amGraph.getFeature("gradientOrientation");
	}
	
	public void setGradientOrientation(Orientation gradientOrientation){
		amGraph.setFeature("gradientOrientation", gradientOrientation.toString());
	}
	
	@JsonProperty(value="hidden")
	public Object isHidden(){
		return amGraph.getFeature("hidden");
	}
	
	public void setHidden(Boolean hidden){
		amGraph.setFeature("hidden", hidden);
	}
	
	public Object getHideBulletsCount(){
		return amGraph.getFeature("hideBulletsCount");
	}
	
	public void setHideBulletsCount(Number hideBulletsCount) throws IntegerException{
		if(NumberValidator.integerValidator(hideBulletsCount)){
			amGraph.setFeature("hideBulletsCount", hideBulletsCount);
		}
	}
	
	@JsonProperty(value="includeInMinMax")
	public Object isIncludeInMinMax(){
		return amGraph.getFeature("includeInMinMax");
	}
	
	public void setIncludeInMinMax(Boolean includeInMinMax){
		amGraph.setFeature("includeInMinMax", includeInMinMax);
	}
	
	public Object getLabelAnchor(){
		return amGraph.getFeature("labelAnchor");
	}
	
	public void setLabelAnchor(LabelAnchor labelAnchor){
		amGraph.setFeature("labelAnchor", labelAnchor.toString());
	}
	
	public Object getLabelColorField(){
		return amGraph.getFeature("labelColorField");
	}
	
	public void setLabelColorField(String labelColorField){
		amGraph.setFeature("labelColorField", labelColorField);
	}
	
	public Object getLabelFunction(){
		return amGraph.getFeature("labelFunction");
	}
	
	public void setLabelFunction(String labelFunction){
		amGraph.setFeature("labelFunction", labelFunction);
	}
	
	public Object getLabelOffset(){
		return amGraph.getFeature("labelOffset");
	}
	
	public void setLabelOffset(Number labelOffset) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(labelOffset, 0, 10)){
			amGraph.setFeature("labelOffset", labelOffset);
		}
	}
	
	public Object getLabelPosition(){
		return amGraph.getFeature("labelPosition");
	}
	
	public void setLabelPosition(LabelPosition labelPosition){
		amGraph.setFeature("labelPosition", labelPosition.toString());
	}
	
	public Object getLabelRotation(){
		return amGraph.getFeature("labelRotation");
	}
	
	public void setLabelRotation(Number labelRotation) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(labelRotation, 0, 360)){
			amGraph.setFeature("labelRotation", labelRotation);
		}
	}
	
	public Object getLabelText(){
		return amGraph.getFeature("labelText");
	}
	
	public void setLabelText(TagsText labelText){
		amGraph.setFeature("labelText", labelText.toString());
	}
	
	public Object getLegendAlpha(){
		return amGraph.getFeature("legendAlpha");
	}
	
	public void setLegendAlpha(Number legendAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(legendAlpha, 0, 1)){
			amGraph.setFeature("legendAlpha", legendAlpha);
		}
	}
	
	public Object getLegendColor(){
		return amGraph.getFeature("legendColor");
	}
	
	public void setLegendColor(ColorsAmCharts legendColor){
		amGraph.setFeature("legendColor", legendColor.toString());
	}
	
	public Object getLegendPeriodValueText(){
		return amGraph.getFeature("legendPeriodValueText");
	}
	
	public void setLegendPeriodValueText(LegendPeriodValueText legendPeriodValueText){
		amGraph.setFeature("legendPeriodValueText", legendPeriodValueText.toString());
	}
	
	public Object getLegendValueText(){
		return amGraph.getFeature("legendValueText");
	}
	
	public void setLegendValueText(TagsText legendValueText){
		amGraph.setFeature("legendValueText", legendValueText.toString());
	}
	
	public Object getLineAlpha(){
		return amGraph.getFeature("lineAlpha");
	}
	
	public void setLineAlpha(Number lineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(lineAlpha, 0, 1)){
			amGraph.setFeature("lineAlpha", lineAlpha);
		}
	}
	
	public Object getMakerType(){
		return amGraph.getFeature("markerType");
	}
	
	public void setMarkerType(MarkerType markerType){
		amGraph.setFeature("markerType", markerType.toString());
	}
	
	public Object getMinDistance(){
		return amGraph.getFeature("minDistance");
	}
	
	public void setMinDistance(Number minDistance) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(minDistance, 0, 100)){
			amGraph.setFeature("minDistance", minDistance);
		}
	}
	
	public Object getNegativeBase(){
		return amGraph.getFeature("negativeBase");
	}
	
	public void setNegativeBase(Number negativeBase) throws IntegerException{
		if(NumberValidator.integerValidator(negativeBase)){
			amGraph.setFeature("negativeBase", negativeBase);
		}
	}
	
	public Object getNegativeFillAlphas(){
		return amGraph.getFeature("negativeFillAlphas");
	}
	
	public void setNegativeFillAlphas(Number negativeFillAlhas) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(negativeFillAlhas, 0, 1)){
			amGraph.setFeature("negativeFillAlhas", negativeFillAlhas);
		}
	}
	
	public Object getNegativeFillColors(){
		return amGraph.getFeature("negativeFillColors");
	}
	
	public void setNegativeFillColors(ColorsAmCharts negativeFillColors){
		amGraph.setFeature("negativeFillColors", negativeFillColors.toString());
	}
	
	//pattern
	
	//patternField
	
	public Object getPrecision(){
		return amGraph.getFeature("precision");
	}
	
	public void setPrecision(Number precision) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(precision, -1, 2)){
			amGraph.setFeature("precision", precision);
		}
	}
	
	@JsonProperty(value="proCandleSticks")
	public Object isProCandleSticks(){
		return amGraph.getFeature("proCandleSticks");
	}
	
	public void setProCandleSticks(Boolean proCandleSticks){
		amGraph.setFeature("proCandleSticks", proCandleSticks);
	}
	
	@JsonProperty(value="showAllValueLabels")
	public Object isSwowAllValueLabels(){
		return amGraph.getFeature("showAllValueLabels");
	}
	
	public void setShowAllValueLabels(Boolean showAllValueLabels){
		amGraph.setFeature("showAllValueLabels", showAllValueLabels);
	}
	
	@JsonProperty(value="showBalloon")
	public Object isShowBalloon(){
		return amGraph.getFeature("showBalloon");
	}
	
	public void setShowBalloon(Boolean showBalloon){
		amGraph.setFeature("showBalloon", showBalloon);
	}
	
	@JsonProperty(value="showHandOnHover")
	public Object isShowHandOnHover(){
		return amGraph.getFeature("showHandOnHover");
	}
	
	public void setShowHandOnHover(Boolean showHandOnHover){
		amGraph.setFeature("showHandOnHover", showHandOnHover);
	}
	
	@JsonProperty(value="showOnAxis")
	public Object isShowOnAxis(){
		return amGraph.getFeature("showOnAxis");
	}
	
	public void setShowOnAxis(Boolean showOnAxis){
		amGraph.setFeature("showOnAxis", showOnAxis);
	}
	
	@JsonProperty(value="stackable")
	public Object isStackable(){
		return amGraph.getFeature("stackable");
	}
	
	public void setStackable(Boolean stackable){
		amGraph.setFeature("stackable", stackable);
	}
	
	@JsonProperty(value="switchable")
	public Object isSwitchable(){
		return amGraph.getFeature("switchable");
	}
	
	public void setSwitchable(Boolean switchable){
		amGraph.setFeature("switchable", switchable);
	}
	
	public Object getTitle(){
		return amGraph.getFeature("title");
	}
	
	public void setTitle(String title) {
		amGraph.setFeature("title", title);
	}
	
	public Object getType(){
		return amGraph.getFeature("type");
	}
	
	public void setType(GraphType type){
		amGraph.setFeature("type", type.toString());
	}
	
	public Object getUrlField(){
		return amGraph.getFeature("urlField");
	}
	
	public void setUrlField(String urlField){
		amGraph.setFeature("urlField", urlField);
	}
	
	public Object getUrlTarget(){
		return amGraph.getFeature("urlTarget");
	}
	
	public void setUrlTarget(UrlTarget urlTarget){
		amGraph.setFeature("urlTarget", urlTarget.toString());
	}
	
	public Object getValueAxis(){
		return amGraph.getFeature("valueAxis");
	}
	
	public void setValueAxis(String valueAxis){
		if(amchart.existValueAxis(valueAxis)){
			amGraph.setFeature("valueAxis", valueAxis);
		}
	}
	
	public Object getValueField(){
		return amGraph.getFeature("valueField");
	}
	
	public void setValueField(String valueField){
		amGraph.setFeature("valueField", valueField);
	}
	
	@JsonProperty(value="visibleInLegend")
	public Object isVisibleInLegend(){
		return amGraph.getFeature("visibleInLegend");
	}
	
	public void setVisibleInLegend(Boolean visibleInLegend){
		amGraph.setFeature("visibleInLegend", visibleInLegend);
	}
	
}
