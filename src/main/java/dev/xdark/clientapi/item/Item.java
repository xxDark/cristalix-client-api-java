package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;

@SidedApi(Side.SERVER)
public interface Item {

  ResourceLocation getLocation();

  int getId();

  boolean hasCustomProperties();

  int getItemStackLimit();

  boolean hasSubtypes();

  int getMaxDamage();

  boolean isDamageable();

  boolean isFull3D();

  boolean shouldRotateAroundWhenRendering();

  String getTranslationKey();

  String getTranslationKey(ItemStack stack);

  Item getContainerItem();

  ItemStack newStack(int amount, int damage);
}
