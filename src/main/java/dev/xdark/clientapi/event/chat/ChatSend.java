package dev.xdark.clientapi.event.chat;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;

@SidedApi(Side.BOTH)
public interface ChatSend extends Cancellable {

  String KEY = "chat_send";

  String getMessage();

  @SidedApi(Side.SERVER)
  void setMessage(String message);

  boolean isCommand();
}
