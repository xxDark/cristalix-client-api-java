package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.nbt.NBTBase;
import dev.xdark.clientapi.nbt.NBTTagCompound;
import dev.xdark.clientapi.nbt.NBTTagList;
import dev.xdark.clientapi.text.Text;
import dev.xdark.clientapi.util.CompileStub;

import java.util.List;

@SidedApi(Side.BOTH)
public interface ItemStack {

  static ItemStack of(Item item, int count, int metadata) {
    throw CompileStub.create();
  }

  static ItemStack of(NBTTagCompound tag) {
    throw CompileStub.create();
  }

  boolean isEmpty();

  ItemStack split(int amount);

  Item getItem();

  float getDestroySpeed(BlockState blockState);

  int getMaxSize();

  boolean isStackable();

  boolean isDamageable();

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

  ItemStack setDisplayName(String displayName);

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

  List<String> getTooltip(EntityPlayer player, TooltipFlag flag);
}
