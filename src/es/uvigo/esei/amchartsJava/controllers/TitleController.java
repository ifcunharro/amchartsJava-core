package es.uvigo.esei.amchartsJava.controllers;

import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.model.Title;

@JsonInclude(Include.NON_NULL)
public class TitleController implements Observer {
	private Title title;
	
	{
		title = new Title();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setId("Title-"+arg.toString());
	}
	
	public Object getAlpha(){
		return title.getFeature("alpha");
	}
	
	public void setAlpha(Number alpha){
		title.setFeature("alpha", alpha);
	}
	
	@JsonProperty
	public Object isBold(){
		return title.getFeature("bold");
	}
	
	public void setBold(Boolean bold){
		title.setFeature("bold", bold);
	}
	
	public Object getColor(){
		return title.getFeature("color");
	}
	
	public void setColor(String color){
		title.setFeature("color", color);
	}
	
	public Object getId(){
		return title.getFeature("id"); 
	}
	
	private void setId(String id){
		title.setFeature("id", id);
	}
	
	public Object getSize(){
		return title.getFeature("size");
	}
	
	public void setSize(Number size){
		title.setFeature("size", size);
	}
	
	public Object getText(){
		return title.getFeature("text");
	}
	
	public void setText(String text){
		title.setFeature("text", text);
	}

	

}
