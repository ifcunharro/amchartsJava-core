package es.uvigo.esei.amchartsJava.core.api.deserializers;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.GaugeBandController;

public abstract interface IJsonDeserializerGaugeAxisController {
	
	abstract void setBands(List<GaugeBandController> gaugeBands);

}
