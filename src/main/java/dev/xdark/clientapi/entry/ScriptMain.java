package dev.xdark.clientapi.entry;

import dev.xdark.clientapi.ClientApi;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface ScriptMain {

  void load(ClientApi api);

  void unload();
}
