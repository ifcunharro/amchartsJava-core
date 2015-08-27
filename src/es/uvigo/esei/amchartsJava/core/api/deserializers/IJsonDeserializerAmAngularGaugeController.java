package es.uvigo.esei.amchartsJava.core.api.deserializers;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.GaugeArrowController;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeAxisController;

public abstract interface IJsonDeserializerAmAngularGaugeController {
	
	abstract void setArrows(List<GaugeArrowController> arrows);
	
	abstract void setAxes(List<GaugeAxisController> axes);

}
