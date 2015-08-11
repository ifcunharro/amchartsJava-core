package es.uvigo.esei.amchartsJava.core.model.charts;

import es.uvigo.esei.amchartsJava.core.controllers.axis.CategoryAxisController;

public class AmSerialChart extends AmRectangularChart {
	
	private CategoryAxisController categoryAxis;
	
	
	
	public void addCategoryAxis(CategoryAxisController categoryAxisController){
		categoryAxis = categoryAxisController;
	}
	
	public CategoryAxisController getCategoryAxis(){
		return categoryAxis;
	}

}
