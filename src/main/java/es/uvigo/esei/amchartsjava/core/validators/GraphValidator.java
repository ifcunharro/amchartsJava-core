package es.uvigo.esei.amchartsjava.core.validators;

import java.util.List;

import es.uvigo.esei.amchartsjava.core.controllers.graphs.AmGraphCandleController;
import es.uvigo.esei.amchartsjava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsjava.core.controllers.graphs.AmGraphOhlcController;
import es.uvigo.esei.amchartsjava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsjava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsjava.core.controllers.graphs.AmGraphXyController;

/**
 * This class contains methods to cast graphs to concrete graph.
 * @author Iago Fernández Cuñarro
 *
 */
public final class GraphValidator {
	
	private GraphValidator(){
		
	}
	
	/**
	 * Cast graphs as Object to List of AmGraphController.
	 * @param graphs Graphs as Object
	 * @return  List of generic graphs or null if can't cast.
	 */
	@SuppressWarnings("unchecked")
	public static List<AmGraphController> castToListAmGraphs(final Object graphs){
		List<?> list;
		if(graphs==null){
			return null;
		}
		if(graphs.getClass().getSimpleName().endsWith("List")){
			list = (List<?>) graphs;
		}else{
			list = null;
		}
		if(list != null){
			if(list.isEmpty()){
				return null;
			}
			final String nameClass = list.get(0).getClass().getSimpleName();
			return nameClass
					.endsWith("Controller") 
					&& nameClass
					.startsWith("AmGraph")
					?(List<AmGraphController>)list
					:null;
		}
		return null;
		
	}
	
	/**
	 * Cast AmGraphController to AmGraphCandleController.
	 * @param graph Generic graph.
	 * @return AmGraphCandleController AmGraph type candle or null if can't cast.
	 */
	public static AmGraphCandleController castToAmGraphCandle(final AmGraphController graph){
		if(graph != null){
			return graph
				.getClass()
				.getSimpleName()
				.equals("AmGraphCandleController")
				? (AmGraphCandleController) graph
				: null;
		}
		return null;
	
		
	}
	
	/**
	 * Cast AmGraphController to AmGraphOhlcController.
	 * @param graph Generic graph.
	 * @return AmGraphOhlcController AmGraph type ohlc or null if can't cast.
	 */
	public static AmGraphOhlcController castToAmGraphOhlc(final AmGraphController graph){
		if(graph != null){
			return graph
				.getClass()
				.getSimpleName()
				.equals("AmGraphOhlcController")
				? (AmGraphOhlcController) graph
				: null;
		}
		return null;
	
		
	}
	
	/**
	 * Cast AmGraphController to AmGraphSerialController.
	 * @param graph Generic graph.
	 * @return AmGraphSerialController AmGraph type serial or null if can't cast.
	 */
	public static AmGraphSerialController castToAmGraphSerial(final AmGraphController graph){
		if(graph != null){
			return graph
				.getClass()
				.getSimpleName()
				.equals("AmGraphSerialController")
				? (AmGraphSerialController) graph
				: null;
		}
		return null;
	
		
	}
	
	/**
	 * Cast AmGraphController to AmGraphStepController.
	 * @param graph Generic graph.
	 * @return AmGraphStepController AmGraph type step or null if can't cast.
	 */
	public static AmGraphStepController castToAmGraphStep(final AmGraphController graph){
		if(graph != null){
			return graph
				.getClass()
				.getSimpleName()
				.equals("AmGraphStepController")
				? (AmGraphStepController) graph
				: null;
		}
		return null;
	
		
	}
	
	/**
	 * Cast AmGraphController to AmGraphXyController.
	 * @param graph Generic graph.
	 * @return AmGraphXyController AmGraph type xy or null if can't cast.
	 */
	public static AmGraphXyController castToAmGraphXy(final AmGraphController graph){
		if(graph != null){
			return graph
				.getClass()
				.getSimpleName()
				.equals("AmGraphXyController")
				? (AmGraphXyController) graph
				: null;
		}
		return null;
	
	}

}
