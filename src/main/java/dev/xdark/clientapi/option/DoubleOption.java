package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface DoubleOption extends Option<Double> {

  double getDoubleValue();

  void setDoubleValue(double value);
}
