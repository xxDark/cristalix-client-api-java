package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.feder.function.BooleanConsumer;

import java.util.function.BooleanSupplier;

@SidedApi(Side.SERVER)
public interface BooleanOptionBuilder
    extends OptionBuilder<Boolean, BooleanOption, BooleanOptionBuilder> {

  BooleanOptionBuilder observer(BooleanObserver observer);

  BooleanOptionBuilder get(BooleanSupplier get);

  BooleanOptionBuilder set(BooleanConsumer set);
}
