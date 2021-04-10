package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.game.Minecraft;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.text.Text;
import dev.xdark.clientapi.util.CompileStub;

import java.io.IOException;
import java.util.List;

@SidedApi(Side.SERVER)
public interface GuiScreen extends Gui {

  void drawScreen(int mouseX, int mouseY, float tickLength);

  void keyTyped(char c, int code) throws IOException;

  void renderToolTip(ItemStack stack, int x, int y);

  void drawHoveringText(String text, int x, int y);

  void drawHoveringText(List<String> tooltip, int x, int y);

  boolean isFocused();

  void setFocused(boolean focused);

  void handleTextHover(Text text, int x, int y);

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

  boolean doesGuiPauseGame();

  void confirmClicked(boolean result, int id);

  @SidedApi(Side.SERVER)
  interface Builder {
    static Builder builder() {
      throw CompileStub.create();
    }

    Builder button(GuiButton button);

    Builder label(GuiLabel label);

    Builder adapter(GuiScreenAdapter adapter);

    GuiScreen build();
  }
}
