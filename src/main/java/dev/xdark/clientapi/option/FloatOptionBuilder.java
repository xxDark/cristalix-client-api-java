package dev.xdark.clientapi.option;

import dev.xdark.feder.function.FloatConsumer;
import dev.xdark.feder.function.FloatSupplier;

public interface FloatOptionBuilder extends OptionBuilder<Float, FloatOption, FloatOptionBuilder> {

  FloatOptionBuilder observer(FloatObserver observer);

  FloatOptionBuilder get(FloatSupplier get);

  FloatOptionBuilder set(FloatConsumer set);

  FloatOptionBuilder normalizer(FloatNormalizer normalizer);

  FloatOptionBuilder min(float min);

  FloatOptionBuilder max(float max);
}
