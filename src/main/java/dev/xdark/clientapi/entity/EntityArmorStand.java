package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.math.Rotations;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface EntityArmorStand extends EntityLivingBase {

  Rotations DEFAULT_HEAD_ROTATION = objectValue(),
      DEFAULT_BODY_ROTATION = objectValue(),
      DEFAULT_LEFTARM_ROTATION = objectValue(),
      DEFAULT_RIGHTARM_ROTATION = objectValue(),
      DEFAULT_LEFTLEG_ROTATION = objectValue(),
      DEFAULT_RIGHTLEG_ROTATION = objectValue();
  DataParameter<Byte> STATUS = objectValue();
  DataParameter<Rotations> BODY_ROTATION = objectValue(),
      LEFT_ARM_ROTATION = objectValue(),
      RIGHT_ARM_ROTATION = objectValue(),
      LEFT_LEG_ROTATION = objectValue(),
      RIGHT_LEG_ROTATION = objectValue();

  void setSmall(boolean small);

  boolean isSmall();

  void setShowArms(boolean showArms);

  boolean shouldShowArms();

  void setNoBasePlate(boolean noBasePlate);

  boolean hasNoBasePlate();

  void setMarker(boolean marker);

  boolean hasMarker();

  void setHeadRotation(Rotations rotations);

  void setBodyRotation(Rotations rotations);

  void setLeftArmRotation(Rotations rotations);

  void setRightArmRotation(Rotations rotations);

  void setLeftLegRotation(Rotations rotations);

  void setRightLegRotation(Rotations rotations);

  Rotations getHeadRotation();

  Rotations getBodyRotation();

  Rotations getLeftArmRotation();

  Rotations getRightArmRotation();

  Rotations getLeftLegRotation();

  Rotations getRightLegRotation();
}
