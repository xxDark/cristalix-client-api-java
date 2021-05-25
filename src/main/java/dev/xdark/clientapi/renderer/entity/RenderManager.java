package dev.xdark.clientapi.renderer.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.renderer.culling.Camera;

@SidedApi(Side.SERVER)
public interface RenderManager {

  void setPosition(double x, double y, double z);

  <T extends Entity> Render<T> getEntityRender(T entity);

  void setPlayerViewY(float playerViewY);

  boolean shouldRenderShadow();

  void setRenderShadow(boolean renderShadow);

  void setDebugBoundingBox(boolean debugBoundingBox);

  boolean isDebugBoundingBox();

  boolean isRenderMultipass(Entity entity);

  boolean shouldRender(Entity entity, Camera camera, double camX, double camY, double camZ);

  void renderEntityStatic(Entity entity, float partialTicks, boolean skipDebugBox);

  void renderEntity(
      Entity entity, double x, double y, double z, float yaw, float pitch, boolean skipDebugBox);

  void renderDebugBoundingBox(
      Entity entity, double x, double y, double z, float yaw, float partialTicks);

  double getDistanceToCamera(double x, double y, double z);

  void setRenderOutlines(boolean renderOutlines);
}
