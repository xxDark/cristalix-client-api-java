package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.render.VertexFormat;
import dev.xdark.clientapi.renderer.texture.TextureAtlasSprite;
import dev.xdark.clientapi.util.EnumFacing;

@SidedApi(Side.SERVER)
public interface BakedQuad {

  TextureAtlasSprite getSprite();

  int[] getVertexData();

  boolean hasTintIndex();

  int getTintIndex();

  EnumFacing getFace();

  int[] getVertexDataSingle();

  VertexFormat getFormat();

  boolean shouldApplyDiffuseLighting();
}
