package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface BooleanObserver extends ValueObserver<Boolean> {

  void onChange(boolean oldValue, boolean newValue);

  @Override
  default void onChange(Boolean oldValue, Boolean newValue) {
    this.onChange(oldValue.booleanValue(), newValue.booleanValue());
  }
}
