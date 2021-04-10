package dev.xdark.clientapi.renderer.block.model;

import static dev.xdark.clientapi.util.SideEffects.objectValue;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import dev.xdark.clientapi.util.EnumFacing;
import org.lwjgl.util.vector.Matrix4f;

@SidedApi(Side.SERVER)
public interface ModelRotation {

  ModelRotation X0_Y0 = objectValue(),
      X0_Y90 = objectValue(),
      X0_Y180 = objectValue(),
      X0_Y270 = objectValue(),
      X90_Y0 = objectValue(),
      X90_Y90 = objectValue(),
      X90_Y180 = objectValue(),
      X90_Y270 = objectValue(),
      X180_Y0 = objectValue(),
      X180_Y90 = objectValue(),
      X180_Y180 = objectValue(),
      X180_Y270 = objectValue(),
      X270_Y0 = objectValue(),
      X270_Y90 = objectValue(),
      X270_Y180 = objectValue(),
      X270_Y270 = objectValue();

  Matrix4f matrix();

  EnumFacing rotateFace(EnumFacing facing);

  int rotateVertex(EnumFacing facing, int vertexIndex);

  static ModelRotation getModelRotation(int x, int y) {
    throw CompileStub.create();
  }
}
