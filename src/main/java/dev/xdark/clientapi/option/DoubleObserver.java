package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface DoubleObserver extends ValueObserver<Double> {

  void onChange(double oldValue, double newValue);

  @Override
  default void onChange(Double oldValue, Double newValue) {
    this.onChange(oldValue.doubleValue(), newValue.doubleValue());
  }
}
