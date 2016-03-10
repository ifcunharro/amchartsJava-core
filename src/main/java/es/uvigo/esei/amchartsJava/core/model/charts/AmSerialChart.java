package es.uvigo.esei.amchartsJava.core.model.charts;

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
import es.uvigo.esei.amchartsJava.core.validators.AxisValidator;

/**
 * Model class for AmSerialChart
 * @author Iago Fernández Cuñarro
 *
 */
public class AmSerialChart extends AmRectangularChart {
	
	private CategoryAxisController categoryAxis;

	/**
	 * Add a CategoryAxis to chart.
	 * @param categoryAxisController Controller for CategoryAxis.
	 */
	public void addCategoryAxis(CategoryAxisController categoryAxisController){
		categoryAxis = categoryAxisController;
	}
	
	/**
	 * Get CategoryAxis.
	 * @return CategoryAxisController Controller for CategoryAxis.
	 */
	public CategoryAxisController getCategoryAxis(){
		return categoryAxis;
	}
	
	public void addGraph(AmGraphController amGraphController) throws NotSupportedException{
		if(amGraphController instanceof AmGraphStepController){
			addGraphStep((AmGraphStepController)amGraphController);
		}else if(amGraphController instanceof AmGraphCandleController){
			addGraphCandle((AmGraphCandleController)amGraphController);
		}else if (amGraphController instanceof AmGraphOhlcController){
			addGraphOhlc((AmGraphOhlcController)amGraphController);
		}else if(amGraphController instanceof AmGraphSerialController){
			addGraphSerial((AmGraphSerialController)amGraphController);
		}else{
			throw new NotSupportedException(
					amGraphController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}
	}
	
	public void addGuide(GuideController guideController) throws NotSupportedException {
		if(guideController instanceof GuideValueAxisController){
			addGuideValueAxis((GuideValueAxisController)guideController);
		}else if(guideController instanceof GuideCategoryAxisController){
			addGuideCategoryAxis((GuideCategoryAxisController)guideController);
		}else{
			throw new NotSupportedException(
					guideController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}
	}

	public  void addValueAxis(AxisBaseController valueAxisController) throws NotSupportedException {
		ValueAxisController valueAxis = AxisValidator.castToValueAxis(valueAxisController);
		if(valueAxis != null){
			addValueAxisController(valueAxis);
		}else{
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
			throw new NotSupportedException(
					trendLineController.getClass().getSimpleName()+
					I18n.get("NotSupportedException")+
					getClass().getSimpleName());
		}
	}


}
