package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.render.ScaledResolution;

@SidedApi(Side.BOTH)
public interface GuiOverlayRender {

  float getPartialTicks();

  ScaledResolution getResolution();
}
