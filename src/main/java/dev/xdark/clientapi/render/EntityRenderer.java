package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityLivingBase;
import dev.xdark.clientapi.renderer.culling.Camera;
import dev.xdark.clientapi.resource.ResourceLocation;

@SidedApi(Side.SERVER)
public interface EntityRenderer {

  void disableLightmap();

  void enableLightmap();

  void drawNameplate(
      FontRenderer fontRenderer,
      String name,
      float x,
      float y,
      float z,
      int verticalShift,
      float viewerYaw,
      float viewerPitch,
      boolean isThirdPersonFrontal,
      boolean isSneaking);

  void drawNameplate(
      Object entity, // TODO fix that
      FontRenderer fontRenderer,
      String name,
      float x,
      float y,
      float z,
      int verticalShift,
      float viewerYaw,
      float viewerPitch,
      boolean isThirdPersonFrontal,
      boolean isSneaking);

  Camera getCamera();

  boolean loadShader(ResourceLocation location);

  boolean setFxaaShader(int shader);

  float getNightVisionBrightness(EntityLivingBase entity, float partialTicks);

  void setupOverlayRendering();

  boolean isShaderActive();

  void stopUseShader();

  void switchUseShader();
}
