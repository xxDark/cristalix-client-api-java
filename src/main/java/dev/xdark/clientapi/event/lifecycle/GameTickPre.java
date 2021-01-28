package dev.xdark.clientapi.event.lifecycle;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface GameTickPre {

  String KEY = "game_tick_pre";
}
