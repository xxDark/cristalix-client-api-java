package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;

import java.util.Collection;
import java.util.List;

@SidedApi(Side.SERVER)
public interface ModelBakery {

  void registerVariant(ModelBlockDefinition definition, ModelResourceLocation location);

  void loadVariantList(ModelResourceLocation location, List<Variant> list);

  void loadItemModel(String variantName, ResourceLocation location, ResourceLocation itemName);

  void registerMultipartVariant(
      ModelBlockDefinition definition, Collection<ModelResourceLocation> locations);
}
