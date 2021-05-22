package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import org.lwjgl.util.vector.Vector3f;

@SidedApi(Side.SERVER)
public interface ItemTransformVec3f {

  Vector3f getRotation();

  Vector3f getTranslation();

  Vector3f getScale();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder rotation(Vector3f rotation);

    Builder translation(Vector3f translation);

    Builder scale(Vector3f scale);

    ItemTransformVec3f build();
  }
}
