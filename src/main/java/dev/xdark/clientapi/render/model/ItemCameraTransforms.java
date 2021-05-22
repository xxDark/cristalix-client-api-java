package dev.xdark.clientapi.render.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.renderer.block.model.ItemTransformVec3f;
import dev.xdark.clientapi.util.CompileStub;
import dev.xdark.clientapi.util.SideEffects;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface ItemCameraTransforms {

  ItemCameraTransforms DEFAULT = SideEffects.objectValue();

  ItemTransformVec3f getThirdPersonLeft();

  ItemTransformVec3f getThirdPersonRight();

  ItemTransformVec3f getFirstPersonLeft();

  ItemTransformVec3f getFirstPersonRight();

  ItemTransformVec3f getHead();

  ItemTransformVec3f getGui();

  ItemTransformVec3f getGround();

  ItemTransformVec3f getFixed();

  void applyTransform(Type type);

  ItemTransformVec3f getTransform(Type type);

  @SidedApi(Side.BOTH)
  interface Type {

    Type NONE = objectValue(),
        THIRD_PERSON_LEFT_HAND = objectValue(),
        THIRD_PERSON_RIGHT_HAND = objectValue(),
        FIRST_PERSON_LEFT_HAND = objectValue(),
        FIRST_PERSON_RIGHT_HAND = objectValue(),
        HEAD = objectValue(),
        GUI = objectValue(),
        GROUND = objectValue(),
        FIXED = objectValue();
  }

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder thirdPersonLeft(ItemTransformVec3f thirdPersonLeft);

    Builder thirdPersonRight(ItemTransformVec3f thirdPersonRight);

    Builder firstPersonLeft(ItemTransformVec3f firstPersonLeft);

    Builder firstPersonRight(ItemTransformVec3f firstPersonRight);

    Builder head(ItemTransformVec3f head);

    Builder gui(ItemTransformVec3f gui);

    Builder ground(ItemTransformVec3f ground);

    Builder fixed(ItemTransformVec3f fixed);

    ItemCameraTransforms build();
  }
}
