package dev.xdark.clientapi.renderer.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.renderer.culling.Camera;

@SidedApi(Side.SERVER)
public interface Render<T extends Entity> {

  void setRenderOutlines(boolean renderOutlines);

  boolean shouldRender(T entity, Camera camera, double x, double y, double z);

  void doRender(T entity, double x, double y, double z, float entityYaw, float partialTicks);

  boolean isMultipass();

  void renderMultipass(T entity, double x, double y, double z, float entityYaw, float partialTicks);
}
