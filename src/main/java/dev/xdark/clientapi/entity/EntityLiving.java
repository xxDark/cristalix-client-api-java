package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface EntityLiving extends EntityLivingBase {

  DataParameter<Byte> AI_FLAGS = SideEffects.objectValue();

  int getTalkInterval();

  void playLivingSound();

  void spawnExplosionParticle();

  void setMoveForward(float moveForward);

  void setMoveVertical(float moveVertical);

  void setMoveStrafing(float moveStrafing);

  boolean canEquipItem(ItemStack item);

  boolean canDespawn();

  void despawnEntity();

  int getVerticalFaceSpeed();

  int getHorizontalFaceSpeed();

  void faceEntity(Entity entity, float maxYaw, float maxPitch);

  boolean isNotColliding();

  boolean canBeSteered();

  boolean getLeashed();

  Entity getLeashHolder();

  void setNoAI(boolean noAI);

  void setLeftHanded(boolean leftHanded);

  boolean isAIDisabled();

  boolean isLeftHanded();
}
