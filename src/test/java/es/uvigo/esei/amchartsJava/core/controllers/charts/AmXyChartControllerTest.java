package es.uvigo.esei.amchartsJava.core.controllers.charts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmXyChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class AmXyChartControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		AmXyChartController xy = new AmXyChartController();
		
		xy.setHideXScrollbar(true);
		
		assertTrue(xy.isHideXScrollbar());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		AmXyChartController xy = new AmXyChartController();
		
		assertNull(xy.isHideYScrollbar());
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		AmXyChartController xy = new AmXyChartController();
		
		try {
			xy.setMaxZoomFactor(4);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(4, (Object)xy.getMaxZoomFactor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		AmXyChartController xy = new AmXyChartController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			switch (Config.getString("lang")) {
				case "en":
					thrown.expectMessage("Number out of range: must be between 1 and 20");
					break;
				case "es":
					thrown.expectMessage("Número fuera de rango: debe estar entre 1 y 20");
					break;
			}
			
			xy.setMaxZoomFactor(24);
		}else{
			xy.setMaxZoomFactor(24);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		AmXyChartController xy = new AmXyChartController();
		
		assertNull(xy.getMaxZoomFactor());
	}
	
	@Test
	public void type_property_must_return_xy_as_string(){
		AmXyChartController xy = new AmXyChartController();
		
		assertEquals("xy", xy.getType());
	}

}
