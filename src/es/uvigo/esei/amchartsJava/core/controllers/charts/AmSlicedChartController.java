package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmSlicedChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
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
	implements IAmSlicedChartController<F> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7757083028057374311L;

	protected AmSlicedChartController(F chart) {
		super(chart);
	}
	
	public Double getAlpha(){
		Object alpha = amchart.getFeature("alpha");
		
		return alpha != null ? ((Number)alpha).doubleValue() : null;
	}
	
	public void setAlpha(Number alpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(alpha, 0, 1)){
			amchart.setFeature("alpha", alpha);
		}
	}
	
	public String getAlphaField(){
		return (String) amchart.getFeature("alphaField");
	}
	
	public void setAlphaField(String alphaField){
		amchart.setFeature("alphaField", alphaField);
		amchart.addField("alphaField", alphaField);
	}
	
	public String getBaseColor(){
		return (String) amchart.getFeature("baseColor");
	}
	
	public void setBaseColor(String baseColor) throws ColorException{
		if(ColorValidator.checkFormatColor(baseColor)){
			amchart.setFeature("baseColor", baseColor);
		}
	}
	
	public String getClassNameField(){
		return (String) amchart.getFeature("classNameField");
	}
	
	public void setClassNameField(String classNameField){
		amchart.setFeature("classNameField", classNameField);
		amchart.addField("classNameField", classNameField);
	}
	
	public String getColorField(){
		return (String) amchart.getFeature("colorField");
	}
	
	public void setColorField(String colorField){
		amchart.setFeature("colorField", colorField);
		amchart.addField("colorField", colorField);
	}
	
	public List<String> getColors(){
		return amchart.getColors();
	}
	
	public void addColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){	
			amchart.addColor(color);
		}
	}
	
	public void changeColorsDefault(String... newColors) throws ColorException{
		if(ColorValidator.checkFormatColors(newColors)){
			amchart.changeColorsDefault(newColors);
		}
	}
	
	public String getDescriptionField(){
		return (String) amchart.getFeature("descriptionField");
	}
	
	public void setDescriptionField(String descriptionField){
		amchart.setFeature("descriptionField", descriptionField);
		amchart.addField("descriptionField", descriptionField);
	}
	
	public List<Number> getGradientRatio(){
		return amchart.getGradientRatio();
	}
	
	public void setGradientRatio(Number... gradientRatio){
		amchart.setGradientRatio(gradientRatio);
	}
	
	public Double getGroupedAlpha(){
		Object groupedAlpha = amchart.getFeature("groupedAlpha");
		
		return groupedAlpha != null ? ((Number)groupedAlpha).doubleValue() : null;
	}
	
	public void setGroupedAlpha(Number groupedAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(groupedAlpha, 0, 1)){
			amchart.setFeature("groupedAlpha", groupedAlpha);
		}
	}
	
	public String getGroupedColor(){
		return (String) amchart.getFeature("groupedColor");
	}
	
	public void setGroupedColor(String groupedColor) throws ColorException{
		if(ColorValidator.checkFormatColor(groupedColor)){
			amchart.setFeature("groupedColor", groupedColor);
		}
	}
	
	public String getGroupedDescription(){
		return (String) amchart.getFeature("groupedDescription");
	}
	
	public void setGroupedDescription(String groupedDescription){
		amchart.setFeature("groupedDescription", groupedDescription);
	}
	
	@JsonProperty(value="groupedPulled")
	public Boolean isGroupedPulled(){
		return (Boolean) amchart.getFeature("groupedPulled");
	}
	
	public void setGroupedPulled(Boolean groupedPulled){
		amchart.setFeature("groupedPulled", groupedPulled);
	}
	
	public String getGroupedTitle(){
		return (String) amchart.getFeature("groupedTitle");
	}
	
	public void setGroupedTitle(String groupedTitle){
		amchart.setFeature("groupedTitle", groupedTitle);
	}
	
	public Integer getGroupPercent(){
		Object groupPercent = amchart.getFeature("groupPercent");
		
		return groupPercent != null ? ((Number)groupPercent).intValue() : null;
	}
	
	public void setGroupPercent(Number groupPercent) throws IntegerException{
		if(NumberValidator.integerValidator(groupPercent)){
			amchart.setFeature("groupPercent", groupPercent);
		}
	}
	
	public Integer getHideLabelsPercent(){
		Object hideLabelsPercent = amchart.getFeature("hideLabelsPercent");
		
		return hideLabelsPercent != null ? ((Number)hideLabelsPercent).intValue() : null;
	}
	
	public void setHideLabelsPercent(Number hideLabelsPercent) throws IntegerException{
		if(NumberValidator.integerValidator(hideLabelsPercent)){
			amchart.setFeature("hideLabelsPercent", hideLabelsPercent);
		}
	}
	
	public Double getHoverAlpha(){
		Object hoverAlpha = amchart.getFeature("hoverAlpha");
		
		return hoverAlpha != null ? ((Number)hoverAlpha).doubleValue() : null;
	}
	
	public void setHoverAlpha(Number hoverAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(hoverAlpha, 0, 1)){
			amchart.setFeature("hoverAlpha", hoverAlpha);
		}
	}
	
	public String getLabelFunction(){
		return (String) amchart.getFeature("labelFunction");
	}
	
	public void setLabelFunction(String labelFunction){
		amchart.setFeature("labelFunction", labelFunction);
	}
	
	@JsonProperty(value="labelsEnabled")
	public Boolean isLabelsEnabled(){
		return (Boolean) amchart.getFeature("labelsEnabled");
	}
	
	public void setLabelsEnabled(Boolean labelsEnabled){
		amchart.setFeature("labelsEnabled", labelsEnabled);
	}
	
	public Double getLabelTickAlpha(){
		Object labelTickAlpha = amchart.getFeature("labelTickAlpha");
		
		return labelTickAlpha != null ? ((Number)labelTickAlpha).doubleValue() : null;
	}
	
	public void setLabelTickAlpha(Number labelTickAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(labelTickAlpha, 0, 1)){
			amchart.setFeature("labelTickAlpha", labelTickAlpha);
		}
	}
	
	public String getLabelTickColor(){
		return (String) amchart.getFeature("labelTickColor");
	}
	
	public void setLabelTickColor(String labelTickColor) throws ColorException{
		if(ColorValidator.checkFormatColor(labelTickColor)){
			amchart.setFeature("labelTickColor", labelTickColor);
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
	
	public Integer getMarginTop(){
		Object marginTop = amchart.getFeature("marginTop");
		
		return marginTop != null ? ((Number)marginTop).intValue() : null;
	}
	
	public void setMarginTop(Number marginTop) throws IntegerException{
		if(NumberValidator.integerValidator(marginTop)){
			amchart.setFeature("marginTop", marginTop);
		}
	}
	
	public Integer getMaxLabelWidth(){
		Object maxLabelWidth = amchart.getFeature("maxLabelWidth");
		
		return maxLabelWidth != null ? ((Number)maxLabelWidth).intValue() : null;
	}
	
	public void setMaxLabelWidth(Number maxLabelWidth) throws IntegerException{
		if(NumberValidator.integerValidator(maxLabelWidth)){
			amchart.setFeature("maxLabelWidth", maxLabelWidth);
		}
	}
	
	public Double getOutlineAlpha(){
		Object outlineAlpha = amchart.getFeature("outlineAlpha");
		
		return outlineAlpha != null ? ((Number)outlineAlpha).doubleValue() : null;
	}
	
	public void setOutlineAlpha(Number outlineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(outlineAlpha, 0, 1)){
			amchart.setFeature("outlineAlpha", outlineAlpha);
		}
	}
	
	public String getOutlineColor(){
		return (String) amchart.getFeature("outlineColor");
	}
	
	public void setOutlineColor(String outlineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(outlineColor)){
			amchart.setFeature("outlineColor", outlineColor);
		}
	}
	
	public Integer getOutlineThickness(){
		Object outlineThickness = amchart.getFeature("outlineThickness");
		
		return outlineThickness != null ? ((Number)outlineThickness).intValue() : null;
	}
	
	public void setOutlineThickness(Number outlineThickness) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(outlineThickness, 0, 16)){
				amchart.setFeature("outlineThickness", outlineThickness);
			}
		}else{
			amchart.setFeature("outlineThickness", outlineThickness);
		}
	}
	
	public String getPatternField(){
		return (String) amchart.getFeature("patternField");
	}
	
	public void setPatternField(String patternField){
		amchart.setFeature("patternField", patternField);
		amchart.addField("patternField", patternField);
	}
	
	public String getPulledField(){
		return (String) amchart.getFeature("pulledField");
	}
	
	public void setPulledField(String pulledField){
		amchart.setFeature("pulledField", pulledField);
		amchart.addField("pulledField", pulledField);
	}
	
	public Integer getPullOutDuration(){
		Object pullOutDuration = amchart.getFeature("pullOutDuration");
		
		return pullOutDuration != null ? ((Number)pullOutDuration).intValue() : null;
	}
	
	public void setPullOutDuration(Number pullOutDuration) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(pullOutDuration, 0, 5)){
				amchart.setFeature("pullOutDuration", pullOutDuration);
			}
		}else{
			amchart.setFeature("pullOutDuration", pullOutDuration);
		}
	}
	
	public String getPullOutEffect(){
		return (String) amchart.getFeature("pullOutEffect");
	}
	
	public void setPullOutEffect(Effect pullOutEffect){
		amchart.setFeature("pullOutEffect", pullOutEffect.toString());
	}
	
	@JsonProperty(value="pullOutOnlyOne")
	public Boolean isPullOutOnlyOne(){
		return (Boolean) amchart.getFeature("pullOutOnlyOne");
	}
	
	public void setPullOutOnlyOne(Boolean pullOutOnlyOne){
		amchart.setFeature("pullOutOnlyOne", pullOutOnlyOne);
	}
	
	@JsonProperty(value="sequencedAnimation")
	public Boolean isSequencedAnimation(){
		return (Boolean) amchart.getFeature("sequencedAnimation");
	}
	
	public void setSequencedAnimation(Boolean sequencedAnimation){
		amchart.setFeature("sequencedAnimation", sequencedAnimation);
	}
	
	@JsonProperty(value="showZeroSlices")
	public Boolean isShowZeroSlices(){
		return (Boolean) amchart.getFeature("showZeroSlices");
	}
	
	public void setShowZeroSlices(Boolean showZeroSlices){
		amchart.setFeature("showZeroSlices", showZeroSlices);
	}
	
	public Double getStartAlpha(){
		Object startAlpha = amchart.getFeature("startAlpha");
		
		return startAlpha != null ? ((Number)startAlpha).doubleValue() : null;
	}
	
	public void setStartAlpha(Number startAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(startAlpha, 0, 1)){
			amchart.setFeature("startAlpha", startAlpha);
		}
	}
	
	public Integer getStartDuration(){
		Object startDuration = amchart.getFeature("startDuration");
		
		return startDuration != null ? ((Number)startDuration).intValue() : null;
	}
	
	public void setStartDuration(Number startDuration) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(startDuration, 1, 5)){
				amchart.setFeature("startDuration", startDuration);
			}
		}else{
			amchart.setFeature("startDuration", startDuration);
		}
	}
	
	public String getStartEffect(){
		return (String) amchart.getFeature("startEffect");
	}
	
	public void setStartEffect(Effect startEffect){
		amchart.setFeature("startEffect", startEffect.toString());
	}
	
	public String getTitleField(){
		return (String) amchart.getFeature("titleField");
	}
	
	public void setTitleField(String titleField){
		amchart.setFeature("titleField", titleField);
		amchart.addField("titleField", titleField);
	}
	
	public String getUrlField(){
		return (String) amchart.getFeature("urlField");
	}
	
	public void setUrlField(String urlField){
		amchart.setFeature("urlField", urlField);
		amchart.addField("urlField", urlField);
	}
	
	public String getUrlTarget(){
		return (String) amchart.getFeature("urlTarget");
	}
	
	public void setUrlTarget(UrlTarget urlTarget){
		amchart.setFeature("urlTarget", urlTarget.toString());
	}
	
	public String getValueField(){
		return (String) amchart.getFeature("valueField");
	}
	
	public void setValueField(String valueField){
		amchart.setFeature("valueField", valueField);
		amchart.addField("valueField", valueField);
	}
	
	public String getVisibleInLegendField(){
		return (String) amchart.getFeature("visibleInLegendField");
	}
	
	public void setVisibleInLegendField(String visibleInLegendField){
		amchart.setFeature("visibleInLegendField", visibleInLegendField);
		amchart.addField("visibleInLegendField", visibleInLegendField);
	}
	
	//usado solo para deserializar json
	@SuppressWarnings("unused")
	private void setColors(List<String> colors){
		amchart.setColors(colors);
	}

}
