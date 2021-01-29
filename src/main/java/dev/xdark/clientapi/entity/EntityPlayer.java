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

@SidedApi(Side.SERVER)
public interface EntityPlayer extends EntityLivingBase {

  DataParameter<Float> ABSORPTION = objectValue();
  DataParameter<Integer> PLAYER_SCORE = objectValue();
  DataParameter<Byte> PLAYER_MODEL_FLAG = objectValue();
  DataParameter<Byte> MAIN_HAND = objectValue();
  DataParameter<NBTTagCompound> LEFT_SHOULDER_ENTITY = objectValue();
  DataParameter<NBTTagCompound> RIGHT_SHOULDER_ENTITY = objectValue();

  int getScore();

  void setScore(int score);

  void addScore(int score);

  float getArmorVisibility();

  boolean isUser();

  GameProfile getGameProfile();

  void setGameProfile(GameProfile gameProfile);

  boolean isInBed();

  boolean isPlayerSleeping();

  boolean isPlayerFullyAsleep();

  int getSleepTimer();

  void addExperience(int exp);

  void addExperienceLevel(int level);

  int xpBarCap();

  //FoodStats getFoodStats();

  boolean canEat(boolean force);

  boolean shouldHeal();

  boolean isAllowEdit();

  boolean addItemStackToInventory(ItemStack stack);

  boolean isSpectator();

  boolean isCreative();

  boolean isWearing(PlayerModelPart part);

  boolean hasReducedDebug();

  void setReducedDebug(boolean reducedDebug);

  void setPrimaryHand(EnumHandSide hand);

  NBTTagCompound getLeftShoulderEntity();

  void setLeftShoulderEntity(NBTTagCompound info);

  NBTTagCompound getRightShoulderEntity();

  void setRightShoulderEntity(NBTTagCompound info);

  float getCooldownPeriod();

  void resetCooldown();

  float getLuck();

  void setWearing(PlayerModelPart part);

  InventoryPlayer getInventory();

  Container getOpenContainer();

  int getExperienceLevel();

  void setExperienceLevel(int experienceLevel);

  int getExperienceTotal();

  void setExperienceTotal(int experienceTotal);

  float getExperience();

  void setExperience(float experience);
}
