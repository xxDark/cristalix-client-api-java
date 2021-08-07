package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface FloatOption extends Option<Float> {

  float getFloatValue();

  void setFloatValue(float value);
}
