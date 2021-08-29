package dev.xdark.clientapi.gui.ingame;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.gui.ChatOverlay;
import dev.xdark.clientapi.gui.Screen;
import dev.xdark.clientapi.gui.TextField;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface ChatScreen extends Screen {

  TextField getInputField();

  void setInputField(TextField textField);

  ChatOverlay getChatOverlay();

  void setChatOverlay(ChatOverlay chatOverlay);

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder inputField(TextField inputField);

    Builder defaultInputFieldText(String defaultInputFieldText);

    Builder chatOverlay(ChatOverlay chatOverlay);

    ChatScreen build();
  }
}
