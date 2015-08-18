package es.uvigo.esei.amchartsJava.core.model.charts;

import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.axis.CategoryAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphCandleController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphOhlcController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;

public class AmSerialChart extends AmRectangularChart {
	
	private CategoryAxisController categoryAxis;
	
	
	
	public void addCategoryAxis(CategoryAxisController categoryAxisController){
		categoryAxis = categoryAxisController;
	}
	
	public CategoryAxisController getCategoryAxis(){
		return categoryAxis;
	}
	
	@Override
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
			throw new NotSupportedException(amGraphController.getClass().getSimpleName()+I18n.get("NotSupportedException")+getClass().getSimpleName());
		}
	}

}
