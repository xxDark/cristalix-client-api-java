package dev.xdark.clientapi.text;

public interface Style {

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
