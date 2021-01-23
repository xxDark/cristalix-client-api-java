package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface NBTProvider {

  NBTBase createById(byte id);

  NBTPrimitive create(long value);

  NBTPrimitive create(double value);

  NBTPrimitive create(int value);

  NBTPrimitive create(float value);

  NBTPrimitive create(short value);

  NBTPrimitive create(byte value);

  NBTPrimitive crate(boolean value);

  NBTTagString create(String str);

  NBTTagList createList();

  NBTTagCompound createCompound();
}
