package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface ItemFood extends Item {

  int getHealAmount(ItemStack stack);

  float getSaturationModifier(ItemStack stack);

  boolean isWolfsFavoriteMeat();

  boolean isAlwaysEdible();

  @SidedApi(Side.SERVER)
  interface Builder extends Item.Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder foodHealHandler(FoodHealHandler foodHealHandler);

    Builder foodSaturationHandler(FoodSaturationHandler foodSaturationHandler);

    Builder foodEatHandler(FoodEatHandler foodEatHandler);

    Builder wolfsFavoriteMeat(boolean wolfsFavoriteMeat);

    Builder alwaysEdible(boolean alwaysEdible);

    ItemFood build();
  }
}
