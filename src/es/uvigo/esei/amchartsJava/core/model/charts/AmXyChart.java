package es.uvigo.esei.amchartsJava.core.model.charts;

import org.apache.log4j.Logger;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.axis.AxisBaseController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.validators.AxisValidator;
import es.uvigo.esei.amchartsJava.core.validators.GraphValidator;

/**
 * Model class for AmXyChart.
 * @author Iago Fernández Cuñarro
 *
 */
public class AmXyChart extends AmRectangularChart {

	private static final Logger logger = Logger.getLogger(AmXyChart.class.getName());

	
	public void addGraph(AmGraphController amGraphController) throws NotSupportedException {
		AmGraphXyController graphXy = GraphValidator.castToAmGraphXy(amGraphController);
		if(graphXy != null){
			addGraphXy(graphXy);
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(amGraphController.getClass().getSimpleName()
						+I18n.get("NotSupportedException")+
						getClass().getSimpleName());
			}
			throw new NotSupportedException(amGraphController.getClass().getSimpleName()+I18n.get("NotSupportedException")+getClass().getSimpleName());
		}
	}
	
	
	public void addGuide(GuideController guideController) throws NotSupportedException {
		if(guideController instanceof GuideValueAxisController){
			addGuideValueAxis((GuideValueAxisController)guideController);
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(guideController.getClass().getSimpleName()
							+I18n.get("NotSupportedException")+
							getClass().getSimpleName());
				
			}
			throw new NotSupportedException(
					guideController.getClass().getSimpleName()
					+I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}
	}
	
	public void addValueAxis(AxisBaseController valueAxisController) throws NotSupportedException {
		ValueAxisController valueAxis = AxisValidator.castToValueAxis(valueAxisController);
		if(valueAxis != null){
			addValueAxisController(valueAxis);
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
		if(trendLineController.getClass().getSimpleName().equals("TrendLineXyChartController")){
			addTrendLineXy((TrendLineXyChartController) trendLineController);
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
