package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface Variant {

  ResourceLocation getModelLocation();

  ModelRotation getModelRotation();

  boolean isUVLocked();

  int getWeight();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder modelLocation(ResourceLocation modelLocation);

    Builder rotation(ModelRotation rotation);

    Builder uvLock(boolean uvLock);

    Builder weight(int weight);

    Variant build();
  }
}
