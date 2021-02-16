package dev.xdark.clientapi.text;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface Style {

  int BOLD = 1;
  int ITALIC = 2;
  int STRIKETHROUGH = 4;
  int UNDERLINED = 8;
  int OBFUSCATED = 16;

  static Style of(int caps, Object... parameters) {
    throw CompileStub.create();
  }

  static Style of(Object... parameters) {
    throw CompileStub.create();
  }

  static Style create() {
    throw CompileStub.create();
  }

  TextFormatting getColor();

  boolean isBold();

  boolean isItalic();

  boolean isStrikethrough();

  boolean isUnderlined();

  boolean isObfuscated();

  String getInsertion();

  boolean isEmpty();

  Style setColor(TextFormatting formatting);

  Style setBold(boolean bold);

  Style setItalic(boolean italic);

  Style setStrikethrough(boolean strikethrough);

  Style setUnderlined(boolean underlined);

  Style setObfuscated(boolean obfuscated);

  Style setClickEvent(ClickEvent event);

  Style setHoverEvent(HoverEvent event);

  Style setInsertion(String insertion);

  Style deepCopy();

  Style shallowCopy();
}
