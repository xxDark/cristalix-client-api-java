package dev.xdark.clientapi.event.chat;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.text.Text;

import java.util.UUID;

@SidedApi(Side.BOTH)
public interface ChatReceive extends Cancellable {

  UUID getSender();

  Text getText();

  void setText(Text text);
}
