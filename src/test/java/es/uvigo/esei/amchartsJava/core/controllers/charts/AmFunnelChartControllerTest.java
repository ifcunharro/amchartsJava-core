package es.uvigo.esei.amchartsJava.core.controllers.charts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.Align;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmFunnelChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class AmFunnelChartControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		
		amFunnel.setRotate(true);
		
		assertEquals(true, amFunnel.isRotate());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		
		assertNull(amFunnel.isRotate());
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		
		try {
			amFunnel.setDepth3D(30);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(30, (Object)amFunnel.getDepth3D());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			switch (Config.getString("lang")) {
				case "en":
					thrown.expectMessage("Number out of range: must be between 0 and 50");
					break;
				case "es":
					thrown.expectMessage("Número fuera de rango: debe estar entre 0 y 50");
					break;
			}
			
			amFunnel.setDepth3D(80);
		}else{
			amFunnel.setDepth3D(80);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_not_is_setted(){
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		
		assertNull(amFunnel.getAngle());
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
		
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		
		amFunnel.setStartY(90.9);
		
	}
	
	@Test
	public void property_enum_must_return_string_if_is_setted(){
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		
		amFunnel.setLabelPosition(Align.right);
		
		assertEquals(Align.right.toString(), amFunnel.getLabelPosition());
	}
	
	@Test
	public void property_enum_must_return_null_if_is_not_setted(){
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		
		assertNull(amFunnel.getLabelPosition());
	}
	
	@Test
	public void baseWidth_neckHeight_neckWidth_properties_accept_integer_or_integer_percent_as_string_if_percent_gt_100_return_100_percent(){
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		
		try {
			amFunnel.setBaseWidth("500");
			assertEquals("500", amFunnel.getBaseWidth());
			amFunnel.setBaseWidth("50%");
			assertEquals("50%", amFunnel.getBaseWidth());
			amFunnel.setBaseWidth("500%");
			assertEquals("100%", amFunnel.getBaseWidth());
			
			amFunnel.setNeckWidth("500");
			assertEquals("500", amFunnel.getNeckWidth());
			amFunnel.setNeckWidth("50%");
			assertEquals("50%", amFunnel.getNeckWidth());
			amFunnel.setNeckWidth("500%");
			assertEquals("100%", amFunnel.getNeckWidth());
			
			amFunnel.setNeckHeight("500");
			assertEquals("500", amFunnel.getNeckHeight());
			amFunnel.setNeckHeight("50%");
			assertEquals("50%", amFunnel.getNeckHeight());
			amFunnel.setNeckHeight("500%");
			assertEquals("100%", amFunnel.getNeckHeight());
		} catch (CoordException e) {
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void baseWidth_neckHeight_neckWidth_pullDistance_properties_return_null_if_no_setted(){
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		
		assertNull(amFunnel.getBaseWidth());
		assertNull(amFunnel.getNeckHeight());
		assertNull(amFunnel.getNeckWidth());
		
	}
	
	@Test
	public void baseWidth_neckHeight_neckWidth_pullDistance_properties_launch_exception_if_recive_null_or_not_integer_no_integer_percent_value() throws CoordException{
		thrown.expect(CoordException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format coords must be an integer number or a percent");
				break;
			case "es":
				thrown.expectMessage("Las coordenadas deben ser un entero o porcentaje");
				break;
		}
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		
		amFunnel.setBaseWidth("90.9");
	}
	
	@Test
	public void pullDistance_no_return_percent_gt_10_no_integer_gt_30(){
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		
		try {
			amFunnel.setPullDistance("10%");
			assertEquals("10%",amFunnel.getPullDistance());
			amFunnel.setPullDistance("30");
			assertEquals("30",amFunnel.getPullDistance());
			amFunnel.setPullDistance("15%");
			assertEquals("10%",amFunnel.getPullDistance());
			amFunnel.setPullDistance("50");
			assertEquals("30",amFunnel.getPullDistance());
		} catch (CoordException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void type_property_must_return_funnel_as_string(){
		AmFunnelChartController amFunnel = new AmFunnelChartController();
		
		assertEquals("funnel", amFunnel.getType());
	}

}
