package es.uvigo.esei.amchartsJava.core.constants;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;



public class AmchartsConstants {
	
	//not delete these two variables, if change name variables, update references in code
	public static final String LOGGING;
	public static final String IMPROVED_VISIBILITY;

	private AmchartsConstants(){
		
	}
	
	static{
		IMPROVED_VISIBILITY = Config.getString("enabledImprovedVisibility");
		LOGGING = Config.getString("log");
	}

	public static final DurationConstant DURATION_UNITS = DurationConstant.getInstance();
	//usada para ser escogida por interfaz
	public static final CreditsPositionConstant CREDITS_POSITION = CreditsPositionConstant.getInstance();
	public static final PointPositionGraphConstant POINT_POSITION_GRAPH = PointPositionGraphConstant.getInstance();
	public static final PointPositionAxisRadarConstant POINT_POSITION_AXIS_RADAR = PointPositionAxisRadarConstant.getInstance();
	public static final AxisPositionConstant AXIS_POSITION = AxisPositionConstant.getInstance();
	public static final PositionConstant POSITION = PositionConstant.getInstance();
	public static final CursorPositionConstant CURSOR_POSITION = CursorPositionConstant.getInstance();
	public static final CategoryPositionConstant CATEGORY_POSITION = CategoryPositionConstant.getInstance();
	public static final ShowAtConstant SHOW_AT = ShowAtConstant.getInstance();
	public static final AlignConstant ALIGN = AlignConstant.getInstance();
	public static final StepDirectionConstant STEP_DIRECTION = StepDirectionConstant.getInstance();
	public static final ValueAlignConstant VALUE_ALIGN = ValueAlignConstant.getInstance();
	public static final TextAlignConstant TEXT_ALIGN = TextAlignConstant.getInstance();
	public static final SeparatorConstant SEPARATOR = SeparatorConstant.getInstance();
	public static final LegendPositionConstant LEGEND_POSITIONS = LegendPositionConstant.getInstance();
	public static final EffectConstant START_EFFECTS = EffectConstant.getInstance();
	public static final UrlTargetConstant URL_TARGET = UrlTargetConstant.getInstance();
	public static final BulletConstant BULLET = BulletConstant.getInstance();
	public static final String[] DATE_FORMAT = DateFormatConstant.getDateFormat();
	public static final PeriodConstant PERIODS = PeriodConstant.getInstance();
	public static final OrientationConstant ORIENTATION = OrientationConstant.getInstance();
	public static final LabelPositionConstant LABEL_POSITION = LabelPositionConstant.getInstance();
	public static final LabelAnchorConstant LABEL_ANCHOR = LabelAnchorConstant.getInstance();
	public static final TagsTextConstant TAGS_TEXT = TagsTextConstant.getInstance();
	public static final CategoryBalloonTextConstant CATEGORY_BALLOON_TEXT = CategoryBalloonTextConstant.getInstance();
	public static final LegendPeriodValueTextConstant LEGEND_PERIOD_VALUE_TEXT = LegendPeriodValueTextConstant.getInstance();
	public static final GradientAngleConstant GRADIENT_ANGLE = GradientAngleConstant.getInstance();
	public static final GraphTypesConstant GRAPH_TYPES = GraphTypesConstant.getInstance();
	public static final GridTypesConstant GRID_TYPES = GridTypesConstant.getInstance();
	public static final MarkerTypeConstant MARKER_TYPES = MarkerTypeConstant.getInstance();
	public static final SwitchTypeConstant SWITCH_TYPES = SwitchTypeConstant.getInstance();
	public static final ChartTypesConstant CHART_TYPES = ChartTypesConstant.getInstance();
	public static final AxisTypeConstant AXIS_TYPES = AxisTypeConstant.getInstance();
	public static final StackTypeConstant STACK_TYPES = StackTypeConstant.getInstance();
	
	
	
	
}
