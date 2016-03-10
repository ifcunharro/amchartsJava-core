package es.uvigo.esei.amchartsJava.core.controllers;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.IAmLegendController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.Align;
import es.uvigo.esei.amchartsJava.core.constants.LegendPeriodValueText;
import es.uvigo.esei.amchartsJava.core.constants.ValueAlign;
import es.uvigo.esei.amchartsJava.core.constants.LegendPosition;
import es.uvigo.esei.amchartsJava.core.constants.MarkerType;
import es.uvigo.esei.amchartsJava.core.constants.SwitchType;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AmLegend;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

/**
 * This class is a controller for AmLegend.
 * @author Iago Fernández Cuñarro
 *
 */
@JsonInclude(Include.NON_NULL)
public class AmLegendController implements IAmLegendController, Serializable{
	
	
	private static final long serialVersionUID = 5442430660954968452L;
	private AmLegend legend;

	{
		legend = new AmLegend();
	}
	
	public AmLegendController(){
		
	}
	
	public String getAlign(){
		return (String) legend.getFeature("align");
	}
	
	public void setAlign(Align align){
		legend.setFeature("align", align.toString());
	}
	
	@JsonProperty(value="autoMargins")
	public Boolean isAutoMargins(){
		return (Boolean) legend.getFeature("autoMargins");
	}
	
	public void setAutoMargins(Boolean autoMargins){
		legend.setFeature("autoMargins", autoMargins);
	}
	
	public Double getBackgroundAlpha(){
		Object bakgroundAlpha = legend.getFeature("backgroundAlpha");
		
		return bakgroundAlpha != null ? ((Number)bakgroundAlpha).doubleValue() : null;
	}
	
	public void setBackgroundAlpha(Number backgroundAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(backgroundAlpha, 0, 1)){
			legend.setFeature("backgroundAlpha", backgroundAlpha);
		}
	}
	
	public String getBackgroundColor(){
		return (String) legend.getFeature("backgroundColor");
	}
	
	public void setBackgroundColor(String backgroundColor) throws ColorException{
		if(ColorValidator.checkFormatColor(backgroundColor)){
			legend.setFeature("backgroundColor", backgroundColor);
		}
	}
	
	public Double getBorderAlpha(){
		Object borderAlpha = legend.getFeature("borderAlpha");
		
		return borderAlpha != null ? ((Number)borderAlpha).doubleValue() : null;
	}
	
	public void setBorderAlpha(Number borderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(borderAlpha, 0, 1)){
			legend.setFeature("borderAlpha", borderAlpha);
		}
	}
	
	public String getBorderColor(){
		return (String) legend.getFeature("borderColor");
	}
	
	public void setBorderColor(String borderColor) throws ColorException{
		if(ColorValidator.checkFormatColor(borderColor)){
			legend.setFeature("borderColor", borderColor);
		}
	}
	
	public Integer getBottom(){
		Object bottom = legend.getFeature("bottom");
		
		return bottom != null ? ((Number)bottom).intValue() : null;
	}
	
	public void setBottom(Number bottom) throws IntegerException{
		if(NumberValidator.integerValidator(bottom)){
			legend.setFeature("bottom", bottom);
		}
	}
	
	public String getColor(){
		return (String) legend.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			legend.setFeature("color", color);
		}
	}
	
	public String getDivId(){
		return (String) legend.getFeature("divId");
	}
	
	public void setDivId(String divId){
		legend.setFeature("divId", divId);
	}
	
	@JsonProperty(value="enabled")
	public Boolean isEnabled(){
		return (Boolean) legend.getFeature("enabled");
	}
	
	public void setEnabled(Boolean enabled){
		legend.setFeature("enabled", enabled);
	}
	
	@JsonProperty(value="equalWidths")
	public Boolean isEqualWidths(){
		return (Boolean) legend.getFeature("equalWidths");
	}
	
	public void setEqualWidths(Boolean equalWidths){
		legend.setFeature("equalWidths", equalWidths);
	}
	
	public Integer getFontSize(){
		Object fontSize = legend.getFeature("fontSize");
		
		return fontSize != null ? ((Number)fontSize).intValue() : null;
	}
	
	public void setFontSize(Number fontSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(fontSize, 10, 18)){
				legend.setFeature("fontSize", fontSize);
			}
		}else{
			legend.setFeature("fontSize", fontSize);
		}
	}
	
	@JsonProperty(value="forceWidth")
	public Boolean isForceWidth(){
		return (Boolean) legend.getFeature("forceWidth");
	}
	
	public void setForceWidth(Boolean forceWidth){
		legend.setFeature("forceWidth", forceWidth);
	}
	
	public Integer getHorizontalGap(){
		Object horizontalGap = legend.getFeature("horizontalGap");
		
		return horizontalGap != null ? ((Number)horizontalGap).intValue() : null;
	}
	
	public void setHorizontalGap(Number horizontalGap) throws IntegerException{
		if(NumberValidator.integerValidator(horizontalGap) && horizontalGap.intValue()>=0){
			legend.setFeature("horizontalGap", horizontalGap);
		}
	}
	
	public String getLabelText(){
		return (String) legend.getFeature("labelText");
	}
	
	//cualquier texto pero si es [[title]] muestra como texto el title del graph
	public void setLabelText(String labelText){
		legend.setFeature("labelText", labelText);
	}
	
	public Integer getLabelWidth(){
		Object labelWidth = legend.getFeature("labelWidth");
		
		return labelWidth != null ? ((Number)labelWidth).intValue() : null;
	}
	
	public void setLabelWidth(Number labelWidth) throws IntegerException{
		if(NumberValidator.integerValidator(labelWidth)){
			legend.setFeature("labelWidth", labelWidth);
		}
	}
	
	public Integer getLeft(){
		Object left = legend.getFeature("left");
		return left != null ? ((Number)left).intValue() : null;
	}
	
	public void setLeft(Number left) throws IntegerException{
		if(NumberValidator.integerValidator(left)){
			legend.setFeature("left", left);
		}
	}
	
	public Integer getMarginBottom(){
		Object marginBottom = legend.getFeature("marginBottom");
		
		return marginBottom != null ? ((Number)marginBottom).intValue() : null;
	}
	
	public void setMarginBottom(Number marginBottom) throws IntegerException{
		if(NumberValidator.integerValidator(marginBottom)){
			legend.setFeature("marginBottom", marginBottom);
		}
	}
	
	public Integer getMarginLeft(){
		Object marginLeft = legend.getFeature("marginLeft");
		
		return marginLeft != null ? ((Number)marginLeft).intValue() : null;
	}
	
	public void setMarginLeft(Number marginLeft) throws IntegerException{
		if(NumberValidator.integerValidator(marginLeft)){
			legend.setFeature("marginLeft", marginLeft);
		}
	}
	
	public Integer getMarginRight(){
		Object marginRight = legend.getFeature("marginRight");
		
		return marginRight != null ? ((Number)marginRight).intValue() : null;
	}
	
	public void setMarginRight(Number marginRight) throws IntegerException{
		if(NumberValidator.integerValidator(marginRight)){
			legend.setFeature("marginRight", marginRight);
		}
	}
	
	public Integer getMarginTop(){
		Object marginTop = legend.getFeature("marginTop");
		
		return marginTop != null ? ((Number)marginTop).intValue() : null;
	}
	
	public void setMarginTop(Number marginTop) throws IntegerException{
		if(NumberValidator.integerValidator(marginTop)){
			legend.setFeature("marginTop", marginTop);
		}
	}
	
	public Double getMarkerBorderAlpha(){
		Object markerBorderAlpha = legend.getFeature("markerBorderAlpha");
		
		return markerBorderAlpha != null ? ((Number)markerBorderAlpha).doubleValue() : null;
	}
	
	public void setMarkerBorderAlpha(Number markerBorderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(markerBorderAlpha, 0, 1)){
			legend.setFeature("markerBorderAlpha", markerBorderAlpha);
		}
	}
	
	public String getMarkerBorderColor(){
		return (String) legend.getFeature("markerBorderColor");
	}
	
	public void setMarkerBorderColor(String markerBorderColor) throws ColorException{
		if(ColorValidator.checkFormatColor(markerBorderColor)){
			legend.setFeature("markerBorderColor", markerBorderColor);
		}
	}
	
	public Integer getMarkerBorderThickness(){
		Object markerBorderThickness = legend.getFeature("markerBorderThickness");
		
		return markerBorderThickness != null ? ((Number)markerBorderThickness).intValue() : null;
	}
	
	public void setMarkerBorderThickness(Number markerBorderThickness) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(markerBorderThickness, 1, 16)){
				legend.setFeature("markerBorderThickness", markerBorderThickness);
			}
		}else{
			legend.setFeature("markerBorderThickness", markerBorderThickness);
		}
	}
	
	public String getMarkerDisabledColor(){
		return (String) legend.getFeature("markerDisabledColor");
	}
	
	public void setMarkerDisabledColor(String markerDisabledColor) throws ColorException{
		if(ColorValidator.checkFormatColor(markerDisabledColor)){
			legend.setFeature("markerDisabledColor", markerDisabledColor);
		}
	}
	
	public Integer getMarkerLabelGap(){
		Object markerLabelGap = legend.getFeature("markerLabelGap");
		
		return markerLabelGap != null ? ((Number)markerLabelGap).intValue() : null;
	}
	
	public void setMarkerLabelGap(Number markerLabelGap) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(markerLabelGap, 5, 16)){
				legend.setFeature("markerLabelGap", markerLabelGap);
			}
		}else{
			legend.setFeature("markerLabelGap", markerLabelGap);
		}
	}
	
	public Integer getMarkerSize(){
		Object markerSize = legend.getFeature("markerSize");
		
		return markerSize != null ? ((Number)markerSize).intValue() : null;
	}
	
	public void setMarkerSize(Number markerSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(markerSize, 1, 36)){
				legend.setFeature("markerSize", markerSize);
			}
		}else{
			legend.setFeature("markerSize", markerSize);
		}
	}
	
	public String getMarkerType(){
		return (String) legend.getFeature("markerType");
	}
	
	public void setMarkerType(MarkerType markerType){
		legend.setFeature("markerType", markerType.toString());
	}
	
	public Integer getMaxColumns(){
		Object maxColumns = legend.getFeature("maxColumns");
		
		return maxColumns != null ? ((Number)maxColumns).intValue() : null;
	}
	
	public void setMaxColumns(Number maxColumns) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(maxColumns, 1, 5)){
				legend.setFeature("maxColumns", maxColumns);
			}
		}else{
			legend.setFeature("maxColumns", maxColumns);
		}
	}
	
	public String getPeriodValueText(){
		return (String) legend.getFeature("periodValueText");
	}
	
	public void setPeriodValueText(LegendPeriodValueText periodValueText){
		legend.setFeature("periodValueText", periodValueText.toString());
	}
	
	public String getPosition(){
		return (String) legend.getFeature("position");
	}
	
	public void setPosition(LegendPosition position){
		legend.setFeature("position", position.toString());
	}
	
	@JsonProperty(value="reversedOrder")
	public Boolean isReversedOrder(){
		return (Boolean) legend.getFeature("reversedOrder");
	}
	
	public void setReversedOrder(Boolean reversedOrder){
		legend.setFeature("reversedOrder", reversedOrder);
	}
	
	public Integer getRight(){
		Object right = legend.getFeature("right");
		
		return right != null ? ((Number)right).intValue() : null;
	}
	
	public void setRight(Number right) throws IntegerException{
		if(NumberValidator.integerValidator(right)){
			legend.setFeature("right", right);
		}
	}
	
	public String getRollOverColor(){
		return (String) legend.getFeature("rollOverColor");
	}
	
	public void setRollOverColor(String rollOverColor) throws ColorException{
		if(ColorValidator.checkFormatColor(rollOverColor)){
			legend.setFeature("rollOverColor", rollOverColor);
		}
	}
	
	public Double getRollOverGraphAlpha(){
		Object rollOverGraphAlpha = legend.getFeature("rollOverGraphAlpha");
		
		return rollOverGraphAlpha != null ? ((Number)rollOverGraphAlpha).doubleValue() : null;
	}
	
	public void setRollOverGraphAlpha(Number rollOverGraphAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(rollOverGraphAlpha, 0, 1)){
			legend.setFeature("rollOverGraphAlpha", rollOverGraphAlpha);
		}
	}
	
	@JsonProperty(value="showEntries")
	public Boolean isShowEntries(){
		return (Boolean) legend.getFeature("showEntries");
	}
	
	public void setShowEntries(Boolean showEntries){
		legend.setFeature("showEntries", showEntries);
	}
	
	public Integer getSpacing(){
		Object spacing = legend.getFeature("spacing");
		
		return spacing != null ? ((Number)spacing).intValue() : null;
	}
	
	public void setSpacing(Number spacing) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(spacing, 0, 10)){
				legend.setFeature("spacing", spacing);
			}
		}else{
			legend.setFeature("spacing", spacing);
		}
	}
	
	@JsonProperty(value="switchable")
	public Boolean isSwitchable(){
		return (Boolean) legend.getFeature("switchable");
	}
	
	public void setSwitchable(Boolean switchable){
		legend.setFeature("switchable", switchable);
	}
	
	public String getSwitchColor(){
		return (String) legend.getFeature("switchColor");
	}
	
	public void setSwitchColor(String switchcolor) throws ColorException{
		if(ColorValidator.checkFormatColor(switchcolor)){
			legend.setFeature("switchColor", switchcolor);
		}
	}
	
	public String getSwitchType(){
		return (String) legend.getFeature("switchType");
	}
	
	public void setSwitchType(SwitchType switchType){
		legend.setFeature("switchType", switchType.toString());
	}
	
	@JsonProperty(value="textClickEnabled")
	public Boolean isTextClickEnabled(){
		return (Boolean) legend.getFeature("textClickEnabled");
	}
	
	public void setTextClickEnabled(Boolean textClickEnabled){
		legend.setFeature("textClickEnabled", textClickEnabled);
	}
	
	public Integer getTop(){
		Object top = legend.getFeature("top");
		
		return top != null ? ((Number)top).intValue() : null;
	}
	
	public void setTop(Number top) throws IntegerException{
		if(NumberValidator.integerValidator(top)){
			legend.setFeature("top", top);
		}
	}
	
	@JsonProperty(value="useGraphSettings")
	public Boolean isUseGraphSettings(){
		return (Boolean) legend.getFeature("useGraphSettings");
	}
	
	public void setUseGraphSettings(Boolean useGraphSettings){
		legend.setFeature("useGraphSettings", useGraphSettings);
	}
	
	@JsonProperty(value="useMarkerColorForLabels")
	public Boolean isUseMarkerColorForLabels(){
		return (Boolean) legend.getFeature("useMarkerColorForLabels");
	}
	
	public void setUseMarkerColorForLabels(Boolean useMarkerColorForLabels){
		legend.setFeature("useMarkerColorForLabels", useMarkerColorForLabels);
	}
	
	@JsonProperty(value="useMarkerColorForValues")
	public Boolean isUseMarkerColorForValues(){
		return (Boolean) legend.getFeature("useMarkerColorForValues");
	}
	
	public void setUseMarkerColorForValues(Boolean useMarkerColorForValues){
		legend.setFeature("useMarkerColorForValues", useMarkerColorForValues);
	}
	
	public String getValueAlign(){
		return (String) legend.getFeature("valueAlign");
	}
	
	public void setValueAlign(ValueAlign valueAlign){
		legend.setFeature("valueAlign", valueAlign.toString());
	}
	
	public String getValueFunction(){
		return (String) legend.getFeature("valueFunction");
	}
	
	public void setValueFunction(String valueFunction){
		legend.setFeature("valueFunction", valueFunction);
	}
	
	public String getValueText(){
		return (String) legend.getFeature("valueText");
	}
	
	//cualquier texto pero tiene más sentido dejarlo en blanco, usa el valueField
	public void setValueText(String valueText){
		legend.setFeature("valueText", valueText);
	}
	
	public Integer getValueWidth(){
		Object valueWidth = legend.getFeature("valueWidth");
		
		return valueWidth != null ? ((Number)valueWidth).intValue() : null;
	}
	
	public void setValueWidth(Number valueWidth) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(valueWidth, 0, 50)){
				legend.setFeature("valueWidth", valueWidth);
			}
		}else{
			legend.setFeature("valueWidth", valueWidth);
		}
	}
	
	public Integer getVerticalGap(){
		Object verticalGap = legend.getFeature("verticalGap");
		
		return verticalGap != null ? ((Number)verticalGap).intValue() : null;
	}
	
	public void setVerticalGap(Number verticalGap) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(verticalGap, 0, 10)){
				legend.setFeature("verticalGap", verticalGap);
			}
		}else{
			legend.setFeature("verticalGap", verticalGap);
		}
	}
	
	public Integer getWidth(){
		Object width = legend.getFeature("width");
		
		return width != null ? ((Number)width).intValue() : null;
	}
	
	public void setWidth(Number width) throws IntegerException{
		if(NumberValidator.integerValidator(width)){
			legend.setFeature("width", width);
		}
	}
	
}
