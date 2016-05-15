package es.uvigo.esei.amchartsJava.core.api.charts;


import java.util.List;

import es.uvigo.esei.amchartsJava.core.constants.Effect;
import es.uvigo.esei.amchartsJava.core.constants.UrlTarget;
import es.uvigo.esei.amchartsJava.core.controllers.axis.AxisBaseController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AmChart;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

/**
 * 
 * Interface for controller of AmCoordinateChart. Details of AmCoordinateChart and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmCoordinateChartController<F extends AmCoordinateChart> extends IAmchartController<AmChart> {

	/**
	 * Get gridAboveGraphs property.<br>
	 * Default: false.
	 * @return Value of gridAboveGraphs.
	 */
	abstract Boolean isGridAboveGraphs();

	/**
	 * Set gridAboveGraphs property.
	 * @param gridAboveGraphs Enable or disabel gridAboveGraphs.
	 */
	abstract void setGridAboveGraphs(Boolean gridAboveGraphs);

	/**
	 * Get sequencedAnimation property.<br>
	 * Default: true.
	 * @return Value of sequencedAnimation.
	 */
	abstract Boolean isSequencedAnimation();

	/**
	 * Set sequencedAnimation property.
	 * @param sequencedAnimation Enable or disable sequencedAnimation.
	 */
	abstract void setSequencedAnimation(Boolean sequencedAnimation);

	/**
	 * Get startAlpha property.<br>
	 * Default: 1.
	 * @return Value of startAlpha.
	 */
	abstract Double getStartAlpha();

	/**
	 * Set startAlpha property.
	 * @param startAlpha Value for startAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setStartAlpha(Number startAlpha) throws OutOfRangeException;

	/**
	 * Get startDuration property.<br>
	 * Default: 0.
	 * @return Value of startDuration.
	 */
	abstract Integer getStartDuration();

	/**
	 * Set startDuration property.With improvedVisibility enabled range activated.
	 * @param startDuration Value for startDuration.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setStartDuration(Number startDuration)
			throws OutOfRangeException;

	/**
	 * Get startEffect property.<br>
	 * Default: elastic.
	 * @return Value of startEffect.
	 */
	abstract String getStartEffect();

	/**
	 * Set startEffect property.
	 * @param startEffect Value for startEffect.
	 */
	abstract void setStartEffect(Effect startEffect);

	/**
	 * Get urlTarger property.<br>
	 * Default: _self.
	 * @return Value of urlTarget.
	 */
	abstract String getUrlTarget();

	/**
	 * Set urlTarget property.
	 * @param urlTarget Value for urlTarget.
	 */
	abstract void setUrlTarget(UrlTarget urlTarget);

	/**
	 * Get colors property.
	 * @return List of colors.
	 */
	abstract List<String> getColors();

	/**
	 * Add a color to chart.
	 * @param color Value for color.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void addColor(String color) throws ColorException;

	/**
	 * Change default colors
	 * @param newColors Values for colors.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void changeColorsDefault(String... newColors) throws ColorException;

	/**
	 * Get graphs property.
	 * @return List of graphs. Use {@link es.uvigo.esei.amchartsJava.core.validators.GraphValidator GraphValidator} to obtain graphs and
	 * concrete graph.
	 */
	abstract Object getGraphs();

	/**
	 * Get guides property.
	 * @return List of guides. Use {@link es.uvigo.esei.amchartsJava.core.validators.GuideValidator GuideValidator} to obtain guides and 
	 * concrete guide.
	 */
	abstract Object getGuides();
	
	/**
	 * Get valueAxes property.
	 * @return List of valueAxes. Use {@link es.uvigo.esei.amchartsJava.core.validators.AxisValidator AxisValidator} to obtain list of axis and
	 * concrete axis.
	 */
	abstract Object getValueAxes();
	
	/**
	 * Add a graph to chart.
	 * @param amGraphController is controller of a type of amGraph.
	 * @throws NotSupportedException Chart doesn't support that type of graph.
	 */
	abstract void addGraph(AmGraphController amGraphController) 
			throws NotSupportedException;
	
	/**
	 * Add a guide to chart.
	 * @param guideController is a controller of a type of guide.
	 * @throws NotSupportedException Chart doesn't support that type of guide.
	 */
	abstract void addGuide(GuideController guideController) 
			throws NotSupportedException;

	/**
	 * Add a valueAxis to chart.
	 * @param valueAxisController Controller of a type of valueAxis.
	 * @throws NotSupportedException Chart doesn't support that type of valueAxis.
	 */
	abstract void addValueAxis(AxisBaseController valueAxisController) 
			throws NotSupportedException;
	
	/**
	 * Remove graph from chart.
	 * @param idGraph AmGraph id.
	 */
	abstract void removeGraph(String idGraph);

	/**
	 * Remove guide from chart.
	 * @param idGuide Guide id.
	 */
	abstract void removeGuide(String idGuide);

	/**
	 * Remove a valueAxis from chart.
	 * @param idValueAxis ValueAxis id.
	 */
	abstract void removeValueAxis(String idValueAxis);

}