package dev.xdark.clientapi.render.model;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface ItemCameraTransforms {

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
}
