package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.BOTH)
public final class DefaultVertexFormats {

  public static VertexFormat BLOCK = objectValue();
  public static VertexFormat ITEM = objectValue();
  public static final VertexFormat PARTICLE_POSITION_TEX_COLOR_LMAP = objectValue();
  public static final VertexFormat POSITION = objectValue();
  public static final VertexFormat POSITION_COLOR = objectValue();
  public static final VertexFormat POSITION_TEX = objectValue();
  public static final VertexFormat POSITION_NORMAL = objectValue();
  public static final VertexFormat POSITION_TEX_COLOR = objectValue();
  public static final VertexFormat POSITION_TEX_NORMAL = objectValue();
  public static final VertexFormat POSITION_TEX_LMAP_COLOR = objectValue();
  public static final VertexFormat POSITION_TEX_COLOR_NORMAL = objectValue();

  private DefaultVertexFormats() {
  }
}
