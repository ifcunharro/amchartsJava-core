package es.uvigo.esei.amchartsJava.core.controllers.axis;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.axis.ICategoryAxisController;
import es.uvigo.esei.amchartsJava.core.constants.CategoryPosition;
import es.uvigo.esei.amchartsJava.core.constants.Period;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;


public class CategoryAxisController extends AxisBaseController implements ICategoryAxisController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2203487257864745560L;

	public Integer getAutoRotateAngle(){
		Object autoRotateAngle = axes.getFeature("autoRotateAngle");
		
		return autoRotateAngle != null ? ((Number)autoRotateAngle).intValue() : null;
	}
	
	public void setAutoRotateAngle(Number autoRotateAngle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(autoRotateAngle, -90, 90)){
			axes.setFeature("autoRotateAngle", autoRotateAngle);
		}
	}
	
	public Integer getAutoRotateCount(){
		Object autoRotateCount = axes.getFeature("autoRotateCount");
		
		return autoRotateCount != null ? ((Number)autoRotateCount).intValue() : null;
	}
	
	public void setAutoRotateCount(Number autoRotateCount) throws IntegerException{
		if(NumberValidator.integerValidator(autoRotateCount) && autoRotateCount.intValue()>=0){
			axes.setFeature("autoRotateCount", autoRotateCount);
		}
	}
	
	@JsonProperty(value="autoWrap")
	public Boolean isAutoWrap(){
		return (Boolean) axes.getFeature("autoWrap");
	}
	
	public void setAutoWrap(Boolean autoWrap){
		axes.setFeature("autoWrap", autoWrap);
	}
	
	@JsonProperty(value="boldPeriodBeginning")
	public Boolean isBoldPeriodBeginning(){
		return (Boolean) axes.getFeature("boldPeriodBeginning");
	}
	
	public void setBoldPeriodBeginning(Boolean boldPeriodBeginning){
		axes.setFeature("boldPeriodBeginning", boldPeriodBeginning);
	}
	
	public String getCategoryFunction(){
		return (String) axes.getFeature("categoryFunction");
	}
	
	public void setCategoryFunction(String categoryFunction){
		axes.setFeature("categoryFunction", categoryFunction);
	}
	
	@JsonProperty(value="centerLabelOnFullPeriod")
	public Boolean isCenterLabelOnFullPeriod(){
		return (Boolean) axes.getFeature("centerLabelOnFullPeriod");
	}
	
	public void setCenterLabelOnFullPeriod(Boolean centerLabelOnFullPeriod){
		axes.setFeature("centerLabelOnFullPeriod", centerLabelOnFullPeriod);
	}
	
	@JsonProperty(value="equalSpacing")
	public Boolean isEqualSpacing(){
		return (Boolean) axes.getFeature("equalSpacing");
	}
	
	public void setEqualSpacing(Boolean equalSpacing){
		axes.setFeature("equalSpacing", equalSpacing);
	}
	
	public Integer getFirstDayOfWeek(){
		Object firstDayOfWeek = axes.getFeature("firstDayOfWeek");
		
		return firstDayOfWeek != null ? ((Number)firstDayOfWeek).intValue() : null;
	}
	
	public void setFirstDayOfWeek(Number firstDayOfWeek) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(firstDayOfWeek, 0, 6)){
			axes.setFeature("firstDayOfWeek", firstDayOfWeek);
		}
	}
	
	public String getForceShowField(){
		return (String) axes.getFeature("forceShowField");
	}
	
	public void setForceShowField(String forceShowField){
		axes.setFeature("forceShowField", forceShowField);
		axes.addAxesField("forceShowField",forceShowField);
	}
	
	public String getGridPosition(){
		return (String) axes.getFeature("gridPosition");
	}
	
	public void setGridPosition(CategoryPosition gridPosition){
		axes.setFeature("gridPosition", gridPosition.toString());
	}
	
	public String getLabelColorField(){
		return (String) axes.getFeature("labelColorField");
	}
	
	public void setLabelColorField(String labelColorField){
		axes.setFeature("labelColorField", labelColorField);
		axes.addAxesField("labelColorField", labelColorField);
	}
	
	public String getLabelFunction(){
		return (String) axes.getFeature("labelFunction");
	}
	
	public void setLabelFunction(String labelFunction){
		axes.setFeature("labelFunction", labelFunction);
	}
	
	@JsonProperty(value="markPeriodChange")
	public Boolean isMarkPeriodChange(){
		return (Boolean) axes.getFeature("markPeriodChange");
	}
	
	public void setMarkPeriodChange(Boolean markPeriodChange){
		axes.setFeature("markPeriodChange", markPeriodChange);
	}
	
	public String getMinPeriod(){
		return (String) axes.getFeature("minPeriod");
	}
	
	public void setMinPeriod(Period minPeriod){
		axes.setFeature("minPeriod", minPeriod.toString());
	}
	
	@JsonProperty(value="parseDates")
	public Boolean isParseDates(){
		return (Boolean) axes.getFeature("parseDates");
	}
	
	public void setParseDates(Boolean parseDates){
		axes.setFeature("parseDates", parseDates);
	}
	
	@JsonProperty(value="startOnAxis")
	public Boolean isStartOnAxis(){
		return (Boolean) axes.getFeature("startOnAxis");
	}
	
	public void setStartOnAxis(Boolean startOnAxis){
		axes.setFeature("startOnAxis", startOnAxis);
	}
	
	public String getTickPosition(){
		return (String) axes.getFeature("tickPosition");
	}
	
	public void setTickPosition(CategoryPosition tickPosition){
		axes.setFeature("tickPosition", tickPosition.toString());
	}
	
	@JsonProperty(value="twoLineMode")
	public Boolean isTwoLineMode(){
		return (Boolean) axes.getFeature("twoLineMode");
	}
	
	public void setTwoLineMode(Boolean twoLineMode){
		axes.setFeature("twoLineMode", twoLineMode);
	}

}
