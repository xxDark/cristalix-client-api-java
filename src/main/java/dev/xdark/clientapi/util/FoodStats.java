package dev.xdark.clientapi.util;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface FoodStats {

  @SidedApi(Side.SERVER)
  void addStats(int foodLevel, float foodSaturationLevel);

  int getFoodLevel();

  boolean needFood();

  @SidedApi(Side.SERVER)
  void addExhaustion(float exhaustion);

  float getSaturationLevel();

  @SidedApi(Side.SERVER)
  void setFoodLevel(int foodLevel);

  @SidedApi(Side.SERVER)
  void setFoodSaturationLevel(float foodSaturationLevel);
}
