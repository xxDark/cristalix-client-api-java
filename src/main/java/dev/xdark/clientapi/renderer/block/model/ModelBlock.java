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

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder parent(ResourceLocation parent);

    Builder elements(List<BlockPart> elements);

    Builder textures(Map<String, String> textures);

    Builder ambientOcclusion(boolean ambientOcclusion);

    Builder gui3d(boolean gui3d);

    Builder cameraTransforms(ItemCameraTransforms cameraTransforms);

    Builder overrides(List<ItemOverride> overrides);

    ModelBlock build();
  }
}
