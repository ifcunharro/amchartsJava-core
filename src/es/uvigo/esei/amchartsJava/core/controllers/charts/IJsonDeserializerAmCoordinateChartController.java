package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideCategoryAxisController;

public abstract interface IJsonDeserializerAmCoordinateChartController {

	abstract void setColors(List<String> colors);
	
	//necesario para deserializar graphs desde Json
	abstract void setGraphs(List<AmGraphSerialController> graphs);
	
	//necesario para deserializar guides desde Json
	abstract void setGuides(List<GuideCategoryAxisController> guideControllers);
	
	abstract void setValueAxes(List<ValueAxisRadarChartController> axes);

}