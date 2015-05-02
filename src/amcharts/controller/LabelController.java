package amcharts.controller;


import amcharts.model.Constants.AlignConstant.Align;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import model.Label;

@JsonInclude(Include.NON_EMPTY)
public class LabelController {
	private Label label;
	
	{
		label = new Label();
	}
	
	public Object getAlign(){
		return label.getFeature("align");
	}
	//solo left, center o right
	public void setAlign(Align labelAlign){
		label.setFeature("align", labelAlign.toString());
	}

	public Object getAlpha(){
		return label.getFeature("alpha");
	}
	
	public void setAlpha(Number alpha){
		label.setFeature("alpha", alpha);
	}
	
	@JsonProperty
	public Object isBold(){
		return label.getFeature("bold");
	}
	
	public void setBold(Boolean bold){
		label.setFeature("bold", bold);
	}
	
	public Object getColor(){
		return label.getFeature("color");
	}
	
	public void setColor(String color){
		label.setFeature("color", color);
	}
	
	public Object getId(){
		return label.getFeature("id");
	}
	
	public void setId(String id){
		label.setFeature("id", id);
	}
	
	public Object getRotation(){
		return label.getFeature("rotation");
	}
	
	public void setRotation(Number rotation){
		label.setFeature("rotation", rotation);
	}
	
	public Object getSize(){
		return label.getFeature("size");
	}
	
	public void setSize(Number size){
		label.setFeature("size", size);
	}
	
	public Object getText(){
		return label.getFeature("text");
	}
	
	public void setText(String text){
		label.setFeature("text", text);
	}
	
	public Object getUrl(){
		return label.getFeature("url");
	}
	
	public void setUrl(String url){
		label.setFeature("url", url);
	}

	public Object getX(){
		return label.getFeature("xCoord");
	}
	
	public void setX(String xCoord){
		label.setFeature("x", xCoord);
	}
	
	public Object getY(){
		return label.getFeature("yCoord");
	}
	
	public void setY(String yCoord){
		label.setFeature("y", yCoord);
	}
}
