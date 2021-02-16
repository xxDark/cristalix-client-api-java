package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface NBTTagString extends NBTBase {

  static NBTTagString of(String value) {
    throw CompileStub.create();
  }

  String getValue();
}
