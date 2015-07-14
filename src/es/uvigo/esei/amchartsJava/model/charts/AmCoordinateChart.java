package es.uvigo.esei.amchartsJava.model.charts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uvigo.esei.amchartsJava.constants.ColorsChart;
import es.uvigo.esei.amchartsJava.controllers.AmGraphController;
import es.uvigo.esei.amchartsJava.model.AmGraph;

public abstract class AmCoordinateChart extends AmChart {
	private List<String> colors;
	private List<AmGraphController<?>> graphs;
	
	{
		colors = new ArrayList<String>();
		for(ColorsChart color: ColorsChart.values()){
			colors.add(color.toString());
		}
	}
	
	public List<String> getColors(){
		return colors;
	}
	
	public void changeColorsDefault(String... newColors){
		colors.clear();
		colors.addAll(Arrays.asList(newColors));
	}
	
	public void addColor(String color){
		colors.add(color);
	}

	public void addGraph(AmGraphController<? extends AmGraph> amGraphController) {
		if(graphs==null){
			graphs = new ArrayList<AmGraphController<?>>();
		}
		
		addObserver(amGraphController);
		setChanged();
		notifyObservers(graphs.size()+1);
		graphs.add(amGraphController);
		deleteObservers();
		
	}

	public void removeGraph(String id) {
		if(graphs!=null){
			graphs.remove(Integer.valueOf(id.substring(id.length() - 1))-1);
		}
		
	}

	public Object getGraphs() {
		return graphs;
	}

}
