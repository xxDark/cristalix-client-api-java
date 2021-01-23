package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface ResourceManager {

  ResourceLocation getLocation(String namespace, String path);
}
