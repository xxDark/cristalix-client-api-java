package dev.xdark.clientapi.option;

import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

public interface IntOptionBuilder extends OptionBuilder<Integer, IntOption, IntOptionBuilder> {

  IntOptionBuilder observer(IntObserver observer);

  IntOptionBuilder get(IntSupplier get);

  IntOptionBuilder set(IntConsumer set);

  IntOptionBuilder normalizer(IntNormalizer normalizer);

  IntOptionBuilder min(int min);

  IntOptionBuilder max(int max);
}
