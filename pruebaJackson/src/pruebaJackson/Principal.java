package pruebaJackson;

import java.io.IOException;

import amcharts.AmSerialChart.TrendLine;
import amcharts.AmXYChart.TrendLineXY;
import amcharts.Axis.AxisBase;
import amcharts.TrendLine.ITrendLine;
import amcharts.TrendLine.TrendLines;
import amcharts.ValueAxis.ValueAxis;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;




public class Principal {

	public static void main(String[] args) {
		
		
		
	      
	      TrendLines nt = new TrendLines();
	     
	      ITrendLine tren = new TrendLine();
	      
	      tren.setFinalValue(11);
	      tren.setLineColor("#FF6600");
	      TrendLine tren2 = new TrendLine();
	      tren2.setFinalValue(11);
	      tren2.setLineColor("#FF6600");
	      nt.addTrendLine(tren);
	      nt.addTrendLine(tren2);
	      AxisBase val = new ValueAxis();
	      val.setId("ola");
	      
	      
	    
	      ObjectMapper mapper = new ObjectMapper();
	     
	       try {
	    	  //escribe a fichero 
			//mapper.writeValue(new File("C:/Users/iago/Desktop/employee.json"), nt);
	    	   //mapper.writeValue(System.out, employee);
	    	   
	    	   //mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false);
	    	   //mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, false);
	    	   mapper.enable(SerializationFeature.INDENT_OUTPUT);
	    	   
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


