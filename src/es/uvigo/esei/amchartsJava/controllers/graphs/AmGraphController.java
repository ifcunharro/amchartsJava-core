package es.uvigo.esei.amchartsJava.controllers.graphs;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.constants.BulletConstant.Bullet;
import es.uvigo.esei.amchartsJava.constants.DateFormatConstant;
import es.uvigo.esei.amchartsJava.constants.GradientOrientationConstant.GradientOrientation;
import es.uvigo.esei.amchartsJava.constants.LabelAnchorConstant.LabelAnchor;
import es.uvigo.esei.amchartsJava.constants.LabelPositionConstant.LabelPosition;
import es.uvigo.esei.amchartsJava.constants.TagsTextConstant.TagsText;
import es.uvigo.esei.amchartsJava.constants.LegendPeriodValueTextConstant.LegendPeriodValueText;
import es.uvigo.esei.amchartsJava.constants.MarkerTypeConstant.MarkerType;
import es.uvigo.esei.amchartsJava.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.exceptions.FloatException;
import es.uvigo.esei.amchartsJava.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.model.AmGraph;
import es.uvigo.esei.amchartsJava.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.validators.StringValidator;

@JsonInclude(Include.NON_NULL)
public abstract class AmGraphController<E extends AmGraph> implements Observer {
	
	protected E amGraph;
	
	public AmGraphController(E graph){
		amGraph = graph;
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setId("AmGraph-"+arg.toString());
		this.setTitle("AmGraph-"+arg.toString());
		
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
	
	@JsonProperty(value="behindColumns")
	public Object isBehindColumns(){
		return amGraph.getFeature("behindColumns");
	}
	
	public void setBehindColumns(Boolean behindColumns){
		amGraph.setFeature("behindColumns", behindColumns);
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
	
	public void setBulletBorderThickness(Number bulletBorderThickness) throws IntegerException{
		if(NumberValidator.integerValidator(bulletBorderThickness)){
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
	
	public void setBulletOffset(Number bulletOffset) throws IntegerException{
		if(NumberValidator.integerValidator(bulletOffset)){
			amGraph.setFeature("bulletOffset", bulletOffset);
		}
	}
	
	public Object getBulletSize(){
		return amGraph.getFeature("bulletSize");
	}
	
	public void setBulletSize(Number bulletSize) throws IntegerException{
		if(NumberValidator.integerValidator(bulletSize)){
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
	
	@JsonProperty(value="clustered")
	public Object isClustered(){
		return amGraph.getFeature("clustered");
	}
	
	public void setClustered(Boolean clustered){
		amGraph.setFeature("clustered", clustered);
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
	
	public Object getColumnWidth(){
		return amGraph.getFeature("columnWidth");
	}
	
	public void setColumnWidth(Number columnWidth) throws IntegerException{
		if(NumberValidator.integerValidator(columnWidth)){
			amGraph.setFeature("columnWidth", columnWidth);
		}
	}
	
	@JsonProperty(value="connect")
	public Object isConnect(){
		return amGraph.getFeature("connect");
	}
	
	public void setConnect(Boolean connect){
		amGraph.setFeature("connect", connect);
	}
	
	public Object getCornerRadiusTop(){
		return amGraph.getFeature("cornerRadiusTop");
	}
	
	public void setCornerRadiusTop(String cornerRadiusTop) throws CoordException{
		if(StringValidator.pixelOrPercent(cornerRadiusTop)){
			amGraph.setFeature("cornerRadiusTop", cornerRadiusTop);
		}
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
	
	public Object getDashLength(){
		return amGraph.getFeature("dashLength");
	}
	
	public void setDashLength(Number dashLength){
		amGraph.setFeature("dashLength", dashLength);
	}
	
	public Object getDashLengthField(){
		return amGraph.getFeature("dashLengthField");
	}
	
	public void setDashLengthField(String dashLengthField){
		amGraph.setFeature("dashLengthField", dashLengthField);
	}
	
	public Object getDateFormat(){
		return amGraph.getFeature("dateFormat");
	}
	
	//escogido de DateFormatConstant, filtrar a nivel interfaz, 
	// si se usa sin interfaz propia o sin ninguna interfaz no se realiza ningún cambio
	public void setDateFormat(String dateFormat){
		if(Arrays.asList(DateFormatConstant.getDateFormat()).contains(dateFormat)){
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
	
	public Object getFillColors(){
		return amGraph.getFeature("fillColors");
	}
	
	public void setFillColors(ColorsAmCharts fillColors){
		amGraph.setFeature("fillColors", fillColors.toString());
	}
	
	public Object getFillColorsField(){
		return amGraph.getFeature("fillColorsField");
	}
	
	public void setFillColorsField(String fillColorsField){
		amGraph.setFeature("fillColorsField", fillColorsField);
	}
	
	public Object getFillToGraph(){
		return amGraph.getFeature("fillToGraph");
	}
	
	//debe ser el id de otro graph
	public void setFillToGraph(String fillToGraph){
		if(AmCoordinateChart.existGraph(fillToGraph)){
			amGraph.setFeature("fillToGraph", fillToGraph);
		}
	}
	
	public Object getFixedColumnWidth(){
		return amGraph.getFeature("fixedColumnWidth");
	}
	
	public void setFixedColumnWidth(Number fixedColumnWidth) throws IntegerException{
		if(NumberValidator.integerValidator(fixedColumnWidth)){
			amGraph.setFeature("fixedColumnWidth", fixedColumnWidth);
		}
	}
	
	public Object getFontSize(){
		return amGraph.getFeature("fontSize");
	}
	
	public void setFontSize(Number fontSize) throws IntegerException{
		if(NumberValidator.integerValidator(fontSize)){
			amGraph.setFeature("fontSize", fontSize);
		}
	}
	
	public Object getGapField(String gapField){
		return amGraph.getFeature("gapField");
	}
	
	public void setGapField(String gapField){
		amGraph.setFeature("gapField", gapField);
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
	
	public void setGradientOrientation(GradientOrientation gradientOrientation){
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
	
	public Object getHighField(){
		return amGraph.getFeature("highField");
	}
	
	public void setHighField(String highField){
		amGraph.setFeature("highField", highField);
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
	
	public void setLabelOffset(Number labelOffset) throws IntegerException{
		if(NumberValidator.integerValidator(labelOffset)){
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
	
	public Object getLineColor(){
		return amGraph.getFeature("lineColor");
	}
	
	public void setLineColor(ColorsAmCharts lineColor){
		amGraph.setFeature("lineColor", lineColor.toString());
	}
	
	public Object getLineThickness(){
		return amGraph.getFeature("lineThickness");
	}
	
	public void setLineThickness(Number lineThickness) throws IntegerException{
		if(NumberValidator.integerValidator(lineThickness)){
			amGraph.setFeature("lineThickness", lineThickness);
		}
	}
	
	public Object getLowField(){
		return amGraph.getFeature("lowField");
	}
	
	public void setLowField(String lowField){
		amGraph.setFeature("lowField", lowField);
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
	
	public Object getNegativeLineAlpha(){
		return amGraph.getFeature("negativeLineAlpha");
	}
	
	public void setNegativeLineAlpha(Number negativeLineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(negativeLineAlpha, 0, 1)){
			amGraph.setFeature("negativeLineAlpha", negativeLineAlpha);
		}
	}
	
	public Object getNegativeLineColor(){
		return amGraph.getFeature("negativeLineColor");
	}
	
	public void setNegativeLineColor(ColorsAmCharts negativeLineColor){
		amGraph.setFeature("negativeLineColor", negativeLineColor.toString());
	}
	
	@JsonProperty(value="newStack")
	public Object isNewStack(){
		return amGraph.getFeature("newStack");
	}
	
	public void setNewStack(Boolean newStack){
		amGraph.setFeature("newStack", newStack);
	}
	
	@JsonProperty(value="noStepRisers")
	public Object isNoStepRisers(){
		return amGraph.getFeature("noStepRisers");
	}
	
	public void setNoStepRisers(Boolean noStepRisers){
		amGraph.setFeature("noStepRisers", noStepRisers);
	}
	
	public Object getOpenField(){
		return amGraph.getFeature("openField");
	}
	
	public void setOpenField(String openField){
		amGraph.setFeature("openField", openField);
	}
	
	//pattern
	
	//patternField
	
	public Object getPeriodSpan(){
		return amGraph.getFeature("periodSpan");
	}
	
	public void setPeriodSpan(Number periodSpan) throws IntegerException{
		if(NumberValidator.integerValidator(periodSpan)){
			amGraph.setFeature("periodSpan", periodSpan);
		}
	}
	
	public Object getTitle(){
		return amGraph.getFeature("title");
	}
	
	public void setTitle(String title) {
		amGraph.setFeature("title", title);
	}
	
	

}
