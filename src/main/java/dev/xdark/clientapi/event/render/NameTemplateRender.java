package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;

@SidedApi(Side.SERVER)
public interface NameTemplateRender extends Cancellable {

  Object getEntity();

  float getX();

  float getY();

  float getZ();

  int getVerticalShift();

  float getViewerYaw();

  float getViewerPitch();

  boolean isThirdPersonFrontal();

  boolean isSneaking();
}
