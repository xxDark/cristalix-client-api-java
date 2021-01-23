package dev.xdark.clientapi.text;

import java.util.List;

public interface Text extends Iterable<Text> {

  Text setStyle(Style style);

  Text append(Text text);

  String getUnformattedPart();

  String getUnformattedText();

  String getFormattedText();

  List<Text> getParts();
}
