package es.uvigo.esei.amchartsJava.core.controllers.guides;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.controllers.charts.AmRadarChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class GuideRadarChartControllerTest {
	

	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer() throws OutOfRangeException{
		GuideRadarChartController guide = new GuideRadarChartController();
		
		guide.setAngle(270);
		
		assertEquals(270, (Object)guide.getAngle());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 0 and 360");
		GuideRadarChartController guide = new GuideRadarChartController();
		
		guide.setToAngle(-270);
		
	}
	
	@Test
	public void angle_and_toAngle_properties_return_zero_if_are_not_setted() throws OutOfRangeException{
		GuideRadarChartController guide = new GuideRadarChartController();
		
		assertEquals(0,(Object)guide.getAngle());
		assertEquals(0,(Object)guide.getToAngle());
		
	}
	
	@Test
	public void guideRadarChart_recive_id_to_be_added_to_chart(){
		AmRadarChartController serialChart = new AmRadarChartController();
		GuideRadarChartController guide = new GuideRadarChartController();
		
		assertNull(guide.getId());
		try {
			serialChart.addGuide(guide);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		assertEquals("Guide-1",guide.getId());
	}

}
