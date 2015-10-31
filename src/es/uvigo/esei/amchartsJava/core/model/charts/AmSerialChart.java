package es.uvigo.esei.amchartsJava.core.model.charts;

import org.apache.log4j.Logger;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.axis.AxisBaseController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.CategoryAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphCandleController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphOhlcController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideCategoryAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;

public class AmSerialChart extends AmRectangularChart {
	
	private CategoryAxisController categoryAxis;
	private static final Logger logger = Logger.getLogger(AmSerialChart.class.getName());

	
	
	
	public void addCategoryAxis(CategoryAxisController categoryAxisController){
		categoryAxis = categoryAxisController;
	}
	
	public CategoryAxisController getCategoryAxis(){
		return categoryAxis;
	}
	
	public <T extends AmGraphController> void addGraph(T amGraphController) throws NotSupportedException{
		if(amGraphController instanceof AmGraphStepController){
			addGraphStep((AmGraphStepController)amGraphController);
		}else if(amGraphController instanceof AmGraphCandleController){
			addGraphCandle((AmGraphCandleController)amGraphController);
		}else if (amGraphController instanceof AmGraphOhlcController){
			addGraphOhlc((AmGraphOhlcController)amGraphController);
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
		if(guideController instanceof GuideValueAxisController){
			addGuideValueAxis((GuideValueAxisController)guideController);
		}else if(guideController instanceof GuideCategoryAxisController){
			addGuideCategoryAxis((GuideCategoryAxisController)guideController);
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
		if(valueAxisController.getClass().getSimpleName().equals("ValueAxisController")){
			addValueAxisController((ValueAxisController)valueAxisController);
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
	
	public <T extends TrendLineSerialChartController> void addTrendLine(T trendLineController) throws NotSupportedException{
		if(trendLineController.getClass().getSimpleName().equals("TrendLineSerialChartController")){
			addTrendLineSerial((TrendLineSerialChartController) trendLineController);
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(trendLineController.getClass().getSimpleName()
						+I18n.get("NotSupportedException")+
						getClass().getSimpleName());
			}
			throw new NotSupportedException(
					trendLineController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}
	}


}
