package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.StepDirection;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class AmGraphStepControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		AmGraphStepController step = new AmGraphStepController();
		
		step.setNoStepRisers(true);
		
		assertEquals(true, step.isNoStepRisers());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		AmGraphStepController step = new AmGraphStepController();
		
		assertNull(step.isNoStepRisers());
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		AmGraphStepController step = new AmGraphStepController();
		
		try {
			step.setPeriodSpan(2);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(2, (Object)step.getPeriodSpan());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		AmGraphStepController step = new AmGraphStepController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			thrown.expectMessage("Number out of range: must be between -2 and 2");
			
			step.setPeriodSpan(-3);
		}else{
			step.setPeriodSpan(-3);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		AmGraphStepController step = new AmGraphStepController();
		
		assertNull(step.getPeriodSpan());
	}
	
	@Test
	public void property_enum_must_return_string_if_is_setted(){
		AmGraphStepController step = new AmGraphStepController();
		
		step.setStepDirection(StepDirection.left);
		
		assertEquals(StepDirection.left.toString(), step.getStepDirection());
	}
	
	@Test
	public void property_enum_must_return_null_if_is_not_setted(){
		AmGraphStepController step = new AmGraphStepController();
		
		assertNull(step.getStepDirection());
	}
	
	@Test
	public void type_property_must_return_step_as_string(){
		AmGraphStepController step = new AmGraphStepController();
		
		assertEquals("step", step.getType());
	}

}
