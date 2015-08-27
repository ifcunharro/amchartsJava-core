package es.uvigo.esei.amchartsJava.core.api.deserializers;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.GaugeBandController;

public interface IJsonDeserializerGaugeAxisController {
	
	public void setBands(List<GaugeBandController> gaugeBands);

}
