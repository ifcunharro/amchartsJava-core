package es.uvigo.esei.amchartsJava.core.parser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import es.uvigo.esei.amchartsJava.core.files.AmChartsIOUtils;
import es.uvigo.esei.amchartsJava.core.validators.PathValidator;

/**
 * This class save and load config from app to temp folder in json format. This class support export
 * to amcharts library but doesn't generate html, which is neccesary to be visualized in browser or in app.  
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public class ParserJson {
	
	/**
	 * Get parser to parse to json.
	 * @return ObjectMapper Parser to json.
	 */
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
	
	/**
	 * Save config in json to console.
	 * @param chartController Controller for chart.
	 * @throws JsonGenerationException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
	public static void saveJsonToConsole(Object chartController) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		ObjectMapper mapper = getParserJson();
		mapper.writeValue(System.out, chartController);
	}
	
	//evitar sobreescribir existente se hace antes de llamar a este método
	/**
	 * Save amcharts config as json in temp folder.  
	 * @param nameFileJson name of json file
	 * @param chartController controller to AmSerialchart.
	 * @throws JsonGenerationException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
	public static void saveJsonToTemp(String nameFileJson,AmSerialChartController chartController) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		String tempDirectory = AmChartsIOUtils.getJsonDirectoryToSave();
		
		if(!nameFileJson.contains(".json")){
			nameFileJson = nameFileJson+".json";
		}
		
		ObjectMapper mapper = getParserJson();
		
		mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
		saveFieldsFromAmSerialChartToTemp(nameFileJson, (AmSerialChartController)chartController);
				
			
	}
	
	/**
	 * Save amcharts config as json in temp folder.  
	 * @param nameFileJson name of json file
	 * @param chartController controller to AmRadarChart.
	 * @throws JsonGenerationException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
	public static void saveJsonToTemp(String nameFileJson,AmRadarChartController chartController) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		String tempDirectory = AmChartsIOUtils.getJsonDirectoryToSave();
		
		if(!nameFileJson.contains(".json")){
			nameFileJson = nameFileJson+".json";
		}
		
		ObjectMapper mapper = getParserJson();
		
		mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
		saveFieldsFromAmRadarChartToTemp(nameFileJson, chartController);
						
	}
	
	/**
	 * Save amcharts config as json in temp folder.  
	 * @param nameFileJson name of json file
	 * @param chartController controller to AmFunnelChart.
	 * @throws JsonGenerationException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
	public static void saveJsonToTemp(String nameFileJson,AmFunnelChartController chartController) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		String tempDirectory = AmChartsIOUtils.getJsonDirectoryToSave();
		
		if(!nameFileJson.contains(".json")){
			nameFileJson = nameFileJson+".json";
		}
		
		ObjectMapper mapper = getParserJson();
		
		mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
		saveFieldsFromAmFunnelChartToTemp(nameFileJson, chartController);
						
	}
	
	/**
	 * Save amcharts config as json in temp folder.  
	 * @param nameFileJson name of json file
	 * @param chartController controller to AmPieChart.
	 * @throws JsonGenerationException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
	public static void saveJsonToTemp(String nameFileJson,AmPieChartController chartController) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		String tempDirectory = AmChartsIOUtils.getJsonDirectoryToSave();
		
		if(!nameFileJson.contains(".json")){
			nameFileJson = nameFileJson+".json";
		}
		
		ObjectMapper mapper = getParserJson();
		
		mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
		saveFieldsFromAmPieChartToTemp(nameFileJson, chartController);
						
	}
	
	/**
	 * Save amcharts config as json in temp folder.  
	 * @param nameFileJson name of json file
	 * @param chartController controller to AmAngularGauge.
	 * @throws JsonGenerationException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
	public static void saveJsonToTemp(String nameFileJson,AmAngularGaugeController chartController) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		String tempDirectory = AmChartsIOUtils.getJsonDirectoryToSave();
		
		if(!nameFileJson.contains(".json")){
			nameFileJson = nameFileJson+".json";
		}
		
		ObjectMapper mapper = getParserJson();
		
		mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
						
	}
	
	
	
	/**
	 * Save amcharts config as json in temp folder.  
	 * @param nameFileJson name of json file
	 * @param chartController controller to AmXyChart.
	 * @throws JsonGenerationException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
	public static void saveJsonToTemp(String nameFileJson,AmXyChartController chartController) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		String tempDirectory = AmChartsIOUtils.getJsonDirectoryToSave();
		
		if(!nameFileJson.contains(".json")){
			nameFileJson = nameFileJson+".json";
		}
		
		ObjectMapper mapper = getParserJson();
		
		mapper.writeValue(new File(tempDirectory+nameFileJson), chartController);
		saveFieldsFromAmXyChartToTemp(nameFileJson, chartController);
						
	}
	
	
	/**
	 * Deserialize AmSerialChart from temp folder.
	 * @param nameFileJson name of amcharts config file.
	 * @return AmSerialChartController Controller for AmSerialChart configured.
	 * @throws JsonParseException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
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
			AmChartsIOUtils.changeExport(tempFile);
			
		
			serialController = mapper.readValue(new File(tempFile), AmSerialChartController.class);
			
			addValueAxisFromJsonToAmSerialChart(serialController,tempFile);
			addGraphsFromJsonToAmSerialChart(serialController,tempFile);
			addGuidesFromJsonToAmSerialChart(serialController,tempFile);
			addTrendLinesFromJsonToAmSerialChart(serialController,tempFile);
			addDataProviderFromJsonToAmSerialChart(serialController,tempFile);
			AmChartsIOUtils.deleteTempFile(tempFile);
			return serialController;
		}else{
			throw new IOException(I18n.get("JsonFileNotFoundException"));
		}
		
	}
	
	/**
	 * Deserialize AmXyChart from temp folder.
	 * @param nameFileJson name of amcharts config file.
	 * @return AmXyChartController Controller for AmXyChart configured.
	 * @throws JsonParseException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
	public static AmXyChartController loadAmXyChart(String nameFileJson) 
			throws JsonParseException, JsonMappingException, IOException
	{
		String tempFile = PathValidator.tempFileExist(nameFileJson);
		if(!tempFile.isEmpty()){
			ObjectMapper mapper = getParserJson();
			AmXyChartController xyController = null;
			
			AmChartsIOUtils.changeExport(tempFile);
			
			xyController = mapper.readValue(new File(tempFile), AmXyChartController.class);
			
			addValueAxisFromJsonToAmXyChart(xyController,tempFile);
			addGraphsFromJsonToAmXyChart(xyController,tempFile);
			addGuidesFromJsonToAmXyChart(xyController,tempFile);
			addTrendLinesFromJsonToAmXyChart(xyController,tempFile);
			addDataProviderFromJsonToAmXyChart(xyController,tempFile);
			AmChartsIOUtils.deleteTempFile(tempFile);
			return xyController;
		}else{
			throw new IOException(I18n.get("JsonFileNotFoundException"));
		}
		
	}
	
	/**
	 * Deserialize AmRadarChart from temp folder.
	 * @param nameFileJson name of amcharts config file.
	 * @return AmRadarChartController Controller for AmRadarChart configured. 
	 * @throws JsonParseException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
	public static AmRadarChartController loadAmRadarChart(String nameFileJson) 
			throws JsonParseException, JsonMappingException, IOException
	{
		String tempFile = PathValidator.tempFileExist(nameFileJson);
		if(!tempFile.isEmpty()){
			ObjectMapper mapper = getParserJson();
			AmRadarChartController radarController = null;
			
			AmChartsIOUtils.changeExport(tempFile);
			
			radarController = mapper.readValue(new File(tempFile), AmRadarChartController.class);
			
			addValueAxisFromJsonToAmRadarChart(radarController,tempFile);
			addGraphsFromJsonToAmRadarChart(radarController,tempFile);
			addGuidesFromJsonToAmRadarChart(radarController,tempFile);
			addDataProviderFromJsonToAmRadarChart(radarController,tempFile);
			AmChartsIOUtils.deleteTempFile(tempFile);
			
			return radarController;
		}else{
			throw new IOException(I18n.get("JsonFileNotFoundException"));
		}
		
	}
	
	/**
	 * Deserialize AmFunnelChart from temp folder.
	 * @param nameFileJson name of amcharts config file.
	 * @return AmFunnelChartController Controller for AmFunnelChart configured.
	 * @throws JsonParseException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
	public static AmFunnelChartController loadAmFunnelChart(String nameFileJson) 
			throws JsonParseException, JsonMappingException, IOException
	{
		String tempFile = PathValidator.tempFileExist(nameFileJson);
		if(!tempFile.isEmpty()){
			ObjectMapper mapper = getParserJson();
			AmFunnelChartController funnelController = null;
			
			AmChartsIOUtils.changeExport(tempFile);
			
			funnelController = mapper.readValue(new File(tempFile), AmFunnelChartController.class);
			AmChartsIOUtils.deleteTempFile(tempFile);
			tempFile = tempFile.replace(".json", "_keys_fields.json");
			tempFile = PathValidator.tempFileExist(tempFile);
			if(!tempFile.isEmpty()){
				addDataProviderFromJsonToAmFunnelChart(funnelController,tempFile);
			}
			
			
			return funnelController;
		}else{
			throw new IOException(I18n.get("JsonFileNotFoundException"));
		}
		
	}
	
	/**
	 * Deserialize AmPieChart from temp folder.
	 * @param nameFileJson name of amcharts config file.
	 * @return AmPieChartController Controller for AmPieChart configured.
	 * @throws JsonParseException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
	public static AmPieChartController loadAmPieChart(String nameFileJson) 
			throws JsonParseException, JsonMappingException, IOException
	{
		String tempFile = PathValidator.tempFileExist(nameFileJson);
		if(!tempFile.isEmpty()){
			ObjectMapper mapper = getParserJson();
			AmPieChartController pieController = null;
			
			AmChartsIOUtils.changeExport(tempFile);
			
			pieController = mapper.readValue(new File(tempFile), AmPieChartController.class);
			
			addDataProviderFromJsonToAmPieChart(pieController,tempFile);
			AmChartsIOUtils.deleteTempFile(tempFile);
			return pieController;
		}else{
			throw new IOException(I18n.get("JsonFileNotFoundException"));
		}
		
	}
	
	/**
	 * Deserialize AmAngularGauge from temp folder.
	 * @param nameFileJson name of amcharts config file.
	 * @return AmAngularGaugeController Controller for AmAngularGauge configured.
	 * @throws JsonParseException -
	 * @throws JsonMappingException -
	 * @throws IOException -
	 */
	public static AmAngularGaugeController loadAmAngularGauge(String nameFileJson) 
			throws JsonParseException, JsonMappingException, IOException
	{
		String tempFile = PathValidator.tempFileExist(nameFileJson);
		if(!tempFile.isEmpty()){
			ObjectMapper mapper = getParserJson();
			AmAngularGaugeController gaugeController = null;
			
			AmChartsIOUtils.changeExport(tempFile);
			
			gaugeController = mapper.readValue(new File(tempFile), AmAngularGaugeController.class);
			
			AmChartsIOUtils.deleteTempFile(tempFile);
			return gaugeController;
		}else{
			throw new IOException(I18n.get("JsonFileNotFoundException"));
		}
		
	}
	
	//usar siempre que se use saveJsonToTemp para tener ademas de la configuracion
		//del chart los valores definidos por el usuario para los fields y poder recuperarlos
	/**
	 * Save fields used by user in AmSerialChart to temp folder.
	 * @param nameFileJson name of amcharts config file.
	 * @param serialChart chart own of fields.
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private static void saveFieldsFromAmSerialChartToTemp(String nameFileJson, AmSerialChartController serialChart) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		String tempDirectory = AmChartsIOUtils.getJsonDirectoryToSave();
		ObjectMapper mapper = getParserJson();
		Map<String,Object> map = new HashMap<>();
		Map<String,String> temp = null;
		
		nameFileJson = nameFileJson.replace(".json", "_keys_fields.json");
		Map<String,String> chartFields = serialChart.getChartFields();
		if (chartFields != null){
			map.put("chartFields", chartFields);
		}
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
				map.put("categoryAxisFields", axesFields);
			}
		}
	
		
		mapper.writeValue(new File(tempDirectory+nameFileJson), map);
		
	}
	
	/**
	 * Save fields used by user in AmXyChart to temp folder.
	 * @param nameFileJson name of amcharts config file.
	 * @param xyChart chart own of fields.
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private static void saveFieldsFromAmXyChartToTemp(String nameFileJson, AmXyChartController xyChart) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		String tempDirectory = AmChartsIOUtils.getJsonDirectoryToSave();
		ObjectMapper mapper = getParserJson();
		Map<String,Object> map = new HashMap<>();
		Map<String,String> temp = null;
		
		nameFileJson = nameFileJson.replace(".json", "_keys_fields.json");
		Map<String,String> chartFields = xyChart.getChartFields();
		if(chartFields != null){
			map.put("chartFields", chartFields);
		}
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
	
	/**
	 * Save fields used by user in AmRadarChart to temp folder.
	 * @param nameFileJson name of amcharts config file.
	 * @param radarChart chart own of fields.
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private static void saveFieldsFromAmRadarChartToTemp(String nameFileJson, AmRadarChartController radarChart) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		String tempDirectory = AmChartsIOUtils.getJsonDirectoryToSave();
		ObjectMapper mapper = getParserJson();
		Map<String,Object> map = new HashMap<>();
		Map<String,String> temp = null;
		
		nameFileJson = nameFileJson.replace(".json", "_keys_fields.json");
		Map<String,String> chartFields = radarChart.getChartFields();
		if(chartFields != null){
			map.put("chartFields", chartFields);
		}
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
	
	/**
	 * Save fields used by user in AmFunnelChart to temp folder.
	 * @param nameFileJson name of amcharts config file.
	 * @param funnelChart chart own of fields.
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private static void saveFieldsFromAmFunnelChartToTemp(String nameFileJson, AmFunnelChartController funnelChart) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		String tempDirectory = AmChartsIOUtils.getJsonDirectoryToSave();
		ObjectMapper mapper = getParserJson();
		Map<String,Object> map = new HashMap<>();
		
		
		nameFileJson = nameFileJson.replace(".json", "_keys_fields.json");
		Map<String,String> chartFields = funnelChart.getChartFields();
		if(chartFields != null){
			map.put("chartFields", chartFields);
			mapper.writeValue(new File(tempDirectory+nameFileJson), map);
		}
		
		
	}
		
	/**
	 * Save fields used by user in AmPieChart to temp folder.
	 * @param nameFileJson name of amcharts config file.
	 * @param pieChart chart own of fields.
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private static void saveFieldsFromAmPieChartToTemp(String nameFileJson, AmPieChartController pieChart) 
			throws JsonGenerationException, JsonMappingException, IOException
	{
		String tempDirectory = AmChartsIOUtils.getJsonDirectoryToSave();
		ObjectMapper mapper = getParserJson();
		Map<String,Object> map = new HashMap<>();
	
		nameFileJson = nameFileJson.replace(".json", "_keys_fields.json");
		
		Map<String,String> chartFields = pieChart.getChartFields();
		if(chartFields != null){
			map.put("chartFields", chartFields);
		}
		mapper.writeValue(new File(tempDirectory+nameFileJson), map);
		
	}
		
	/**
	 * Deserialize dataProvider and fields to AmSerialChart.
	 * @param serialChartController chart own of dataProvider and fields.
	 * @param tempFile name of amSerialChart config file.
	 * @throws JsonProcessingException
	 * @throws IOException
	 */
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
			JsonNode chartsFieldsNode = nodeFields.path("chartFields");
			if(!chartsFieldsNode.isMissingNode()){
				fieldKeys = mapper.treeToValue(nodeFields.path("chartFields"), HashMap.class);
				if(!fieldKeys.isEmpty()){
					serialChartController.setChartFields(fieldKeys);
				}
			}
			
			
		}catch(IOException e1){
			e1.printStackTrace();
		}
		try{
			JsonNode graphFieldsNode = nodeFields.path("graphFields");
			if(!graphFieldsNode.isMissingNode()){
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
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		try{
			JsonNode categoryAxisFieldsNode = nodeFields.path("categoryAxisFields");
			if(!categoryAxisFieldsNode.isMissingNode()){
				axesFields = mapper.treeToValue(nodeFields.path("categoryAxisFields"), HashMap.class);
				if(!axesFields.isEmpty()){
					
					if(serialChartController.getCategoryAxis()!=null){
						serialChartController.getCategoryAxis().setAxesFields(axesFields);
					}
				}
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
		serialChartController.setDataProvider(dataProvider);	
		AmChartsIOUtils.deleteTempFile(tempFile);
	}
	
	/**
	 * Deserialize dataProvider and fields to AmXyChart.
	 * @param xyChartController chart own of dataProvider and fields.
	 * @param tempFile name of amXyChart config file.
	 * @throws JsonProcessingException
	 * @throws IOException
	 */
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
			JsonNode chartFieldsNode = nodeFields.path("chartFields");
			if(!chartFieldsNode.isMissingNode()){
				fieldKeys = mapper.treeToValue(nodeFields.path("chartFields"), HashMap.class);
				
				if(!fieldKeys.isEmpty()){
					xyChartController.setChartFields(fieldKeys);
				}
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		try{
			JsonNode graphFieldsNode = nodeFields.path("graphFields");
			if(!graphFieldsNode.isMissingNode()){
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
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
		xyChartController.setDataProvider(dataProvider);	
		AmChartsIOUtils.deleteTempFile(tempFile);
	}
	
	/**
	 * Deserialize dataProvider and fields to AmRadarChart.
	 * @param radarChartController chart own of dataProvider and fields.
	 * @param tempFile name of AmRadarChart config file.
	 * @throws JsonProcessingException
	 * @throws IOException
	 */
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
			JsonNode chartFields = nodeFields.path("chartFields");
			if(!chartFields.isMissingNode()){
				fieldKeys = mapper.treeToValue(nodeFields.path("chartFields"), HashMap.class);
				if(!fieldKeys.isEmpty()){
					radarChartController.setChartFields(fieldKeys);
				}
			}
			
			
		}catch(IOException e1){
			e1.printStackTrace();
		}
		try{
			JsonNode graphFieldsNode = nodeFields.path("graphFields");
			if(!graphFieldsNode.isMissingNode()){
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
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
		
		radarChartController.setDataProvider(dataProvider);		
		AmChartsIOUtils.deleteTempFile(tempFile);
	}
	
	/**
	 * Deserialize dataProvider and fields to AmFunnelChart.
	 * @param funnelChartController chart own of dataProvider and fields.
	 * @param tempFile name of AmFunnelChart config file.
	 * @throws JsonProcessingException
	 * @throws IOException
	 */
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
			JsonNode chartFields = nodeFields.path("chartFields");
			if(!chartFields.isMissingNode()){
				fieldKeys = mapper.treeToValue(nodeFields.path("chartFields"), HashMap.class);
				
				if(!fieldKeys.isEmpty()){
					funnelChartController.setChartFields(fieldKeys);
				}
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
		funnelChartController.setDataProvider(dataProvider);	
		
		AmChartsIOUtils.deleteTempFile(tempFile);
	}
	
	/**
	 * Deserialize dataProvider and fields to AmPieChart.
	 * @param pieChartController chart own of dataProvider and fields.
	 * @param tempFile name of AmPieChart config file.
	 * @throws JsonProcessingException
	 * @throws IOException
	 */
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
			JsonNode chartFields = nodeFields.path("chartFields");
			if(!chartFields.isMissingNode()){
				fieldKeys = mapper.treeToValue(nodeFields.path("chartFields"), HashMap.class);
				
				if(!fieldKeys.isEmpty()){
					pieChartController.setChartFields(fieldKeys);
				}
			}
			
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
		pieChartController.setDataProvider(dataProvider);		
		AmChartsIOUtils.deleteTempFile(tempFile);
	}
	
	/**
	 * Deserialize graphs to AmSerialChart. If AmGraph type is step,candlestick or ohlc deserialize to
	 * correct controller else always try load to AmGraphSerialController 
	 * @param serialChartController chart own of graphs.
	 * @param tempFile name of AmSerialChart config file.
	 */
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
	
	/**
	 * Deserialize graphs to AmXyChart. AmXyChart must to have maxBulletSize property setted.
	 * @param xyChartController chart own of graphs.
	 * @param tempFile name of AmXyChart config file.
	 */
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
	
	/**
	 * Deserialize graphs to AmRadarChart.If exist value to maxBulletSize graph will be treat as AmXyChart 
	 * else as AmSerialChart.
	 * @param radarChartController chart own of graphs.
	 * @param tempFile name of AmRadarChart config file.
	 */
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
	
	/**
	 * Deserialize guides to AmSerialChart.Guides to CategoryAxis need value to expand,
	 * guides to valueAxis can't have value to angle.
	 * @param serialChartController chart own of guides.
	 * @param tempFile name of AmSerialChart config file.
	 */
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
	
	/**
	 * Deserialize guides to AmXyChart.Guides can't have value to angle or expand.
	 * @param xyChartController chart own of guides.
	 * @param tempFile name of AmXyChart config file.
	 */
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
	
	/**
	 * Deserialize guides to AmRadarChart. Guides must have value to angle.
	 * @param radarChartController chart own of guides.
	 * @param tempFile name of AmRadarChart config file.
	 */
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
	
	/**
	 * Deserialize TrendLines to AmSerialChart.Trendlines can't have value to initialXValue.
	 * @param serialChartController chart own of trendLines.
	 * @param tempFile name of AmSerialChart config file.
	 */
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
	
	/**
	 * Deserialize TrendLines to AmXyChart.TrendLines need value to initialXValue.
	 * @param xyChartController chart own of TrendLines.
	 * @param tempFile name of AmXyChart config file.
	 */
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
	
	/**
	 * Deserialize valueAxis to AmSerialChart.ValueAxis can't have value to radarCategoriesEnabled.
	 * @param serialChartController chart own of valueAxis.
	 * @param tempFile name of AmSerialChart config file.
	 */
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
	
	/**
	 * Deserialize valueAxis to AmXyChart.ValueAxis can't have value to radarCategoriesEnabled.
	 * @param xyChartController chart own of valueAxis.
	 * @param tempFile name of AmXyChart config file.
	 */
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
	
	/**
	 * Deserialize valueAxis to AmRadarChart.ValueAxis need value to radarCategoriesEnabled.
	 * @param radarChartController chart own of valueAxis.
	 * @param tempFile name of AmRadarChart config file.
	 */
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
