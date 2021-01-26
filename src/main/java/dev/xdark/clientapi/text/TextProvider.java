package dev.xdark.clientapi.text;

public interface TextProvider {

  Style newStyle();

  TextLiteral of(String text);

  TextKeybinding keybinding(String keybinding);

  Text parse(String json);

  String toJson(Text text);
}
