package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface IntNormalizer extends ValueNormalizer<Integer> {

  int normalize(float value, int min, int max);

  @Override
  default Integer normalize(Integer value, Integer min, Integer max) {
    return this.normalize(value.intValue(), min.intValue(), max.intValue());
  }
}
