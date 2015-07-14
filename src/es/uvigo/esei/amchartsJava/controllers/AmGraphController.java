package es.uvigo.esei.amchartsJava.controllers;

import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.constants.ColorsChart;
import es.uvigo.esei.amchartsJava.constants.BulletConstant.Bullet;
import es.uvigo.esei.amchartsJava.model.AmGraph;

@JsonInclude(Include.NON_NULL)
public abstract class AmGraphController<E extends AmGraph> implements Observer {
	private E amGraph;
	
	public AmGraphController(E graph){
		amGraph = graph;
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setId("AmGraph-"+arg.toString());
		this.setTitle("AmGraph-"+arg.toString());
		
	}

	public Object getId(){
		return amGraph.getFeature("id");
	}
	
	private void setId(String id) {
		amGraph.setFeature("id", id);	
	}
	
	public Object getAlphaField(){
		return amGraph.getFeature("alphaField");
	}
	
	public void setAlphaField(String alphaField){
		amGraph.setFeature("alphaField", alphaField);
	}
	
	@JsonProperty(value="animationPlayed")
	public Object isAnimationPlayed(){
		return amGraph.getFeature("animationPlayed");
	}
	
	public void setAnimationPlayed(Boolean animationPlayed){
		amGraph.setFeature("animationPlayed", animationPlayed);
	}
	
	public Object getBalloonColor(){
		return amGraph.getFeature("balloonColor");
	}
	
	public void setBalloonColor(ColorsChart balloonColor){
		amGraph.setFeature("balloonColor", balloonColor.toString());
	}
	
	public Object getBalloonFunction(){
		return amGraph.getFeature("balloonFunction");
	}
	
	public void setBalloonFunction(String balloonFunction){
		amGraph.setFeature("balloonFunction", balloonFunction);
	}
	
	@JsonProperty(value="behindColumns")
	public Object isBehindColumns(){
		return amGraph.getFeature("behindColumns");
	}
	
	public void setBehindColumns(Boolean behindColumns){
		amGraph.setFeature("behindColumns", behindColumns);
	}
	
	public Object getBullet(){
		return amGraph.getFeature("bullet");
	}
	
	public void setBullet(Bullet bullet){
		amGraph.setFeature("bullet", bullet.toString());
	}
	
	public Object getBulletAlpha(){
		return amGraph.getFeature("bulletAlpha");
	}
	
	public void setBulletAlpha(Number bulletAlpha){
		amGraph.setFeature("bulletAlpha", bulletAlpha);
	}
	
	public Object getBulletBorderAlpha(){
		return amGraph.getFeature("bulletBorderAlpha");
	}
	
	public void setBulletBorderAlpha(Number bulletBorderAlpha){
		amGraph.setFeature("bulletBorderAlpha", bulletBorderAlpha);
	}
	
	public Object getBulletBordeColor(){
		return amGraph.getFeature("bulletBorderColor");
	}
	
	public void setBulletBorderColor(ColorsChart bulletBorderColor){
		amGraph.setFeature("bulletBorderColor", bulletBorderColor.toString());
	}
	
	public Object getBulletBorderThickness(){
		return amGraph.getFeature("bulletBorderThickness");
	}
	
	public void setBulletBorderThickness(Number bulletBorderThickness){
		amGraph.setFeature("bulletBorderThickness", bulletBorderThickness);
	}
	
	public Object getBulletColor(){
		return amGraph.getFeature("bulletColor");
	}
	
	public void setBulletColor(ColorsChart bulletColor){
		amGraph.setFeature("bulletColor", bulletColor.toString());
	}
	
	public Object getBulletField(){
		return amGraph.getFeature("bulletField");
	}
	
	public void setBulletField(String bulletField){
		amGraph.setFeature("bulletField", bulletField);
	}
	
	public Object getBulletOffset(){
		return amGraph.getFeature("bulletOffset");
	}
	
	public void setBulletOffset(Number bulletOffset){
		amGraph.setFeature("bulletOffset", bulletOffset);
	}
	
	public Object getBulletSize(){
		return amGraph.getFeature("bulletSize");
	}
	
	public void setBulletSize(Number bulletSize){
		amGraph.setFeature("bulletSize", bulletSize);
	}
	
	public Object getBulletSizeField(){
		return amGraph.getFeature("bulletSizeField");
	}
	
	public void setBulletSizeField(String bulletSizeField){
		amGraph.setFeature("bulletSizeField", bulletSizeField);
	}
	
	public Object getCloseField(){
		return amGraph.getFeature("closeField");
	}
	
	public void setCloseField(String closeField){
		amGraph.setFeature("closeField", closeField);
	}
	
	@JsonProperty(value="clustered")
	public Object isClustered(){
		return amGraph.getFeature("clustered");
	}
	
	public void setClustered(Boolean clustered){
		amGraph.setFeature("clustered", clustered);
	}
	
	public Object getColor(){
		return amGraph.getFeature("color");
	}
	
	public void setColor(ColorsChart color){
		amGraph.setFeature("color", color.toString());
	}
	
	public Object getColorField(){
		return amGraph.getFeature("colorField");
	}
	
	public void setColorField(String colorField){
		amGraph.setFeature("colorField", colorField);
	}
	
	public Object getColumnWidth(){
		return amGraph.getFeature("columnWidth");
	}
	
	public void setColumnWidth(Number columnWidth){
		amGraph.setFeature("columnWidth", columnWidth);
	}
	
	@JsonProperty(value="connect")
	public Object isConnect(){
		return amGraph.getFeature("connect");
	}
	
	public void setConnect(Boolean connect){
		amGraph.setFeature("connect", connect);
	}
	
	public Object getCornerRadiusTop(){
		return amGraph.getFeature("cornerRadiusTop");
	}
	
	public void setCornerRadiusTop(Number cornerRadiusTop){
		amGraph.setFeature("cornerRadiusTop", cornerRadiusTop);
	}
	
	public Object getCursorBulletAlpha(){
		return amGraph.getFeature("cursorBulletAlpha");
	}
	
	public void setCursorBulletAlpha(Number cursorBulletAlpha){
		amGraph.setFeature("cursorBulletAlpha", cursorBulletAlpha);
	}
	
	public Object getCustomBullet(){
		return amGraph.getFeature("customBullet");
	}
	
	public void setCustomBullet(String customBullet){
		amGraph.setFeature("customBullet", customBullet);
	}
	
	public Object getCustomBulletField(){
		return amGraph.getFeature("customBulletField");
	}
	
	public void setCustomBulletField(String customBulletField){
		amGraph.setFeature("customBulletField", customBulletField);
	}
	
	public Object getCustomMarker(){
		return amGraph.getFeature("customMarker");
	}
	
	public void setCustomMarker(String customMarker){
		amGraph.setFeature("customMarker", customMarker);
	}
	
	public Object getDashLength(){
		return amGraph.getFeature("dashLength");
	}
	
	public void setDashLength(Number dashLength){
		amGraph.setFeature("dashLength", dashLength);
	}
	
	public Object getDashLengthField(){
		return amGraph.getFeature("dashLengthField");
	}
	
	public void setDashLengthField(String dashLengthField){
		amGraph.setFeature("dashLengthField", dashLengthField);
	}
	
	
	
	public Object getTitle(){
		return amGraph.getFeature("title");
	}
	
	public void setTitle(String title) {
		amGraph.setFeature("title", title);
	}
	
	

}
