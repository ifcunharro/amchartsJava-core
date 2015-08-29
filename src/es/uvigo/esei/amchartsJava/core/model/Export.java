package es.uvigo.esei.amchartsJava.core.model;

import es.uvigo.esei.amchartsJava.core.controllers.ExportController;

public class Export extends IModel {
	
	private ExportController defaultExport;

	public ExportController getFabric(){
		if(defaultExport == null){
			return null;
		}else{
			return defaultExport;
		}
	}
	
	public void setFabric(ExportController fabric) {
		defaultExport = fabric;
	}

}
