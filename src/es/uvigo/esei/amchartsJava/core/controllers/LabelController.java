package es.uvigo.esei.amchartsJava.core.controllers;



import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.ILabelController;
import es.uvigo.esei.amchartsJava.core.constants.AlignConstant.Align;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.Label;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.TypeValidator;

@JsonInclude(Include.NON_NULL)
public class LabelController implements Observer, ILabelController, Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 35109066885532425L;
	private Label label;
	
	{
		label = new Label();
		
	}
	
	public LabelController(){
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setId("Label-"+arg.toString());
		
	}
	
	public String getAlign(){
		return (String) label.getFeature("align");
	}
	
	public void setAlign(Align labelAlign){
		label.setFeature("align", labelAlign.toString());
	}

	public Object getAlpha(){
		return label.getFeature("alpha");
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
	
	public Object getRotation(){
		return label.getFeature("rotation");
	}
	
	public void setRotation(Number rotation) throws OutOfRangeException{
		if( NumberValidator.rangeIntegerValidator(rotation, -90, 90)){
					label.setFeature("rotation", rotation);
		}
	}
	
	public Object getSize(){
		return label.getFeature("size");
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
		label.setFeature("text", text);
	}
	
	public String getUrl(){
		return (String) label.getFeature("url");
	}
	
	public void setUrl(String url){
		label.setFeature("url", url);
	}

	public String getX(){
		return (String) label.getFeature("xCoord");
	}
	
	public void setX(String xCoord) throws CoordException{
		if(TypeValidator.pixelOrPercent(xCoord)){
			label.setFeature("x", xCoord);
		}
	}
	
	public String getY(){
		return (String) label.getFeature("yCoord");
	}
	
	public void setY(String yCoord) throws CoordException{
		if(TypeValidator.pixelOrPercent(yCoord)){
			label.setFeature("y", yCoord);
		}
	}
	
	
}
