package dev.xdark.clientapi.text;

public interface Style {

  int BOLD = 1;
  int ITALIC = 2;
  int STRIKETHROUGH = 4;
  int UNDERLINED = 8;
  int OBFUSCATED = 16;

  boolean isBold();

  boolean isItalic();

  boolean isStrikethrough();

  boolean isUnderlined();

  boolean isObfuscated();

  String getInsertion();

  boolean isEmpty();

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
