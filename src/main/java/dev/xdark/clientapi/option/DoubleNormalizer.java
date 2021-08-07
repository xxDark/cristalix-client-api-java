package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface DoubleNormalizer extends ValueNormalizer<Double> {

  double normalize(double value, double min, double max);

  @Override
  default Double normalize(Double value, Double min, Double max) {
    return this.normalize(value.doubleValue(), min.doubleValue(), max.doubleValue());
  }
}
