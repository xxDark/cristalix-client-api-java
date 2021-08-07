package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface BooleanOption extends Option<Boolean> {

  boolean getBooleanValue();

  void setBooleanValue(boolean value);
}
