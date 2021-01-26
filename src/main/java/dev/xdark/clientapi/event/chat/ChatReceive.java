package dev.xdark.clientapi.event.chat;

import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.text.Text;

public interface ChatReceive extends Cancellable {

  String KEY = "chat_receive";

  Text getText();

  void setText(Text text);
}
