package dev.xdark.clientapi.event.network;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.text.Text;

@SidedApi(Side.BOTH)
public interface ServerQuit {

  Text getReason();
}
