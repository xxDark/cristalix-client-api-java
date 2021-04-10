package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface Variant {

  static Variant of(
      ResourceLocation modelLocation, ModelRotation rotation, boolean uvLock, int weight) {
    throw CompileStub.create();
  }

  ResourceLocation getModelLocation();

  ModelRotation getModelRotation();

  boolean isUVLocked();

  int getWeight();
}
