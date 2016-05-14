package es.uvigo.esei.amchartsjava.core.api.graphs;

import es.uvigo.esei.amchartsjava.core.constants.ColorsAmCharts;

/**
 * 
 * Interface for AmGraphSerialController. 
 * This interface contains common properties to graphs used by serial charts but not used by xy charts. 
 * Details of AmGraph and its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmGraphSerialController extends IAmGraphController {

	/**
	 * Get connect property.<br>
	 * Default: true.
	 * @return Value of connect.
	 */
	abstract Boolean isConnect();

	/**
	 * Set connect property.
	 * @param connect Enable or disable connect.
	 */
	abstract void setConnect(Boolean connect);
	
	/**
	 * Get fillColors property.
	 * @return Value of fillColors.
	 */
	abstract String getFillColors();

	/**
	 * Set fillColors property.
	 * @param fillColors Value for fillColors.
	 */
	abstract void setFillColors(ColorsAmCharts fillColors);

	/**
	 * Get fillColorsField property.
	 * @return Value of fillColorsField.
	 */
	abstract String getFillColorsField();

	/**
	 * Set fillColorsField property.
	 * @param fillColorsField Value for fillColorsField.
	 */
	abstract void setFillColorsField(String fillColorsField);

	/**
	 * Set gapField property.
	 * @param gapField Value for gapField.
	 */
	abstract void setGapField(String gapField);

	/**
	 * Get gapField property.
	 * @return Value of gapField.
	 */
	abstract String getGapField();


}