package es.uvigo.esei.amchartsJava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.GraphType;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsJava.core.controllers.ChartScrollbarController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphCandleController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class ChartScrollbarControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		scrollbar.setAutoGridCount(true);;
		
		assertEquals(true, scrollbar.isAutoGridCount());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		assertNull(scrollbar.isEnabled());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		try {
			scrollbar.setBackgroundAlpha(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, scrollbar.getBackgroundAlpha(),0);
		
	}
	
	@Test
	public void property_numeric_with_value_double_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number out of range: must be between 0 and 1");
				break;
			case "es":
				thrown.expectMessage("Número fuera de rango: debe estar entre 0 y 1");
				break;
		}
		
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		scrollbar.setGraphFillAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		assertNull(scrollbar.getBackgroundAlpha());
	}
	
	@Test
	public void all_property_to_color_return_string_if_format_color_is_correct(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		try {
			scrollbar.setBackgroundColor("#000000");
		} catch (ColorException e) {
			e.printStackTrace();
		}
		
		assertEquals("#000000", scrollbar.getBackgroundColor());
		
	}
	
	@Test
	public void all_property_to_color_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format color should be #000000");
				break;
			case "es":
				thrown.expectMessage("El formato de color debe ser #000000");
				break;

		}
		
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		scrollbar.setColor("255,255,255");
		
	}
	
	@Test
	public void all_property_to_color_return_null_if_is_not_setted(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		assertNull(scrollbar.getColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		try {
			scrollbar.setDragIconHeight(10);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(10, (Object)scrollbar.getDragIconHeight());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			switch (Config.getString("lang")) {
				case "en":
					thrown.expectMessage("Number out of range: must be between 16 and 35");
					break;
				case "es":
					thrown.expectMessage("Número fuera de rango: debe estar entre 16 y 35");
					break;
		
			}
			
			scrollbar.setDragIconWidth(37);
		}else{
			scrollbar.setDragIconWidth(37);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		assertNull(scrollbar.getDragIconHeight());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_without_range_limit_return_integer_if_set_method_recive_integer_value(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		try {
			scrollbar.setMaximum(100);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		
		assertEquals(100, (Object)scrollbar.getMaximum());
		
	}
	
	@Test
	public void property_mumeric_with_value_integer_without_range_limit_launch_exception_if_set_method_recive_not_integer() throws IntegerException{
		thrown.expect(IntegerException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number must be an integer");
				break;
			case "es":
				thrown.expectMessage("El número debe ser un entero");
				break;
		}
		
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		scrollbar.setMinimum(9.6);
		
	}
	
	@Test
	public void property_enum_must_return_string_if_is_setted(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		scrollbar.setGraphType(GraphType.line);
		
		assertEquals(GraphType.line.toString(), scrollbar.getGraphType());
	}
	
	@Test
	public void property_enum_must_return_null_if_is_not_setted(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		assertNull(scrollbar.getGraphType());
	}
	
	@Test
	public void scrollDuration_property_must_return_integer_if_set_method_recive_positive_integer(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		try {
			scrollbar.setScrollDuration(0);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		
		assertEquals(0,(Object)scrollbar.getScrollDuration());
	}
	
	@Test
	public void scrollDuration_property_must_return_null_if_set_method_recive_negative_integer(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		try {
			scrollbar.setScrollDuration(-3);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		
		assertNull(scrollbar.getScrollDuration());
	}
	
	@Test
	public void dragIcon_property_must_return_string_if_icon_exist_in_images_folder(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		URL iconsPath;
		iconsPath = ChartScrollbarControllerTest.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			iconsPath = new URL(URLDecoder.decode(iconsPath.toString(), "UTF-8"));
			iconsPath = new URL(iconsPath,AmchartsJavaPaths.IMAGES_PATH);
		} catch (MalformedURLException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		File[] images = new File(iconsPath.getFile()).listFiles();
		for(File image: images){
			if(!image.isDirectory()){
				scrollbar.setDragIcon(image.getName());
				assertEquals(image.getName(), scrollbar.getDragIcon());
			}
		}
		
	}
	
	@Test
	public void dragIcon_property_must_return_null_if_icon_not_exist_in_images_folder(){
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		URL iconsPath;
		iconsPath = ChartScrollbarControllerTest.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			iconsPath = new URL(URLDecoder.decode(iconsPath.toString(), "UTF-8"));
			iconsPath = new URL(iconsPath,AmchartsJavaPaths.IMAGES_PATH);
		} catch (MalformedURLException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String[] images = new File(iconsPath.getFile()).list();
		
		scrollbar.setDragIcon("");
		assertNull(scrollbar.getDragIcon());
		assertFalse(Arrays.asList(images).contains(""));
		
	}
	
	@Test
	public void graph_property_launch_exception_if_ChartScrollbarController_not_added_to_chart() throws ChartException{
		thrown.expect(ChartException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("ChartScrollbarController needs to be added to "
						+ "a chart to can be used that property");
				break;
			case "es":
				thrown.expectMessage("ChartScrollbarController necesita añadirse a "
						+ "un chart para poder usar esta propiedad");
				break;
		}
		
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		scrollbar.setGraph("AmGraph-1");
	}
	
	@Test
	public void graph_property_return_null_if_chart_not_contains_graph_with_that_id(){
		AmSerialChartController serial = new AmSerialChartController();
		AmGraphStepController stepGraph = new AmGraphStepController();
		try {
			serial.addGraph(stepGraph);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		serial.addChartScrollbar(scrollbar);
		
		try {
			scrollbar.setGraph("AmGraph-2");
		} catch (ChartException e) {
			e.printStackTrace();
		}
		assertNull(scrollbar.getGraph());
		assertEquals("AmGraph-1", stepGraph.getId());
	}
	
	@Test
	public void graph_property_return_string_if_chart_contains_graph_with_that_id(){
		AmSerialChartController serial = new AmSerialChartController();
		AmGraphStepController stepGraph = new AmGraphStepController();
		AmGraphCandleController candleGraph = new AmGraphCandleController();
		try {
			serial.addGraph(stepGraph);
			serial.addGraph(candleGraph);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		ChartScrollbarController scrollbar = new ChartScrollbarController();
		
		serial.addChartScrollbar(scrollbar);
		
		try {
			scrollbar.setGraph("AmGraph-2");
		} catch (ChartException e) {
			e.printStackTrace();
		}
		assertEquals("AmGraph-2", scrollbar.getGraph());
		assertEquals("AmGraph-1", stepGraph.getId());
		assertEquals("AmGraph-2", candleGraph.getId());
	}

}
