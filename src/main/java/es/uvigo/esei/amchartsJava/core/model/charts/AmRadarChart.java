package es.uvigo.esei.amchartsJava.core.model.charts;

import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.axis.AxisBaseController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideRadarChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.validators.AxisValidator;
import es.uvigo.esei.amchartsJava.core.validators.GraphValidator;
import es.uvigo.esei.amchartsJava.core.validators.GuideValidator;

/**
 * Model class for AmRadarChart.
 * @author Iago Fernández Cuñarro
 *
 */
public class AmRadarChart extends AmCoordinateChart {
	
	public void addGraph(AmGraphController amGraphController) throws NotSupportedException {
		if(amGraphController instanceof AmGraphXyController){
			addGraphXy(GraphValidator.castToAmGraphXy(amGraphController));
		}else if(amGraphController instanceof AmGraphSerialController){
			addGraphSerial(GraphValidator.castToAmGraphSerial(amGraphController));
		}else{
			throw new NotSupportedException(
					amGraphController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}

	}

	public void addGuide(GuideController guideController) throws NotSupportedException {
		GuideRadarChartController guide = GuideValidator.castToGuideRadarChart(guideController);
		if(guide != null){
			addGuideRadarChart(guide);
		}else{
			throw new NotSupportedException(
					guideController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}

	}
	
	public void addValueAxis(AxisBaseController valueAxisController) throws NotSupportedException {
		ValueAxisRadarChartController valueAxis = AxisValidator.castToValueAxisRadarChart(valueAxisController);
		if(valueAxis != null){
			addValueAxisRadarController(valueAxis);
		}else{
			throw new NotSupportedException(
					valueAxisController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}
		
	}

}
