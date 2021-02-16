package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import java.util.List;

@SidedApi(Side.BOTH)
public interface NBTTagList extends NBTBase {

  static NBTTagList create() {
    throw CompileStub.INSTANCE;
  }

  static NBTTagList create(List<NBTBase> list) {
    throw CompileStub.INSTANCE;
  }

  static NBTTagList copy(NBTTagList list) {
    throw CompileStub.INSTANCE;
  }

  void set(int idx, NBTBase nbt);

  void add(int idx, NBTBase nbt);

  void add(NBTBase nbt);

  void remove(NBTBase nbt);

  NBTBase remove(int idx);

  int size();

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
}
