package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.Collection;
import java.util.function.Function;

@SidedApi(Side.BOTH)
public interface NBTTagCompound extends NBTBase {

  void put(String key, NBTBase nbt);

  NBTBase putIfAbsent(String key, NBTBase nbt);

  NBTBase computeIfAbsent(String key, Function<String, ? extends NBTBase> func);

  void put(String key, long value);

  void put(String key, double value);

  void put(String key, int value);

  void put(String key, float value);

  void put(String key, short value);

  void put(String key, byte value);

  void put(String key, boolean value);

  void put(String key, String value);

  void put(String key, long[] value);

  void put(String key, int[] value);

  void put(String key, byte[] value);

  byte getId(String key);

  long getLong(String key, long fallback);

  double getDouble(String key, double fallback);

  int getInt(String key, int fallback);

  float getFloat(String key, float fallback);

  short getShort(String key, short fallback);

  byte getByte(String key, byte fallback);

  boolean getBoolean(String key, boolean fallback);

  String getString(String key, String fallback);

  long[] getLongArray(String key, long[] fallback);

  int[] getIntArray(String key, int[] fallback);

  byte[] getByteArray(String key, byte[] fallback);

  NBTTagList getList(String key, NBTTagList fallback);

  NBTTagCompound getCompound(String key, NBTTagCompound fallback);

  <V extends NBTBase> V remove(String key);

  Collection<String> keys();

  Collection<NBTBase> values();

  void clear();

  @Override
  NBTTagCompound copy();
}
