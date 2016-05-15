package es.uvigo.esei.amchartsjava.core.controllers.graphs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsjava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsjava.core.constants.config.Config;
import es.uvigo.esei.amchartsjava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmXyChartController;
import es.uvigo.esei.amchartsjava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsjava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

public class AmGraphXyControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void axis_properties_launch_exception_if_AmGraphXyController_is_not_added_to_chart() throws ChartException{
		thrown.expect(ChartException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("AmGraphXyController needs to be added to "
						+ "a chart to can be used that property");
				break;
			case "es":
				thrown.expectMessage("AmGraphXyController necesita añadirse a "
						+ "un chart para poder usar esta propiedad");
				break;
		}
		AmGraphXyController xy = new AmGraphXyController();
		
		xy.setBulletAxis("ValueAxis-1");
	}
	
	@Test 
	public void axis_properties_must_return_string_if_chart_have_a_valueAxis_with_that_id(){
		AmXyChartController xyChart = new AmXyChartController();
		ValueAxisController axis = new ValueAxisController();
		AmGraphXyController xy = new AmGraphXyController();
		try {
			xyChart.addValueAxis(axis);
		} catch (NotSupportedException e1) {
			e1.printStackTrace();
		}
		try {
			xyChart.addGraph(xy);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		try {
			xy.setBulletAxis("ValueAxis-1");
			xy.setFillToAxis("ValueAxis-1");
			xy.setYAxis("ValueAxis-1");
			xy.setXAxis("ValueAxis-1");
		} catch (ChartException e) {
			e.printStackTrace();
		}
		
		assertEquals("ValueAxis-1",xy.getBulletAxis());
		assertEquals("ValueAxis-1",xy.getFillToAxis());
		assertEquals("ValueAxis-1",xy.getXAxis());
		assertEquals("ValueAxis-1",xy.getYAxis());
	}
	
	@Test 
	public void axis_properties_must_return_null_if_chart_have_not_a_valueAxis_with_that_id(){
		AmXyChartController xyChart = new AmXyChartController();
		ValueAxisController axis = new ValueAxisController();
		AmGraphXyController xy = new AmGraphXyController();
		try {
			xyChart.addValueAxis(axis);
		} catch (NotSupportedException e1) {
			e1.printStackTrace();
		}
		try {
			xyChart.addGraph(xy);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		try {
			xy.setBulletAxis("ValueAxis-2");
			xy.setFillToAxis("ValueAxis-3");
			xy.setXAxis("ValueAxis-4");
			xy.setYAxis("ValueAxis-5");
		} catch (ChartException e) {
			e.printStackTrace();
		}
		
		assertNull(xy.getBulletAxis());
		assertNull(xy.getFillToAxis());
		assertNull(xy.getXAxis());
		assertNull(xy.getYAxis());
	}
	
	@Test 
	public void axis_properties_must_return_null_if_is_not_setted(){
		AmGraphXyController xy = new AmGraphXyController();
		
		assertNull(xy.getBulletAxis());
		assertNull(xy.getFillToAxis());
		assertNull(xy.getXAxis());
		assertNull(xy.getYAxis());
	}
	
	@Test
	public void maxBulletSize_with_value_integer_in_range_must_return_integer(){
		AmGraphXyController xy = new AmGraphXyController();
		
		try {
			xy.setMaxBulletSize(60);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(60, (Object)xy.getMaxBulletSize());
		
	}
	
	@Test
	public void maxBulletSize_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		AmGraphXyController xy = new AmGraphXyController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			switch (Config.getString("lang")) {
				case "en":
					thrown.expectMessage("Number out of range: must be between 50 and 100");
					break;
				case "es":
					thrown.expectMessage("Número fuera de rango: debe estar entre 50 y 100");
					break;
			}
			
			xy.setMaxBulletSize(270);
		}else{
			xy.setMaxBulletSize(270);
		}
		
	}
	
	@Test
	public void maxBulletSize_must_return_default_value_if_is_not_setted(){
		AmGraphXyController xy = new AmGraphXyController();
		
		assertEquals(50,(Object)xy.getMaxBulletSize());
		

	}
	
	@Test
	public void minBulletSize_must_return_null_if_is_not_setted(){
		AmGraphXyController xy = new AmGraphXyController();
		
		assertNull(xy.getMinBulletSize());
	}
	
	@Test
	public void minBulletSize_launch_exception_if_recive_not_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number must be an integer");
				break;
			case "es":
				thrown.expectMessage("El número debe ser un entero");
				break;
		}
		
		AmGraphXyController xy = new AmGraphXyController();
		
		xy.setMinBulletSize(9.4);
	}
	
	@Test
	public void minBulletSize_must_return_null_if_recive_negative_integer(){
		AmGraphXyController xy = new AmGraphXyController();
		
		try {
			xy.setMinBulletSize(-2);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		assertNull(xy.getMinBulletSize());
	}
	
	@Test
	public void minBulletSize_must_return_integer_if_is_setted(){
		AmGraphXyController xy = new AmGraphXyController();
		
		try {
			xy.setMinBulletSize(2);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		assertEquals(2,(Object)xy.getMinBulletSize());
	}
	
	@Test
	public void fields_properties_must_return_string_if_are_setted(){
		AmGraphXyController xy = new AmGraphXyController();
		
		xy.setXField("myXFieldName");
		xy.setYField("myYFieldName");
		
		assertEquals("myXFieldName",xy.getXField());
		assertEquals("myYFieldName",xy.getYField());
	}
	
	@Test
	public void fields_properties_save_relation_user_nameField_amcharts_nameField_if_are_setted(){
		AmGraphXyController xy = new AmGraphXyController();
		
		xy.setXField("myXFieldName");
		xy.setYField("myYFieldName");
		
		Map<String, String> graphFields = xy.getGraphFields();
		assertEquals("myXFieldName",graphFields.get("xField"));
		assertEquals("myYFieldName",graphFields.get("yField"));
	}
	
	@Test
	public void fields_properties_must_return_null_if_are_not_setted(){
		AmGraphXyController xy = new AmGraphXyController();
		
		assertNull(xy.getXField());
		assertNull(xy.getYField());
	}
	
	@Test
	public void type_property_must_return_line_as_string(){
		AmGraphXyController xy = new AmGraphXyController();
		
		assertEquals("line", xy.getType());
	}

}
