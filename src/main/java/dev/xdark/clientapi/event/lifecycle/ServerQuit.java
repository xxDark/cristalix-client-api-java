package dev.xdark.clientapi.event.lifecycle;

import dev.xdark.clientapi.text.Text;

public interface ServerQuit {

  String KEY = "server_quit";

  Text getReason();
}
