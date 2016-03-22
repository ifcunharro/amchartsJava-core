package es.uvigo.esei.amchartsJava.core.validators;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class NumberValidatorTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void rangeDoubleValidator_return_true_if_number_is_between_lo_and_hi(){
		try {
			assertEquals(true,NumberValidator.rangeDoubleValidator(9e0, 0, 10));
			assertEquals(true,NumberValidator.rangeDoubleValidator(9.8, 0, 10));
			assertEquals(true,NumberValidator.rangeDoubleValidator(9, 0, 10));
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void rangeDoubleValidator_launch_exception_if_recive_null_as_number() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 0 and 10");
		NumberValidator.rangeDoubleValidator(null, 0, 10);
	}
	
	@Test 
	public void rangeDoubleValidator_launch_exception_if_number_is_not_between_lo_and_hi() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 0 and 10");
		NumberValidator.rangeDoubleValidator(20.8, 0, 10);
	}
	
	@Test
	public void rangeIntegerValidator_return_true_if_number_is_between_lo_and_hi(){
		try {
			assertEquals(true,NumberValidator.rangeIntegerValidator(9, 0, 10));
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void rangeIntegerValidator_launch_exception_if_recive_null_as_number() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 0 and 10");
		NumberValidator.rangeDoubleValidator(null, 0, 10);
	}
	
	@Test 
	public void rangeIntegerValidator_launch_exception_if_number_is_not_between_lo_and_hi() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 0 and 10");
		NumberValidator.rangeIntegerValidator(15, 0, 10);
	}
	
	@Test
	public void integerValidator_return_true_if_number_is_integer(){
		try {
			assertEquals(true,NumberValidator.integerValidator(9));
		} catch (IntegerException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void integerValidator_launch_exception_if_recive_null() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		
		NumberValidator.integerValidator(null);
	}
	
	@Test
	public void integerValidator_launch_exception_if_number_is_not_integer() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		
		NumberValidator.integerValidator(7.9);
	}
	
	@Test
	public void doubleValidator_return_true_if_number_is_double(){
		try {
			assertEquals(true,NumberValidator.doubleValidator(9.0));
		} catch (DoubleException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void doubleValidator_launch_exception_if_recive_null() throws DoubleException{
		thrown.expect(DoubleException.class);
		thrown.expectMessage("Number must be a double");
		
		NumberValidator.doubleValidator(null);
	}
	
	@Test
	public void doubleValidator_launch_exception_if_number_is_not_double() throws DoubleException{
		thrown.expect(DoubleException.class);
		thrown.expectMessage("Number must be a double");
		
		NumberValidator.doubleValidator(9);
	}
	
	@Test
	public void checkArrayDoubles_return_true_if_numbers_are_double(){
		Number[] array = {9.0,79.5,333e+3,-4.7,Double.NaN};
		try {
			assertEquals(true,NumberValidator.checkArrayDoubles(array));
		} catch (DoubleException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void checkArrayDoubles_launch_exception_if_recive_null() throws DoubleException{
		thrown.expect(DoubleException.class);
		thrown.expectMessage("Number must be a double");
		
		NumberValidator.checkArrayDoubles((Number[])null);
	}
	
	@Test
	public void checkArrayDoubles_launch_exception_if_some_number_is_not_double() throws DoubleException{
		thrown.expect(DoubleException.class);
		thrown.expectMessage("Number must be a double");
		
		Number[] array = {9.0,79.5,333e+3,-4,Double.NaN};
		NumberValidator.checkArrayDoubles(array);
	}

}
