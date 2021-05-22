package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface ResourceManagerReloadListener {

  void onReload(ResourceManager resourceManager);
}
