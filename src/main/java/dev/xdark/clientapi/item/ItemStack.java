package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.BlockState;
import dev.xdark.clientapi.nbt.NBTBase;
import dev.xdark.clientapi.nbt.NBTTagCompound;
import dev.xdark.clientapi.nbt.NBTTagList;
import dev.xdark.clientapi.text.Text;

@SidedApi(Side.BOTH)
public interface ItemStack {

  boolean isEmpty();

  ItemStack splitStack(int amount);

  Item getItem();

  float getDestroySpeed(BlockState blockState);

  int getMaxStackSize();

  boolean isStackable();

  boolean isItemStackDamageable();

  boolean isItemDamaged();

  int getItemDamage();

  int getMetadata();

  void setItemDamage(int meta);

  int getMaxDamage();

  ItemStack copy();

  boolean isItemEqual(ItemStack other);

  boolean isItemEqualIgnoreDurability(ItemStack stack);

  String getTranslationKey();

  NBTTagCompound getTagCompound();

  NBTTagCompound getOrCreateSubCompound(String key);

  NBTTagCompound getSubCompound(String key);

  void removeSubCompound(String key);

  NBTTagList getEnchantmentTagList();

  void setTagCompound(NBTTagCompound nbt);

  String getDisplayName();

  ItemStack setTranslatableName(String name);

  ItemStack setStackDisplayName(String displayName);

  void clearCustomName();

  boolean hasDisplayName();

  boolean hasEffect();

  boolean isItemEnchantable();

  boolean isItemEnchanted();

  void setTagInfo(String key, NBTBase value);

  int getRepairCost();

  Text getText();

  int getCount();

  void setCount(int size);

  void grow(int quantity);

  void shrink(int quantity);

  NBTTagCompound writeToNBT(NBTTagCompound nbt);
}
