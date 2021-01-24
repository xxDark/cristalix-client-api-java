package dev.xdark.clientapi.chat;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.text.Text;

@SidedApi(Side.BOTH)
public interface Chat {

  @SidedApi(Side.SERVER)
  void sendChatMessage(String message);

  void printChatMessage(Text message);

  void printChatMessage(String message);

  void clearReceivedMessages();

  void clearSentHistory();
}
