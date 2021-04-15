package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.game.Minecraft;
import dev.xdark.clientapi.text.Text;

import java.io.IOException;

@SidedApi(Side.SERVER)
public interface ScreenAdapter {
  void drawScreen(int mouseX, int mouseY, float tickLength);

  void keyTyped(char c, int code) throws IOException;

  void setText(String text, boolean overwrite);

  boolean handleTextClick(Text text);

  void mouseClicked(int x, int y, int button) throws IOException;

  void mouseReleased(int x, int y, int button);

  void mouseClickMove(int x, int y, int button, long diff);

  void actionPerformed(GuiButton button) throws IOException;

  void setWorldAndResolution(Minecraft mc, int w, int h);

  void init();

  void handleInput() throws IOException;

  void handleKeyboardInput() throws IOException;

  void handleMouseInput() throws IOException;

  void update();

  void closed();

  void drawDefaultBackground();

  void drawWorldBackground(int tint);

  void drawBackground(int tint);

  boolean doesGuiPauseGame();

  void confirmClicked(boolean result, int id);
}
