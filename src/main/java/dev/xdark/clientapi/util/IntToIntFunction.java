package dev.xdark.clientapi.util;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
@FunctionalInterface
public interface IntToIntFunction {

  int applyAsInt(int i);
}
