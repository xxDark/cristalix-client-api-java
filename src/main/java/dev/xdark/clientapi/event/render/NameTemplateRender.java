package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface NameTemplateRender extends Cancellable {

  EventBus<NameTemplateRender> BUS = SideEffects.objectValue();

  Object getEntity(); // TODO fix that

  float getX();

  float getY();

  float getZ();

  int getVerticalShift();

  float getViewerYaw();

  float getViewerPitch();

  boolean isThirdPersonFrontal();

  boolean isSneaking();

  String getName();

  void setName(String name);
}
