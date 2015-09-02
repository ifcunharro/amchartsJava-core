package es.uvigo.esei.amchartsJava.core.model.charts;

import org.apache.log4j.Logger;

import es.uvigo.esei.amchartsJava.core.constants.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.axis.AxisBaseController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideRadarChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;

public class AmRadarChart extends AmCoordinateChart {
	
	private static final Logger logger = Logger.getLogger(AmRadarChart.class.getName());


	public <T extends AmGraphController> void addGraph(T amGraphController) throws NotSupportedException {
		if(amGraphController instanceof AmGraphXyController){
			addGraphXy((AmGraphXyController)amGraphController);
		}else if(amGraphController instanceof AmGraphSerialController){
			addGraphSerial((AmGraphSerialController)amGraphController);
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(amGraphController.getClass().getSimpleName()
						+I18n.get("NotSupportedException")+
						getClass().getSimpleName());
			}
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
			if(Config.getString("log").equals("file")){
				logger.info(guideController.getClass().getSimpleName()
						+I18n.get("NotSupportedException")+
						getClass().getSimpleName());
			}
			throw new NotSupportedException(
					guideController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}

	}
	
	public <T extends AxisBaseController> void addValueAxis(T valueAxisController) throws NotSupportedException {
		if(valueAxisController instanceof ValueAxisRadarChartController){
			addValueAxisRadarController((ValueAxisRadarChartController)valueAxisController);
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(valueAxisController.getClass().getSimpleName()
						+I18n.get("NotSupportedException")+
						getClass().getSimpleName());
			}
			throw new NotSupportedException(
					valueAxisController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}
		
	}

}
