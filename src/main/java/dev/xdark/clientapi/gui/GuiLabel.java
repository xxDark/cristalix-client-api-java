package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

import java.util.List;

@SidedApi(Side.SERVER)
public interface GuiLabel extends Gui {

  int getX();

  void setX(int x);

  int getY();

  void setY(int y);

  int getWith();

  void setWidth(int width);

  int getHeight();

  void setHeight(int height);

  int getId();

  List<String> getLabels();

  boolean isVisible();

  void setVisible(boolean visible);

  boolean isBackgroundEnabled();

  int getTextColor();

  int getBackColor();

  int getUlColor();

  int getBrColor();

  int getBorder();

  @SidedApi(Side.SERVER)
  interface Builder {
    static Builder builder() {
      throw CompileStub.create();
    }

    Builder id(int id);

    Builder width(int width);

    Builder height(int height);

    Builder dimension(int width, int height);

    Builder x(int x);

    Builder y(int y);

    Builder pos(int x, int y);

    Builder labels(String... labels);

    Builder labels(String label);

    Builder labels(List<String> labels);

    Builder visible(boolean visible);

    Builder backgroundEnabled(boolean enabled);

    Builder textColor(int color);

    Builder backgroundColor(int color);

    Builder ulColor(int color);

    Builder brColor(int color);

    Builder border(int border);

    GuiLabel build();
  }
}
