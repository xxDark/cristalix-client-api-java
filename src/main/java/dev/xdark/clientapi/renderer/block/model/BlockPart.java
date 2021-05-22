package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import dev.xdark.clientapi.util.EnumFacing;
import org.lwjgl.util.vector.Vector3f;

import java.util.Map;

@SidedApi(Side.SERVER)
public interface BlockPart {

  Vector3f getFrom();

  Vector3f getTo();

  Map<EnumFacing, BlockPartFace> getFaces();

  BlockPartRotation getPartRotation();

  boolean isShading();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder from(Vector3f from);

    Builder to(Vector3f to);

    Builder faces(Map<EnumFacing, BlockPartFace> faces);

    Builder rotation(BlockPartRotation rotation);

    Builder shading(boolean shading);

    BlockPart build();
  }
}
