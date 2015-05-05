package principal;

import java.io.IOException;

import amcharts.model.api.Axis.ValueAxis;
import amcharts.model.api.TrendLine.ITrendLine;
import amcharts.model.api.TrendLine.TrendLines;
import amcharts.model.impl.TrendLine.TrendLineSerial;
import amcharts.model.impl.TrendLine.TrendLineXY;

import com.fasterxml.jackson.databind.ObjectMapper;

import es.uvigo.esei.amchartsJava.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.controllers.AmCoordinateChartController;
import es.uvigo.esei.amchartsJava.controllers.AmLegendController;
import es.uvigo.esei.amchartsJava.controllers.LabelController;
import es.uvigo.esei.amchartsJava.controllers.TitleController;
import es.uvigo.esei.amchartsJava.parser.ParserJson;




public class Principal {

	public static void main(String[] args) {

		
	
		
		//testeado
		AmCoordinateChartController ab = new AmCoordinateChartController();
		ab.setType(AmchartsConstants.CHART_TYPES.getSerial());
		ab.changeColorsDefault(new String[]{"#AAAAAA","#BBBBBB"});
		ab.addColor("#CCCCCC");
		
		LabelController lab = new LabelController();
		lab.setAlign(AmchartsConstants.ALIGN.getRight());
		lab.setAlpha(9.9);
		lab.setBold(true);
		
		LabelController lab2 = new LabelController();
		lab2.setAlign(AmchartsConstants.ALIGN.getRight());
		lab2.setAlpha(9.9);
		lab2.setBold(true);
		
		
		AmLegendController lc = new AmLegendController();
		lc.setAutoMargins(false);
		lc.setBottom(9);
		
		TitleController tc = new TitleController();
		TitleController tc2 = new TitleController();
		tc.setSize(9);
		tc2.setText("mierda");
		
		ab.addLabel(lab);
		ab.addLegend(lc);
		ab.addTitle(tc);
		ab.addTitle(tc2);
		ab.addLabel(lab2);
		//fin testeo
		TrendLines nt = new TrendLines();

		ITrendLine tren = new TrendLineSerial();
		
		
		tren.setFinalValue(11);
		tren.setLineColor("#FF6600");
		ValueAxis val = new ValueAxis();
		val.setId("ola");
		val.setLogarithmic(true);
		val.setDurationUnits(AmchartsConstants.DURATIONUNITS.getDays(),"mola");
		
		
		ITrendLine tren2 = new TrendLineXY();
		
		tren2.setFinalValue(11);
		tren2.setLineColor("#FF6600");
		tren2.setValueAxis(val.getId().toString());
		

		nt.addTrendLine(tren);
		nt.addTrendLine(tren2);


		ObjectMapper mapper = ParserJson.getParserJson();

		try {
			//escribe a fichero 
			//mapper.writeValue(new File("C:/Users/iago/Desktop/employee.json"), nt);
			//mapper.writeValue(System.out, employee);

			//mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
			//mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, false);

			mapper.writeValue(System.out,ab);


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//lee de fichero json a java
		/*try {
				employee =  mapper.readValue(new File("C:/Users/iago/Desktop/employee.json"), Employee.class);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/

		//System.out.println(employee);
	}

}


