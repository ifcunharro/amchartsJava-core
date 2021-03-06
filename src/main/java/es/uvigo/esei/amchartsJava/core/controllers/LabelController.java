package es.uvigo.esei.amchartsJava.core.controllers;



import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.ILabelController;
import es.uvigo.esei.amchartsJava.core.constants.Align;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.Label;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PropertyValidator;

/**
 * This class i a controller for Label
 * @author Iago Fernández Cuñarro
 *
 */
@JsonInclude(Include.NON_NULL)
public class LabelController implements Observer, ILabelController, Serializable {
	

	private static final long serialVersionUID = 35109066885532425L;
	private Label label;
	
	{
		label = new Label();
		
	}
	
	public LabelController(){
		
	}
	
	//Set id from chart
	@Override
	public void update(Observable o, Object arg) {
		this.setId("Label-"+arg.toString());
		
	}
	
	public String getAlign(){
		return (String) label.getFeature("align");
	}
	
	public void setAlign(Align labelAlign){
		if(labelAlign != null){
			label.setFeature("align", labelAlign.toString());
		}
	}

	public Double getAlpha(){
		Object alpha = label.getFeature("alpha");
		
		return alpha != null ? ((Number)alpha).doubleValue() : null;
	}
	
	public void setAlpha(Number alpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(alpha, 0, 1)){
			label.setFeature("alpha", alpha);
		}
	}
	
	@JsonProperty(value = "bold")
	public Boolean isBold(){
		return (Boolean) label.getFeature("bold");
	}
	
	public void setBold(Boolean bold){
		label.setFeature("bold", bold);
	}
	
	public String getColor(){
		return (String) label.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			label.setFeature("color", color);
		}
	}
	
	public String getId(){
		return (String) label.getFeature("id");
	}
	
	private void setId(String id){
		label.setFeature("id", id);
	}
	
	public Integer getRotation(){
		Object rotation = label.getFeature("rotation");
		
		return rotation != null ? ((Number)rotation).intValue() : null;
	}
	
	public void setRotation(Number rotation) throws OutOfRangeException{
		if( NumberValidator.rangeIntegerValidator(rotation, -90, 90)){
			label.setFeature("rotation", rotation);
		}
	}
	
	public Integer getSize(){
		Object size = label.getFeature("size");
		
		return size != null ? ((Number)size).intValue() : null;
	}
	
	public void setSize(Number size) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(size, 10, 24)){
				label.setFeature("size", size);
			}
		}else{
			label.setFeature("size", size);
		}
	}
	
	public String getText(){
		return (String) label.getFeature("text");
	}
	
	public void setText(String text){
		if(PropertyValidator.isValidString(text)){
			label.setFeature("text", text);
		}
	}
	
	public String getUrl(){
		return (String) label.getFeature("url");
	}
	
	public void setUrl(String url){
		if(PropertyValidator.isValidString(url)){
			label.setFeature("url", url);
		}
	}

	public String getX(){
		return (String) label.getFeature("x");
	}
	
	public void setX(String xCoord) throws CoordException{
		if(PropertyValidator.pixelOrPercent(xCoord)){
			label.setFeature("x", xCoord);
		}
	}
	
	public String getY(){
		return (String) label.getFeature("y");
	}
	
	public void setY(String yCoord) throws CoordException{
		if(PropertyValidator.pixelOrPercent(yCoord)){
			label.setFeature("y", yCoord);
		}
	}
	
	
}
