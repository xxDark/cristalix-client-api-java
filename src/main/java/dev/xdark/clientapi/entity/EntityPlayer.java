package dev.xdark.clientapi.entity;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import com.mojang.authlib.GameProfile;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.inventory.Container;
import dev.xdark.clientapi.inventory.InventoryPlayer;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.nbt.NBTTagCompound;
import dev.xdark.clientapi.util.EnumHandSide;
import dev.xdark.clientapi.util.FoodStats;

@SidedApi(Side.BOTH)
public interface EntityPlayer extends EntityLivingBase {

  DataParameter<Float> ABSORPTION = objectValue();
  DataParameter<Integer> PLAYER_SCORE = objectValue();
  DataParameter<Byte> PLAYER_MODEL_FLAG = objectValue();
  DataParameter<Byte> MAIN_HAND = objectValue();
  DataParameter<NBTTagCompound> LEFT_SHOULDER_ENTITY = objectValue();
  DataParameter<NBTTagCompound> RIGHT_SHOULDER_ENTITY = objectValue();

  int getScore();

  @SidedApi(Side.SERVER)
  void setScore(int score);

  @SidedApi(Side.SERVER)
  void addScore(int score);

  @SidedApi(Side.SERVER)
  float getArmorVisibility();

  boolean isUser();

  @SidedApi(Side.SERVER)
  GameProfile getGameProfile();

  @SidedApi(Side.SERVER)
  void setGameProfile(GameProfile gameProfile);

  boolean isInBed();

  boolean isPlayerSleeping();

  boolean isPlayerFullyAsleep();

  int getSleepTimer();

  @SidedApi(Side.SERVER)
  void addExperience(int exp);

  @SidedApi(Side.SERVER)
  void addExperienceLevel(int level);

  int xpBarCap();

  //FoodStats getFoodStats();

  boolean canEat(boolean force);

  boolean shouldHeal();

  boolean isAllowEdit();

  @SidedApi(Side.SERVER)
  boolean addItemStackToInventory(ItemStack stack);

  boolean isSpectator();

  boolean isCreative();

  boolean isWearing(PlayerModelPart part);

  boolean hasReducedDebug();

  @SidedApi(Side.SERVER)
  void setReducedDebug(boolean reducedDebug);

  @SidedApi(Side.SERVER)
  void setPrimaryHand(EnumHandSide hand);

  @SidedApi(Side.SERVER)
  NBTTagCompound getLeftShoulderEntity();

  @SidedApi(Side.SERVER)
  void setLeftShoulderEntity(NBTTagCompound info);

  @SidedApi(Side.SERVER)
  NBTTagCompound getRightShoulderEntity();

  @SidedApi(Side.SERVER)
  void setRightShoulderEntity(NBTTagCompound info);

  @SidedApi(Side.SERVER)
  float getCooldownPeriod();

  @SidedApi(Side.SERVER)
  void resetCooldown();

  float getLuck();

  @SidedApi(Side.SERVER)
  void setWearing(PlayerModelPart part);

  InventoryPlayer getInventory();

  @SidedApi(Side.SERVER)
  Container getOpenContainer();

  int getExperienceLevel();

  @SidedApi(Side.SERVER)
  void setExperienceLevel(int experienceLevel);

  int getExperienceTotal();

  @SidedApi(Side.SERVER)
  void setExperienceTotal(int experienceTotal);

  float getExperience();

  @SidedApi(Side.SERVER)
  void setExperience(float experience);

  FoodStats getFoodStats();

  void setRenderOffset(float renderOffsetX, float renderOffsetY, float renderOffsetZ);

  void setRenderOffsetForSleep(float renderOffsetX, float renderOffsetZ);
}
