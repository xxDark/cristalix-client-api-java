package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface IntOption extends Option<Integer> {

  int getIntValue();

  void setIntValue(int value);
}
