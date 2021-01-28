package dev.xdark.clientapi.util;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface EnumHandSide {

  EnumHandSide LEFT = objectValue(),
      RIGHT = objectValue();

  EnumHandSide opposite();
}
