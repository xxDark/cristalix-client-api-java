package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.nbt.NBTTagCompound;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface EntityProvider {

  Entity newEntity(NBTTagCompound info, World world);

  Entity newEntity(int id, World world);
}
