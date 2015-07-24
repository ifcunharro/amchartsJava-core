package es.uvigo.esei.amchartsJava.core.api;


import es.uvigo.esei.amchartsJava.core.constants.TextAlignConstant.TextAlign;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IAmBalloonController {

	public Object isAdjustColor();

	public void setAdjustColor(Boolean adjustColor);

	public Object getAnimationDuration();

	public void setAnimationDuration(Number animationDuration)
			throws OutOfRangeException;

	public Object getBorderAlpha();

	public void setBorderAlpha(Number borderAlpha) throws OutOfRangeException;

	public Object getBorderColor();

	public void setBorderColor(String borderColor) throws ColorException;

	public Object getBorderThickness();

	public void setBorderThickness(Number borderThickness)
			throws IntegerException;

	public Object getColor();

	public void setColor(String color) throws ColorException;

	public Object getCornerRadius();

	public void setCornerRadius(Number cornerRadius) throws IntegerException;

	public Object getFadeOutDuration();

	public void setFadeOutDuration(Number fadeOutDuration)
			throws OutOfRangeException;

	public Object getFillAlpha();

	public void setFillAlpha(Number fillAlpha) throws OutOfRangeException;

	public Object getFillColor();

	public void setFillColor(String fillColor) throws ColorException;

	public Object isFixedPosition();

	public void setFixedPosition(Boolean fixedPosition);

	public Object getFontSize();

	public void setFontSize(Number fontSize) throws IntegerException;

	public Object getHorizontalPadding();

	public void setHorizontalPaddint(Number horizontalPadding)
			throws IntegerException;

	public Object getMaxWidth();

	public void setMaxWidth(Number maxWidth) throws IntegerException;

	public Object getOffsetX();

	public void setOffsetX(Number offsetX) throws IntegerException;

	public Object getOffsetY();

	public void setOffsetY(Number offsetY) throws IntegerException;

	public Object getPointerWidth();

	public void setPointerWidth(Number pointerWidth) throws IntegerException;

	public Object getShadowAlpha();

	public void setShadowAlpha(Number shadowAlpha) throws OutOfRangeException;

	public Object getShadowColor();

	public void setShadowColor(String shadowColor) throws ColorException;

	public Object isShowBullet();

	public void setShowBullet(Boolean showBullet);

	public Object getTextAlign();

	public void setTextAlign(TextAlign textAlign);

	public Object getVerticalPadding();

	public void setVerticalPadding(Number verticalPadding)
			throws IntegerException;

}