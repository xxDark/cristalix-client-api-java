package dev.xdark.clientapi.event.lifecycle;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.text.Text;

@SidedApi(Side.BOTH)
public interface ServerQuit {

  String KEY = "server_quit";

  Text getReason();
}
