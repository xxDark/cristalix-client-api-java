package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface FloatNormalizer extends ValueNormalizer<Float> {

  float normalize(float value, float min, float max);

  @Override
  default Float normalize(Float value, Float min, Float max) {
    return this.normalize(value.floatValue(), min.floatValue(), max.floatValue());
  }
}
