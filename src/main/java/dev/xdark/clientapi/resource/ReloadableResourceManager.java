package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import java.util.List;

@SidedApi(Side.SERVER)
public interface ReloadableResourceManager extends ResourceManager {

  void reloadResources(List<ResourcePack> resourcePacks);

  void registerReloadListener(ResourceManagerReloadListener reloadListener);

  void unregisterReloadListener(ResourceManagerReloadListener reloadListener);
}
