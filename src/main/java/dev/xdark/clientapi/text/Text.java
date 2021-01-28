package dev.xdark.clientapi.text;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.List;

@SidedApi(Side.BOTH)
public interface Text extends Iterable<Text> {

  Text setStyle(Style style);

  Style getStyle();

  Text append(Text text);

  String getUnformattedPart();

  String getUnformattedText();

  String getFormattedText();

  List<Text> getParts();

  Text copy();
}
