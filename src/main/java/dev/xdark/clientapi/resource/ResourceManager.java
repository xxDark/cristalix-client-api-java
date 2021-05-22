package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.renderer.block.model.ModelBlock;
import dev.xdark.clientapi.renderer.block.model.ModelBlockDefinition;

import java.io.IOException;
import java.util.List;

@SidedApi(Side.BOTH)
public interface ResourceManager {

  ResourceLocation getLocation(String namespace, String path);

  Resource getResource(ResourceLocation location) throws IOException;

  List<Resource> getAllResources(ResourceLocation location) throws IOException;

  boolean resourceExists(ResourceLocation location);

  ModelBlockDefinition loadBlockDefinition(ResourceLocation location) throws IOException;

  ModelBlock loadModelBlock(ResourceLocation location) throws IOException;
}
