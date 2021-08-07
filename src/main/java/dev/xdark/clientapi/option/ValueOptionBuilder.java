package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import java.util.function.Consumer;
import java.util.function.Supplier;

@SidedApi(Side.SERVER)
public interface ValueOptionBuilder<V> extends OptionBuilder<V, Option<V>, ValueOptionBuilder<V>> {

  ValueOptionBuilder<V> observer(ValueObserver<V> observer);

  ValueOptionBuilder<V> get(Supplier<V> get);

  ValueOptionBuilder<V> set(Consumer<V> set);

  ValueOptionBuilder<V> normalizer(ValueNormalizer<V> normalizer);

  ValueOptionBuilder<V> min(V min);

  ValueOptionBuilder<V> max(V max);
}
