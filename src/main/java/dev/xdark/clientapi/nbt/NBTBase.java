package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

@SidedApi(Side.BOTH)
public interface NBTBase {

  void write(DataOutput output) throws IOException;

  void read(DataInput input, int depth) throws IOException;

  byte getId();

  boolean isEmpty();
}
