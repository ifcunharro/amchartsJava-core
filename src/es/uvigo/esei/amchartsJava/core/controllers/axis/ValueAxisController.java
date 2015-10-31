package es.uvigo.esei.amchartsJava.core.controllers.axis;

import java.sql.Date;
import java.util.Observable;
import java.util.Observer;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import es.uvigo.esei.amchartsJava.core.api.axis.IValueAxisController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.AxisTypeConstant.AxisType;
import es.uvigo.esei.amchartsJava.core.constants.DurationConstant.Duration;
import es.uvigo.esei.amchartsJava.core.constants.PositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.constants.StackTypeConstant.StackType;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class ValueAxisController extends AxisBaseController implements Observer, IValueAxisController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2266935966284026139L;
	private AmCoordinateChart chart;
	private static final Logger logger = Logger.getLogger(ValueAxisController.class.getName());

	
	
	
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
	
	public String getDuration(){
		return (String) axes.getFeature("duration");
	}
	
	public void setDuration(Duration duration){
		axes.setFeature("duration", duration.toString());
	}
	
	//durationUnits por defecto
	
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
		axes.setFeature("labelFunction", labelFunction);
	}
	
	@JsonProperty(value="logarithmic")
	public Boolean isLogarithmic(){
		return (Boolean) axes.getFeature("logarithmic");
	}
	
	public void setLogarithmic(Boolean logarithmic){
		axes.setFeature("logarithmic", logarithmic);
	}
	
	public Object getMaximum(){
		return axes.getFeature("maximum");
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
		axes.setFeature("maximumDate", maximumDate.toString());
	}
	
	public Object getMinimum(){
		return axes.getFeature("minimum");
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
		axes.setFeature("minimumDate", minimumDate.toString());
	}
	
	public Object getMinMaxMultiplier(){
		return axes.getFeature("minMaxMultiplier");
	}
	
	public void setMinMaxMultiplier(Number minMaxMultiplier) throws DoubleException{
		if(NumberValidator.doubleValidator(minMaxMultiplier)){
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
		axes.setFeature("stackType", stackType.toString());
	}
	
	@JsonProperty(value="strictMinMax")
	public Boolean isStrictMinMax(){
		return (Boolean) axes.getFeature("strictMinMax");
	}
	
	public void setStrictMinMax(Boolean strictMinMax){
		axes.setFeature("strictMinMax", strictMinMax);
	}
	
	public  Object getSynchronizationMultiplier(){
		return axes.getFeature("synchronizationMultiplier");
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
			if(chart.existValueAxis(synchronizeWith)){
				axes.setFeature("synchronizeWith", synchronizeWith);
			}
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(getClass().getSimpleName()+I18n.get("ChartException"));
			}
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
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
	
	public Object getTotalTextOffset(){
		return axes.getFeature("totalTextOffset");
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
	
	public Object getTreatZeroAs(){
		return axes.getFeature("treatZeroAs");
	}
	//donde va a comenzar el eje de coordenadas
	public void setTreatZeroAs(Number treatZeroAs) throws IntegerException{
		if(NumberValidator.integerValidator(treatZeroAs)){
			axes.setFeature("treatZeroAs", treatZeroAs);
		}
	}
	
	public String getType(){
		return (String) axes.getFeature("type");
	}
	
	public void setType(AxisType type){
		axes.setFeature("type", type.toString());
	}
	
	public String getUnit(){
		return (String) axes.getFeature("unit");
	}
	
	public void setUnit(String unit){
		axes.setFeature("unit", unit);
	}
	
	public String getUnitPosition(){
		return (String) axes.getFeature("unitPosition");
	}
	
	public void setUnitPosition(Position unitPosition){
		axes.setFeature("unitPosition", unitPosition.toString());
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
	
	//para deserializar json
	@SuppressWarnings("unused")
	private void setTotalText(String total){
		axes.setFeature("totalText", total);
	}
}
