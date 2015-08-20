package es.uvigo.esei.amchartsJava.core.model.charts;

import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideRadarChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;

public class AmRadarChart extends AmCoordinateChart {

	public <T extends AmGraphController> void addGraph(T amGraphController) throws NotSupportedException {
		if(amGraphController instanceof AmGraphXyController){
			addGraphXy((AmGraphXyController)amGraphController);
		}else if(amGraphController instanceof AmGraphSerialController){
			addGraphSerial((AmGraphSerialController)amGraphController);
		}else{
			throw new NotSupportedException(
					amGraphController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}

	}

	public <T extends GuideController> void addGuide(T guideController) throws NotSupportedException {
		if(guideController instanceof GuideRadarChartController){
			addGuideRadarChart((GuideRadarChartController)guideController);
		}else{
			throw new NotSupportedException(
					guideController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}

	}
	
	public <T extends ValueAxisController> void addValueAxis(T valueAxisController) throws NotSupportedException {
		if(valueAxisController instanceof ValueAxisRadarChartController){
			addValueAxisRadarController((ValueAxisRadarChartController)valueAxisController);
		}else{
			throw new NotSupportedException(
					valueAxisController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}
		
	}

}
