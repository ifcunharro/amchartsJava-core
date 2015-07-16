package principal;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import es.uvigo.esei.amchartsJava.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.controllers.AmLegendController;
import es.uvigo.esei.amchartsJava.controllers.LabelController;
import es.uvigo.esei.amchartsJava.controllers.TitleController;
import es.uvigo.esei.amchartsJava.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.parser.ParserJson;
import es.uvigo.esei.amchartsJava.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.validators.NumberValidator;




public class Principal {

	public static void main(String[] args) {

		
		//testeo excepciones
		
		try {
			System.out.println(ColorValidator.checkFormatColor("#99ffas"));
		} catch (ColorException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		I18n.setLanguage("ENs");
		
		try {
			NumberValidator.IntegerValidator(9.5);
		} catch (IntegerException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		//fin testeo excepciones
		
		//testeado
		
		//AmGraphXyController ab = new AmGraphXyController();
		
		
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
		try {
			lc.setBottom(9);
		} catch (IntegerException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		lc.setALign(AmchartsConstants.ALIGN.getCenter());
		
	
		
		try {
			lc.setBackgroundAlpha(-1);
		} catch (OutOfRangeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		TitleController tc = new TitleController();
		TitleController tc2 = new TitleController();
		tc.setSize(9);
		tc2.setText("prueba");
	
		
		
		//fin testeo
		


		ObjectMapper mapper = ParserJson.getParserJson();

		try {
			//escribe a fichero 
			//mapper.writeValue(new File("C:/Users/iago/Desktop/employee.json"), nt);
			//mapper.writeValue(System.out, employee);

			//mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
			//mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, false);

			mapper.writeValue(System.out,lc);


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


