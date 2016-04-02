package es.uvigo.esei.amchartsJava.core.controllers.charts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.Effect;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeArrowController;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.PatternController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmAngularGaugeController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.MalFormedPatternException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class AmAngularGaugeControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		amGauge.setAdjustSize(true);
		
		assertEquals(true, amGauge.isAdjustSize());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		assertNull(amGauge.isClockWiseOnly());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		try {
			amGauge.setFaceBorderAlpha(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, amGauge.getFaceBorderAlpha(),0);
		
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
		
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		amGauge.setFaceAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		assertNull(amGauge.getFaceBorderAlpha());
	}
	
	@Test
	public void all_color_property_return_string_if_format_color_is_correct(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		try {
			amGauge.setColor("#ffffff");
		} catch (ColorException e) {
			e.printStackTrace();
		}
		
		assertEquals("#ffffff", amGauge.getColor());
		
	}
	
	@Test
	public void all_color_property_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format color should be #000000");
				break;
			case "es":
				thrown.expectMessage("El formato de color debe ser #000000");
				break;
		}
		
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		amGauge.setBorderColor("255,255,255");
	}
	
	@Test
	public void all_color_property_return_null_if_is_not_setted(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		assertNull(amGauge.getFaceBorderColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		try {
			amGauge.setStartDuration(5);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(5, (Object)amGauge.getStartDuration());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			switch (Config.getString("lang")) {
				case "en":
					thrown.expectMessage("Number out of range: must be between 0 and 10");
					break;
				case "es":
					thrown.expectMessage("Número fuera de rango: debe estar entre 0 y 10");
					break;
			}
			
			amGauge.setStartDuration(-270);
		}else{
			amGauge.setStartDuration(-270);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		assertNull(amGauge.getFontSize());
	}
	
	@Test
	public void some_property_launch_exception_if_set_method_recive_not_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number must be an integer");
				break;
			case "es":
				thrown.expectMessage("El número debe ser un entero");
				break;
		}
	
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		amGauge.setGaugeX(90.9);
		
	}
	
	@Test
	public void property_enum_must_return_string_if_is_setted(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		amGauge.setStartEffect(Effect.bounce);
		
		assertEquals(Effect.bounce.toString(), amGauge.getStartEffect());
	}
	
	@Test
	public void property_enum_must_return_null_if_is_not_setted(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		assertNull(amGauge.getStartEffect());
	}
	
	@Test
	public void minRadius_property_must_return_null_if_set_method_recive_value_lt_10(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		amGauge.setMinRadius(5.9);
		assertNull(amGauge.getMinRadius());
		amGauge.setMinRadius(3);
		assertNull(amGauge.getMinRadius());
	}
	
	@Test
	public void facePattern_property_launch_exception_if_recive_patternController_invalid() throws MalFormedPatternException{
		thrown.expect(MalFormedPatternException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Pattern must have values to height, width and url");
				break;
			case "es":
				thrown.expectMessage("Pattern debe tener valores para height, width y una url");
				break;
		}
		
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		PatternController pattern = new PatternController();
		
		amGauge.setFacePattern(pattern);
	}
	
	@Test
	public void arrows_property_must_return_list_of_GaugeArrowController_if_some_GaugeArrowController_is_added(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		amGauge.addArrow(gaugeArrow);
		
		List<GaugeArrowController> arrows = amGauge.getArrows();
		
		assertTrue(arrows != null);
		assertEquals(1, arrows.size());
		
	}
	
	@Test
	public void arrows_property_must_return_null_if_no_GaugeArrowController_is_added(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		assertNull(amGauge.getArrows());
		
	}
	
	@Test
	public void axes_property_must_return_list_of_GaugeAxisController_if_some_GaugeAxisController_is_added(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		GaugeAxisController axis = new GaugeAxisController();
		
		amGauge.addAxis(axis);
		
		List<GaugeAxisController> gaugeAxis = amGauge.getAxes();
		
		assertTrue(gaugeAxis != null);
		assertEquals(1, (Object)gaugeAxis.size());
		
	}
	
	@Test
	public void axes_property_must_return_null_if_not_GaugeAxisController_is_added(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		assertNull(amGauge.getAxes());
	}
	
	@Test
	public void removeArrow_must_delete_GaugeArrowController_added(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		GaugeArrowController arrow = new GaugeArrowController();
		
		amGauge.addArrow(arrow);
		assertEquals("GaugeArrow-1",arrow.getId());
		assertEquals(1, (Object)amGauge.getArrows().size());
		
		amGauge.removeArrow("GaugeArrow-1");
		assertNull(amGauge.getArrows());
		
	}
	
	@Test
	public void removeAxis_must_delete_GaugeAxisController_added(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		GaugeAxisController axis = new GaugeAxisController();
		
		amGauge.addAxis(axis);
		assertEquals("GaugeAxis-1",axis.getId());
		assertEquals(1, (Object)amGauge.getAxes().size());
		
		amGauge.removeAxis("GaugeAxis-1");
		assertNull(amGauge.getAxes());
		
	}
	
	/*
	 * Only must have folders in pattern folder and patterns into them.
	 * This test search some folder and first pattern into it to create an url valid to
	 * pattern
	 */
	@Test
	public void facePattern_property_must_return_patternController_if_is_valid(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		PatternController patternController = new PatternController();
		
		try {
			patternController.setHeight(4);
			patternController.setWidth(4);
		} catch (OutOfRangeException e1) {
			e1.printStackTrace();
		}
		
		URL patternsPath;
		patternsPath = AmAngularGaugeControllerTest.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			patternsPath = new URL(patternsPath,AmchartsJavaPaths.URL_PATTERNS);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		File[] patternsFolders = new File(patternsPath.getFile()).listFiles();
		File patternFolderFound = null;
		String patternFound = "";
		
		for(File patternFolder: patternsFolders){
			if(patternFolder.isDirectory()){
				patternFolderFound = patternFolder;
				patternFound = patternFolder.list()[0];
				patternController.addUrl(patternFolder.getName(), patternFound);
				break;
			}
			
		}
		
		try {
			amGauge.setFacePattern(patternController);
		} catch (MalFormedPatternException e) {
			e.printStackTrace();
		}
		
		PatternController patternRecovery = amGauge.getFacePattern();
		
		assertTrue(patternRecovery != null);
		assertEquals(4, (Object)patternRecovery.getHeight());
		assertEquals(4, (Object)patternRecovery.getWidth());
		assertEquals(AmchartsJavaPaths.URL_PATTERNS+patternFolderFound.getName()+"/"+patternFound, patternRecovery.getUrl());
		
	}
	
	@Test
	public void type_property_must_return_gauge_as_string(){
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		assertEquals("gauge", amGauge.getType());
	}


}
