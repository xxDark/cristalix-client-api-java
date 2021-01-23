package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface NBTTagString extends NBTBase {

  String getValue();
}
