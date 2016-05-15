package es.uvigo.esei.amchartsJava.core.validators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;
import es.uvigo.esei.amchartsJava.core.validators.TrendLineValidator;

public class TrendLineValidatorTest {
	
	@Test
	public void castToListTrendLines_can_revert_object_to_list_of_TrendLineSerialChartController(){
		List<TrendLineSerialChartController> list = new ArrayList<>();
		
		TrendLineSerialChartController serial = new TrendLineSerialChartController();
		TrendLineXyChartController xy = new TrendLineXyChartController();
		
		list.add(xy);
		list.add(serial);
		
		Object listObject = (Object) list;
		
		List<TrendLineSerialChartController> listRecovery = TrendLineValidator.castToListTrendLines(listObject);
		
		assertNotNull(listRecovery);
		assertEquals(2,(Object)listRecovery.size());
	}
	
	@Test
	public void castToListTrendLines_must_return_null_if_object_is_not_list_of_TrendLines(){
		Object noListTrendLines = 9; 
		
		List<TrendLineSerialChartController> listRecovery = TrendLineValidator.castToListTrendLines(noListTrendLines);
		
		assertNull(listRecovery);
	}
	
	@Test
	public void castToTrendLineXyChart_can_cast_TrendLineSerialChartController_to_TrendLineXyChart_if_is_TrendLineXyChart(){
		TrendLineSerialChartController xy = new TrendLineXyChartController();
		
		TrendLineXyChartController xyCast = TrendLineValidator.castToTrendLineXyChart(xy);
		
		assertNotNull(xyCast);
	}
	
	@Test
	public void castToTrendLineXyChart_return_null_if_TrendLineSerialChartController_is_not_TrendLineXyChart(){
		TrendLineSerialChartController serial = new TrendLineSerialChartController();
		
		TrendLineXyChartController xyCast = TrendLineValidator.castToTrendLineXyChart(serial);
		
		assertNull(xyCast);
	}

}
