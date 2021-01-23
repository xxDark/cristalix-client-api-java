package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.List;

@SidedApi(Side.BOTH)
public interface FontRenderer {

  int drawStringWithShadow(String str, float x, float y, int color);

  int drawString(String str, float x, float y, int color, boolean dropShadow);

  int getStringWidth(String str);

  int getCharWidth(char c);

  String trimStringToWidth(String str, int width, boolean reverse);

  void drawSplitString(String str, int x, int y, int wrapWidth, int color);

  int getWordWrappedHeight(String str, int maxLength);

  boolean getUnicodeFlag();

  List<String> listFormattedStringToWidth(String str, int wrapWidth);
}
