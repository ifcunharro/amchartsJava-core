package es.uvigo.esei.amchartsJava.core.parser;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphCandleController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphOhlcController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;

public class ParserJson {
	
	public static ObjectMapper getParserJson(){
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.enable(SerializationFeature.INDENT_OUTPUT);
		 mapper.configure(MapperFeature.AUTO_DETECT_IS_GETTERS,true);
  	   	 mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES,false);
  	   	 return mapper;
	}
	
	public static AmSerialChartController addGraphsFromJsonToAmSerialChart(AmSerialChartController serialChartController){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File("I:/prueba.json"));
			for(int i = 0; i<node.path("graphs").size();i++){
				temp = mapper.treeToValue(node.path("graphs").path(i), Object.class);
				
				if(temp.toString().contains("maxBulletSize")){
					AmGraphXyController xy = null;
					xy = mapper.treeToValue(node.path("graphs").path(i), AmGraphXyController.class);
					serialChartController.addGraph(xy);
				}else if(temp.toString().contains("step")){
					AmGraphStepController step = null;
					step =mapper.treeToValue(node.path("graphs").path(i), AmGraphStepController.class);
					serialChartController.addGraph(step);
				}else if(temp.toString().contains("candlestick")){
					AmGraphCandleController candle = null;
					candle = mapper.treeToValue(node.path("graphs").path(i), AmGraphCandleController.class);
					serialChartController.addGraph(candle);
				}else if(temp.toString().contains("ohlc")){
					AmGraphOhlcController ohlc = null;
					ohlc = mapper.treeToValue(node.path("graphs").path(i), AmGraphOhlcController.class);
					serialChartController.addGraph(ohlc);
				}
				else{
					AmGraphSerialController serial = null;
					serial =mapper.treeToValue(node.path("graphs").path(i), AmGraphSerialController.class);
					serialChartController.addGraph(serial);
				}
			}
		}catch(IOException e1){
					e1.printStackTrace();
		}
		return serialChartController;
	}
}
