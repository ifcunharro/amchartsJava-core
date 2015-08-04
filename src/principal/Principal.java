package principal;



import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import es.uvigo.esei.amchartsJava.core.api.IAmLegendController;
import es.uvigo.esei.amchartsJava.core.api.ILabelController;
import es.uvigo.esei.amchartsJava.core.api.ITitleController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.AmLegendController;
import es.uvigo.esei.amchartsJava.core.controllers.LabelController;
import es.uvigo.esei.amchartsJava.core.controllers.TitleController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.FloatException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.parser.ParserJson;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.StringValidator;




public class Principal {

	public static void main(String[] args) {
		
		
	
		Number l = 9.935655;
		Number p = 5.82434343;
		System.out.println(l.floatValue()+p.floatValue());
		
		
		try {
			NumberValidator.floatValidator(5);
		} catch (FloatException e7) {
			// TODO Auto-generated catch block
			e7.printStackTrace();
		}
		
		
		String[] colors = {"#999999","#AAAAA"};
		try {
			ColorValidator.checkFormatColors(colors);
		} catch (ColorException e6) {
			// TODO Auto-generated catch block
			e6.printStackTrace();
		}
		
		
		try {
			StringValidator.pixelOrPercent("12");
		} catch (CoordException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
		
		I18n.setLanguage("EN");
		//testeado
		
		//AmGraphXyController ab = new AmGraphXyController();
		
		
		ILabelController lab = new LabelController();
		
		try {
			lab.setRotation(90);
		} catch (OutOfRangeException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		} catch (IntegerException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		lab.setAlign(AmchartsConstants.ALIGN.getRight());
		try {
			lab.setAlpha(0.3);
		} catch (OutOfRangeException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		lab.setBold(true);
		
		ILabelController lab2 = new LabelController();
		lab2.setAlign(AmchartsConstants.ALIGN.getRight());
		try {
			lab2.setAlpha(0.6);
		} catch (OutOfRangeException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		lab2.setBold(true);
		
		
		IAmLegendController lc = new AmLegendController();
		lc.setAutoMargins(false);
		try {
			lc.setBottom(9);
		} catch (IntegerException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		lc.setALign(AmchartsConstants.ALIGN.getCenter());
		
	
		
		try {
			lc.setBackgroundAlpha(1);
		} catch (OutOfRangeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ITitleController tc = new TitleController();
		ITitleController tc2 = new TitleController();
		try {
			tc.setSize(9);
		} catch (OutOfRangeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		tc2.setText("prueba");
	
		
		
		//fin testeo
		


		ObjectMapper mapper = ParserJson.getParserJson();

		try {
			//escribe a fichero 
			//mapper.writeValue(new File("C:/Users/iago/Desktop/employee.json"), nt);
			//mapper.writeValue(System.out, employee);

			//mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
			//mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, false);

			mapper.writeValue(System.out,lab);


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


