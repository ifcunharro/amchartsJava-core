package es.uvigo.esei.amchartsJava.core.controllers.axis;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.ICategoryAxisController;
import es.uvigo.esei.amchartsJava.core.constants.CategoryPositionConstant.CategoryPosition;
import es.uvigo.esei.amchartsJava.core.constants.PeriodConstant.Period;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;


public class CategoryAxisController extends AxisBaseController implements ICategoryAxisController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2203487257864745560L;

	public Object getAutoRotateAngle(){
		return axes.getFeature("autoRotateAngle");
	}
	
	public void setAutoRotateAngle(Number autoRotateAngle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(autoRotateAngle, -90, 90)){
			axes.setFeature("autoRotateAngle", autoRotateAngle);
		}
	}
	
	public Object getAutoRotateCount(){
		return axes.getFeature("autoRotateCount");
	}
	
	public void setAutoRotateCount(Number autoRotateCount) throws IntegerException{
		if(NumberValidator.integerValidator(autoRotateCount) && autoRotateCount.intValue()>=0){
			axes.setFeature("autoRotateCount", autoRotateCount);
		}
	}
	
	@JsonProperty(value="autoWrap")
	public Object isAutoWrap(){
		return axes.getFeature("autoWrap");
	}
	
	public void setAutoWrap(Boolean autoWrap){
		axes.setFeature("autoWrap", autoWrap);
	}
	
	@JsonProperty(value="boldPeriodBeginning")
	public Object isBoldPeriodBeginning(){
		return axes.getFeature("boldPeriodBeginning");
	}
	
	public void setBoldPeriodBeginning(Boolean boldPeriodBeginning){
		axes.setFeature("boldPeriodBeginning", boldPeriodBeginning);
	}
	
	public Object getCategoryFunction(){
		return axes.getFeature("categoryFunction");
	}
	
	public void setCategoryFunction(String categoryFunction){
		axes.setFeature("categoryFunction", categoryFunction);
	}
	
	@JsonProperty(value="centerLabelOnFullPeriod")
	public Object isCenterLabelOnFullPeriod(){
		return axes.getFeature("centerLabelOnFullPeriod");
	}
	
	public void setCenterLabelOnFullPeriod(Boolean centerLabelOnFullPeriod){
		axes.setFeature("centerLabelOnFullPeriod", centerLabelOnFullPeriod);
	}
	
	@JsonProperty(value="equalSpacing")
	public Object isEqualSpacing(){
		return axes.getFeature("equalSpacing");
	}
	
	public void setEqualSpacing(Boolean equalSpacing){
		axes.setFeature("equalSpacing", equalSpacing);
	}
	
	public Object getFirstDayOfWeek(){
		return axes.getFeature("firstDayOfWeek");
	}
	
	public void setFirstDayOfWeek(Number firstDayOfWeek) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(firstDayOfWeek, 0, 6)){
			axes.setFeature("firstDayOfWeek", firstDayOfWeek);
		}
	}
	
	public Object getForceShowField(){
		return axes.getFeature("forceShow");
	}
	
	public void setForceShowField(String forceShowField){
		axes.setFeature("forceShowField", forceShowField);
	}
	
	public Object getGridPosition(){
		return axes.getFeature("gridPosition");
	}
	
	public void setGridPosition(CategoryPosition gridPosition){
		axes.setFeature("gridPosition", gridPosition.toString());
	}
	
	public Object getLabelColorField(){
		return axes.getFeature("labelColorField");
	}
	
	public void setLabelColorField(String labelColorField){
		axes.setFeature("labelColorField", labelColorField);
	}
	
	public Object getLabelFunction(){
		return axes.getFeature("labelFunction");
	}
	
	public void setLabelFunction(String labelFunction){
		axes.setFeature("labelFunction", labelFunction);
	}
	
	@JsonProperty(value="markPeriodChange")
	public Object isMarkPeriodChange(){
		return axes.getFeature("markPeriodChange");
	}
	
	public void setMarkPeriodChange(Boolean markPeriodChange){
		axes.setFeature("markPeriodChange", markPeriodChange);
	}
	
	public Object getMinPeriod(){
		return axes.getFeature("minPeriod");
	}
	
	public void setMinPeriod(Period minPeriod){
		axes.setFeature("minPeriod", minPeriod.toString());
	}
	
	@JsonProperty(value="parseDates")
	public Object isParseDates(){
		return axes.getFeature("parseDates");
	}
	
	public void setParseDates(Boolean parseDates){
		axes.setFeature("parseDates", parseDates);
	}
	
	@JsonProperty(value="startOnAxis")
	public Object isStartOnAxis(){
		return axes.getFeature("startOnAxis");
	}
	
	public void setStartOnAxis(Boolean startOnAxis){
		axes.setFeature("startOnAxis", startOnAxis);
	}
	
	public Object getTickPosition(){
		return axes.getFeature("tickPosition");
	}
	
	public void setTickPosition(CategoryPosition tickPosition){
		axes.setFeature("tickPosition", tickPosition.toString());
	}
	
	@JsonProperty(value="twoLineMode")
	public Object isTwoLineMode(){
		return axes.getFeature("twoLineMode");
	}
	
	public void setTwoLineMode(Boolean twoLineMode){
		axes.setFeature("twoLineMode", twoLineMode);
	}

}
