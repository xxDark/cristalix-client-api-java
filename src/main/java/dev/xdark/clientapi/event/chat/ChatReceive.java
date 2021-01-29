package dev.xdark.clientapi.event.chat;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.text.Text;

@SidedApi(Side.BOTH)
public interface ChatReceive extends Cancellable {

  Text getText();

  void setText(Text text);
}
