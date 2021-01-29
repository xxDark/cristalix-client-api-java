package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface NBTTagString extends NBTBase {

  static NBTTagString create(String value) {
    throw CompileStub.INSTANCE;
  }

  String getValue();
}
