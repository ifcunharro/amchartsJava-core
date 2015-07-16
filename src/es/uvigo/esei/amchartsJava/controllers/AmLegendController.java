package es.uvigo.esei.amchartsJava.controllers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.constants.AlignConstant.Align;
import es.uvigo.esei.amchartsJava.constants.AlignConstant.ValueAlign;
import es.uvigo.esei.amchartsJava.constants.LegendPositionConstant.LegendPosition;
import es.uvigo.esei.amchartsJava.constants.MarkerTypeConstant.MarkerType;
import es.uvigo.esei.amchartsJava.constants.SwitchTypeConstant.SwitchType;
import es.uvigo.esei.amchartsJava.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.model.AmLegend;
import es.uvigo.esei.amchartsJava.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.validators.NumberValidator;

@JsonInclude(Include.NON_NULL)
public class AmLegendController {
	private AmLegend legend;

	{
		legend = new AmLegend();
	}

	@JsonIgnore
	public AmLegend getLegend() {
		return legend;
	}
	
	public Object getAlign(){
		return legend.getFeature("align");
	}
	
	public void setALign(Align align){
		legend.setFeature("align", align.toString());
	}
	
	@JsonProperty(value="autoMargins")
	public Object isAutoMargins(){
		return legend.getFeature("autoMargins");
	}
	
	public void setAutoMargins(Boolean autoMargins){
		legend.setFeature("autoMargins", autoMargins);
	}
	
	public Object getBackgroundAlpha(){
		return legend.getFeature("backgroundAlpha");
	}
	
	public void setBackgroundAlpha(Number backgroundAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(backgroundAlpha, 0, 1)){
			legend.setFeature("backgroundAlpha", backgroundAlpha);
		}
	}
	
	public Object getBackgroundColor(){
		return legend.getFeature("color");
	}
	
	public void setBackgroundColor(String backGroundColor) throws ColorException{
		if(ColorValidator.checkFormatColor(backGroundColor)){
			legend.setFeature("backGroundColor", backGroundColor);
		}
	}
	
	public Object getBorderAlpha(){
		return legend.getFeature("borderAlpha");
	}
	
	public void setBorderAlpha(Number borderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(borderAlpha, 0, 1)){
			legend.setFeature("borderAlpha", borderAlpha);
		}
	}
	
	public Object getBorderColor(){
		return legend.getFeature("borderColor");
	}
	
	public void setBorderColor(String borderColor) throws ColorException{
		if(ColorValidator.checkFormatColor(borderColor)){
			legend.setFeature("borderColor", borderColor);
		}
	}
	
	public Object getBottom(){
		return legend.getFeature("bottom");
	}
	
	public void setBottom(Number bottom) throws IntegerException{
		if(NumberValidator.IntegerValidator(bottom)){
			legend.setFeature("bottom", bottom);
		}
	}
	
	public Object getColor(){
		return legend.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			legend.setFeature("color", color);
		}
	}
	
	public Object getDivId(){
		return legend.getFeature("divId");
	}
	
	public void setDivId(String divId){
		legend.setFeature("divId", divId);
	}
	
	@JsonProperty(value="enabled")
	public Object isEnabled(){
		return legend.getFeature("enabled");
	}
	
	public void setEnabled(Boolean enabled){
		legend.setFeature("enabled", enabled);
	}
	
	@JsonProperty(value="equualWidths")
	public Object isEqualWidths(){
		return legend.getFeature("equalWidths");
	}
	
	public void setEqualWidths(Boolean equalWidths){
		legend.setFeature("equalWidths", equalWidths);
	}
	
	public Object getFontSize(){
		return legend.getFeature("fontSize");
	}
	
	public void setFontSize(Number fontSize) throws IntegerException{
		if(NumberValidator.IntegerValidator(fontSize)){
			legend.setFeature("fontSize", fontSize);
		}
	}
	
	@JsonProperty(value="forceWidth")
	public Object isForceWidth(){
		return legend.getFeature("forceWidth");
	}
	
	public void setForceWidth(Boolean forceWidth){
		legend.setFeature("forceWidth", forceWidth);
	}
	
	public Object getHorizontalGap(){
		return legend.getFeature("horizontalGap");
	}
	
	public void setHorizontalGap(Number horizontalGap) throws IntegerException{
		if(NumberValidator.IntegerValidator(horizontalGap)){
			legend.setFeature("horizontalGap", horizontalGap);
		}
	}
	
	public Object getLabelText(){
		return legend.getFeature("labelText");
	}
	
	//cualquier texto pero si es [[title]] muestra como texto el title del graph
	public void setLabelText(String labelText){
		legend.setFeature("labelText", labelText);
	}
	
	public Object getLabelWidth(){
		return legend.getFeature("labelWidth");
	}
	
	public void setLabelWidth(Number labelWidth) throws IntegerException{
		if(NumberValidator.IntegerValidator(labelWidth)){
			legend.setFeature("labelWidth", labelWidth);
		}
	}
	
	public Object getLeft(){
		return legend.getFeature("left");
	}
	
	public void setLeft(Number left) throws IntegerException{
		if(NumberValidator.IntegerValidator(left)){
			legend.setFeature("left", left);
		}
	}
	
	public Object getMarginBottom(){
		return legend.getFeature("marginBottom");
	}
	
	public void setMarginBottom(Number marginBottom) throws IntegerException{
		if(NumberValidator.IntegerValidator(marginBottom)){
			legend.setFeature("marginBottom", marginBottom);
		}
	}
	
	public Object getMarginLeft(){
		return legend.getFeature("marginLeft");
	}
	
	public void setMarginLeft(Number marginLeft) throws IntegerException{
		if(NumberValidator.IntegerValidator(marginLeft)){
			legend.setFeature("marginLeft", marginLeft);
		}
	}
	
	public Object getMarginRight(){
		return legend.getFeature("marginRight");
	}
	
	public void setMarginRight(Number marginRight) throws IntegerException{
		if(NumberValidator.IntegerValidator(marginRight)){
			legend.setFeature("marginRight", marginRight);
		}
	}
	
	public Object getMarginTop(){
		return legend.getFeature("marginTop");
	}
	
	public void setMarginTop(Number marginTop) throws IntegerException{
		if(NumberValidator.IntegerValidator(marginTop)){
			legend.setFeature("marginTop", marginTop);
		}
	}
	
	public Object getMarkerBorderAlpha(){
		return legend.getFeature("markerBorderAlpha");
	}
	
	public void setMarkerBorderAlpha(Number markerBorderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(markerBorderAlpha, 0, 1)){
			legend.setFeature("markerBorderAlpha", markerBorderAlpha);
		}
	}
	
	public Object getMarkerBorderColor(){
		return legend.getFeature("markerBorderColor");
	}
	
	public void setMarkerBorderColor(String markerBorderColor) throws ColorException{
		if(ColorValidator.checkFormatColor(markerBorderColor)){
			legend.setFeature("markerBorderColor", markerBorderColor);
		}
	}
	
	public Object getMarkerBorderThickness(){
		return legend.getFeature("markerBorderThickness");
	}
	
	public void setMarkerBorderThickness(Number markerBorderThickness) throws IntegerException{
		if(NumberValidator.IntegerValidator(markerBorderThickness)){
			legend.setFeature("markerBorderThickness", markerBorderThickness);
		}
	}
	
	public Object getMarkerDisabledColor(){
		return legend.getFeature("markenDisabledColor");
	}
	
	public void setMarkerDisabledColor(String markerDisabledColor) throws ColorException{
		if(ColorValidator.checkFormatColor(markerDisabledColor)){
			legend.setFeature("markerDisabledColor", markerDisabledColor);
		}
	}
	
	public Object getMarkerLabelGap(){
		return legend.getFeature("markerLabelGap");
	}
	
	public void setMarkerLabelGap(Number markerLabelGap) throws IntegerException{
		if(NumberValidator.IntegerValidator(markerLabelGap)){
			legend.setFeature("markerLabelGap", markerLabelGap);
		}
	}
	
	public Object getMarkerSize(){
		return legend.getFeature("markerSize");
	}
	
	public void setMarkerSize(Number markerSize) throws IntegerException{
		if(NumberValidator.IntegerValidator(markerSize)){
			legend.setFeature("markerSize", markerSize);
		}
	}
	
	public Object getMarkerType(){
		return legend.getFeature("markerType");
	}
	
	public void setMarkerType(MarkerType markerType){
		legend.setFeature("markerType", markerType.toString());
	}
	
	public Object getMaxColumns(){
		return legend.getFeature("maxColumns");
	}
	
	public void setMaxColumns(Number maxColumns) throws IntegerException{
		if(NumberValidator.IntegerValidator(maxColumns)){
			legend.setFeature("maxColumns", maxColumns);
		}
	}
	
	public Object getPeriodValueText(){
		return legend.getFeature("periodValueText");
	}
	
	public void setPeriodValueText(String periodValueText){
		legend.setFeature("periodValueText", periodValueText);
	}
	
	public Object getPosition(){
		return legend.getFeature("position");
	}
	
	public void setPosition(LegendPosition position){
		legend.setFeature("position", position.toString());
	}
	
	@JsonProperty(value="reversedOrder")
	public Object isReversedOrder(){
		return legend.getFeature("reversedOrder");
	}
	
	public void setReversedOrder(Boolean reversedOrder){
		legend.setFeature("reversedOrder", reversedOrder);
	}
	
	public Object getRight(){
		return legend.getFeature("right");
	}
	
	public void setRight(Number right) throws IntegerException{
		if(NumberValidator.IntegerValidator(right)){
			legend.setFeature("right", right);
		}
	}
	
	public Object getRollOverColor(){
		return legend.getFeature("rollOverColor");
	}
	
	public void setRollOverColor(String rollOverColor) throws ColorException{
		if(ColorValidator.checkFormatColor(rollOverColor)){
			legend.setFeature("rollOverColor", rollOverColor);
		}
	}
	
	public Object getRollOverGraphAlpha(){
		return legend.getFeature("rollOverGraphAlpha");
	}
	
	public void setRollOverGraphAlpha(Number rollOverGraphAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(rollOverGraphAlpha, 0, 1)){
			legend.setFeature("rollOverGraphAlpha", rollOverGraphAlpha);
		}
	}
	
	@JsonProperty(value="showEntries")
	public Object isShowEntries(){
		return legend.getFeature("showEntries");
	}
	
	public void setShowEntries(Boolean showEntries){
		legend.setFeature("showEntries", showEntries);
	}
	
	public Object getSpacing(){
		return legend.getFeature("spacing");
	}
	
	public void setSpacing(Number spacing) throws IntegerException{
		if(NumberValidator.IntegerValidator(spacing)){
			legend.setFeature("spacing", spacing);
		}
	}
	
	@JsonProperty(value="switchable")
	public Object isSwitchable(){
		return legend.getFeature("switchable");
	}
	
	public void setSwitchable(Boolean switchable){
		legend.setFeature("switchable", switchable);
	}
	
	public Object getSwitchColor(){
		return legend.getFeature("switchable");
	}
	
	public void setSwitchColor(String switchcolor) throws ColorException{
		if(ColorValidator.checkFormatColor(switchcolor)){
			legend.setFeature("switchcolor", switchcolor);
		}
	}
	
	public Object getSwitchType(){
		return legend.getFeature("switchType");
	}
	
	public void setSwitchType(SwitchType switchType){
		legend.setFeature("switchType", switchType.toString());
	}
	
	@JsonProperty(value="textClickEnabled")
	public Object isTextClickEnabled(){
		return legend.getFeature("textClickEnabled");
	}
	
	public void setTextClickEnabled(Boolean textClickEnabled){
		legend.setFeature("textClickEnabled", textClickEnabled);
	}
	
	public Object getTop(){
		return legend.getFeature("top");
	}
	
	public void setTop(Number top) throws IntegerException{
		if(NumberValidator.IntegerValidator(top)){
			legend.setFeature("top", top);
		}
	}
	
	@JsonProperty(value="useGraphSettings")
	public Object isUseGraphSettings(){
		return legend.getFeature("useGraphSettings");
	}
	
	public void setUseGraphSettings(Boolean useGraphSettings){
		legend.setFeature("useGraphSettings", useGraphSettings);
	}
	
	@JsonProperty(value="useMarkerColorForLabels")
	public Object isUseMarkerColorForLabels(){
		return legend.getFeature("useMarkerColorForLabels");
	}
	
	public void setUseMarkerColorForLabels(Boolean useMarkerColorForLabels){
		legend.setFeature("useMarkerColorForLabels", useMarkerColorForLabels);
	}
	
	@JsonProperty(value="useMarkerColorForValues")
	public Object isUseMarkerColorForValues(){
		return legend.getFeature("useMarkerColorForValues");
	}
	
	public void setUseMarkerColorForValues(Boolean useMarkerColorForValues){
		legend.setFeature("useMarkerColorForValues", useMarkerColorForValues);
	}
	
	public Object getValueAlign(){
		return legend.getFeature("valueAlign");
	}
	
	public void setValueAlign(ValueAlign valueAlign){
		legend.setFeature("valueAlign", valueAlign.toString());
	}
	
	public Object getValueFunction(){
		return legend.getFeature("valueFunction");
	}
	
	public void setValueFunction(String valueFunction){
		legend.setFeature("valueFunction", valueFunction);
	}
	
	public Object getValueText(){
		return legend.getFeature("valueText");
	}
	
	//cualquier texto pero tiene más sentido dejarlo en blanco, usa el valueField
	public void setValueText(String valueText){
		legend.setFeature("valueText", valueText);
	}
	
	public Object getValueWidth(){
		return legend.getFeature("valueWidth");
	}
	
	public void setValueWidth(Number valueWidth) throws IntegerException{
		if(NumberValidator.IntegerValidator(valueWidth)){
			legend.setFeature("valueWidth", valueWidth);
		}
	}
	
	public Object getVerticalGap(){
		return legend.getFeature("verticalGap");
	}
	
	public void setVerticalGap(Number verticalGap) throws IntegerException{
		if(NumberValidator.IntegerValidator(verticalGap)){
			legend.setFeature("verticalGap", verticalGap);
		}
	}
	
	public Object getWidth(){
		return legend.getFeature("width");
	}
	
	public void setWidth(Number width) throws IntegerException{
		if(NumberValidator.IntegerValidator(width)){
			legend.setFeature("width", width);
		}
	}
	
}