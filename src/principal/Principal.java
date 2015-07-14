package principal;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import es.uvigo.esei.amchartsJava.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.controllers.AmLegendController;
import es.uvigo.esei.amchartsJava.controllers.AmGraphXyController;
import es.uvigo.esei.amchartsJava.controllers.LabelController;
import es.uvigo.esei.amchartsJava.controllers.TitleController;
import es.uvigo.esei.amchartsJava.parser.ParserJson;




public class Principal {

	public static void main(String[] args) {

		
		
		
		//testeado
		AmGraphXyController ab = new AmGraphXyController();
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
		
		/*AmGraphController am = new AmGraphController();
		AmGraphController am2 = new AmGraphController();
		
		
		ab.addGraph(am);
		ab.addGraph(am2);
		am2.setBalloonColor(ColorsChart.GRAY);
		ab.removeGraph("AmGraph-1");*/
		//fin testeo
		


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


