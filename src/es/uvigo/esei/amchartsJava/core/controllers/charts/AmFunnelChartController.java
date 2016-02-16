package es.uvigo.esei.amchartsJava.core.controllers.charts;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmFunnelChartController;
import es.uvigo.esei.amchartsJava.core.constants.Align;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.ChartType;
import es.uvigo.esei.amchartsJava.core.constants.ValueRepresents;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSlicedChart;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.TypeValidator;

/**
 * This class is a controller for AmFunnelChart.
 * @author Iago Fernández Cuñarro
 *
 */
public class AmFunnelChartController extends AmSlicedChartController<AmSlicedChart> implements IAmFunnelChartController {

	
	private static final long serialVersionUID = 8507677441406620348L;

	public AmFunnelChartController() {
		super(new AmSlicedChart());
		setType(ChartType.funnel);
	}
	
	public Integer getAngle(){
		Object angle = amchart.getFeature("angle");
		
		return angle != null ? ((Number)angle).intValue() : null;
	}
	
	public void setAngle(Number angle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(angle, 0, 360)){
			amchart.setFeature("angle", angle);
		}
	}
	
	public String getBalloonText(){
		return (String) amchart.getFeature("balloonText");
	}
	
	public void setBalloonText(String balloonText){
		amchart.setFeature("balloonText", balloonText);
	}
	
	public String getBaseWidth(){
		return (String) amchart.getFeature("baseWidth");
	}
	
	public void setBaseWidth(String baseWidth) throws CoordException{
		if(TypeValidator.pixelOrPercent(baseWidth)){
			if(baseWidth.contains("%") 
					&& Integer.valueOf(baseWidth.substring(0, baseWidth.length()-1) )>100){
				amchart.setFeature("baseWidth", "100%");
			}else{
				amchart.setFeature("baseWidth", baseWidth);
			}
		}
	}
	
	public Integer getDepth3D(){
		Object depth3D = amchart.getFeature("depth3D");
		
		return depth3D != null ? ((Number)depth3D).intValue() : null;
	}
	
	public void setDepth3D(Number depth3D) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(depth3D, 0, 50)){
				amchart.setFeature("depth3D", depth3D);
			}
		}else{
			amchart.setFeature("depth3D", depth3D);
		}
	}
	
	public String getLabelPosition(){
		return (String) amchart.getFeature("labelPosition");
	}
	
	public void setLabelPosition(Align labelPosition){
		amchart.setFeature("labelPosition", labelPosition.toString());
	}
	
	public String getLabelText(){
		return (String) amchart.getFeature("labelText");
	}
	
	public void setLabelText(String labelText){
		amchart.setFeature("labelText", labelText);
	}
	
	public String getNeckHeight(){
		return (String) amchart.getFeature("neckHeight");
	}
	
	public void setNeckHeight(String neckHeight) throws CoordException{
		if(TypeValidator.pixelOrPercent(neckHeight)){
			if(neckHeight.contains("%") 
					&& Integer.valueOf(neckHeight.substring(0, neckHeight.length()-1) )>100){
				amchart.setFeature("neckHeight", "100%");
			}else{
				amchart.setFeature("neckHeight", neckHeight);
			}
		}
	}
	
	public String getNeckWidth(){
		return (String) amchart.getFeature("neckWidth");
	}
	
	public void setNeckWidth(String neckWidth) throws CoordException{
		if(TypeValidator.pixelOrPercent(neckWidth)){
			if(neckWidth.contains("%") 
					&& Integer.valueOf(neckWidth.substring(0, neckWidth.length()-1) )>100){
				amchart.setFeature("neckWidth", "100%");
			}else{
				amchart.setFeature("neckWidth", neckWidth);
			}
		}
	}
	
	public String getPullDistance(){
		return (String) amchart.getFeature("pullDistance");
	}
	
	public void setPullDistance(String pullDistance) throws CoordException{
		if(TypeValidator.pixelOrPercent(pullDistance)){
			if(pullDistance.contains("%") 
					&& Integer.valueOf(pullDistance.substring(0, pullDistance.length()-1) )>10){
				amchart.setFeature("pullDistance", "10%");
			}
			else if(!pullDistance.contains("%") 
					&& Integer.valueOf(pullDistance.substring(0, pullDistance.length()-1) )>30){
				amchart.setFeature("pullDistance", 30);
			}
			else{
				amchart.setFeature("pullDistance", pullDistance);
			}
		}
	}
	
	@JsonProperty(value="rotate")
	public Boolean isRotate(){
		return (Boolean) amchart.getFeature("rotate");
	}
	
	public void setRotate(Boolean rotate){
		amchart.setFeature("rotate", rotate);
	}
	
	public Integer getStartX(){
		Object startX = amchart.getFeature("startX");
		
		return startX != null ? ((Number)startX).intValue() : null;
	}
	
	public void setStartX(Number startX) throws IntegerException{
		if(NumberValidator.integerValidator(startX)){
			amchart.setFeature("startX", startX);
		}
	}
	
	public Integer getStartY(){
		Object startY = amchart.getFeature("startY");
		
		return startY != null ? ((Number)startY).intValue() : null;
	}
	
	public void setStartY(Number startY) throws IntegerException{
		if(NumberValidator.integerValidator(startY)){
			amchart.setFeature("startY", startY);
		}
	}
	
	public String getValueRepresents(){
		return (String) amchart.getFeature("valueRepresents");
	}
	
	public void setValueRepresents(ValueRepresents valueRepresents){
		amchart.setFeature("valueRepresents", valueRepresents.toString());
	}

}
