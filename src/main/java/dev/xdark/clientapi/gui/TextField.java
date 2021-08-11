package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.render.FontRenderer;
import dev.xdark.clientapi.render.Tessellator;
import dev.xdark.clientapi.util.CompileStub;

import java.util.function.Predicate;

@SidedApi(Side.SERVER)
public interface TextField extends UIComponent {

  static TextField create(
      int id,
      int x,
      int y,
      int width,
      int height,
      FontRenderer fontRenderer,
      Tessellator tessellator) {
    throw CompileStub.create();
  }

  int getId();

  int getX();

  int getY();

  void setX(int x);

  void setY(int y);

  void setPos(int x, int y);

  int getWidth();

  int getHeight();

  void setWidth(int width);

  void setHeight(int height);

  void setDimension(int width, int height);

  String getText();

  void setText(String text);

  int getMaxTextLength();

  void setMaxTextLength(int maxTextLength);

  boolean shouldDrawBackground();

  void setBackgroundDrawing(boolean backgroundDrawing);

  boolean canLoseFocus();

  void setCanLoseFocus(boolean canLoseFocus);

  boolean isEnabled();

  void setEnabled(boolean enabled);

  int getEnabledColor();

  void setEnabledColor(int enabledColor);

  int getDisabledColor();

  void setDisabledColor(int disabledColor);

  boolean isVisible();

  void setVisible(boolean visible);

  Predicate<String> getValidator();

  void setValidator(Predicate<String> validator);

  void writeText(String text);

  void deleteWords(int num);

  void deleteFromCursor(int num);

  int getNthWordFromCursor(int num);

  int getNthWordFromPos(int n, int pos);

  int getNthWordFromPosWS(int n, int pos, boolean skipWs);

  void moveCursorBy(int offset);

  void setCursorPosition(int cursorPosition);

  boolean textboxKeyTyped(char typedChar, int keyCode);

  boolean mouseClicked(int mouseX, int mouseY, int button);

  void drawTextBox();

  int getCursorPosition();

  boolean isFocused();

  void setFocused(boolean focused);

  int getSelectionEnd();

  int getRealWidth();

  void setSelectionPos(int selectionPos);
}
