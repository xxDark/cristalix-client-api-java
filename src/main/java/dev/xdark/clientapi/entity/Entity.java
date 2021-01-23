package dev.xdark.clientapi.entity;

import com.sun.javafx.geom.Vec3d;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.item.ItemStack;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@SidedApi(Side.SERVER)
public interface Entity {

  int getEntityId();

  void setEntityId(int entityId);

  UUID getUniqueID();

  //ITextComponent getDisplayName();

  String getDisplayNameForRendering();

  String getName();

  boolean hasCustomName();

  String getCustomNameTag();

  boolean getAlwaysRenderNameTag();

  double getLastX();

  double getPrevX();

  double getX();

  double getLastY();

  double getPrevY();

  double getY();

  double getLastZ();

  double getPrevZ();

  double getZ();

  float getRotationYaw();

  float getRotationPitch();

  float getPrevRotationYaw();

  float getPrevRotationPitch();

  double getMotionX();

  double getMotionY();

  double getMotionZ();

  boolean isOnGround();

  boolean isTurnLocked();

  void setTurnLocked(boolean turnLocked);

  float getEyeHeight();

  Vec3d getLook(float partialTicks);

  Vec3d getPositionEyes(float partialTicks);

  void setMotion(double x, double y, double z);

  void setMotionX(double x);

  void setMotionY(double y);

  void setMotionZ(double z);

  void teleport(double x, double y, double z);

  void setAngle(float yaw, float pitch);

  void setYaw(float yaw);

  void setPitch(float pitch);

  void setSize(float width, float height);

  //EntityDataManager getDataManager();

  void turn(float yaw, float pitch);

  void setFire(int ticks);

  void extinguish();

  boolean isSilent();

  void setSilent(boolean silent);

  boolean hasNoGravity();

  void setNoGravity(boolean noGravity);

  boolean isImmuneToFire();

  boolean isWet();

  boolean isInWater();

  boolean isInLava();

  int getBrightnessForRender();

  float getBrightness();

  Vec3d getVectorForRotation(float yaw, float pitch);

  //RayTraceResult rayTrace(double p_rayTrace_1_, float p_rayTrace_3_);

  boolean isEntityAlive();

  boolean isEntityInsideOpaqueBlock();

  double getYOffset();

  double getMountedYOffset();

  boolean startRiding(Entity entity1, boolean force);

  boolean canBeRidden(Entity entity);

  void removePassengers();

  void dismountRidingEntity();

  void addPassenger(Entity entity);

  void removePassenger(Entity entity);

  boolean canFitPassenger(Entity entity);

  Vec3d getLookVec();

  Vec3d getForward();

  Iterable<ItemStack> getHeldEquipment();

  Iterable<ItemStack> getArmorInventoryList();

  Iterable<ItemStack> getEquipmentAndArmor();

  //void setItemStackToSlot(EntityEquipmentSlot slot, ItemStack stack);

  boolean isBurning();

  boolean isRiding();

  boolean isBeingRidden();

  boolean isSneaking();

  void setSneaking(boolean sneaking);

  boolean isSprinting();

  void setSprinting(boolean sprinting);

  boolean isGlowing();

  void setGlowing(boolean glowing);

  boolean isInvisible();

  void setInvisible(boolean invisible);

  int getAir();

  void setAir(int air);

  void setInWeb();

  Entity[] getParts();

  String getCachedUniqueIdString();

  void setCustomNameTag(String customNameTag);

  void setAlwaysRenderNameTag(boolean alwaysRenderNameTag);

  boolean getAlwaysRenderNameTagForRender();

  //EnumFacing getHorizontalFacing();

  //EnumFacing getAdjustedHorizontalFacing();

  //HoverEvent getHoverEvent();

  boolean isImmuneToExplosions();

  List<Entity> getPassengers();

  boolean isPassenger(Entity entity);

  Collection<Entity> getRecursivePassengers();

  Entity getLowestRidingEntity();

  boolean isRidingSameEntity(Entity entity);

  boolean isRidingOrBeingRiddenBy(Entity entity);

  Entity getRidingEntity();

  //AxisAlignedBB getEntityBoundingBox();

  //AxisAlignedBB getRenderBoundingBox();

  //void setEntityBoundingBox(AxisAlignedBB aabb);

  void setUniqueId(UUID uniqueId);

  void setFakeRiding(boolean riding);

  boolean isFakeRiding();
}
