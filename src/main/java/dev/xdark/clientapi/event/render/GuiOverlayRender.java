package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.render.ScaledResolution;

public interface GuiOverlayRender {

  float getPartialTicks();

  ScaledResolution getResolution();
}
