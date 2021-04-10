package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.util.CompileStub;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;

@SidedApi(Side.SERVER)
public interface ItemOverride {

  static ItemOverride of(
      ResourceLocation location, Object2FloatMap<ResourceLocation> resourceValues) {
    throw CompileStub.create();
  }

  ResourceLocation getLocation();
}
