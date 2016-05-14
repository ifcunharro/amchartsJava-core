package es.uvigo.esei.amchartsjava.core.api.graphs;


import es.uvigo.esei.amchartsjava.core.constants.StepDirection;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for AmGraphStepController.This interface contains methods used only by step charts.
 * Details of AmGraph and its methods in AmCharts API.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmGraphStepController extends IAmGraphController {

	/**
	 * Get noStepRisers property.<br>
	 * Default: false.
	 * @return Value of noStepRisers.
	 */
	abstract Boolean isNoStepRisers();

	/**
	 * Set notStepRisers property.
	 * @param noStepRisers Enable or disable risers.
	 */
	abstract void setNoStepRisers(Boolean noStepRisers);

	/**
	 * Get periodSpan property.<br>
	 * Default: 1.
	 * @return Value of periodSpan.
	 */
	abstract Integer getPeriodSpan();

	/**
	 * Set periodSpan property.With improvedVisibility enabled, range activated.
	 * @param periodSpan Value for periodSpan.
	 * @throws OutOfRangeException Value out of range admitted: -2 to 2.
	 */
	abstract void setPeriodSpan(Number periodSpan) throws OutOfRangeException;

	/**
	 * Get stepDirection property.<br>
	 * Default: right.
	 * @return Value of stepDirection.
	 */
	abstract String getStepDirection();

	/**
	 * Set stepDirection property.
	 * @param stepDirection Value for stepDirection.
	 */
	abstract void setStepDirection(StepDirection stepDirection);

}