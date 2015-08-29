package es.uvigo.esei.amchartsJava.core.api.charts;


import java.util.List;

import es.uvigo.esei.amchartsJava.core.constants.EffectConstant.Effect;
import es.uvigo.esei.amchartsJava.core.constants.UrlTargetConstant.UrlTarget;
import es.uvigo.esei.amchartsJava.core.controllers.axis.AxisBaseController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AmChart;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

public abstract interface IAmCoordinateChartController<F extends AmCoordinateChart> extends IAmchartController<AmChart> {

	abstract Boolean isGridAboveGraphs();

	abstract void setGridAboveGraphs(Boolean gridAboveGraphs);

	abstract Boolean isSequencedAnimation();

	abstract void setSequencedAnimation(Boolean sequencedAnimation);

	abstract Object getStartAlpha();

	abstract void setStartAlpha(Number startAlpha) throws OutOfRangeException;

	abstract Object getStartDuration();

	abstract void setStartDuration(Number startDuration)
			throws OutOfRangeException;

	abstract String getStartEffect();

	abstract void setStartEffect(Effect startEffect);

	abstract String getUrlTarget();

	abstract void setUrlTarget(UrlTarget urlTarget);

	//methods
	//colors problema tipo prefixes
	abstract List<String> getColors();

	abstract void addColor(String color);

	abstract void changeColorsDefault(String... newColors);

	//graphs
	abstract Object getGraphs();

	//guides
	abstract Object getGuides();
	
	//valueAxes
	abstract Object getValueAxes();
	
	abstract  <T extends AmGraphController> void addGraph(T amGraphController) 
			throws NotSupportedException;
	
	abstract <T extends GuideController> void addGuide(T guideController) 
			throws NotSupportedException;

	abstract <T extends AxisBaseController> void addValueAxis(T valueAxisController) 
			throws NotSupportedException;
	
	//remove by id
	abstract void removeGraph(String idGraph);

	abstract void removeGuide(String idGuide);

	abstract void removeValueAxis(String idValueAxis);

}