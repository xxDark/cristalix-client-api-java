package dev.xdark.clientapi.util;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@FunctionalInterface
@SidedApi(Side.BOTH)
public interface BooleanToIntFunction {

  int applyAsInt(boolean value);
}
