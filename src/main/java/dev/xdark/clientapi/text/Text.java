package dev.xdark.clientapi.text;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import java.util.List;

@SidedApi(Side.BOTH)
public interface Text extends Iterable<Text> {

  static Text of(String literal) {
    throw CompileStub.INSTANCE;
  }

  static TextKeybinding keybinding(String keybinding) {
    throw CompileStub.INSTANCE;
  }

  static Text of(Object... parameters) {
    throw CompileStub.INSTANCE;
  }

  Text setStyle(Style style);

  Style getStyle();

  Text append(Text text);

  String getUnformattedPart();

  String getUnformattedText();

  String getFormattedText();

  List<Text> getParts();

  Text copy();
}
