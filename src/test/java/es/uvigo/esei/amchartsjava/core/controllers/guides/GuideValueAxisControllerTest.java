package es.uvigo.esei.amchartsjava.core.controllers.guides;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsjava.core.constants.config.Config;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsjava.core.controllers.guides.GuideValueAxisController;
import es.uvigo.esei.amchartsjava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsjava.core.exceptions.NotSupportedException;

public class GuideValueAxisControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void value_and_toValue_properties_must_return_null_if_are_not_setted(){
		GuideValueAxisController guide = new GuideValueAxisController();
		
		assertNull(guide.getValue());
		assertNull(guide.getToValue());
	}
	
	@Test
	public void value_and_toValue_properties_must_return_double_value_if_are_setted() throws DoubleException{
		GuideValueAxisController guide = new GuideValueAxisController();
		
		guide.setValue(10e+4);
		guide.setToValue(9.6);
		
		assertEquals(10e+4,guide.getValue(),0);
		assertEquals(9.6,guide.getToValue(),0);
	}
	
	@Test
	public void value_and_toValue_properties_launch_exception_if_recive_not_integer_value() throws DoubleException{
		thrown.expect(DoubleException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number must be a double");
				break;
			case "es":
				thrown.expectMessage("El número debe ser un real");
				break;
		}
		GuideValueAxisController guide = new GuideValueAxisController();
		
		guide.setValue(9);
	}
	
	@Test
	public void guideValueAxis_recive_id_to_be_added_to_chart(){
		AmSerialChartController serialChart = new AmSerialChartController();
		GuideValueAxisController guide = new GuideValueAxisController();
		
		assertNull(guide.getId());
		try {
			serialChart.addGuide(guide);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		assertEquals("Guide-1",guide.getId());
	}
	
	

}
