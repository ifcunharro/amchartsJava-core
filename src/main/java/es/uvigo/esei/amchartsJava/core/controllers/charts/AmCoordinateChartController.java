package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmCoordinateChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.Effect;
import es.uvigo.esei.amchartsJava.core.constants.UrlTarget;
import es.uvigo.esei.amchartsJava.core.controllers.axis.AxisBaseController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PropertyValidator;

/**
 * This class is a controller for AmCoordinateChart.
 * @author Iago Fernández Cuñarro
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class AmCoordinateChartController<F extends AmCoordinateChart>
			extends AmChartController<F> implements IAmCoordinateChartController<AmCoordinateChart>{

	
	private static final long serialVersionUID = -4021796361267991139L;
	
	protected AmCoordinateChartController(F chart) {
		super(chart);
	}

	
	@JsonProperty(value="gridAboveGraphs")
	public Boolean isGridAboveGraphs(){
		return (Boolean) amchart.getFeature("gridAboveGraphs");
	}
	
	public void setGridAboveGraphs(Boolean gridAboveGraphs){
		amchart.setFeature("gridAboveGraphs", gridAboveGraphs);
	}
	
	@JsonProperty(value="sequencedAnimation")
	public Boolean isSequencedAnimation(){
		return (Boolean) amchart.getFeature("sequencedAnimation");
	}
	
	public void setSequencedAnimation(Boolean sequencedAnimation){
		amchart.setFeature("sequencedAnimation", sequencedAnimation);
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
			if(NumberValidator.rangeIntegerValidator(startDuration, 0, 10)){
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
		if(startEffect != null){
			amchart.setFeature("startEffect", startEffect.toString());
		}
	}
	
	public String getUrlTarget(){
		return (String) amchart.getFeature("urlTarget");
	}
	
	public void setUrlTarget(UrlTarget urlTarget){
		if(urlTarget != null){
			amchart.setFeature("urlTarget", urlTarget.toString());
		}
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
	
	public Object getGraphs(){
		return amchart.getGraphs();
	}
	
	public Object getGuides(){
		return amchart.getGuides();
	}
	
	public Object getValueAxes(){
		return amchart.getValueAxes();
	}
		
	public void addGraph(AmGraphController amGraphController) throws NotSupportedException{
		if(amGraphController != null){
			amchart.addGraph(amGraphController);
		}
	}
	
	public void addGuide(GuideController guideController) throws NotSupportedException{
		if(guideController != null){
			amchart.addGuide(guideController);
		}
	}
	
	public void addValueAxis(AxisBaseController valueAxis) throws NotSupportedException{
		if(valueAxis != null){
			amchart.addValueAxis(valueAxis);
		}
	}
	
	//remove by id
	public void removeGraph(String idGraph){
		if(PropertyValidator.isValidString(idGraph) && amchart.existGraph(idGraph)){
			amchart.removeGraph(idGraph);
		}
	}
	
	public void removeGuide(String idGuide){
		if(PropertyValidator.isValidString(idGuide) && amchart.existGuide(idGuide)){
			amchart.removeGuide(idGuide);
		}
	}
	
	public void removeValueAxis(String idValueAxis){
		if(PropertyValidator.isValidString(idValueAxis) && amchart.existValueAxis(idValueAxis)){
			amchart.removeValueAxis(idValueAxis);
		}
	}
	
	//used to deserialize json
	@JsonSetter(value="colors")
	private void setColors(List<String> colors){
		amchart.setColors(colors);
	}
	

}
