package principal;



import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.AmBalloonController;
import es.uvigo.esei.amchartsJava.core.controllers.AmLegendController;
import es.uvigo.esei.amchartsJava.core.controllers.ChartCursorController;
import es.uvigo.esei.amchartsJava.core.controllers.LabelController;
import es.uvigo.esei.amchartsJava.core.controllers.TitleController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.FloatException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.parser.ParserJson;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PathValidator;
import es.uvigo.esei.amchartsJava.core.validators.StringValidator;




public class Principal {

	public static void main(String[] args) {
		
		//DISASTER MAIN TESTING DESERIALIZATION AMGRAPHS
		
		AmGraphXyController ams = new AmGraphXyController();
		AmGraphStepController ams2 = new AmGraphStepController();
		TrendLineSerialChartController ts = new TrendLineSerialChartController();
		TrendLineXyChartController tx = new TrendLineXyChartController();
		try {
			ts.setDashLength(0);
		} catch (OutOfRangeException e10) {
			// TODO Auto-generated catch block
			e10.printStackTrace();
		}
		tx.setInitialXValue(9);
		
	
		try {
			ams2.setPeriodSpan(0);
		} catch (OutOfRangeException e9) {
			// TODO Auto-generated catch block
			e9.printStackTrace();
		}
		ams.setAlphaField("ValueAxis-1");
		ams.setAnimationPlayed(false);
		
		
		
		System.out.println(PathValidator.dragIconExist("lens.png"));
		AmSerialChartController asc = new AmSerialChartController();
		AmGraphSerialController ags = new AmGraphSerialController();
		ValueAxisController va = new ValueAxisController();
		ValueAxisRadarChartController var = new ValueAxisRadarChartController();
		var.setGridType(AmchartsConstants.GRID_TYPES.getCircles());
		va.enabledTotalText();
		ags.setAlphaField("laaaa");
		asc.setCategoryField("lola");
		
		asc.addGraph(ams);
		asc.addGraph(ams2);
		asc.addTrendLine(ts);
		asc.addTrendLine(tx);
		
		
		
	
		try {
			asc.setAngle(90);
		} catch (OutOfRangeException e8) {
			// TODO Auto-generated catch block
			e8.printStackTrace();
		}
		AmBalloonController abc = new AmBalloonController();
		abc.setAdjustColor(true);
		abc.setTextAlign(AmchartsConstants.TEXT_ALIGN.getTextAlignLeft());
		asc.addBalloon(abc);
		ChartCursorController ccc = new ChartCursorController();
		try {
			ccc.setBulletSize(20);
		} catch (OutOfRangeException e8) {
			// TODO Auto-generated catch block
			e8.printStackTrace();
		}
		//asc.addChartCursor(ccc);
	
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
		
		I18n.setLanguage("en");
		//testeado
		
		//AmGraphXyController ab = new AmGraphXyController();
		
		
		LabelController lab = new LabelController();
		
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
		
		LabelController lab2 = new LabelController();
		lab2.setAlign(AmchartsConstants.ALIGN.getRight());
		try {
			lab2.setAlpha(0.6);
		} catch (OutOfRangeException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
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
			lc.setBackgroundAlpha(1);
		} catch (OutOfRangeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		TitleController tc = new TitleController();
		TitleController tc2 = new TitleController();
		try {
			tc.setSize(9);
		} catch (OutOfRangeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		tc2.setText("prueba");
	
		
		
		//fin testeo
		asc.addLabel(lab);
		asc.addLabel(lab2);
		asc.addTitle(tc);
		asc.addTitle(tc2);
		asc.addLegend(lc);
		asc.addValueAxis(va);
		
		
	
		asc.addValueAxis(var);
		
		//asc.removeValueAxis(va.getId().toString());
		
		//asc.removeValueAxisRadar(var.getId().toString());
		//falta conseguir deserializar any graph
		//asc.addGraph(ags);
		//System.out.println(((List<AmGraphController>)asc.getGraphs()).size());
		ObjectMapper mapper = ParserJson.getParserJson();
		/////
		
		//////

		try {
			//escribe a fichero 
			mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, true);
			mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, false);

			mapper.writeValue(new File("I:/prueba.json"), asc);
			mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET,false);
			mapper.writeValue(System.out, asc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//lee de fichero json a java
		
		AmSerialChartController employee = null;
		AmGraphStepController step = new AmGraphStepController();
		AmGraphXyController xy = new AmGraphXyController();
		try {

				JsonNode node = mapper.readTree(new File("I:/prueba.json"));
				//int last = node.path("graphs").size();
				
					xy =mapper.treeToValue(node.path("graphs").path(0), AmGraphXyController.class);

					step =mapper.treeToValue(node.path("graphs").path(1), AmGraphStepController.class);
					
				employee =  mapper.readValue(new File("I:/prueba.json"), AmSerialChartController.class);
				employee.addGraph(xy);
				employee.addGraph(step);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		try {
			mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET,false);
			mapper.writeValue(System.out,employee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(((List<AmGraphController>)employee.getGraphs()).size());
		
		
		
	}

}


