package es.uvigo.esei.amchartsJava.core.validators;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;

public class ColorValidatorTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void checkFormatColor_return_true_if_color_format_is_sharp_six_hexadecimal_numbers() throws ColorException{
		
		assertEquals(true,ColorValidator.checkFormatColor("#ffaa00"));
		
	}
	
	@Test
	public void checkFormatColors_return_true_if_color_format_is_sharp_six_hexadecimal_numbers_in_all_colors() throws ColorException{
		
		assertEquals(true,ColorValidator.checkFormatColors("#ffaa00","#ffffff","#090909"));
		
	}
	
	@Test
	public void checkFormatColor_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		thrown.expectMessage("Format color should be #000000");
		
		ColorValidator.checkFormatColor("#ffa00");
		
	}
	
	@Test
	public void checkFormatColors_launch_exception_if_format_color_is_incorrect_in_some_color() throws ColorException{
		thrown.expect(ColorException.class);
		thrown.expectMessage("Format color should be #000000");
		
		ColorValidator.checkFormatColors("#ffaa00","#ffffff","#09");
		
	}
	
	@Test
	public void canActivateNegativeColor_return_true_if_graphType_is_line_column_or_step_else_false(){
		
		assertEquals(true, ColorValidator.canActivateNegativeColor("line"));
		assertEquals(true, ColorValidator.canActivateNegativeColor("column"));
		assertEquals(true, ColorValidator.canActivateNegativeColor("step"));
		assertEquals(false, ColorValidator.canActivateNegativeColor("smoothedLine"));
		assertEquals(false, ColorValidator.canActivateNegativeColor("candlestick"));
		assertEquals(false, ColorValidator.canActivateNegativeColor("ohlc"));
	}

}
