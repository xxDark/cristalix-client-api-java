package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.BlockState;
import dev.xdark.clientapi.render.model.ItemCameraTransforms;
import dev.xdark.clientapi.renderer.texture.TextureAtlasSprite;
import dev.xdark.clientapi.util.CompileStub;
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

  @SidedApi(Side.SERVER)
  interface Builder {
    static Builder builder() {
      throw CompileStub.create();
    }

    Builder addFaceQuad(EnumFacing facing, BakedQuad quad);

    Builder addGeneralQuad(BakedQuad quad);

    Builder setTexture(TextureAtlasSprite sprite);

    BakedModel build();
  }
}
