package es.uvigo.esei.amchartsJava.core.controllers.axis;

import java.sql.Date;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import es.uvigo.esei.amchartsJava.core.api.axis.IValueAxisController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.AxisType;
import es.uvigo.esei.amchartsJava.core.constants.Duration;
import es.uvigo.esei.amchartsJava.core.constants.Position;
import es.uvigo.esei.amchartsJava.core.constants.StackType;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PropertyValidator;

/**
 * This class is a controller for ValueAxis, this controller is used by charts distinct of AmRadarChart.
 * @author Iago Fernández Cuñarro
 *
 */
public class ValueAxisController extends AxisBaseController implements Observer, IValueAxisController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2266935966284026139L;
	private AmCoordinateChart chart;

	/**
	 * Set id of valueAxis to be add to chart. Id of valueAxis auto increment.
	 */
	@Override
	public void update(Observable o, Object arg) {
		this.setId("ValueAxis-"+arg.toString());	
	}
	
	@JsonIgnore
	public void setChart(AmCoordinateChart c) {
		chart = c;		
	}
	
	public Integer getBaseValue(){
		Object baseValue = axes.getFeature("baseValue");
		
		return baseValue != null ? ((Number)baseValue).intValue() : null;
	}
	
	public void setBaseValue(Number baseValue) throws IntegerException{
		if(NumberValidator.integerValidator(baseValue)){
			axes.setFeature("baseValue", baseValue);
		}
	}
	
	public String getDuration(){
		return (String) axes.getFeature("duration");
	}
	
	public void setDuration(Duration duration){
		if(duration != null){
			axes.setFeature("duration", duration.toString());
		}
	}
	
	public String getId() {
		return (String) axes.getFeature("id");
	}
	
	private void setId(String id){
		axes.setFeature("id", id);
	}
	
	@JsonProperty(value="includeGuidesInMinMax")
	public Boolean isIncludeGuidesInMinMax(){
		return (Boolean) axes.getFeature("includeGuidesInMinMax");
	}
	
	public void setIncludeGuidesInMinMax(Boolean includeGuidesInMinMax){
		axes.setFeature("includeGuidesInMinMax", includeGuidesInMinMax);
	}
	
	@JsonProperty(value="includeHidden")
	public Boolean isIncludeHidden(){
		return (Boolean) axes.getFeature("includeHidden");
	}
	
	public void setIncludeHidden(Boolean includeHidden){
		axes.setFeature("includeHidden", includeHidden);
	}
	
	@JsonProperty(value="integersOnly")
	public Boolean isIntegersOnly(){
		return (Boolean) axes.getFeature("integersOnly");
	}
	
	public void setIntegersOnly(Boolean integersOnly){
		axes.setFeature("integersOnly", integersOnly);
	}
	
	public String getLabelFunction(){
		return (String) axes.getFeature("labelFunction");
	}
	
	public void setLabelFunction(String labelFunction){
		if(labelFunction != null){
			axes.setFeature("labelFunction", labelFunction);
		}
	}
	
	@JsonProperty(value="logarithmic")
	public Boolean isLogarithmic(){
		return (Boolean) axes.getFeature("logarithmic");
	}
	
	public void setLogarithmic(Boolean logarithmic){
		axes.setFeature("logarithmic", logarithmic);
	}
	
	public Double getMaximum(){
		Object maximum = axes.getFeature("maximum");
		
		return maximum != null ? ((Number)maximum).doubleValue() : null;
	}
	
	public void setMaximum(Number maximum) throws DoubleException{
		if(NumberValidator.doubleValidator(maximum)){
			axes.setFeature("maximum", maximum);
		}
	}
	
	public String getMaximumDate(){
		return (String) axes.getFeature("maximumDate");
	}
	
	public void setMaximunDate(Date maximumDate){
		if(maximumDate != null){
			axes.setFeature("maximumDate", maximumDate.toString());
		}
	}
	
	public Double getMinimum(){
		Object minimum = axes.getFeature("minimum");
		
		return minimum != null ? ((Number)minimum).doubleValue() : null;
	}
	
	public void setMinimum(Number minimum) throws DoubleException{
		if(NumberValidator.doubleValidator(minimum)){
			axes.setFeature("minimum", minimum);
		}
	}
	
	public String getMinimumDate(){
		return (String) axes.getFeature("minimunDate");
	}
	
	public void setMinimumDate(Date minimumDate){
		if(minimumDate != null){
			axes.setFeature("minimumDate", minimumDate.toString());
		}
	}
	
	public Double getMinMaxMultiplier(){
		Object minMaxMultiplier = axes.getFeature("minMaxMultiplier");
		
		return minMaxMultiplier != null ? ((Number)minMaxMultiplier).doubleValue() : null;
	}
	
	public void setMinMaxMultiplier(Number minMaxMultiplier) throws DoubleException{
		if(NumberValidator.doubleValidator(minMaxMultiplier)){
			axes.setFeature("minMaxMultiplier", minMaxMultiplier);
		}
	}
	
	public Integer getPrecision(){
		Object precision = axes.getFeature("precision");
		
		return precision != null ? ((Number)precision).intValue() : null;
	}
	
	public void setPrecision(Number precision) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(precision, 2, 15)){
			axes.setFeature("precision", precision);
		}
	}
	
	@JsonProperty(value="recalculateToPercents")
	public Boolean isRecalculateToPercents(){
		return (Boolean) axes.getFeature("recalculateToPercents");
	}
	
	public void setRecalculateToPercents(Boolean recalculateToPercents){
		axes.setFeature("recalculateToPercents", recalculateToPercents);
	}
	
	@JsonProperty(value="reversed")
	public Boolean isReversed(){
		return (Boolean) axes.getFeature("reversed");
	}
	
	public void setReversed(Boolean reversed){
		axes.setFeature("reversed", reversed);
	}
	
	public String getStackType(){
		return (String) axes.getFeature("stackType");
	}
	
	public void setStackType(StackType stackType){
		if(stackType != null){
			axes.setFeature("stackType", stackType.toString());
		}
	}
	
	@JsonProperty(value="strictMinMax")
	public Boolean isStrictMinMax(){
		return (Boolean) axes.getFeature("strictMinMax");
	}
	
	public void setStrictMinMax(Boolean strictMinMax){
		axes.setFeature("strictMinMax", strictMinMax);
	}
	
	public  Double getSynchronizationMultiplier(){
		Object synchronizationMultiplier = axes.getFeature("synchronizationMultiplier");
		
		return synchronizationMultiplier != null ? ((Number)synchronizationMultiplier).doubleValue() : null;
	}
	
	public void setSynchronizationMultiplier(Number synchronizationMultiplier) throws DoubleException{
		if(NumberValidator.doubleValidator(synchronizationMultiplier)){
			axes.setFeature("synchronizationMultiplier", synchronizationMultiplier);
		}
	}
	
	public String getSynchronizeWith(){
		return (String) axes.getFeature("synchronizeWith");
	}
	
	public void setSynchronizeWith(String synchronizeWith) throws ChartException{
		if(chart != null){
			if(PropertyValidator.isValidString(synchronizeWith) 
					&&chart.existValueAxis(synchronizeWith) 
					&& !this.getId().equals(synchronizeWith)){
				axes.setFeature("synchronizeWith", synchronizeWith);
			}
		}else{
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	//Used to deserialize json
	@JsonSetter(value="synchronizeWith")
	private void setJsonSynchronizeWith(String synchronizeWith){
		axes.setFeature("synchronizeWith", synchronizeWith);
	}
	
	public String getTotalText(){
		return (String) axes.getFeature("totalText");
	}
	
	public void enabledTotalText(){
		axes.setFeature("totalText", "[[total]]");
	}
	
	public String getTotalTextColor(){
		return (String) axes.getFeature("totalTextColor");
	}
	
	public void setTotalTextColor(String totalTextColor) throws ColorException{
		if(ColorValidator.checkFormatColor(totalTextColor)){
			axes.setFeature("totalTextColor", totalTextColor);
		}
	}
	
	public Integer getTotalTextOffset(){
		Object totalTextOffset = axes.getFeature("totalTextOffset");
		
		return totalTextOffset != null ? ((Number)totalTextOffset).intValue() : null;
	}
	
	public void setTotalTextOffset(Number totalTextOffset) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(totalTextOffset, 0, 10)){
				axes.setFeature("totalTextOffset", totalTextOffset);
			}
		}else{
			axes.setFeature("totalTextOffset", totalTextOffset);
		}
	}
	
	public Integer getTreatZeroAs(){
		Object treatZeroAs = axes.getFeature("treatZeroAs");
		
		return treatZeroAs != null ? ((Number)treatZeroAs).intValue() : null;
	}
	
	public void setTreatZeroAs(Number treatZeroAs) throws IntegerException{
		if(NumberValidator.integerValidator(treatZeroAs)){
			axes.setFeature("treatZeroAs", treatZeroAs);
		}
	}
	
	public String getType(){
		return (String) axes.getFeature("type");
	}
	
	public void setType(AxisType type){
		if(type != null){
			axes.setFeature("type", type.toString());
		}
	}
	
	public String getUnit(){
		return (String) axes.getFeature("unit");
	}
	
	public void setUnit(String unit){
		if(PropertyValidator.isValidString(unit)){
			axes.setFeature("unit", unit);
		}
	}
	
	public String getUnitPosition(){
		return (String) axes.getFeature("unitPosition");
	}
	
	public void setUnitPosition(Position unitPosition){
		if(unitPosition != null){
			axes.setFeature("unitPosition", unitPosition.toString());
		}
	}
	
	@JsonProperty(value="usePrefixes")
	public Boolean isUsePrefixes(){
		return (Boolean) axes.getFeature("usePrefixes");
	}
	
	public void setUsePrefixes(Boolean usePrefixes){
		axes.setFeature("usePrefixes", usePrefixes);
	}
	
	@JsonProperty(value="useScientificNotation")
	public Boolean isUseScientificNotation(){
		return (Boolean) axes.getFeature("useScientificNotation");
	}
	
	public void setUseScientificNotation(Boolean useScientificNotation){
		axes.setFeature("useScientificNotation", useScientificNotation);
	}
	
	//to deserialize totalText value from json
	@JsonSetter(value="totalText")
	private void setTotalText(String total){
		axes.setFeature("totalText", total);
	}
}
