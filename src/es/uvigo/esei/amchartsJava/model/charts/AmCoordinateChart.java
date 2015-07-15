package es.uvigo.esei.amchartsJava.model.charts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uvigo.esei.amchartsJava.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.model.graphs.AmGraph;

public abstract class AmCoordinateChart extends AmChart {
	private List<String> colors;
	private List<AmGraphController<?>> graphs;
	private static List<String> idGraphs;
	private int deleteGraphs;
	
	{
		colors = new ArrayList<String>();
		for(ColorsAmCharts color: ColorsAmCharts.values()){
			colors.add(color.toString());
		}
		deleteGraphs = 0;
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
			idGraphs = new ArrayList<String>();
		}
		
		addObserver(amGraphController);
		setChanged();
		notifyObservers(graphs.size()+1+deleteGraphs);
		graphs.add(amGraphController);
		deleteObservers();
		idGraphs.add("AmGraph-"+graphs.size()+deleteGraphs);
		
	}

	public void removeGraph(String id) {
		if(graphs!=null){
			graphs.remove(Integer.valueOf(id.substring(id.length() - 1))-1);
			idGraphs.remove(id);
			deleteGraphs++;
		}
		
	}

	public Object getGraphs() {
		return graphs;
	}
	
	public static boolean existGraph(String idGraph){
		return idGraphs.contains(idGraph);
		
	}

}
