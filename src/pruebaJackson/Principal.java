package pruebaJackson;

import java.io.IOException;

import amcharts.controller.LabelController;
import amcharts.model.Constants.AmchartsConstants;
import amcharts.model.api.Axis.ValueAxis;
import amcharts.model.api.TrendLine.ITrendLine;
import amcharts.model.api.TrendLine.TrendLines;
import amcharts.model.impl.TrendLine.TrendLineSerial;
import amcharts.model.impl.TrendLine.TrendLineXY;
import amcharts.model.parser.ParserJson;

import com.fasterxml.jackson.databind.ObjectMapper;




public class Principal {

	public static void main(String[] args) {
		
		
		
	      
	      TrendLines nt = new TrendLines();
	     
	      ITrendLine tren = new TrendLineSerial();
	      LabelController lab = new LabelController();
	      lab.setAlign(AmchartsConstants.ALIGN.getRight());
	      lab.setId("ola");
	      lab.setAlpha(9.9);
	      lab.setBold(true);
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
	    	
	    	   mapper.writeValue(System.out,val);
	    	   
	    	   
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


