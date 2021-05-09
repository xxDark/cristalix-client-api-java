package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.game.Minecraft;
import dev.xdark.clientapi.util.CompileStub;

import java.util.List;

@SidedApi(Side.SERVER)
public interface Label extends UIComponent {

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

  List<String> getContent();

  void setContent(List<String> content);

  boolean isCentered();

  void setCentered(boolean centered);

  boolean isVisible();

  void setVisible(boolean visible);

  boolean isBackgroundEnabled();

  void setBackgroundEnabled(boolean enabled);

  int getBackgroundColor();

  void setBackgroundColor(int color);

  int getTextColor();

  void setTextColor(int color);

  int getUlColor();

  void setUlColor(int color);

  int getBrColor();

  void setBrColor(int color);

  int getBorder();

  void setBorder(int border);

  void draw(Minecraft mc);

  void drawBackground();

  @SidedApi(Side.SERVER)
  interface Builder {
    static Builder builder() {
      throw CompileStub.create();
    }

    Builder id(int id);

    Builder x(int x);

    Builder y(int y);

    Builder pos(int x, int y);

    Builder width(int width);

    Builder height(int height);

    Builder dimension(int width, int height);

    Builder content(List<String> content);

    Builder content(String... content);

    Builder centered(boolean centered);

    Builder visible(boolean visible);

    Builder backgroundEnabled(boolean enabled);

    Builder backgroundColor(int color);

    Builder textColor(int color);

    Builder ulColor(int color);

    Builder brColor(int color);

    Builder border(int border);

    Builder draw(LabelDrawHandler handler);

    Builder drawBackground(LabelBackgroundDrawHandler handler);

    Label build();
  }
}
