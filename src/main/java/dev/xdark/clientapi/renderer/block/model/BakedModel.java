package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.render.model.ItemCameraTransforms;
import dev.xdark.clientapi.renderer.texture.TextureAtlasSprite;
import dev.xdark.clientapi.util.EnumFacing;

import java.util.List;

@SidedApi(Side.SERVER)
public interface BakedModel {

  List<BakedQuad> getQuads(BlockState state, EnumFacing facing, long seed);

  boolean hasQuads(BlockState state, EnumFacing facing, long seed);

  boolean isAmbientOcclusion();

  boolean isGui3d();

  boolean isBuiltInRenderer();

  TextureAtlasSprite getParticleTexture();

  ItemCameraTransforms getItemCameraTransforms();
}
