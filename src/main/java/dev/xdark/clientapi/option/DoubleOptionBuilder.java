package dev.xdark.clientapi.option;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;

public interface DoubleOptionBuilder
    extends OptionBuilder<Double, DoubleOption, DoubleOptionBuilder> {

  DoubleOptionBuilder observer(DoubleObserver observer);

  DoubleOptionBuilder get(DoubleSupplier get);

  DoubleOptionBuilder set(DoubleConsumer set);

  DoubleOptionBuilder normalizer(DoubleNormalizer normalizer);

  DoubleOptionBuilder min(double min);

  DoubleOptionBuilder max(double max);
}
