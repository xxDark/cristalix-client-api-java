package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.renderer.BlockModelShapes;
import dev.xdark.clientapi.renderer.texture.TextureMap;

@SidedApi(Side.SERVER)
public interface ModelManager {

  BakedModel getModel(ModelResourceLocation location);

  BakedModel getMissingModel();

  TextureMap getTextureMap();

  BlockModelShapes getBlockModelShapes();
}
