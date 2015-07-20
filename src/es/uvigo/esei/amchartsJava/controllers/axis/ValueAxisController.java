package es.uvigo.esei.amchartsJava.controllers.axis;

import java.sql.Date;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.constants.DurationConstant.Duration;
import es.uvigo.esei.amchartsJava.constants.StackTypeConstant.StackType;
import es.uvigo.esei.amchartsJava.exceptions.FloatException;
import es.uvigo.esei.amchartsJava.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.model.axis.ValueAxis;
import es.uvigo.esei.amchartsJava.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.validators.NumberValidator;

public abstract class ValueAxisController extends AxisBaseController<ValueAxis> implements Observer {

	private AmCoordinateChart chart;
	
	public ValueAxisController() {
		super(new ValueAxis());	
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setId("ValueAxis-"+arg.toString());	
	}
	
	@JsonIgnore
	public void setChart(AmCoordinateChart c) {
		chart = c;		
	}
	
	public Object getBaseValue(){
		return axes.getFeature("baseValue");
	}
	
	public void setBaseValue(Number baseValue) throws IntegerException{
		if(NumberValidator.integerValidator(baseValue)){
			axes.setFeature("baseValue", baseValue);
		}
	}
	
	public Object getDuration(){
		return axes.getFeature("duration");
	}
	
	public void setDuration(Duration duration){
		axes.setFeature("duration", duration.toString());
	}
	
	//durationUnits por defecto
	
	public Object getId() {
		return axes.getFeature("id");
	}
	
	private void setId(String id){
		axes.setFeature("id", id);
	}
	
	@JsonProperty(value="includeGuidesInMinMax")
	public Object isIncludeGuidesInMinMax(){
		return axes.getFeature("includeGuidesInMinMax");
	}
	
	public void setIncludeGuidesInMinMax(Boolean includeGuidesInMinMax){
		axes.setFeature("includeGuidesInMinMax", includeGuidesInMinMax);
	}
	
	@JsonProperty(value="includeHidden")
	public Object isIncludeHidden(){
		return axes.getFeature("includeHidden");
	}
	
	@JsonProperty(value="integersOnly")
	public Object isIntegersOnly(){
		return axes.getFeature("integersOnly");
	}
	
	public void setIntegersOnly(Boolean integersOnly){
		axes.setFeature("integersOnly", integersOnly);
	}
	
	public Object getLabelFunction(){
		return axes.getFeature("labelFunction");
	}
	
	public void setLabelFunction(String labelFunction){
		axes.setFeature("labelFunction", labelFunction);
	}
	
	@JsonProperty(value="logarithmic")
	public Object isLogarithmic(){
		return axes.getFeature("logarithmic");
	}
	
	public void setLogarithmic(Boolean logarithmic){
		axes.setFeature("logarithmic", logarithmic);
	}
	
	public Object getMaximum(){
		return axes.getFeature("maximum");
	}
	
	public void setMaximum(Number maximum) throws FloatException{
		if(NumberValidator.floatValidator(maximum)){
			axes.setFeature("maximum", maximum);
		}
	}
	
	public Object getMaximumDate(){
		return axes.getFeature("maximumDate");
	}
	
	public void setMaximunDate(Date maximumDate){
		axes.setFeature("maximumDate", maximumDate.toString());
	}
	
	public Object getMinimum(){
		return axes.getFeature("minimum");
	}
	
	public void setMinimum(Number minimum) throws FloatException{
		if(NumberValidator.floatValidator(minimum)){
			axes.setFeature("minimum", minimum);
		}
	}
	
	public Object getMinimumDate(){
		return axes.getFeature("minimunDate");
	}
	
	public void setMinimumDate(Date minimumDate){
		axes.setFeature("minimumDate", minimumDate.toString());
	}
	
	public Object getMinMaxMultiplier(){
		return axes.getFeature("minMaxMultiplier");
	}
	
	public void setMinMaxMultiplier(Number minMaxMultiplier) throws FloatException{
		if(NumberValidator.floatValidator(minMaxMultiplier)){
			axes.setFeature("minMaxMultiplier", minMaxMultiplier);
		}
	}
	
	public Object getPrecision(){
		return axes.getFeature("precision");
	}
	
	public void setPrecision(Number precision) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(precision, 2, 15)){
			axes.setFeature("precision", precision);
		}
	}
	
	@JsonProperty(value="recalculateToPercents")
	public Object isRecalculateToPercents(){
		return axes.getFeature("recalculateToPercents");
	}
	
	public void setRecalculateToPercents(Boolean recalculateToPercents){
		axes.setFeature("recalculateToPercents", recalculateToPercents);
	}
	
	@JsonProperty(value="reversed")
	public Object isReversed(){
		return axes.getFeature("reversed");
	}
	
	public void setReversed(Boolean reversed){
		axes.setFeature("reversed", reversed);
	}
	
	public Object getStackType(){
		return axes.getFeature("stackType");
	}
	
	public void setStackType(StackType stackType){
		axes.setFeature("stackType", stackType.toString());
	}
	
	@JsonProperty(value="strictMinMax")
	public Object isStrictMinMax(){
		return axes.getFeature("strictMinMax");
	}
	
	public void setStrictMinMax(Boolean strictMinMax){
		axes.setFeature("strictMinMax", strictMinMax);
	}
	
	public  Object getSynchronizationMultiplier(){
		return axes.getFeature("synchronizationMultiplier");
	}
	
	public void setSynchronizationMultiplier(Number synchronizationMultiplier) throws FloatException{
		if(NumberValidator.floatValidator(synchronizationMultiplier)){
			axes.setFeature("synchronizationMultiplier", synchronizationMultiplier);
		}
	}
}
