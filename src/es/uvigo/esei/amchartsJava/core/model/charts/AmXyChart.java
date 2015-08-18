package es.uvigo.esei.amchartsJava.core.model.charts;

import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;

public class AmXyChart extends AmRectangularChart {

	@Override
	public <T extends AmGraphController> void addGraph(T amGraphController) throws NotSupportedException {
		if(amGraphController instanceof AmGraphXyController){
			addGraphXy((AmGraphXyController)amGraphController);
		}else{
			throw new NotSupportedException(amGraphController.getClass().getSimpleName()+I18n.get("NotSupportedException")+getClass().getSimpleName());
		}
	}

}
