package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.game.Minecraft;
import dev.xdark.clientapi.text.Text;
import dev.xdark.clientapi.util.CompileStub;

import java.util.List;

@SidedApi(Side.SERVER)
public interface ChatOverlay extends UIComponent {

  void draw(int updateCounter);

  void refresh();

  void resetScroll();

  void scroll(int pos);

  void deleteChatLine(int line);

  int getWidth();

  int getHeight();

  float getScale();

  int getLineCount();

  void clear(boolean clearHistory);

  void clearSentMessages();

  void printText(Text text);

  void printTextWithOptionalDeletion(Text text, int id);

  List<String> getSentMessages();

  void setWidth(int width);

  void setFocusedHeight(int focusedHeight);

  void setUnfocusedHeight(int unfocusedHeight);

  void setScale(float scale);

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder minecraft(Minecraft mc);

    Builder width(int width);

    Builder focusedHeight(int focusedHeight);

    Builder unfocusedHeight(int unfocusedHeight);

    Builder scale(float scale);

    ChatOverlay build();
  }
}
