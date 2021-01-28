package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface RenderPass {

  String KEY = "render_pass";

  int getPass();

  float getPartialTicks();
}
