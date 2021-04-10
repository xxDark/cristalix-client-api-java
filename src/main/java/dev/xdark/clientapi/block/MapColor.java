package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface MapColor {

  static MapColor of(int color) {
    throw CompileStub.create();
  }

  int getColor(int type);
}
