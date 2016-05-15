package es.uvigo.esei.amchartsjava.core.controllers.guides;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsjava.core.constants.config.Config;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmRadarChartController;
import es.uvigo.esei.amchartsjava.core.controllers.guides.GuideRadarChartController;
import es.uvigo.esei.amchartsjava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

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
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number out of range: must be between 0 and 360");
				break;
			case "es":
				thrown.expectMessage("Número fuera de rango: debe estar entre 0 y 360");
				break;
		}
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
