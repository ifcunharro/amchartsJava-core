package principal;



import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.parser.ParserJson;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PathValidator;
import es.uvigo.esei.amchartsJava.core.validators.StringValidator;




public class Principal {

	public static void main(String[] args) {
		
		
		//graphs
		AmGraphXyController ams = new AmGraphXyController();
		AmGraphStepController ams2 = new AmGraphStepController();
		AmGraphSerialController ams3 = new AmGraphSerialController();
		AmGraphCandleController ams4 = new AmGraphCandleController();
		AmGraphOhlcController ams5 = new AmGraphOhlcController();
		
		//guides
		GuideCategoryAxisController gc = new GuideCategoryAxisController();
		gc.setExpand(true);
		
		GuideRadarChartController gr = new GuideRadarChartController();
		try {
			gr.setAngle(90);
		} catch (OutOfRangeException e11) {
			// TODO Auto-generated catch block
			e11.printStackTrace();
		}
		GuideValueAxisController gv = new GuideValueAxisController();
		try {
			gv.setToValue(9e90);
		} catch (DoubleException e11) {
			// TODO Auto-generated catch block
			e11.printStackTrace();
		}
		
		AmXyChartController axy = new AmXyChartController();
		try {
			axy.addGraph(ams);
			axy.addGraph(ams2);
		} catch (NotSupportedException e11) {
			// TODO Auto-generated catch block
			e11.printStackTrace();
		}
		
		
		
		ams3.setConnect(true);
		//trendLines
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
		//valueAxis
		ValueAxisController va = new ValueAxisController();
		ValueAxisRadarChartController var = new ValueAxisRadarChartController();
		var.setGridType(AmchartsConstants.GRID_TYPES.getCircles());
		va.enabledTotalText();
		ags.setAlphaField("laaaa");
		asc.setCategoryField("lola");
		
		//add ValueAxis
		try {
			asc.addValueAxis(va);
			asc.addValueAxis(var);
		} catch (NotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//add Graphs
		try{
			//asc.addGraph(ams);
			asc.addGraph(ams2);
			asc.addGraph(ams3);
			asc.addGraph(ams4);
			asc.addGraph(ams5);
		}
			catch (Exception e) {
				e.printStackTrace();
		}
		
		//add trendLines
		try {
			asc.addTrendLine(ts);
		} catch (NotSupportedException e10) {
			// TODO Auto-generated catch block
			e10.printStackTrace();
		}
		try {
			asc.addTrendLine(tx);
		} catch (NotSupportedException e10) {
			
			e10.printStackTrace();
		}
		
		//add Guides
		try {
			asc.addGuide(gc);
			asc.addGuide(gv);
			asc.addGuide(gr);
		} catch (NotSupportedException e9) {
			// TODO Auto-generated catch block
			e9.printStackTrace();
		}
		//asc.addGuide(gr);
		//asc.addGuide(gv);
		/*asc.removeGraph(ams.getId().toString());
		asc.removeGraph(ams2.getId().toString());
		asc.removeGraph(ams3.getId().toString());
		asc.removeGraph(ams4.getId().toString());
		asc.removeGraph(ams5.getId().toString());*/
		//asc.removeGraph("ola");
		
		
	
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
			NumberValidator.doubleValidator(5);
		} catch (DoubleException e7) {
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
		
		AmSerialChartController serialController = null;
		
		try {

				
				serialController =  mapper.readValue(new File("I:/prueba.json"), AmSerialChartController.class);
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		ParserJson.addValueAxisFromJsonToAmSerialChart(serialController);
		ParserJson.addGraphsFromJsonToAmSerialChart(serialController);
		ParserJson.addGuidesFromJsonToAmSerialChart(serialController);
		ParserJson.addTrendLinesFromJsonToAmSerialChart(serialController);
		try {
			mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET,false);
			mapper.writeValue(System.out,serialController);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//List<AmGraphController> S = ((List<AmGraphController>)employee.getGraphs());
		
		
		
	}

}


