package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmSlicedChartController;
import es.uvigo.esei.amchartsJava.core.api.deserializers.IJsonDeserializerColorCharts;
import es.uvigo.esei.amchartsJava.core.constants.EffectConstant.Effect;
import es.uvigo.esei.amchartsJava.core.constants.UrlTargetConstant.UrlTarget;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSlicedChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

@JsonInclude(Include.NON_NULL)
public abstract class AmSlicedChartController<F extends AmSlicedChart> extends AmChartController<F> 
	implements IJsonDeserializerColorCharts, IAmSlicedChartController<F> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7757083028057374311L;

	protected AmSlicedChartController(F chart) {
		super(chart);
	}
	
	public Object getAlpha(){
		return amchart.getFeature("alpha");
	}
	
	public void setAlpha(Number alpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(alpha, 0, 1)){
			amchart.setFeature("alpha", alpha);
		}
	}
	
	public Object getAlphaField(){
		return amchart.getFeature("alphaField");
	}
	
	public void setAlphaField(String alphaField){
		amchart.setFeature("alphaField", alphaField);
	}
	
	public Object getBaseColor(){
		return amchart.getFeature("baseColor");
	}
	
	public void setBaseColor(String baseColor) throws ColorException{
		if(ColorValidator.checkFormatColor(baseColor)){
			amchart.setFeature("baseColor", baseColor);
		}
	}
	
	public Object getClassNameField(){
		return amchart.getFeature("classNameField");
	}
	
	public void setClassNameField(String classNameField){
		amchart.setFeature("classNameField", classNameField);
	}
	
	public Object getColorField(){
		return amchart.getFeature("colorField");
	}
	
	public void setColorField(String colorField){
		amchart.setFeature("colorField", colorField);
	}
	
	public Object getColors(){
		return amchart.getColors();
	}
	
	public void addColor(String color){
		amchart.addColor(color);
	}
	
	public void changeColorsDefault(String... newColors){
		amchart.changeColorsDefault(newColors);
	}
	
	public Object getDescriptionField(){
		return amchart.getFeature("descriptionField");
	}
	
	public void setDescriptionField(String descriptionField){
		amchart.setFeature("descriptionField", descriptionField);
	}
	
	public Object getGradientRatio(){
		return amchart.getGradientRatio();
	}
	
	public void setGradientRatio(Number... gradientRatio){
		amchart.setGradientRatio(gradientRatio);
	}
	
	public Object getGroupedAlpha(){
		return amchart.getFeature("groupedAlpha");
	}
	
	public void setGroupedAlpha(Number groupedAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(groupedAlpha, 0, 1)){
			amchart.setFeature("groupedAlpha", groupedAlpha);
		}
	}
	
	public Object getGroupedColor(){
		return amchart.getFeature("groupedColor");
	}
	
	public void setGroupedColor(String groupedColor) throws ColorException{
		if(ColorValidator.checkFormatColor(groupedColor)){
			amchart.setFeature("groupedColor", groupedColor);
		}
	}
	
	public Object getGroupedDescription(){
		return amchart.getFeature("groupedDescription");
	}
	
	public void setGroupedDescription(String groupedDescription){
		amchart.setFeature("groupedDescription", groupedDescription);
	}
	
	@JsonProperty(value="groupedPulled")
	public Object isGroupedPulled(){
		return amchart.getFeature("groupedPulled");
	}
	
	public void setGroupedPulled(Boolean groupedPulled){
		amchart.setFeature("groupedPulled", groupedPulled);
	}
	
	public Object getGroupedTitle(){
		return amchart.getFeature("groupedTitle");
	}
	
	public void setGroupedTitle(String groupedTitle){
		amchart.setFeature("groupedTitle", groupedTitle);
	}
	
	public Object getGroupPercent(){
		return amchart.getFeature("groupPercent");
	}
	
	public void setGroupPercent(Number groupPercent) throws IntegerException{
		if(NumberValidator.integerValidator(groupPercent)){
			amchart.setFeature("groupPercent", groupPercent);
		}
	}
	
	public Object getHideLabelsPercent(){
		return amchart.getFeature("hideLabelsPercent");
	}
	
	public void setHideLabelsPercent(Number hideLabelsPercent) throws IntegerException{
		if(NumberValidator.integerValidator(hideLabelsPercent)){
			amchart.setFeature("hideLabelsPercent", hideLabelsPercent);
		}
	}
	
	public Object getHoverAlpha(){
		return amchart.getFeature("hoverAlpha");
	}
	
	public void setHoverAlpha(Number hoverAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(hoverAlpha, 0, 1)){
			amchart.setFeature("hoverAlpha", hoverAlpha);
		}
	}
	
	public Object getLabelFunction(){
		return amchart.getFeature("labelFunction");
	}
	
	public void setLabelFunction(String labelFunction){
		amchart.setFeature("labelFunction", labelFunction);
	}
	
	@JsonProperty(value="labelsEnabled")
	public Object getLabelsEnabled(){
		return amchart.getFeature("labelsEnabled");
	}
	
	public void setLabelsEnabled(Boolean labelsEnabled){
		amchart.setFeature("labelsEnabled", labelsEnabled);
	}
	
	public Object getLabelTickAlpha(){
		return amchart.getFeature("labelTickAlpha");
	}
	
	public void setLabelTickAlpha(String labelTickAlpha){
		amchart.setFeature("labelTickAlpha", labelTickAlpha);
	}
	
	public Object labelTickColor(){
		return amchart.getFeature("labelTickColor");
	}
	
	public void setLabelTickColor(String labelTickColor) throws ColorException{
		if(ColorValidator.checkFormatColor(labelTickColor)){
			amchart.setFeature("labelTickColor", labelTickColor);
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
	
	public Object getMarginTop(){
		return amchart.getFeature("marginTop");
	}
	
	public void setMarginTop(Number marginTop) throws IntegerException{
		if(NumberValidator.integerValidator(marginTop)){
			amchart.setFeature("marginTop", marginTop);
		}
	}
	
	public Object getMaxLabelWidth(){
		return amchart.getFeature("maxLabelWidth");
	}
	
	public void setMaxLabelWidth(Number maxLabelWidth) throws IntegerException{
		if(NumberValidator.integerValidator(maxLabelWidth)){
			amchart.setFeature("maxLabelWidth", maxLabelWidth);
		}
	}
	
	public Object getOutlineAlpha(){
		return amchart.getFeature("outlineAlpha");
	}
	
	public void setOutlineAlpha(Number outlineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(outlineAlpha, 0, 1)){
			amchart.setFeature("outlineAlpha", outlineAlpha);
		}
	}
	
	public Object getOutlineColor(){
		return amchart.getFeature("outlineColor");
	}
	
	public void setOutlineColor(String outlineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(outlineColor)){
			amchart.setFeature("outlineColor", outlineColor);
		}
	}
	
	public Object getOutlineThickness(Number outlineThickness){
		return amchart.getFeature("outlineThickness");
	}
	
	public void setOutlineThickness(Number outlineThickness) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(outlineThickness, 0, 16)){
			amchart.setFeature("outlineThickness", outlineThickness);
		}
	}
	
	public Object getPatternField(){
		return amchart.getFeature("patternField");
	}
	
	public void setPatternField(String patternField){
		amchart.setFeature("patternField", patternField);
	}
	
	public Object getPulledField(){
		return amchart.getFeature("pulledField");
	}
	
	public void setPulledField(String pulledField){
		amchart.setFeature("pulledField", pulledField);
	}
	
	public Object getPullOutDuration(){
		return amchart.getFeature("pullOutDuration");
	}
	
	public void setPullOutDuration(Number pullOutDuration) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(pullOutDuration, 0, 5)){
			amchart.setFeature("pullOutDuration", pullOutDuration);
		}
	}
	
	public Object getPullOutEffect(){
		return amchart.getFeature("pullOutEffect");
	}
	
	public void setPullOutEffect(Effect pullOutEffect){
		amchart.setFeature("pullOutEffect", pullOutEffect.toString());
	}
	
	@JsonProperty(value="pullOutOnlyOne")
	public Object isPullOutOnlyOne(){
		return amchart.getFeature("pullOutOnlyOne");
	}
	
	public void setPullOutOnlyOne(Boolean pullOutOnlyOne){
		amchart.setFeature("pullOutOnlyOne", pullOutOnlyOne);
	}
	
	@JsonProperty(value="sequencedAnimation")
	public Object isSequencedAnimation(){
		return amchart.getFeature("sequencedAnimation");
	}
	
	public void setSequencedAnimation(Boolean sequencedAnimation){
		amchart.setFeature("sequencedAnimation", sequencedAnimation);
	}
	
	@JsonProperty(value="showZeroSlices")
	public Object isShowZeroSlices(){
		return amchart.getFeature("showZeroSlices");
	}
	
	public void setShowZeroSlices(Boolean showZeroSlices){
		amchart.setFeature("showZeroSlices", showZeroSlices);
	}
	
	public Object getStartAlpha(){
		return amchart.getFeature("startAlpha");
	}
	
	public void setStartAlpha(Number startAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(startAlpha, 0, 1)){
			amchart.setFeature("startAlpha", startAlpha);
		}
	}
	
	public Object getStartDuration(){
		return amchart.getFeature("startDuration");
	}
	
	public void setStartDuration(Number startDuration) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(startDuration, 1, 5)){
			amchart.setFeature("startDuration", startDuration);
		}
	}
	
	public Object getStartEffect(){
		return amchart.getFeature("startEffect");
	}
	
	public void setStartEffect(Effect startEffect){
		amchart.setFeature("startEffect", startEffect.toString());
	}
	
	public Object getTitleField(){
		return amchart.getFeature("titleField");
	}
	
	public void setTitleField(String titleField){
		amchart.setFeature("titleField", titleField);
	}
	
	public Object getUrlField(){
		return amchart.getFeature("urlField");
	}
	
	public void setUrlField(String urlField){
		amchart.setFeature("urlField", urlField);
	}
	
	public Object getUrlTarget(){
		return amchart.getFeature("urlTarget");
	}
	
	public void setUrlTarget(UrlTarget urlTarget){
		amchart.setFeature("urlTarget", urlTarget.toString());
	}
	
	public Object getValueField(){
		return amchart.getFeature("valueField");
	}
	
	public void setValueField(String valueField){
		amchart.setFeature("valueField", valueField);
	}
	
	public Object getVisibleInLegendField(){
		return amchart.getFeature("visibleInLegendField");
	}
	
	public void setVisibleInLegendField(String visibleInLegendField){
		amchart.setFeature("visibleInLegendField", visibleInLegendField);
	}
	
	//usado solo para deserializar json
	public void setColors(List<String> colors){
		amchart.setColors(colors);
	}

}
