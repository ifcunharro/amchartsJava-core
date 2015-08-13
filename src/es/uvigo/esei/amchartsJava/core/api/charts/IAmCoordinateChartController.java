package es.uvigo.esei.amchartsJava.core.api.charts;


import es.uvigo.esei.amchartsJava.core.constants.StartEffectConstant.StartEffect;
import es.uvigo.esei.amchartsJava.core.constants.UrlTargetConstant.UrlTarget;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AmChart;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

public abstract interface IAmCoordinateChartController<F extends AmCoordinateChart> extends IAmchartController<AmChart> {

	abstract Object isGridAboveGraphs();

	abstract void setGridAboveGraphs(Boolean gridAboveGraphs);

	abstract Object isSequencedAnimation();

	abstract void setSequencedAnimation(Boolean sequencedAnimation);

	abstract Object getStartAlpha();

	abstract void setStartAlpha(Number startAlpha) throws OutOfRangeException;

	abstract Object getStartDuration();

	abstract void setStartDuration(Number startDuration)
			throws OutOfRangeException;

	abstract Object getStartEffect();

	abstract void setStartEffect(StartEffect startEffect);

	abstract Object getUrlTarget();

	abstract void setUrlTarget(UrlTarget urlTarget);

	//methods
	//colors problema tipo prefixes
	abstract Object getColors();

	abstract void addColor(String color);

	abstract void changeColorsDefault(String... newColors);

	//graphs
	abstract Object getGraphs();

	//guides
	abstract Object getGuides();

	//valueAxes
	abstract Object getValueAxes();
	
	abstract  <T extends AmGraphController> void addGraph(T amGraphController);
	
	abstract void addGuide(GuideController guideController);

	abstract <T extends ValueAxisController> void addValueAxis(T valueAxisController);
	
	//remove by id
	//abstract void removeGraph(String idGraph);

	abstract void removeGuide(String idGuide);

	abstract void removeValueAxis(String idValueAxis);
	
	abstract void removeValueAxisRadar(String idValueAxis);

}