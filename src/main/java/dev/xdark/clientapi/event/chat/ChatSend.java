package dev.xdark.clientapi.event.chat;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.BOTH)
public interface ChatSend extends Cancellable {

  EventBus<ChatSend> BUS = SideEffects.objectValue();

  String getMessage();

  @SidedApi(Side.SERVER)
  void setMessage(String message);

  boolean isCommand();
}
