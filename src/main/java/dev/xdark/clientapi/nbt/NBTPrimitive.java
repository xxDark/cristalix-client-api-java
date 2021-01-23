package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface NBTPrimitive extends NBTBase {

  long getLong();

  int getInt();

  short getShort();

  byte getByte();

  double getDouble();

  float getFloat();

  @Override
  NBTPrimitive copy();
}
