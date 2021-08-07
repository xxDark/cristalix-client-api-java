package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface IntObserver extends ValueObserver<Integer> {

  void onChange(int oldValue, int newValue);

  @Override
  default void onChange(Integer oldValue, Integer newValue) {
    this.onChange(oldValue.intValue(), newValue.intValue());
  }
}
