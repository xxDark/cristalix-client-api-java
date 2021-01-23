package dev.xdark.clientapi.discord;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface DiscordRPC {

  void hide();

  void show();

  void updateState(String state);
}
