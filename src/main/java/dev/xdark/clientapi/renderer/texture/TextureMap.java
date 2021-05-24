package dev.xdark.clientapi.renderer.texture;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.render.VertexFormat;
import dev.xdark.clientapi.renderer.block.model.BakedQuad;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.texture.Texture;
import dev.xdark.clientapi.util.EnumFacing;

@SidedApi(Side.SERVER)
public interface TextureMap extends Texture {

  boolean generateMipmaps(TextureAtlasSprite atlasSprite);

  ResourceLocation getResourceLocation(TextureAtlasSprite atlasSprite);

  ResourceLocation completeResourceLocation(ResourceLocation location);

  TextureAtlasSprite getAtlasSprite(String name);

  void updateAnimations();

  TextureAtlasSprite registerSprite(ResourceLocation location);

  void tick();

  void setMipmapLevels(int mipmapLevels);

  TextureAtlasSprite getMissingSprite();

  String getBasePath();

  int getMipmapLevels();

  TextureAtlasSprite getRegisteredSprite(ResourceLocation location);

  int getCountRegisteredSprites();

  boolean isTextureBound();

  TextureAtlasSprite getIconByUV(double u, double v);

  int getCountAnimations();

  int getCountAnimationsActive();

  BakedQuad newQuad(
      int[] vertexData,
      int tintIndex,
      EnumFacing face,
      TextureAtlasSprite sprite,
      boolean applyDiffuseLighting,
      VertexFormat format);

  BakedQuad newQuad(int[] vertexData, int tintIndex, EnumFacing face, TextureAtlasSprite sprite);
}
