package es.uvigo.esei.amchartsJava.core.api;


import es.uvigo.esei.amchartsJava.core.constants.TextAlignConstant.TextAlign;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IAmBalloonController {

	abstract Object isAdjustColor();

	abstract void setAdjustColor(Boolean adjustColor);

	abstract Object getAnimationDuration();

	abstract void setAnimationDuration(Number animationDuration)
			throws OutOfRangeException;

	abstract Object getBorderAlpha();

	abstract void setBorderAlpha(Number borderAlpha) throws OutOfRangeException;

	abstract Object getBorderColor();

	abstract void setBorderColor(String borderColor) throws ColorException;

	abstract Object getBorderThickness();

	abstract void setBorderThickness(Number borderThickness)
			throws OutOfRangeException;

	abstract Object getColor();

	abstract void setColor(String color) throws ColorException;

	abstract Object getCornerRadius();

	abstract void setCornerRadius(Number cornerRadius) throws OutOfRangeException;
	
	abstract Object isDisableMouseEvents();
	
	abstract void setDisableMouseEvents(Boolean disableMouseEvents);

	abstract Object getFadeOutDuration();

	abstract void setFadeOutDuration(Number fadeOutDuration)
			throws OutOfRangeException;

	abstract Object getFillAlpha();

	abstract void setFillAlpha(Number fillAlpha) throws OutOfRangeException;

	abstract Object getFillColor();

	abstract void setFillColor(String fillColor) throws ColorException;

	abstract Object isFixedPosition();

	abstract void setFixedPosition(Boolean fixedPosition);

	abstract Object getFontSize();

	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	abstract Object getHorizontalPadding();

	abstract void setHorizontalPadding(Number horizontalPadding)
			throws OutOfRangeException;

	abstract Object getMaxWidth();

	abstract void setMaxWidth(Number maxWidth) throws IntegerException;

	abstract Object getOffsetX();

	abstract void setOffsetX(Number offsetX) throws IntegerException;

	abstract Object getOffsetY();

	abstract void setOffsetY(Number offsetY) throws IntegerException;

	abstract Object getPointerWidth();

	abstract void setPointerWidth(Number pointerWidth) throws OutOfRangeException;

	abstract Object getShadowAlpha();

	abstract void setShadowAlpha(Number shadowAlpha) throws OutOfRangeException;

	abstract Object getShadowColor();

	abstract void setShadowColor(String shadowColor) throws ColorException;

	abstract Object isShowBullet();

	abstract void setShowBullet(Boolean showBullet);

	abstract Object getTextAlign();

	abstract void setTextAlign(TextAlign textAlign);

	abstract Object getVerticalPadding();

	abstract void setVerticalPadding(Number verticalPadding)
			throws OutOfRangeException;

}