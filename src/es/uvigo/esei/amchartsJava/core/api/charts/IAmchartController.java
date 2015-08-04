package es.uvigo.esei.amchartsJava.core.api.charts;

import java.util.List;







import es.uvigo.esei.amchartsJava.core.constants.ChartTypesConstant.ChartType;
import es.uvigo.esei.amchartsJava.core.constants.CreditsPositionConstant.CreditsPosition;
import es.uvigo.esei.amchartsJava.core.constants.SeparatorConstant.Separator;
import es.uvigo.esei.amchartsJava.core.constants.lang.Idioms;
import es.uvigo.esei.amchartsJava.core.controllers.AmBalloonController;
import es.uvigo.esei.amchartsJava.core.controllers.AmLegendController;
import es.uvigo.esei.amchartsJava.core.controllers.LabelController;
import es.uvigo.esei.amchartsJava.core.controllers.TitleController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AmChart;

public abstract interface IAmchartController<E extends AmChart> {

	//properties
	abstract Object IsAddClassNames();

	abstract void setAddClassNames(Boolean addClassNames);
	
	abstract Object isAutoResize();
	
	abstract void setAutoResize(Boolean autoResize);

	abstract Object getBackgroundAlpha();

	abstract void setBackGroundAlpha(Number backGroundAlpha)
			throws OutOfRangeException;

	abstract Object getBackGroundColor();

	abstract void setBackGroundColor(String backGrouncColor)
			throws ColorException;

	abstract Object getBorderAlpha();

	abstract void setBorderAlpha(Number borderAlpha) throws OutOfRangeException;

	abstract Object getBorderColor();

	abstract void setBorderColor(String borderColor) throws ColorException;

	abstract Object getClassNamePrefix();

	abstract void setClassNamePrefix(String classNamePrefix);

	abstract Object getColor();

	abstract void setColor(String color) throws ColorException;

	abstract Object getCreditsPosition();

	abstract void setCreditsPosition(CreditsPosition creditsPosition);

	abstract Object getDecimalSepartator();

	//punto o coma, ningun otro para evitar conflictos
	abstract void setDecimalSeparator(Separator decimalSeparator);

	abstract Object getFontFamily();

	abstract void setFontFamily(String fontFamily);

	abstract Object getFontSize();

	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	abstract Object isHandDrawn();

	abstract void setHandDrawn(Boolean handDrawn);

	abstract Object getHandDrawScatter();

	abstract void setHandDrawScatter(Number handDrawScatter)
			throws OutOfRangeException;

	abstract Object getHandDrawThickness();

	abstract void setHandDrasThickness(Number handDrawThickness)
			throws OutOfRangeException;

	abstract Object getHideBalloonTime();

	abstract void setHideBalloonTime(Number hideBalloonTime)
			throws IntegerException;

	//necesario un archivo js de idioma escogido
	abstract Object getLanguage();

	abstract void setLanguage(Idioms language);

	abstract Object isPanEventsEnabled();

	abstract void setPanEventsEnabled(Boolean panEventsEnabled);
	
	abstract Object getPath();
	
	abstract void setPath(String path);

	abstract Object getPathToImages();

	//FALTA VALIDAR PATH, SE DA UNO POR DEFECTO ../amcharts/images
	abstract void setPathToImages(String pathToImages);

	abstract Object getPercentPrecision();

	abstract void setPercentPrecision(Number percentPrecision)
			throws OutOfRangeException;

	abstract Object getPrecision();

	abstract void setPrecision(Number precision) throws OutOfRangeException;

	//nombre file js in folder themes sin extension,
	//se puede crear el tuyo propio
	abstract Object getTheme();

	//debe existir file theme
	abstract void setTheme(String theme);

	abstract Object getThousandsSeparator();

	abstract void setThousandsSeparator(Separator thousandsSeparator);

	abstract Object getType();

	abstract void setType(ChartType type);

	abstract Object isUsePrefixes();

	abstract void setUsePrefixes(Boolean usePrefixes);

	//methods 
	abstract Object getTitles();

	//propio
	abstract List<LabelController> getAllLabels();

	//propio
	abstract Object getExport();

	//propio
	abstract void createExport();

	//propio
	abstract Object getBalloon();

	//propio
	abstract Object getLegend();

	//method amcharts
	abstract void addLabel(LabelController labelController);

	//method amcharts
	abstract void addLegend(AmLegendController amLegendController);

	//method amcharts
	abstract void addTitle(TitleController titleController);

	//propio
	abstract void addBalloon(AmBalloonController amBalloon);

	//method amcharts
	abstract void clearLabels();

	//method amcharts
	abstract void removeLegend();

}