package dev.xdark.clientapi.tile;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.nbt.NBTTagCompound;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface TileEntity {

  World getWorld();

  boolean hasWorld();

  void readFromNBT(NBTTagCompound compound);

  NBTTagCompound writeToNBT(NBTTagCompound compound);

  int getBlockMetadata();

  void markDirty();

  double getDistanceSq(double x, double y, double z);

  double getMaxRenderDistanceSquared();

  //BlockPos getPos();

  Block getBlockType();

  boolean isInvalid();

  void invalidate();

  void validate();

  void updateContainingBlockInfo();

  //ITextComponent getDisplayName();
}
