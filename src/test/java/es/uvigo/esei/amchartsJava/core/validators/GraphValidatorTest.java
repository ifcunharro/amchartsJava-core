package es.uvigo.esei.amchartsJava.core.validators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphCandleController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphOhlcController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;

public class GraphValidatorTest {
	
	@Test
	public void castToListAmGraphs_can_revert_object_to_list_of_AmGraphController(){
		List<AmGraphController> list = new ArrayList<>();
		
		AmGraphStepController step = new AmGraphStepController();
		AmGraphXyController xy = new AmGraphXyController();
		AmGraphCandleController candle = new AmGraphCandleController();
		AmGraphOhlcController ohlc = new AmGraphOhlcController();
		AmGraphSerialController serial = new AmGraphSerialController();
		
		list.add(step);
		list.add(xy);
		list.add(candle);
		list.add(ohlc);
		list.add(serial);
		
		Object listObject = (Object) list;
		
		List<AmGraphController> listRecovery = GraphValidator.castToListAmGraphs(listObject);
		
		assertTrue(listRecovery != null);
		assertEquals(5,(Object)listRecovery.size());
	}
	
	@Test
	public void castToListAmGraphs_must_return_null_if_object_is_not_list_of_AmGraphController(){
		Object noListAmGraphs = 9; 
		
		List<AmGraphController> listRecovery = GraphValidator.castToListAmGraphs(noListAmGraphs);
		
		assertNull(listRecovery);
	}
	
	@Test
	public void castToAmGraphCandle_can_cast_AmGraphController_to_AmGraphCandle_if_is_AmGraphCandle(){
		AmGraphController candle = new AmGraphCandleController();
		
		AmGraphCandleController candleCast = GraphValidator.castToAmGraphCandle(candle);
		
		assertTrue(candleCast != null);
	}
	
	@Test
	public void castToAmGraphCandle_return_null_if_AmGraphController_is_not_AmGraphCandle(){
		AmGraphController ohlc = new AmGraphOhlcController();
		
		AmGraphCandleController candleCast = GraphValidator.castToAmGraphCandle(ohlc);
		
		assertNull(candleCast);
	}
	
	@Test
	public void castToAmGraphOhlc_can_cast_AmGraphController_to_AmGraphOhlc_if_is_AmGraphOhlc(){
		AmGraphController ohlc = new AmGraphOhlcController();
		
		AmGraphOhlcController ohlcCast = GraphValidator.castToAmGraphOhlc(ohlc);
		
		assertTrue(ohlcCast != null);
	}
	
	@Test
	public void castToAmGraphOhlc_return_null_if_AmGraphController_is_not_AmGraphOhlc(){
		AmGraphController step = new AmGraphStepController();
		
		AmGraphOhlcController ohlcCast = GraphValidator.castToAmGraphOhlc(step);
		
		assertNull(ohlcCast);
	}
	
	@Test
	public void castToAmGraphSerial_can_cast_AmGraphController_to_AmGraphSerial_if_is_AmGraphSerial(){
		AmGraphController serial = new AmGraphSerialController();
		
		AmGraphSerialController serialCast = GraphValidator.castToAmGraphSerial(serial);
		
		assertTrue(serialCast != null);
	}
	
	@Test
	public void castToAmGraphSerial_return_null_if_AmGraphController_is_not_AmGraphSerial(){
		AmGraphController ohlc = new AmGraphOhlcController();
		
		AmGraphSerialController ohlcCast = GraphValidator.castToAmGraphSerial(ohlc);
		
		assertNull(ohlcCast);
	}
	
	@Test
	public void castToAmGraphStep_can_cast_AmGraphController_to_AmGraphStep_if_is_AmGraphStep(){
		AmGraphController step = new AmGraphStepController();
		
		AmGraphStepController stepCast = GraphValidator.castToAmGraphStep(step);
		
		assertTrue(stepCast != null);
	}
	
	@Test
	public void castToAmGraphStep_return_null_if_AmGraphController_is_not_AmGraphStep(){
		AmGraphController ohlc = new AmGraphOhlcController();
		
		AmGraphStepController stepCast = GraphValidator.castToAmGraphStep(ohlc);
		
		assertNull(stepCast);
	}
	
	@Test
	public void castToAmGraphXy_can_cast_AmGraphController_to_AmGraphXy_if_is_AmGraphXy(){
		AmGraphController xy = new AmGraphXyController();
		
		AmGraphXyController xyCast = GraphValidator.castToAmGraphXy(xy);
		
		assertTrue(xyCast != null);
	}
	
	@Test
	public void castToAmGraphXy_return_null_if_AmGraphController_is_not_AmGraphXy(){
		AmGraphController ohlc = new AmGraphOhlcController();
		
		AmGraphXyController xyCast = GraphValidator.castToAmGraphXy(ohlc);
		
		assertNull(xyCast);
	}

}
