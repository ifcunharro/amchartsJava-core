package es.uvigo.esei.amchartsJava.core.api;


import es.uvigo.esei.amchartsJava.core.constants.StartEffectConstant.StartEffect;
import es.uvigo.esei.amchartsJava.core.constants.UrlTargetConstant.UrlTarget;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

public abstract interface IAmCoordinateChartController<E extends AmCoordinateChart> extends IAmchartController<AmCoordinateChart> {

	abstract Object isGridAboveGraphs();

	abstract void setGridAboveGraphs(Boolean gridAboveGraphs);

	abstract Object isSequencedAnimation();

	abstract void setSequencedAnimation(Boolean sequencedAnimation);

	abstract Object getStartAlpha();

	abstract void setStartAlpha(Number startAlpha) throws OutOfRangeException;

	abstract Object getStartDuration();

	abstract void setStartDuration(Number startDuration)
			throws IntegerException;

	abstract Object getStartEffect();

	abstract void setStartEffect(StartEffect startEffect);

	abstract Object getUrlTarget();

	abstract void setUrlTarget(UrlTarget urlTarget);

	//methods
	//colors problema tipo prefixes
	abstract Object getColors();

	abstract void addColor(String color);

	abstract void changeColorsDefault(String... newColors);

	abstract <T extends IAmGraphController> void addGraph(T amGraphController);

	//graphs
	abstract Object getGraphs();

	//guides
	abstract Object getGuides();

	//valueAxes
	abstract Object getValueAxes();

	abstract void addGuide(IGuideController guideController);

	abstract void addValueAxis(ValueAxisController valueAxisController);

	//remove by id
	abstract void removeGraph(String idGraph);

	abstract void removeGuide(String idGuide);

	abstract void removeValueAxis(String idValueAxis);

}