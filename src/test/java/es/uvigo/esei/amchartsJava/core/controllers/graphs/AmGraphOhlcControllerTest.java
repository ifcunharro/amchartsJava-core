package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphOhlcController;

public class AmGraphOhlcControllerTest {
	
	@Test
	public void type_property_must_return_ohlc_as_string(){
		AmGraphOhlcController ohlc = new AmGraphOhlcController();
		
		assertEquals("ohlc", ohlc.getType());
	}

}
