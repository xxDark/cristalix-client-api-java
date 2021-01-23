package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.render.ScaledResolution;

public interface GuiOverlayRender {

  String KEY = "gui_overlay_render";

  float getPartialTicks();

  ScaledResolution getResolution();
}
