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
public interface Screen extends UIComponent {

  List<Button> getButtons();

  List<Label> getLabels();

  void drawScreen(int mouseX, int mouseY, float tickLength);

  void keyTyped(char c, int code) throws IOException;

  void renderToolTip(ItemStack stack, int x, int y);

  List<String> getItemToolTip(ItemStack stack);

  void drawHoveringText(String text, int x, int y);

  void setFocused(boolean focused);

  boolean isFocused();

  void drawHoveringText(List<String> tooltip, int x, int y);

  void handleTextHover(Text text, int x, int y);

  void setText(String text, boolean overwrite);

  boolean handleTextClick(Text component);

  void mouseClicked(int x, int y, int button) throws IOException;

  void mouseReleased(int x, int y, int button);

  void mouseClickMove(int x, int y, int button, long diff);

  void actionPerformed(Button button) throws IOException;

  void setWorldAndResolution(Minecraft mc, int w, int h);

  void setSize(int w, int h);

  void init();

  void handleInput() throws IOException;

  void handleMouseInput() throws IOException;

  void handleKeyboardInput() throws IOException;

  void update();

  void closed();

  void drawDefaultBackground();

  void drawWorldBackground(int tint);

  void drawBackground(int tint);

  boolean doesGuiPauseGame();

  void confirmClicked(boolean result, int id);

  void resize(Minecraft mc, int w, int h);

  @SidedApi(Side.SERVER)
  interface Builder {
    static Builder builder() {
      throw CompileStub.create();
    }

    Builder action(ScreenActionHandler handler);

    Builder clickConfirm(ScreenClickConfirmHandler handler);

    Builder close(ScreenCloseHandler handler);

    Builder draw(ScreenDrawHandler handler);

    Builder init(ScreenInitHandler handler);

    Builder keyboardInput(ScreenKeyboardInputHandler handler);

    Builder keyTyped(ScreenKeyTypedHandler handler);

    Builder mouseClick(ScreenMouseClickedHandler handler);

    Builder mouseClickMove(ScreenMouseClickMoveHandler handler);

    Builder mouseInput(ScreenMouseInputHandler handler);

    Builder mouseRelease(ScreenMouseReleasedHandler handler);

    Builder resize(ScreenResizeHandler handler);

    Builder textClick(ScreenTextClickHandler handler);

    Builder textControl(ScreenTextControlHandler handler);

    Builder update(ScreenUpdateHandler handler);

    Screen build();
  }
}
