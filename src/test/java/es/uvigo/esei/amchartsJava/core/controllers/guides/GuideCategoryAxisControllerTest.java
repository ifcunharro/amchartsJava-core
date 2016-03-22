package es.uvigo.esei.amchartsJava.core.controllers.guides;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;

public class GuideCategoryAxisControllerTest {
	
	@Test
	public void expand_property_must_return_boolean_value_if_is_setted(){
		GuideCategoryAxisController guide = new GuideCategoryAxisController();
		
		guide.setExpand(true);
		
		assertEquals(true, guide.isExpand());
	}
	
	@Test
	public void expand_property_must_return_false_if_is_not_setted(){
		GuideCategoryAxisController guide = new GuideCategoryAxisController();
		
		assertEquals(false,guide.isExpand());
	}
	
	@Test
	public void guideCategoryAxis_recive_id_to_be_added_to_chart(){
		AmSerialChartController serialChart = new AmSerialChartController();
		GuideCategoryAxisController guide = new GuideCategoryAxisController();
		
		assertNull(guide.getId());
		try {
			serialChart.addGuide(guide);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		assertEquals("Guide-1",guide.getId());
	}

}
