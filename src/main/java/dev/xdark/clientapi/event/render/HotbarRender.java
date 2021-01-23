package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;

@SidedApi(Side.BOTH)
public interface HotbarRender extends Cancellable {

  String KEY = "hotbar_render";
}
