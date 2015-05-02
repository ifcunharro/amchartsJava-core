package amcharts.controller;


import amcharts.model.Constants.CreditsPositionConstant.CreditsPosition;
import model.AmLegend;
import model.Label;
import model.charts.AmChart;

public abstract class AmChartController {
	
	private AmChart amchart;
	
	
	//properties
	public Object IsAddClassNames(){
		return amchart.getFeature("addClassNames");
	}
	
	public void setAddClassNames(Boolean addClassNames){
		amchart.setFeature("addClassNames",addClassNames);
	}
	
	public Object getBackgroundAlpha(){
		return amchart.getFeature("backGroundAlpha");
	}
	//limit 0 a 1 en float
	public void setBackGroundAlpha(Number backGroundAlpha){
		amchart.setFeature("backGroundAlpha", backGroundAlpha);
	}
	
	public Object getBackGroundColor(){
		return amchart.getFeature("backGroundColor");
	}
	
	public void setBackGroundColor(String backGrouncColor){
		amchart.setFeature("backGroundColor", backGrouncColor);
	}
	
	public Object getBorderAlpha(){
		return amchart.getFeature("borderAlpha");
	}
	//limit o a 1 en float
	public void setBorderAlpha(Number borderAlpha){
		amchart.setFeature("borderAlpha", borderAlpha);
	}
	
	public Object getBorderColor(){
		return amchart.getFeature("borderColor");
	}
	
	public void setBorderColor(String borderColor){
		amchart.setFeature("borderColor", borderColor);
	}
	
	public Object getClassNamePrefix(){
		return amchart.getFeature("classNamePrefix");
	}
	
	public void setClassNamePrefix(String classNamePrefix){
		amchart.setFeature("classNamePrefix",classNamePrefix);
	}
	
	public Object getColor(){
		return amchart.getFeature("color");
	}
	
	public void setColor(String color){
		amchart.setFeature("color", color);
	}
	
	public Object getCreditsPosition(){
		return amchart.getFeature("creditsPosition");
	}
	//usar constant creditsPosition
	public void setCreditsPosition(CreditsPosition creditsPosition){
		amchart.setFeature("creditsPosition", creditsPosition.toString());
	}
	
	public Object getDecimalSepartator(){
		return amchart.getFeature("decimalSeparator");
	}
	//punto o coma, ningun otro
	public void setDecimalSeparator(String decimalSeparator){
		amchart.setFeature("decimalSeparator",decimalSeparator);
	}
	
	public Object getFontFamily(){
		return amchart.getFeature("fontFamily");
	}
	
	public void setFontFamily(String fontFamily){
		amchart.setFeature("fontFamily", fontFamily);
	}
	
	public Object getFontSize(){
		return amchart.getFeature("fontSize");
	}
	
	public void setFontSize(Number fontSize){
		amchart.setFeature("fontSize", fontSize);
	}
	
	public Object isHandDrawn(){
		return amchart.getFeature("handDrawn");
	}
	
	public void setHandDrawn(Boolean handDrawn){
		amchart.setFeature("handDrawn", handDrawn);
	}
	
	public Object getHandDrawScatter(){
		return amchart.getFeature("handDrawScatter");
	}
	
	public void setHandDrawScatter(Number handDrawScatter){
		amchart.setFeature("handDrawScatter", handDrawScatter);
	}
	
	public Object getHandDrawThickness(){
		return amchart.getFeature("handDrawThickness");
	}
	
	public void setHandDrasThickness(Number handDrawThickness){
		amchart.setFeature("handDrawThickness", handDrawThickness);
	}
	
	public Object getHideBalloonTime(){
		return amchart.getFeature("hideBalloonTime");
	}
	
	public void setHideBalloonTime(Number hideBalloonTime){
		amchart.setFeature("hideBalloonTime", hideBalloonTime);
	}
	
	//necesario un archivo js de idioma escogido
	public Object getLanguage(){
		return amchart.getFeature("language");
	}
	
	public void setLanguage(String language){
		amchart.setFeature("language", language);
	}
	//methods 
	//propio
	public Object getAllLabels(){
		return amchart.getLabels();
	}
	
	//propio
	public Object getExport(){
		return amchart.getExport();
	}
	//propio
	public void createExport(){
		amchart.createExport();
	}
	
	//propio
	public Object getBalloon(){
		return amchart.getBalloon();
	}
	//propio
	public void createAmBalloon(){
		amchart.createBalloon();
	}
	//propio
	public Object getLegend(){
		return amchart.getLegend();
	}
	
	//propio
	/*public Object getDataProvider(){
		return amchart.getDataProvider();
	}*/
	

	//propio
	/*public Object getDefs(){
		return amchart.getDefs();
	}*/
	
	//method amcharts
	public void addLabel(Label label){
		amchart.addLabel(label);
	}
	//method amcharts
	public void addLegend(AmLegend amLegend){
		amchart.addLegend(amLegend);
	}
	
	
}
