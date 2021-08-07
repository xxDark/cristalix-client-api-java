package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface LongNormalizer extends ValueNormalizer<Long> {

  long normalize(long value, long min, long max);

  @Override
  default Long normalize(Long value, Long min, Long max) {
    return this.normalize(value.longValue(), min.longValue(), max.longValue());
  }
}
