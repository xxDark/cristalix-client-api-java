package dev.xdark.clientapi.event.chat;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.text.Text;
import dev.xdark.clientapi.util.SideEffects;

import java.util.UUID;

@SidedApi(Side.BOTH)
public interface ChatReceive extends Event, Cancellable {

  EventBus<ChatReceive> BUS = SideEffects.objectValue();

  UUID getSender();

  Text getText();

  void setText(Text text);
}
