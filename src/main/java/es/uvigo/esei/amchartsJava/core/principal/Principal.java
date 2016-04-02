package es.uvigo.esei.amchartsJava.core.principal;



import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.constants.config.DefaultConfigCharts;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmChartsController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.provider.DataProviderController;
import es.uvigo.esei.amchartsJava.core.exceptions.LangException;
import es.uvigo.esei.amchartsJava.core.parser.ParserJson;
import es.uvigo.esei.amchartsJava.core.validators.IdiomValidator;




public class Principal {

	public static void main(String[] args) {
		
		
		/*dataProvider will be serialize with their method
		dataProvider es List<Map<String,Object>> se recupera una lista y luego
		se obtienen los maps, luego se guardan las claves y los valores, posible 
		forma de asociar nombre de claves a fields amcharts es guardar esos valores en
		fichero json aparte del dataProvider con un nombre tipo prueba_keys_fields.json y
		prueba.json el json con la informacion del amcharts, como se observa el nombre
		solo difiere en el sufijo keys_fields*/
		
		
		I18n.setLanguage("en");
		
		try {
			IdiomValidator.checkIdiom(null);
		} catch (LangException e1) {
			e1.printStackTrace();
		}
		
		AmSerialChartController serial = 
				DefaultConfigCharts.initDefaultCandleStickGraphToBEW();
		
		Map<String,Object> data = new HashMap<>();
		data.put("category", "cat-1");
		data.put("serie", "ser-1");
		Map<String,Object> data2 = new HashMap<>();
		data2.put("serie", "ser-2");
		data2.put("category", "cat-2");
		
		DataProviderController provider = new DataProviderController();
		provider.addData(data);
		provider.addData(data2);
		
		serial.setProvider(provider);
		
		try {
			//write to file
			ParserJson.saveJsonToTemp("pruebaJson.json", serial);
			
			ParserJson.saveJsonToConsole(serial);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//read json to java
		
		AmSerialChartController serialController = null;
		
		AmChartsController amController = new AmChartsController();
		
		
		try {

				serialController = ParserJson.loadAmSerialChart("pruebaJson.json");
			
				amController.addChart(serialController);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		try {
			
			ParserJson.saveJsonToConsole(serialController);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}


