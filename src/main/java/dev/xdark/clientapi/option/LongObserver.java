package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface LongObserver extends ValueObserver<Long> {

  void onChange(long oldValue, long newValue);

  @Override
  default void onChange(Long oldValue, Long newValue) {
    this.onChange(oldValue.longValue(), newValue.longValue());
  }
}
