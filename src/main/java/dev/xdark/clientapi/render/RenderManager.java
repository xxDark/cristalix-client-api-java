package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.Entity;

@SidedApi(Side.SERVER)
public interface RenderManager {

  void renderEntityStatic(Entity entity, float partialTicks, boolean skipDebugBox);

  void renderEntity(Entity entity, double x, double y, double z, float yaw, float pitch, boolean skipDebugBox);

  void renderMultipass(Entity entity, float partialTicks);

  boolean isRenderingOutlines();

  void setRenderOutlines(boolean renderOutlines);
}
