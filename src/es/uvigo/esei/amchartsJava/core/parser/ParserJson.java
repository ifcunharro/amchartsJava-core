package es.uvigo.esei.amchartsJava.core.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.axis.CategoryAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmAngularGaugeController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmFunnelChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmPieChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmXyChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphCandleController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphOhlcController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideCategoryAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.provider.DataProviderController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.validators.PathValidator;

public class ParserJson {
	
	private static ObjectMapper getParserJson(){
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.enable(SerializationFeature.INDENT_OUTPUT);
		 mapper.configure(MapperFeature.AUTO_DETECT_IS_GETTERS,true);
  	   	 mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES,false);
  	   	 mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, true);
  	   	 mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, false);
  	   	 mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET,false);
  	   	 mapper.setVisibility(PropertyAccessor.SETTER,Visibility.ANY);
  	   	 mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
  	   	 return mapper;
	}
	
	public static void saveJsonToConsole(Object chartController) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		ObjectMapper mapper = getParserJson();
		mapper.writeValue(System.out, chartController);
	}
	
	//evitar sobreescribir existente se hace antes de llamar a este método
	public static void saveJsonToTemp(String nameFileJson,Object chartController) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		String tempDirectory = PathValidator.getJsonDirectoryToSave();
		if(!nameFileJson.contains(".json")){
			nameFileJson = nameFileJson+".json";
		}
		
		ObjectMapper mapper = getParserJson();
		try{
			if((AmSerialChartController) chartController instanceof AmSerialChartController){
				mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
				saveFieldsFromAmSerialChartToTemp(nameFileJson, (AmSerialChartController)chartController);
			}
		}catch(ClassCastException e1){
			e1.printStackTrace();
		}
		try{
			if((AmXyChartController) chartController instanceof AmXyChartController){
				mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
				saveFieldsFromAmXyChartToTemp(nameFileJson, (AmXyChartController)chartController);
			}
		}catch(ClassCastException e1){
			e1.printStackTrace();
		}
		
		try{
			if((AmRadarChartController) chartController instanceof AmRadarChartController){
				mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
				saveFieldsFromAmRadarChartToTemp(nameFileJson, (AmRadarChartController)chartController);
			}
		}catch(ClassCastException e1){
			e1.printStackTrace();
		}
		
		try{
			if((AmFunnelChartController) chartController instanceof AmFunnelChartController){
				mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
				saveFieldsFromAmFunnelChartToTemp(nameFileJson, (AmFunnelChartController)chartController);
			}
		}catch(ClassCastException e1){
			e1.printStackTrace();
		}
		
		try{
			if((AmPieChartController) chartController instanceof AmPieChartController){
				mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
				saveFieldsFromAmPieChartToTemp(nameFileJson, (AmPieChartController)chartController);
			}
		}catch(ClassCastException e1){
			e1.printStackTrace();
		}
		
		try{
			if((AmAngularGaugeController) chartController instanceof AmAngularGaugeController){
				mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
			}
			else{
				mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
			}
		}catch(ClassCastException e1){
			e1.printStackTrace();
		}
		
			
	}
	
	
	
	public static AmSerialChartController loadAmSerialChart(String nameFileJson) 
			throws JsonParseException, JsonMappingException, IOException
	{
		String tempFile = PathValidator.tempFileExist(nameFileJson);
		if(!tempFile.isEmpty()){
			ObjectMapper mapper = getParserJson();
			AmSerialChartController serialController = null;
			
			/* se espera valor incorrecto sin comillas para propiedad export en json se cambia por misma cadena pero
			 * com comillas para evitar JsonParseException y recuperar el valor guardado, actualmente esto
			 *  no importa mucho pues export siempre recibe el mismo valor AmCharts.exportCFG y es el valor
			 *  correcto, sin las comillas
			 */
			FileInputStream fis = new FileInputStream(tempFile);
		    String content = IOUtils.toString(fis, Charset.defaultCharset());
		    content = content.replaceAll("AmCharts.exportCFG", "\"AmCharts.exportCFG\"");
		    
		    FileOutputStream fos = new FileOutputStream(tempFile);
		    IOUtils.write(content, new FileOutputStream(tempFile), Charset.defaultCharset());
		    fis.close();
		    fos.close();
		
			serialController = mapper.readValue(new File(tempFile), AmSerialChartController.class);
			
			addValueAxisFromJsonToAmSerialChart(serialController,tempFile);
			addGraphsFromJsonToAmSerialChart(serialController,tempFile);
			addGuidesFromJsonToAmSerialChart(serialController,tempFile);
			addTrendLinesFromJsonToAmSerialChart(serialController,tempFile);
			addDataProviderFromJsonToAmSerialChart(serialController,tempFile);
			
			return serialController;
		}else{
			throw new IOException(I18n.get("JsonFileNotFoundException"));
		}
		
	}
	
	public static AmXyChartController loadAmXyChart(String nameFileJson) 
			throws JsonParseException, JsonMappingException, IOException
	{
		String tempFile = PathValidator.tempFileExist(nameFileJson);
		if(!tempFile.isEmpty()){
			ObjectMapper mapper = getParserJson();
			AmXyChartController xyController = null;
			
			FileInputStream fis = new FileInputStream(tempFile);
		    String content = IOUtils.toString(fis, Charset.defaultCharset());
		    content = content.replaceAll("AmCharts.exportCFG", "\"AmCharts.exportCFG\"");
		    FileOutputStream fos = new FileOutputStream(tempFile);
		    IOUtils.write(content, new FileOutputStream(tempFile), Charset.defaultCharset());
		    fis.close();
		    fos.close();
			
			xyController = mapper.readValue(new File(tempFile), AmXyChartController.class);
			
			addValueAxisFromJsonToAmXyChart(xyController,tempFile);
			addGraphsFromJsonToAmXyChart(xyController,tempFile);
			addGuidesFromJsonToAmXyChart(xyController,tempFile);
			addTrendLinesFromJsonToAmXyChart(xyController,tempFile);
			addDataProviderFromJsonToAmXyChart(xyController,tempFile);
			
			return xyController;
		}else{
			throw new IOException(I18n.get("JsonFileNotFoundException"));
		}
		
	}
	
	public static AmRadarChartController loadAmRadarChart(String nameFileJson) 
			throws JsonParseException, JsonMappingException, IOException
	{
		String tempFile = PathValidator.tempFileExist(nameFileJson);
		if(!tempFile.isEmpty()){
			ObjectMapper mapper = getParserJson();
			AmRadarChartController radarController = null;
			
			FileInputStream fis = new FileInputStream(tempFile);
		    String content = IOUtils.toString(fis, Charset.defaultCharset());
		    content = content.replaceAll("AmCharts.exportCFG","\"AmCharts.exportCFG\"");
		    FileOutputStream fos = new FileOutputStream(tempFile);
		    IOUtils.write(content, new FileOutputStream(tempFile), Charset.defaultCharset());
		    fis.close();
		    fos.close();
			
			radarController = mapper.readValue(new File(tempFile), AmRadarChartController.class);
			
			addValueAxisFromJsonToAmRadarChart(radarController,tempFile);
			addGraphsFromJsonToAmRadarChart(radarController,tempFile);
			addGuidesFromJsonToAmRadarChart(radarController,tempFile);
			addDataProviderFromJsonToAmRadarChart(radarController,tempFile);
			
			
			return radarController;
		}else{
			throw new IOException(I18n.get("JsonFileNotFoundException"));
		}
		
	}
	
	public static AmFunnelChartController loadAmFunnelChart(String nameFileJson) 
			throws JsonParseException, JsonMappingException, IOException
	{
		String tempFile = PathValidator.tempFileExist(nameFileJson);
		if(!tempFile.isEmpty()){
			ObjectMapper mapper = getParserJson();
			AmFunnelChartController funnelController = null;
			
			FileInputStream fis = new FileInputStream(tempFile);
		    String content = IOUtils.toString(fis, Charset.defaultCharset());
		    content = content.replaceAll("AmCharts.exportCFG", "\"AmCharts.exportCFG\"");
		    FileOutputStream fos = new FileOutputStream(tempFile);
		    IOUtils.write(content, new FileOutputStream(tempFile), Charset.defaultCharset());
		    fis.close();
		    fos.close();
			
			funnelController = mapper.readValue(new File(tempFile), AmFunnelChartController.class);
			
			addDataProviderFromJsonToAmFunnelChart(funnelController,tempFile);
			
			return funnelController;
		}else{
			throw new IOException(I18n.get("JsonFileNotFoundException"));
		}
		
	}
	
	public static AmPieChartController loadAmPieChart(String nameFileJson) 
			throws JsonParseException, JsonMappingException, IOException
	{
		String tempFile = PathValidator.tempFileExist(nameFileJson);
		if(!tempFile.isEmpty()){
			ObjectMapper mapper = getParserJson();
			AmPieChartController pieController = null;
			
			FileInputStream fis = new FileInputStream(tempFile);
		    String content = IOUtils.toString(fis, Charset.defaultCharset());
		    content = content.replaceAll("AmCharts.exportCFG", "\"AmCharts.exportCFG\"");
		    FileOutputStream fos = new FileOutputStream(tempFile);
		    IOUtils.write(content, new FileOutputStream(tempFile), Charset.defaultCharset());
		    fis.close();
		    fos.close();
			
			pieController = mapper.readValue(new File(tempFile), AmPieChartController.class);
			
			addDataProviderFromJsonToAmPieChart(pieController,tempFile);
			
			return pieController;
		}else{
			throw new IOException(I18n.get("JsonFileNotFoundException"));
		}
		
	}
	
	public static AmAngularGaugeController loadAmAngularGauge(String nameFileJson) 
			throws JsonParseException, JsonMappingException, IOException
	{
		String tempFile = PathValidator.tempFileExist(nameFileJson);
		if(!tempFile.isEmpty()){
			ObjectMapper mapper = getParserJson();
			AmAngularGaugeController gaugeController = null;
			
			FileInputStream fis = new FileInputStream(tempFile);
		    String content = IOUtils.toString(fis, Charset.defaultCharset());
		    content = content.replaceAll("AmCharts.exportCFG", "\"AmCharts.exportCFG\"");
		    FileOutputStream fos = new FileOutputStream(tempFile);
		    IOUtils.write(content, new FileOutputStream(tempFile), Charset.defaultCharset());
		    fis.close();
		    fos.close();
			
			gaugeController = mapper.readValue(new File(tempFile), AmAngularGaugeController.class);
			
			addDataProviderFromJsonToAmAngularGauge(gaugeController,tempFile);
			
			return gaugeController;
		}else{
			throw new IOException(I18n.get("JsonFileNotFoundException"));
		}
		
	}
	
	//usar siempre que se use saveJsonToTemp para tener ademas de la configuracion
		//del chart los valores definidos por el usuario para los fields y poder recuperarlos
		private static void saveFieldsFromAmSerialChartToTemp(String nameFileJson, AmSerialChartController serialChart) 
				throws JsonGenerationException, JsonMappingException, IOException
		{
			String tempDirectory = PathValidator.getJsonDirectoryToSave();
			ObjectMapper mapper = getParserJson();
			Map<String,Object> map = new HashMap<>();
			Map<String,String> temp = null;
			
			nameFileJson = nameFileJson.replace(".json", "_keys_fields.json");
			
			map.put("chartFields", serialChart.getChartFields());
			List<Map<String,String>> graphFields = new ArrayList<Map<String,String>>();
			@SuppressWarnings("unchecked")
			List<AmGraphController> graphs = (List<AmGraphController>)serialChart.getGraphs();
			for(AmGraphController graph: graphs){
				temp = graph.getGraphFields();
				if(temp != null){
					graphFields.add(temp);
				}
			}
			if(!graphFields.isEmpty()){
				map.put("graphFields", graphFields);
			}
			
			CategoryAxisController categoryAxis = serialChart.getCategoryAxis();
			if(categoryAxis != null){
				Map<String,String> axesFields = categoryAxis.getAxesFields();
				if(axesFields != null){
					map.put("categoryAxisFields", serialChart.getCategoryAxis().getAxesFields());
				}
			}
		
			
			mapper.writeValue(new File(tempDirectory+nameFileJson), map);
			
		}
		
		private static void saveFieldsFromAmXyChartToTemp(String nameFileJson, AmXyChartController xyChart) 
				throws JsonGenerationException, JsonMappingException, IOException
		{
			String tempDirectory = PathValidator.getJsonDirectoryToSave();
			ObjectMapper mapper = getParserJson();
			Map<String,Object> map = new HashMap<>();
			Map<String,String> temp = null;
			
			nameFileJson = nameFileJson.replace(".json", "_keys_fields.json");
			
			map.put("chartFields", xyChart.getChartFields());
			List<Map<String,String>> graphFields = new ArrayList<Map<String,String>>();
			@SuppressWarnings("unchecked")
			List<AmGraphController> graphs = (List<AmGraphController>)xyChart.getGraphs();
			for(AmGraphController graph: graphs){
				temp = graph.getGraphFields();
				if(temp != null){
					graphFields.add(temp);
				}
			}
			if(!graphFields.isEmpty()){
				map.put("graphFields", graphFields);
			}
			
			mapper.writeValue(new File(tempDirectory+nameFileJson), map);
			
		}
		
		private static void saveFieldsFromAmRadarChartToTemp(String nameFileJson, AmRadarChartController radarChart) 
				throws JsonGenerationException, JsonMappingException, IOException
		{
			String tempDirectory = PathValidator.getJsonDirectoryToSave();
			ObjectMapper mapper = getParserJson();
			Map<String,Object> map = new HashMap<>();
			Map<String,String> temp = null;
			
			nameFileJson = nameFileJson.replace(".json", "_keys_fields.json");
			
			map.put("chartFields", radarChart.getChartFields());
			List<Map<String,String>> graphFields = new ArrayList<Map<String,String>>();
			@SuppressWarnings("unchecked")
			List<AmGraphController> graphs = (List<AmGraphController>)radarChart.getGraphs();
			for(AmGraphController graph: graphs){
				temp = graph.getGraphFields();
				if(temp != null){
					graphFields.add(temp);
				}
			}
			if(!graphFields.isEmpty()){
				map.put("graphFields", graphFields);
			}
			
			mapper.writeValue(new File(tempDirectory+nameFileJson), map);
			
		}
		
		private static void saveFieldsFromAmFunnelChartToTemp(String nameFileJson, AmFunnelChartController funnelChart) 
				throws JsonGenerationException, JsonMappingException, IOException
		{
			String tempDirectory = PathValidator.getJsonDirectoryToSave();
			ObjectMapper mapper = getParserJson();
			Map<String,Object> map = new HashMap<>();
			
			
			nameFileJson = nameFileJson.replace(".json", "_keys_fields.json");
			
			map.put("chartFields", funnelChart.getChartFields());
			
			mapper.writeValue(new File(tempDirectory+nameFileJson), map);
			
		}
		
		private static void saveFieldsFromAmPieChartToTemp(String nameFileJson, AmPieChartController pieChart) 
				throws JsonGenerationException, JsonMappingException, IOException
		{
			String tempDirectory = PathValidator.getJsonDirectoryToSave();
			ObjectMapper mapper = getParserJson();
			Map<String,Object> map = new HashMap<>();
		
			nameFileJson = nameFileJson.replace(".json", "_keys_fields.json");
			
			map.put("chartFields", pieChart.getChartFields());
			
			mapper.writeValue(new File(tempDirectory+nameFileJson), map);
			
		}
		
		
	
	
	@SuppressWarnings("unchecked")
	private static void addDataProviderFromJsonToAmSerialChart(AmSerialChartController serialChartController, String tempFile) 
			throws JsonProcessingException, IOException
	{
		ObjectMapper mapper = getParserJson();
		HashMap<String, Object> map = null;
		HashMap<String, String> fieldKeys = null;
		//para cargar graphFields
		List<HashMap<String,String>> listGraphFields = null;
		HashMap<String, String> graphFields = null;
		//para cargar categoryAxisFields
		HashMap<String,String> axesFields = null;
		
		DataProviderController dataProvider = new DataProviderController();
		
		JsonNode node = mapper.readTree(new File(tempFile));
		
		for(int i = 0; i<node.path("dataProvider").size();i++){
			map = mapper.treeToValue(node.path("dataProvider").path(i), HashMap.class);
			dataProvider.addData(map);
		}
		
		tempFile = tempFile.replace(".json", "_keys_fields.json");
		JsonNode nodeFields = mapper.readTree(new File(tempFile));
		
		try{
			
			fieldKeys = mapper.treeToValue(nodeFields.path("chartFields"), HashMap.class);
			
			if(!fieldKeys.isEmpty()){
				serialChartController.setChartFields(fieldKeys);
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		try{
			listGraphFields = mapper.treeToValue(nodeFields.path("graphFields"), List.class);
			if(!listGraphFields.isEmpty()){
				List<AmGraphController> graphs = (List<AmGraphController>)serialChartController.getGraphs();
				TypeFactory typeFactory = mapper.getTypeFactory();
				MapType mapType = typeFactory.constructMapType(HashMap.class, String.class, String.class);
				for(int i = 0;i < nodeFields.path("graphFields").size();i++){
					graphFields = mapper.readValue(mapper.writeValueAsString(listGraphFields.get(i)), mapType);
					graphs.get(i).setGraphFields(graphFields);
				}
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		try{
			axesFields = mapper.treeToValue(nodeFields.path("categoryAxisFields"), HashMap.class);
			if(!axesFields.isEmpty()){
				
				if(serialChartController.getCategoryAxis()!=null){
					serialChartController.getCategoryAxis().setAxesFields(axesFields);
				}
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
		serialChartController.setDataProvider(dataProvider);		
	}
	
	@SuppressWarnings("unchecked")
	private static void addDataProviderFromJsonToAmXyChart(AmXyChartController xyChartController, String tempFile) 
			throws JsonProcessingException, IOException
	{
		ObjectMapper mapper = getParserJson();
		HashMap<String, Object> map = null;
		HashMap<String, String> fieldKeys = null;
		//para cargar graphFields
		List<HashMap<String,String>> listGraphFields = null;
		HashMap<String, String> graphFields = null;
		
		
		DataProviderController dataProvider = new DataProviderController();
		
		JsonNode node = mapper.readTree(new File(tempFile));
		
		for(int i = 0; i<node.path("dataProvider").size();i++){
			map = mapper.treeToValue(node.path("dataProvider").path(i), HashMap.class);
			dataProvider.addData(map);
		}
		
		tempFile = tempFile.replace(".json", "_keys_fields.json");
		JsonNode nodeFields = mapper.readTree(new File(tempFile));
		
		try{
			
			fieldKeys = mapper.treeToValue(nodeFields.path("chartFields"), HashMap.class);
			
			if(!fieldKeys.isEmpty()){
				xyChartController.setChartFields(fieldKeys);
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		try{
			listGraphFields = mapper.treeToValue(nodeFields.path("graphFields"), List.class);
			if(!listGraphFields.isEmpty()){
				List<AmGraphController> graphs = (List<AmGraphController>)xyChartController.getGraphs();
				TypeFactory typeFactory = mapper.getTypeFactory();
				MapType mapType = typeFactory.constructMapType(HashMap.class, String.class, String.class);
				for(int i = 0;i < nodeFields.path("graphFields").size();i++){
					graphFields = mapper.readValue(mapper.writeValueAsString(listGraphFields.get(i)), mapType);
					graphs.get(i).setGraphFields(graphFields);
				}
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
		xyChartController.setDataProvider(dataProvider);		
	}
	
	@SuppressWarnings("unchecked")
	private static void addDataProviderFromJsonToAmRadarChart(AmRadarChartController radarChartController, String tempFile) 
			throws JsonProcessingException, IOException
	{
		ObjectMapper mapper = getParserJson();
		HashMap<String, Object> map = null;
		HashMap<String, String> fieldKeys = null;
		//para cargar graphFields
		List<HashMap<String,String>> listGraphFields = null;
		HashMap<String, String> graphFields = null;
	
		DataProviderController dataProvider = new DataProviderController();
		
		JsonNode node = mapper.readTree(new File(tempFile));
		
		for(int i = 0; i<node.path("dataProvider").size();i++){
			map = mapper.treeToValue(node.path("dataProvider").path(i), HashMap.class);
			dataProvider.addData(map);
		}
		
		tempFile = tempFile.replace(".json", "_keys_fields.json");
		JsonNode nodeFields = mapper.readTree(new File(tempFile));
		
		try{
			
			fieldKeys = mapper.treeToValue(nodeFields.path("chartFields"), HashMap.class);
			
			if(!fieldKeys.isEmpty()){
				radarChartController.setChartFields(fieldKeys);
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		try{
			listGraphFields = mapper.treeToValue(nodeFields.path("graphFields"), List.class);
			if(!listGraphFields.isEmpty()){
				List<AmGraphController> graphs = (List<AmGraphController>)radarChartController.getGraphs();
				TypeFactory typeFactory = mapper.getTypeFactory();
				MapType mapType = typeFactory.constructMapType(HashMap.class, String.class, String.class);
				for(int i = 0;i < nodeFields.path("graphFields").size();i++){
					graphFields = mapper.readValue(mapper.writeValueAsString(listGraphFields.get(i)), mapType);
					graphs.get(i).setGraphFields(graphFields);
				}
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
		
		radarChartController.setDataProvider(dataProvider);		
	}
	
	@SuppressWarnings("unchecked")
	private static void addDataProviderFromJsonToAmFunnelChart(AmFunnelChartController funnelChartController, String tempFile) 
			throws JsonProcessingException, IOException
	{
		ObjectMapper mapper = getParserJson();
		HashMap<String, Object> map = null;
		HashMap<String, String> fieldKeys = null;
		
		DataProviderController dataProvider = new DataProviderController();
		
		JsonNode node = mapper.readTree(new File(tempFile));
		
		for(int i = 0; i<node.path("dataProvider").size();i++){
			map = mapper.treeToValue(node.path("dataProvider").path(i), HashMap.class);
			dataProvider.addData(map);
		}
		
		tempFile = tempFile.replace(".json", "_keys_fields.json");
		JsonNode nodeFields = mapper.readTree(new File(tempFile));
		
		try{
			
			fieldKeys = mapper.treeToValue(nodeFields.path("chartFields"), HashMap.class);
			
			if(!fieldKeys.isEmpty()){
				funnelChartController.setChartFields(fieldKeys);
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
		funnelChartController.setDataProvider(dataProvider);		
	}
	
	@SuppressWarnings("unchecked")
	private static void addDataProviderFromJsonToAmPieChart(AmPieChartController pieChartController, String tempFile) 
			throws JsonProcessingException, IOException
	{
		ObjectMapper mapper = getParserJson();
		HashMap<String, Object> map = null;
		HashMap<String, String> fieldKeys = null;
		
		DataProviderController dataProvider = new DataProviderController();
		
		JsonNode node = mapper.readTree(new File(tempFile));
		
		for(int i = 0; i<node.path("dataProvider").size();i++){
			map = mapper.treeToValue(node.path("dataProvider").path(i), HashMap.class);
			dataProvider.addData(map);
		}
		
		tempFile = tempFile.replace(".json", "_keys_fields.json");
		JsonNode nodeFields = mapper.readTree(new File(tempFile));
		
		try{
			
			fieldKeys = mapper.treeToValue(nodeFields.path("chartFields"), HashMap.class);
			
			if(!fieldKeys.isEmpty()){
				pieChartController.setChartFields(fieldKeys);
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
		pieChartController.setDataProvider(dataProvider);		
	}
	
	@SuppressWarnings("unchecked")
	private static void addDataProviderFromJsonToAmAngularGauge(AmAngularGaugeController gaugeController, String tempFile) 
			throws JsonProcessingException, IOException
	{
		ObjectMapper mapper = getParserJson();
		HashMap<String, Object> map = null;
		
		DataProviderController dataProvider = new DataProviderController();
		
		JsonNode node = mapper.readTree(new File(tempFile));
		
		for(int i = 0; i<node.path("dataProvider").size();i++){
			map = mapper.treeToValue(node.path("dataProvider").path(i), HashMap.class);
			dataProvider.addData(map);
		}
		
		gaugeController.setDataProvider(dataProvider);		
	}
	
	
	
	private static void addGraphsFromJsonToAmSerialChart(AmSerialChartController serialChartController, String tempFile){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File(tempFile));
			for(int i = 0; i<node.path("graphs").size();i++){
				temp = mapper.treeToValue(node.path("graphs").path(i), Object.class);
				
				if(temp.toString().contains("step")){
					AmGraphStepController step = null;
					
					step =mapper.treeToValue(node.path("graphs").path(i), AmGraphStepController.class);
					try {
						serialChartController.addGraph(step);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}else if(temp.toString().contains("candlestick")){
					AmGraphCandleController candle = null;
					candle = mapper.treeToValue(node.path("graphs").path(i), AmGraphCandleController.class);
					try {
						serialChartController.addGraph(candle);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}else if(temp.toString().contains("ohlc")){
					AmGraphOhlcController ohlc = null;
					ohlc = mapper.treeToValue(node.path("graphs").path(i), AmGraphOhlcController.class);
					try {
						serialChartController.addGraph(ohlc);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}
				else{
					AmGraphSerialController serial = null;
					serial =mapper.treeToValue(node.path("graphs").path(i), AmGraphSerialController.class);
					try {
						serialChartController.addGraph(serial);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}
			}
		}catch(IOException e1){
					e1.printStackTrace();
		}
		
	}
	
	private static void addGraphsFromJsonToAmXyChart(AmXyChartController xyChartController, String tempFile){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File(tempFile));
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
	
	private static void addGraphsFromJsonToAmRadarChart(AmRadarChartController radarChartController, String tempFile){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File(tempFile));
			for(int i = 0; i<node.path("graphs").size();i++){
				temp = mapper.treeToValue(node.path("graphs").path(i), Object.class);
				
				if(temp.toString().contains("maxBulletSize")){
					AmGraphXyController xy = null;
					xy = mapper.treeToValue(node.path("graphs").path(i), AmGraphXyController.class);
					try {
						radarChartController.addGraph(xy);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}else{
					AmGraphSerialController serial = null;
					serial = mapper.treeToValue(node.path("graphs").path(i), AmGraphSerialController.class);
					try {
						radarChartController.addGraph(serial);
					} catch (NotSupportedException e) {
						e.printStackTrace();
					}
				}
			}
		}catch(IOException e1){
					e1.printStackTrace();
		}
		
	}
	
	private static void addGuidesFromJsonToAmSerialChart(AmSerialChartController serialChartController, String tempFile){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File(tempFile));
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
	
	private static void addGuidesFromJsonToAmXyChart(AmXyChartController xyChartController, String tempFile){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File(tempFile));
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
	
	private static void addGuidesFromJsonToAmRadarChart(AmRadarChartController radarChartController, String tempFile){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File(tempFile));
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
	
	private static void addTrendLinesFromJsonToAmSerialChart(AmSerialChartController serialChartController, String tempFile){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File(tempFile));
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
	
	private static void addTrendLinesFromJsonToAmXyChart(AmXyChartController xyChartController, String tempFile){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File(tempFile));
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
	
	private static void addValueAxisFromJsonToAmSerialChart(AmSerialChartController serialChartController, String tempFile){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File(tempFile));
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
	
	private static void addValueAxisFromJsonToAmXyChart(AmXyChartController xyChartController, String tempFile){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File(tempFile));
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
	
	private static void addValueAxisFromJsonToAmRadarChart(AmRadarChartController radarChartController, String tempFile){
		ObjectMapper mapper = getParserJson();
		Object temp = null;
		
		try{
			JsonNode node = mapper.readTree(new File(tempFile));
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
