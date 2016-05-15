package es.uvigo.esei.amchartsjava.core.constants.lang;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * This class contains text used by amcharts core in spanish.
 * @author Iago Fernández Cuñarro
 *
 */
public class ES implements Idiom {

	private static Map<String,String> textsES = new ConcurrentHashMap<String,String>();
	
	static{
		textsES.put("RangeException", "Número fuera de rango: debe estar entre ");
		textsES.put("LanguageException", "El idioma no es válido");
		textsES.put("ColorException", "El formato de color debe ser #000000");
		textsES.put("IntegerException", "El número debe ser un entero");
		textsES.put("DoubleException", "El número debe ser un real");
		textsES.put("and"," y ");
		textsES.put("CoordException","Las coordenadas deben ser un entero o porcentaje");
		textsES.put("NotSupportedException", " no es soportado por ");
		textsES.put("ChartException", " necesita añadirse a un chart para poder usar esta propiedad");
		textsES.put("PatternException", "Pattern debe tener valores para height, width y una url");
		textsES.put("JsonFileNotFoundException", "Archivo json no encontrado en directorio temp");
		textsES.put("PropertiesException", "No encontrado configuration.properties en carpeta resources");
		textsES.put("ConfigKeyException", "no encontrada en archivo de configuración");
		textsES.put("ChartCastException","No se puede convertir a chart");
		
		textsES.put("dayNames", "['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'];");
		textsES.put("shortDayNames","['Dom', 'Lun', 'Mar', 'Mié', 'Jue', 'Vie', 'Sáb'];");
		textsES.put("monthNames", "['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];");
		textsES.put("shortMonthNames", "['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'];");


	}
	
	private ES(){
		
	}
	
	private static final class InitSingleton{
		private static final ES INSTANCE = new ES();
	}
	
	/**
	 * Get a singleton of this class.
	 * @return Idiom Singleton of Idiom used by app.
	 */
	public static Idiom getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	/**
	 * Get a text in spanish.
	 * @param key Key asociated to text searched.
	 * @return String Text searched.
	 */
	public String get(final String key){
		return  textsES.get(key);
	}
	
}
