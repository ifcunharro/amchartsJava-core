package amcharts.controller;


import com.fasterxml.jackson.annotation.JsonProperty;

import amcharts.model.Constants.ChartTypesConstant.ChartType;
import amcharts.model.Constants.CreditsPositionConstant.CreditsPosition;
import amcharts.model.Constants.SeparatorConstant.Separator;
import model.AmLegend;
import model.Label;
import model.Title;
import model.charts.AmChart;

public abstract class AmChartController {
	
	private AmChart amchart;
	
	private AmChartController(){
		amchart.setFeature("pathToImages", "../amcharts/images");
	}
	
	
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
	public void setDecimalSeparator(Separator decimalSeparator){
		amchart.setFeature("decimalSeparator",decimalSeparator.toString());
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
	
	//only-read
	public Object getLegendDiv(){
		return amchart.getLegend().getFeature("divId");
	}
	
	@JsonProperty
	public Object isPanEventsEnabled(){
		return amchart.getFeature("panEventsEnabled");
	}
	
	public void setPanEventsEnabled(Boolean panEventsEnabled){
		amchart.setFeature("panEventsEnabled", panEventsEnabled);
	}
	
	public Object getPathToImages(){
		return amchart.getFeature("pathToImages");
	}
	
	public void setPathToImages(String pathToImages){
		amchart.setFeature("pathToImages", pathToImages);
	}
	
	public Object getPercentPrecision(){
		return amchart.getFeature("percentPrecision");
	}
	
	public void setPercentPrecision(Number percentPrecision){
		amchart.setFeature("percentPrecision", percentPrecision);
	}
	
	public Object getPrecision(){
		return amchart.getFeature("precision");
	}
	
	public void setPrecision(Number precision){
		amchart.setFeature("precision", precision);
	}
	
	public Object getPrefixesOfBigNumbers(){
		return amchart.getBigPrefixes();
	}
	
	public void addPrefixBigNumber(Number number, String prefix){
		amchart.addBigPrefix(number, prefix);
	}
	
	public Object getPrefixesOfSmallNumbers(){
		return amchart.getBigPrefixes();
	}
	
	public void addPrefixSmallNumber(Number number, String prefix){
		amchart.addSmallPrefix(number, prefix);
	}
	
	//nombre file js in folder themes sin extension,
	//se puede crear el tuyo propio
	public Object getTheme(){
		return amchart.getFeature("theme");
	}
	
	public void setTheme(String theme){
		amchart.setFeature("theme", theme);
	}
	
	public Object getThousandsSeparator(){
		return amchart.getFeature("thousandsFeature");
	}
	
	public void setThousandsSeparator(Separator thousandsSeparator){
		amchart.setFeature("thousandsSeparator", thousandsSeparator.toString());
	}
	
	public Object getTitles(){
		return amchart.getTitles();
	}
	
	public void addTitle(Title title){
		amchart.addTitle(title);
	}
	
	public Object getType(){
		return amchart.getFeature("type");
	}
	
	public void setType(ChartType type){
		amchart.setFeature("type", type.toString());
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
