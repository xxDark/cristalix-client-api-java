package dev.xdark.clientapi.event.window;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.render.ScaledResolution;

@SidedApi(Side.BOTH)
public interface WindowResize {

  ScaledResolution getResolution();
}
