package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.List;

@SidedApi(Side.BOTH)
public interface ResourceManager {

  ResourceLocation getLocation(String namespace, String path);

  Resource getResource(ResourceLocation location);

  List<Resource> getAllResources(ResourceLocation location);

  boolean resourceExists(ResourceLocation location);
}
