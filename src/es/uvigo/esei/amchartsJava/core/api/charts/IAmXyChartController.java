package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

/**
 * 
 * Interface for controller of AmXyChart. Details of AmXyChart and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmXyChartController extends IAmRectangularChartController<AmRectangularChart> {

	/**
	 * Get hideXScrollbar property.<br>
	 * Default: false.
	 * @return Boolean Value for hideXScrollbar.
	 */
	abstract Boolean isHideXScrollbar();

	/**
	 * Set hideXScrollbar property.
	 * @param hideXScrollbar Show or hide XScrollbar.
	 */
	abstract void setHideXScrollbar(Boolean hideXScrollbar);

	/**
	 * Get hideYScrollbar property.<br>
	 * Default: false.
	 * @return Boolean Value for hideYScrollbar.
	 */
	abstract Boolean isHideYScrollbar();

	/**
	 * Set hideYScrollbar property.
	 * @param hideYScrollbar Show or hide YScrollbar.
	 */
	abstract void setHideYScrollbar(Boolean hideYScrollbar);

	/**
	 * Get maxZoomFactor property.<br>
	 * Default: 20.
	 * @return Object Value for maxZoomFactor is an integer number.
	 */
	abstract Object getMaxZoomFactor();

	/**
	 * Set maxZoomFactor property.With improvedVisibility enabled range activated.
	 * @param maxZoomFactor Value for maxZoomfactor.
	 * @throws OutOfRangeException Value out of range admitted: 1-20.
	 */
	abstract void setMaxZoomFactor(Number maxZoomFactor)
			throws OutOfRangeException;

}