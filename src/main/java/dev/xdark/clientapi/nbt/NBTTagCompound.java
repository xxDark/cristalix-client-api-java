package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

@SidedApi(Side.BOTH)
public interface NBTTagCompound extends NBTBase {

  static NBTTagCompound of() {
    throw CompileStub.create();
  }

  static NBTTagCompound of(Map<String, NBTBase> map) {
    throw CompileStub.create();
  }

  static NBTTagCompound copy(NBTTagCompound compound) {
    throw CompileStub.create();
  }

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

  long getLong(String key);

  double getDouble(String key);

  int getInteger(String key);

  float getFloat(String key);

  short getShort(String key);

  byte getByte(String key);

  boolean getBoolean(String key);

  String getString(String key);

  long[] getLongArray(String key);

  int[] getIntArray(String key);

  byte[] getByteArray(String key);

  NBTTagList getList(String key, int type);

  NBTTagCompound getCompound(String key);

  <V extends NBTBase> V remove(String key);

  Collection<String> keys();

  Collection<NBTBase> values();

  void clear();

  boolean hasKey(String key);

  boolean hasKeyOfType(String key, int type);
}
