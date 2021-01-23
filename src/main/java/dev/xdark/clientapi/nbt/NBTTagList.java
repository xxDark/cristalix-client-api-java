package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface NBTTagList extends NBTBase {

  void set(int idx, NBTBase nbt);

  void add(int idx, NBTBase nbt);

  void add(NBTBase nbt);

  void remove(NBTBase nbt);

  int size();

  boolean isEmpty();

  long getLong(int idx);

  int getInt(int idx);

  double getDouble(int idx);

  float getFloat(int idx);

  short getShort(int idx);

  byte getByte(int idx);

  String getString(int idx);

  NBTTagList getList(int idx);

  NBTTagCompound getCompound(int idx);

  void clear();

  @Override
  NBTTagList copy();
}
