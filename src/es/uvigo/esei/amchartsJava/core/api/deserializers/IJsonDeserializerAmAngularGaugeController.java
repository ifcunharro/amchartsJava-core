package es.uvigo.esei.amchartsJava.core.api.deserializers;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.GaugeArrowController;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeAxisController;

public interface IJsonDeserializerAmAngularGaugeController {
	
	public void setArrows(List<GaugeArrowController> arrows);
	
	public void setAxes(List<GaugeAxisController> axes);

}
