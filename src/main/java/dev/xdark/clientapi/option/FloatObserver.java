package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface FloatObserver extends ValueObserver<Float> {

  void onChange(float oldValue, float newValue);

  @Override
  default void onChange(Float oldValue, Float newValue) {
    this.onChange(oldValue.floatValue(), newValue.floatValue());
  }
}
