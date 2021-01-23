package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;

@SidedApi(Side.BOTH)
public interface AirBarRender extends Cancellable {

  String KEY = "air_bar_render";
}
