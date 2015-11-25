package es.uvigo.esei.amchartsJava.core.api.graphs;

import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;

/**
 * 
 * Interface for AmGraphSerialController. 
 * This interface contains common properties to graphs used by serial charts but not used by xy charts. 
 * Details of AmGraph and its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmGraphSerialController extends IAmGraphSerialChartController {

	/**
	 * Get connect property.<br>
	 * Default: true.
	 * @return Boolean Value for connect.
	 */
	abstract Boolean isConnect();

	/**
	 * Set connect property.
	 * @param connect Enable or disable connect.
	 */
	abstract void setConnect(Boolean connect);
	
	/**
	 * Get fillColors property.
	 * @return String Value for fillColors.
	 */
	abstract String getFillColors();

	/**
	 * Set fillColors property.
	 * @param fillColors Value for fillColors.
	 */
	abstract void setFillColors(ColorsAmCharts fillColors);

	/**
	 * Get fillColorsField property.
	 * @return String Value for fillColorsField.
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
	 * @return String Value for gapField.
	 */
	abstract String getGapField();


}