package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.LabelController;
import es.uvigo.esei.amchartsJava.core.controllers.TitleController;

public abstract interface IJsonDeserializerAmChartController {

	//usado solo para deserializar json
	abstract void setAllLabels(List<LabelController> allLabels);

	//usada solo para deserializar json
	abstract void setTitles(List<TitleController> titles);

}