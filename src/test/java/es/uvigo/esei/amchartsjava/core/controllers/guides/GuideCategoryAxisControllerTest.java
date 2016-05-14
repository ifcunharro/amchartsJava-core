package es.uvigo.esei.amchartsjava.core.controllers.guides;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.uvigo.esei.amchartsjava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsjava.core.controllers.guides.GuideCategoryAxisController;
import es.uvigo.esei.amchartsjava.core.exceptions.NotSupportedException;

public class GuideCategoryAxisControllerTest {
	
	@Test
	public void expand_property_must_return_boolean_value_if_is_setted(){
		GuideCategoryAxisController guide = new GuideCategoryAxisController();
		
		guide.setExpand(true);
		
		assertTrue(guide.isExpand());
	}
	
	@Test
	public void expand_property_must_return_false_if_is_not_setted(){
		GuideCategoryAxisController guide = new GuideCategoryAxisController();
		
		assertFalse(guide.isExpand());
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
