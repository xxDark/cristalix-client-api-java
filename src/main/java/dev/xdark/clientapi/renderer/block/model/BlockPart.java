package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import dev.xdark.clientapi.util.EnumFacing;
import org.lwjgl.util.vector.Vector3f;

import java.util.Map;

@SidedApi(Side.SERVER)
public interface BlockPart {

  static BlockPart of(
      Vector3f from,
      Vector3f to,
      Map<EnumFacing, BlockPartFace> faces,
      BlockPartRotation partRotation,
      boolean shading) {
    throw CompileStub.create();
  }

  Vector3f getFrom();

  Vector3f getTo();

  Map<EnumFacing, BlockPartFace> getFaces();

  BlockPartRotation getPartRotation();

  boolean isShading();
}
