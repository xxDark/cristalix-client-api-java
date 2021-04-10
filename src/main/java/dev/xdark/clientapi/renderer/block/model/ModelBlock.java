package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.render.model.ItemCameraTransforms;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.util.CompileStub;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@SidedApi(Side.SERVER)
public interface ModelBlock {
  static ModelBlock of(
      ResourceLocation parent,
      List<BlockPart> elements,
      Map<String, String> textures,
      boolean ambientOcclusion,
      boolean gui3d,
      ItemCameraTransforms cameraTransforms,
      List<ItemOverride> overrides) {
    throw CompileStub.create();
  }

  List<BlockPart> getElements();

  boolean isAmbientOcclusion();

  boolean isGui3d();

  boolean isResolved();

  void getParentFromMap(Map<ResourceLocation, ModelBlock> map);

  Collection<ResourceLocation> getOverrideLocations();

  boolean isTexturePresent(String tex);

  String resolveTextureName(String name);

  ResourceLocation getParentLocation();

  ModelBlock getRootModel();

  ItemCameraTransforms getAllTransforms();
}
