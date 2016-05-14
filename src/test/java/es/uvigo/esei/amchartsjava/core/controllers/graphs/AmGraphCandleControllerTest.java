package es.uvigo.esei.amchartsjava.core.controllers.graphs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.uvigo.esei.amchartsjava.core.controllers.graphs.AmGraphCandleController;

public class AmGraphCandleControllerTest {
	
	@Test
	public void type_property_must_return_candlestic_as_string(){
		AmGraphCandleController candle = new AmGraphCandleController();
		
		assertEquals("candlestick", candle.getType());
	}

}
