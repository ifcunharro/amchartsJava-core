package es.uvigo.esei.amchartsjava.core.validators;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import es.uvigo.esei.amchartsjava.core.controllers.axis.AxisBaseController;
import es.uvigo.esei.amchartsjava.core.controllers.axis.CategoryAxisController;
import es.uvigo.esei.amchartsjava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsjava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsjava.core.validators.AxisValidator;

public class AxisValidatorTest {
	
	@Test
	public void castToListValueAxes_can_revert_object_to_list_of_AxisBaseController(){
		List<AxisBaseController> list = new ArrayList<>();
		
		CategoryAxisController category = new CategoryAxisController();
		ValueAxisController valueAxis = new ValueAxisController();
		ValueAxisRadarChartController axisRadar = new ValueAxisRadarChartController();
		
		list.add(category);
		list.add(valueAxis);
		list.add(axisRadar);
		
		Object listObject = (Object) list;
		
		List<AxisBaseController> listRecovery = AxisValidator.castToListValueAxes(listObject);
		
		assertNotNull(listRecovery);
		assertEquals(3,(Object)listRecovery.size());
	}
	
	@Test
	public void castToListValueAxes_must_return_null_if_object_is_not_list_of_AxisBaseController(){
		
		
		Object noListAxis = 9; 
		
		List<AxisBaseController> listRecovery = AxisValidator.castToListValueAxes(noListAxis);
		
		assertNull(listRecovery);
	}
	
	@Test
	public void castToCategoryAxis_can_cast_AxisBaseController_to_CategoryAxis_if_is_categoryAxis(){
		AxisBaseController category = new CategoryAxisController();
		
		CategoryAxisController categoryCast = AxisValidator.castToCategoryAxis(category);
		
		assertNotNull(categoryCast);
		
	}
	
	@Test
	public void castToCategoryAxis_return_null_if_AxisBaseController_is_not_categoryAxis(){
		AxisBaseController axis = new ValueAxisController();
		
		CategoryAxisController axisCast = AxisValidator.castToCategoryAxis(axis);
		
		assertNull(axisCast);
		
	}
	
	@Test
	public void castToValueAxis_can_cast_AxisBaseController_to_ValueAxis_if_is_valueAxis(){
		AxisBaseController valueAxis = new ValueAxisController();
		
		ValueAxisController axisCast = AxisValidator.castToValueAxis(valueAxis);
		
		assertNotNull(axisCast);
		
	}
	
	@Test
	public void castToValueAxis_return_null_if_AxisBaseController_is_not_valueAxis(){
		AxisBaseController valueAxis = new ValueAxisRadarChartController();
		
		ValueAxisController axisCast = AxisValidator.castToValueAxis(valueAxis);
		
		assertNull(axisCast);
		
	}
	
	@Test
	public void castToValueAxisRadarChart_can_cast_AxisBaseController_to_ValueAxisRadarChart_if_is_valueAxisRadarChart(){
		AxisBaseController valueAxis = new ValueAxisRadarChartController();
		
		ValueAxisRadarChartController axisCast = AxisValidator.castToValueAxisRadarChart(valueAxis);
		
		assertNotNull(axisCast);
		
	}
	
	@Test
	public void castToValueAxisRadarChart_return_null_if_AxisBaseController_is_not_valueAxisRadarChart(){
		AxisBaseController valueAxis = new ValueAxisController();
		
		ValueAxisRadarChartController axisCast = AxisValidator.castToValueAxisRadarChart(valueAxis);
		
		assertNull(axisCast);
		
	}

}
