package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.game.Minecraft;
import dev.xdark.clientapi.sound.SoundHandler;
import dev.xdark.clientapi.util.BooleanToIntFunction;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface Button extends UIComponent {

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

  String getText();

  void setText(String text);

  boolean isEnabled();

  void setEnabled(boolean enabled);

  boolean isVisible();

  void setVisible(boolean visible);

  boolean isHovered();

  int getHoverState(boolean state);

  void draw(Minecraft mc, int x, int y, float tickLength);

  void mouseDragged(Minecraft mc, int x, int y);

  void mouseReleased(int x, int y);

  boolean mousePressed(Minecraft mc, int x, int y);

  void drawButtonForegroundLayer(int mouseX, int mouseY);

  void playPressSound(SoundHandler soundHandler);

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

    Builder text(String text);

    Builder enabled(boolean enabled);

    Builder visible(boolean visible);

    Builder hoverState(BooleanToIntFunction function);

    Builder draw(ButtonDrawHandler handler);

    Builder mouseDragged(ButtonMouseDraggedHandler handler);

    Builder mouseReleased(ButtonMouseReleasedHandler handler);

    Builder mousePressed(ButtonMousePressedHandler handler);

    Builder drawButtonForegroundLayer(ButtonForegroundHandler handler);

    Builder playPressSound(ButtonSoundPressHandler handler);

    Button build();
  }
}
