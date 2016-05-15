package es.uvigo.esei.amchartsJava.core.validators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;

public class ColorValidatorTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void checkFormatColor_return_true_if_color_format_is_sharp_six_hexadecimal_numbers(){
		
		try {
			assertTrue(ColorValidator.checkFormatColor("#ffaa00"));
		} catch (ColorException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void checkFormatColors_return_true_if_color_format_is_sharp_six_hexadecimal_numbers_in_all_colors(){
		
		try {
			assertTrue(ColorValidator.checkFormatColors("#ffaa00","#ffffff","#090909"));
		} catch (ColorException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void checkFormatColor_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format color should be #000000");
				break;
			case "es":
				thrown.expectMessage("El formato de color debe ser #000000");
				break;
		}
		
		ColorValidator.checkFormatColor("#ffa00");
		
	}
	
	@Test
	public void checkFormatColors_launch_exception_if_format_color_is_incorrect_in_some_color() throws ColorException{
		thrown.expect(ColorException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format color should be #000000");
				break;
			case "es":
				thrown.expectMessage("El formato de color debe ser #000000");
				break;
		}
		
		ColorValidator.checkFormatColors("#ffaa00","#ffffff","#09");
		
	}
	
	@Test
	public void canActivateNegativeColor_return_true_if_graphType_is_line_column_or_step_else_false(){
		
		assertTrue(ColorValidator.canActivateNegativeColor("line"));
		assertTrue(ColorValidator.canActivateNegativeColor("column"));
		assertTrue(ColorValidator.canActivateNegativeColor("step"));
		assertFalse(ColorValidator.canActivateNegativeColor("smoothedLine"));
		assertFalse(ColorValidator.canActivateNegativeColor("candlestick"));
		assertFalse(ColorValidator.canActivateNegativeColor("ohlc"));
	}

}
