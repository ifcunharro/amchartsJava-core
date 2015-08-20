package es.uvigo.esei.amchartsJava.core.model.charts;

import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;

public class AmXyChart extends AmRectangularChart {

	
	public <T extends AmGraphController> void addGraph(T amGraphController) throws NotSupportedException {
		if(amGraphController instanceof AmGraphXyController){
			addGraphXy((AmGraphXyController)amGraphController);
		}else{
			throw new NotSupportedException(amGraphController.getClass().getSimpleName()+I18n.get("NotSupportedException")+getClass().getSimpleName());
		}
	}
	
	
	public <T extends GuideController> void addGuide(T guideController) throws NotSupportedException {
		if(guideController instanceof GuideValueAxisController){
			addGuideValueAxis((GuideValueAxisController)guideController);
		}else{
			throw new NotSupportedException(
					guideController.getClass().getSimpleName()
					+I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}
	}
	
	public <T extends ValueAxisController> void addValueAxis(T valueAxisController) throws NotSupportedException {
		if(valueAxisController instanceof ValueAxisController){
			addValueAxisController((ValueAxisController)valueAxisController);
		}else{
			throw new NotSupportedException(
					valueAxisController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}
		
	}
	
	public <T extends TrendLineSerialChartController> void addTrendLine(T trendLineController) throws NotSupportedException{
		if(trendLineController instanceof TrendLineXyChartController){
			addTrendLineXy((TrendLineXyChartController) trendLineController);
		}else{
			throw new NotSupportedException(
					trendLineController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}
	}

}
