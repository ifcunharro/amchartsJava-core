package amcharts.model.parser;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ParserJson {
	
	public static ObjectMapper getParserJson(){
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.enable(SerializationFeature.INDENT_OUTPUT);
		 mapper.configure(MapperFeature.AUTO_DETECT_IS_GETTERS,true);
  	   	 mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES,false);
  	   	 return mapper;
	}
}
