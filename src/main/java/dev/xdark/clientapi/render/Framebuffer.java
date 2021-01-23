package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface Framebuffer {

  void createBindFramebuffer(int width, int height);

  void deleteFramebuffer();

  void createFramebuffer(int width, int height);

  void setFramebufferFilter(int framebufferFilterIn);

  void checkFramebufferComplete();

  void bindFramebufferTexture();

  void unbindFramebufferTexture();

  void bindFramebuffer(boolean viewport);

  void unbindFramebuffer();

  void setFramebufferColor(float red, float green, float blue, float alpha);

  void framebufferRender(int width, int height);

  void framebufferRenderExt(int width, int height, boolean p_178038_3_);

  void framebufferClear();
}
