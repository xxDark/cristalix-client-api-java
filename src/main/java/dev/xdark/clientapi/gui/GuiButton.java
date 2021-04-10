package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.game.Minecraft;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface GuiButton extends Gui {

  int getX();

  void setX(int x);

  int getY();

  void setY(int y);

  int getWith();

  void setWidth(int width);

  int getHeight();

  void setHeight(int height);

  String getText();

  void setText(String text);

  int getId();

  boolean isEnabled();

  void setEnabled(boolean enabled);

  boolean isVisible();

  void setVisible(boolean visible);

  boolean isHovered();

  int getHoverState(boolean state);

  void drawButton(Minecraft mc, int x, int y, float tickLength);

  void mouseDragged(Minecraft mc, int x, int y);

  void mouseReleased(int x, int y);

  boolean mousePressed(Minecraft mc, int x, int y);

  boolean isMouseOver();

  void drawButtonForegroundLayer(int mouseX, int mouseY);

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

    Builder text(String text);

    Builder enabled(boolean enabled);

    Builder visible(boolean visible);

    Builder adapter(ButtonAdapter adapter);

    GuiButton build();
  }
}
