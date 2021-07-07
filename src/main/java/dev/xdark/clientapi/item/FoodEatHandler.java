package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface FoodEatHandler {

    void onFoodEaten(ItemStack stack, World world, EntityPlayer player);
}
