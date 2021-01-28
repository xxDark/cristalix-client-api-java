package dev.xdark.clientapi.text;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface TextFormatting {

  TextFormatting BLACK = objectValue(),
      DARK_BLUE = objectValue(),
      DARK_GREEN = objectValue(),
      DARK_AQUA = objectValue(),
      DARK_RED = objectValue(),
      DARK_PURPLE = objectValue(),
      GOLD = objectValue(),
      GRAY = objectValue(),
      DARK_GRAY = objectValue(),
      BLUE = objectValue(),
      GREEN = objectValue(),
      AQUA = objectValue(),
      RED = objectValue(),
      LIGHT_PURPLE = objectValue(),
      YELLOW = objectValue(),
      WHITE = objectValue(),
      OBFUSCATED = objectValue(),
      BOLD = objectValue(),
      STRIKETHROUGH = objectValue(),
      UNDERLINE = objectValue(),
      ITALIC = objectValue(),
      RESET = objectValue();

  int getColorIndex();

  boolean isFancyStyling();

  boolean isColor();

  String getFriendlyName();
}
