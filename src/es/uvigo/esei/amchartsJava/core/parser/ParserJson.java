package es.uvigo.esei.amchartsJava.core.parser;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmXyChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphCandleController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphOhlcController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideCategoryAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;

public class ParserJson {
	
	public static ObjectMapper getParserJson(){
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.enable(SerializationFeature.INDENT_OUTPUT);
		 mapper.configure(MapperFeature.AUTO_DETECT_IS_GETTERS,true);
  	   	 mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES,false);
  	   	 return mapper;
	}
	
	public static void addGraphsFromJsonToAmSerialChart(AmSerialChartController serialChartController){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File("I:/prueba.json"));
			for(int i = 0; i<node.path("graphs").size();i++){
				temp = mapper.treeToValue(node.path("graphs").path(i), Object.class);
				
				if(temp.toString().contains("step")){
					AmGraphStepController step = null;
					step =mapper.treeToValue(node.path("graphs").path(i), AmGraphStepController.class);
					try {
						serialChartController.addGraph(step);
					} catch (NotSupportedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(temp.toString().contains("candlestick")){
					AmGraphCandleController candle = null;
					candle = mapper.treeToValue(node.path("graphs").path(i), AmGraphCandleController.class);
					try {
						serialChartController.addGraph(candle);
					} catch (NotSupportedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(temp.toString().contains("ohlc")){
					AmGraphOhlcController ohlc = null;
					ohlc = mapper.treeToValue(node.path("graphs").path(i), AmGraphOhlcController.class);
					try {
						serialChartController.addGraph(ohlc);
					} catch (NotSupportedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else{
					AmGraphSerialController serial = null;
					serial =mapper.treeToValue(node.path("graphs").path(i), AmGraphSerialController.class);
					try {
						serialChartController.addGraph(serial);
					} catch (NotSupportedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}catch(IOException e1){
					e1.printStackTrace();
		}
		
	}
	
	public static void addGraphsFromJsonToAmXyChart(AmXyChartController xyChartController){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File("I:/prueba.json"));
			for(int i = 0; i<node.path("graphs").size();i++){
				temp = mapper.treeToValue(node.path("graphs").path(i), Object.class);
				
				if(temp.toString().contains("maxBulletSize")){
					AmGraphXyController xy = null;
					xy = mapper.treeToValue(node.path("graphs").path(i), AmGraphXyController.class);
					try {
						xyChartController.addGraph(xy);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}
			}
		}catch(IOException e1){
					e1.printStackTrace();
		}
		
	}
	
	public static void addGuidesFromJsonToAmSerialChart(AmSerialChartController serialChartController){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File("I:/prueba.json"));
			for(int i = 0; i<node.path("guides").size();i++){
				temp = mapper.treeToValue(node.path("guides").path(i), Object.class);
				
				if(temp.toString().contains("expand")){
					GuideCategoryAxisController guideCategory = null;
					guideCategory = mapper.treeToValue(node.path("guides").path(i), GuideCategoryAxisController.class);
					try {
						serialChartController.addGuide(guideCategory);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}else if(!temp.toString().contains("angle")){
					GuideValueAxisController guideValueAxis = null;
					guideValueAxis = mapper.treeToValue(node.path("guides").path(i), GuideValueAxisController.class);
					try {
						serialChartController.addGuide(guideValueAxis);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}
			}
		}catch(IOException e1){
				e1.printStackTrace();
		}
	
	}
	
	public static void addGuidesFromJsonToAmXyChart(AmXyChartController xyChartController){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File("I:/prueba.json"));
			for(int i = 0; i<node.path("guides").size();i++){
				temp = mapper.treeToValue(node.path("guides").path(i), Object.class);
				
				if(!temp.toString().contains("angle") && !temp.toString().contains("expand")){
					GuideValueAxisController guideValueAxis = null;
					guideValueAxis = mapper.treeToValue(node.path("guides").path(i), GuideValueAxisController.class);
					try {
						xyChartController.addGuide(guideValueAxis);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}
			}
		}catch(IOException e1){
				e1.printStackTrace();
		}
		
	}
	
	public static void addGuidesFromJsonToAmRadarChart(AmRadarChartController radarChartController){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File("I:/prueba.json"));
			for(int i = 0; i<node.path("guides").size();i++){
				temp = mapper.treeToValue(node.path("guides").path(i), Object.class);
				
				if(temp.toString().contains("angle")){
					GuideRadarChartController guideRadar = null;
					guideRadar = mapper.treeToValue(node.path("guides").path(i), GuideRadarChartController.class);
					try {
						radarChartController.addGuide(guideRadar);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}
			}
		}catch(IOException e1){
				e1.printStackTrace();
		}
		
	}
	
	public static void addTrendLinesFromJsonToAmSerialChart(AmSerialChartController serialChartController){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File("I:/prueba.json"));
			for(int i = 0; i<node.path("trendLines").size();i++){
				temp = mapper.treeToValue(node.path("trendLines").path(i), Object.class);
				
				if(!temp.toString().contains("initialXValue")){
					TrendLineSerialChartController trendLineSerial = null;
					trendLineSerial = mapper.treeToValue(node.path("trendLines").path(i), TrendLineSerialChartController.class);
					try {
						serialChartController.addTrendLine(trendLineSerial);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}
			}
		}catch(IOException e1){
				e1.printStackTrace();
		}
		
	}
	
	public static void addTrendLinesFromJsonToAmXyChart(AmXyChartController xyChartController){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File("I:/prueba.json"));
			for(int i = 0; i<node.path("trendLines").size();i++){
				temp = mapper.treeToValue(node.path("trendLines").path(i), Object.class);
				
				if(temp.toString().contains("initialXValue")){
					TrendLineXyChartController trendLineXy = null;
					trendLineXy = mapper.treeToValue(node.path("trendLines").path(i), TrendLineXyChartController.class);
					try {
						xyChartController.addTrendLine(trendLineXy);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}
			}
		}catch(IOException e1){
				e1.printStackTrace();
		}
		
	}
	
	public static void addValueAxisFromJsonToAmSerialChart(AmSerialChartController serialChartController){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File("I:/prueba.json"));
			for(int i = 0; i<node.path("valueAxes").size();i++){
				temp = mapper.treeToValue(node.path("valueAxes").path(i), Object.class);
				
				if(!temp.toString().contains("radarCategoriesEnabled")){
					ValueAxisController valueAxis = null;
					valueAxis = mapper.treeToValue(node.path("valueAxes").path(i), ValueAxisController.class);
					try {
						serialChartController.addValueAxis(valueAxis);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}
			}
		}catch(IOException e1){
				e1.printStackTrace();
		}
		
	}
	
	public static void addValueAxisFromJsonToAmXyChart(AmXyChartController xyChartController){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File("I:/prueba.json"));
			for(int i = 0; i<node.path("valueAxes").size();i++){
				temp = mapper.treeToValue(node.path("valueAxes").path(i), Object.class);
				
				if(!temp.toString().contains("radarCategoriesEnabled")){
					ValueAxisController valueAxis = null;
					valueAxis = mapper.treeToValue(node.path("valueAxes").path(i), ValueAxisController.class);
					try {
						xyChartController.addValueAxis(valueAxis);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}
			}
		}catch(IOException e1){
				e1.printStackTrace();
		}
		
	}
	
	public static void addValueAxisFromJsonToAmRadarChart(AmRadarChartController radarChartController){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File("I:/prueba.json"));
			for(int i = 0; i<node.path("valueAxes").size();i++){
				temp = mapper.treeToValue(node.path("valueAxes").path(i), Object.class);
				
				if(temp.toString().contains("radarCategoriesEnabled")){
					ValueAxisController valueAxis = null;
					valueAxis = mapper.treeToValue(node.path("valueAxes").path(i), ValueAxisRadarChartController.class);
					try {
						radarChartController.addValueAxis(valueAxis);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}
			}
		}catch(IOException e1){
				e1.printStackTrace();
		}
		
	}
	
	
	 
	 
}
