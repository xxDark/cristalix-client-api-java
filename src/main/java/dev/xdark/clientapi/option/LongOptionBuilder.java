package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import java.util.function.LongConsumer;
import java.util.function.LongSupplier;

@SidedApi(Side.SERVER)
public interface LongOptionBuilder extends OptionBuilder<Long, LongOption, LongOptionBuilder> {

  LongOptionBuilder observer(LongObserver observer);

  LongOptionBuilder get(LongSupplier get);

  LongOptionBuilder set(LongConsumer set);

  LongOptionBuilder normalizer(LongNormalizer normalizer);

  LongOptionBuilder min(long min);

  LongOptionBuilder max(long max);
}
