package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;

@SidedApi(Side.BOTH)
public interface PlayerListRender extends Cancellable {

  String KEY = "player_list_render";
}
