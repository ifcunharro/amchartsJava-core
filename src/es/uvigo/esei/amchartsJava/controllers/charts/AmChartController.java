package es.uvigo.esei.amchartsJava.controllers.charts;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.constants.ChartTypesConstant.ChartType;
import es.uvigo.esei.amchartsJava.constants.CreditsPositionConstant.CreditsPosition;
import es.uvigo.esei.amchartsJava.constants.SeparatorConstant.Separator;
import es.uvigo.esei.amchartsJava.controllers.AmLegendController;
import es.uvigo.esei.amchartsJava.controllers.LabelController;
import es.uvigo.esei.amchartsJava.controllers.TitleController;
import es.uvigo.esei.amchartsJava.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.model.AmChart;
import es.uvigo.esei.amchartsJava.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.validators.NumberValidator;

@JsonInclude(Include.NON_NULL)
public abstract class AmChartController<E extends AmChart>{
	
	protected E amchart;
	

	
	protected AmChartController(E chart) {
		amchart = chart;
		amchart.setFeature("pathToImages", "../amcharts/images");
	}

	

	//properties
	@JsonProperty(value = "addClassNames")
	public Object IsAddClassNames(){
		return amchart.getFeature("addClassNames");
	}
	
	public void setAddClassNames(Boolean addClassNames){
		amchart.setFeature("addClassNames",addClassNames);
	}
	
	public Object getBackgroundAlpha(){
		return amchart.getFeature("backGroundAlpha");
	}
	
	public void setBackGroundAlpha(Number backGroundAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(backGroundAlpha, 0, 1)){
			amchart.setFeature("backGroundAlpha", backGroundAlpha);
		}
	}
	
	public Object getBackGroundColor(){
		return amchart.getFeature("backGroundColor");
	}
	
	public void setBackGroundColor(String backGrouncColor) throws ColorException{
		if(ColorValidator.checkFormatColor(backGrouncColor)){
			amchart.setFeature("backGroundColor", backGrouncColor);
		}
	}
	
	public Object getBorderAlpha(){
		return amchart.getFeature("borderAlpha");
	}
	
	public void setBorderAlpha(Number borderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(borderAlpha, 0, 1)){
			amchart.setFeature("borderAlpha", borderAlpha);
		}
	}
	
	public Object getBorderColor(){
		return amchart.getFeature("borderColor");
	}
	
	public void setBorderColor(String borderColor) throws ColorException{
		if(ColorValidator.checkFormatColor(borderColor)){
			amchart.setFeature("borderColor", borderColor);
		}
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
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			amchart.setFeature("color", color);
		}
	}
	
	public Object getCreditsPosition(){
		return amchart.getFeature("creditsPosition");
	}
	
	public void setCreditsPosition(CreditsPosition creditsPosition){
		amchart.setFeature("creditsPosition", creditsPosition.toString());
	}
	
	public Object getDecimalSepartator(){
		return amchart.getFeature("decimalSeparator");
	}
	//punto o coma, ningun otro para evitar conflictos
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
	
	public void setFontSize(Number fontSize) throws IntegerException{
		if(NumberValidator.integerValidator(fontSize)){
			amchart.setFeature("fontSize", fontSize);
		}
	}
	
	@JsonProperty(value = "handDrawn")
	public Object isHandDrawn(){
		return amchart.getFeature("handDrawn");
	}
	
	public void setHandDrawn(Boolean handDrawn){
		amchart.setFeature("handDrawn", handDrawn);
	}
	
	public Object getHandDrawScatter(){
		return amchart.getFeature("handDrawScatter");
	}
	
	public void setHandDrawScatter(Number handDrawScatter) throws IntegerException{
		if(NumberValidator.integerValidator(handDrawScatter)){
			amchart.setFeature("handDrawScatter", handDrawScatter);
		}
	}
	
	public Object getHandDrawThickness(){
		return amchart.getFeature("handDrawThickness");
	}
	
	public void setHandDrasThickness(Number handDrawThickness) throws IntegerException{
		if(NumberValidator.integerValidator(handDrawThickness)){
			amchart.setFeature("handDrawThickness", handDrawThickness);
		}
	}
	
	public Object getHideBalloonTime(){
		return amchart.getFeature("hideBalloonTime");
	}
	
	public void setHideBalloonTime(Number hideBalloonTime) throws IntegerException{
		if(NumberValidator.integerValidator(hideBalloonTime)){
			amchart.setFeature("hideBalloonTime", hideBalloonTime);
		}
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
		if(amchart.getLegend()!=null){
			return amchart.getLegendDiv();
		}else{
			return null;
		}
	}
	
	@JsonProperty(value = "panEventsEnabled")
	public Object isPanEventsEnabled(){
		return amchart.getFeature("panEventsEnabled");
	}
	
	public void setPanEventsEnabled(Boolean panEventsEnabled){
		amchart.setFeature("panEventsEnabled", panEventsEnabled);
	}
	
	public Object getPathToImages(){
		return amchart.getFeature("pathToImages");
	}
	
	//FALTA VALIDAR PATH, SE DA UNO POR DEFECTO ../amcharts/images
	public void setPathToImages(String pathToImages){
		amchart.setFeature("pathToImages", pathToImages);
	}
	
	public Object getPercentPrecision(){
		return amchart.getFeature("percentPrecision");
	}
	
	public void setPercentPrecision(Number percentPrecision) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(percentPrecision, -1, 2)){
			amchart.setFeature("percentPrecision", percentPrecision);
		}
	}
	
	public Object getPrecision(){
		return amchart.getFeature("precision");
	}
	
	public void setPrecision(Number precision) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(precision, -1, 2)){
			amchart.setFeature("precision", precision);
		}
	}
	
	
	/*
	
	PREFIXES NECESITA DE UN OBSERVER Y COMPROBACION DE COLISIONES
	*/
	/*public Object getPrefixesOfBigNumbers(){
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
	}*/
	
	//nombre file js in folder themes sin extension,
	//se puede crear el tuyo propio
	public Object getTheme(){
		return amchart.getFeature("theme");
	}
	
	//debe existir file theme
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
	
	public Object getType(){
		return amchart.getFeature("type");
	}
	
	public void setType(ChartType type){
		amchart.setFeature("type", type.toString());
	}
	
	@JsonProperty(value = "usePrefixes")
	public Object isUsePrefixes(){
		return amchart.getFeature("usePrefixes");
	}
	
	public void setUsePrefixes(Boolean usePrefixes){
		amchart.setFeature("usePrefixes", usePrefixes);
	}
	
	//only read
	public Object getVersion(){
		return amchart.getFeature("version");
	}
	
	
	//methods 
	//propio
	public List<LabelController> getAllLabels(){
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
	public void addLabel(LabelController labelController){
		amchart.addLabel(labelController);
	}
	//method amcharts
	public void addLegend(AmLegendController amLegendController){
		amchart.addLegend(amLegendController);
	}
	//method amcharts
	public void addTitle(TitleController titleController){
		amchart.addTitle(titleController);
	}
	
	//method amcharts
	public void clearLabels(){
		amchart.clearLabels();
	}
	//method amcharts
	public void removeLegend(){
		amchart.removeLegend();
	}
	
	
}
