package es.uvigo.esei.amchartsjava.core.api.guides;

import es.uvigo.esei.amchartsjava.core.exceptions.DoubleException;

/**
 * 
 * Interface for GuideValueAxisController. This interface contains properties of guide only used by ValueAxis. 
 * Details of Guide and its properties in AmCharts API.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IGuideValueAxisController extends IGuideController {

	/**
	 * Get toValue property.
	 * @return Value of toValue.
	 */
	abstract Double getToValue();

	/**
	 * Set toValue property.
	 * @param toValue Value for toValue.
	 * @throws DoubleException Value for toValue is not a double number.
	 */
	abstract void setToValue(Number toValue) throws DoubleException;

	/**
	 * Get value property.
	 * @return Value of value.
	 */
	abstract Double getValue();

	/**
	 * Set value property.
	 * @param value Value for value.
	 * @throws DoubleException Value for value is not a double number.
	 */
	abstract void setValue(Number value) throws DoubleException;

}