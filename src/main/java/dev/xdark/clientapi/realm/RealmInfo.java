package dev.xdark.clientapi.realm;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface RealmInfo {

  String getType();

  int getId();

  String getReadableName();

  boolean isLobby();
}
