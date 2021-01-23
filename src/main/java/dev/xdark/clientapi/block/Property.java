package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.Collection;
import java.util.Optional;

@SidedApi(Side.SERVER)
public interface Property<T extends Comparable<T>> {

  String getName();

  Collection<T> getAllowedValues();

  Class<T> getValueClass();

  Optional<T> parseValue(String var1);

  String getName(T value);
}
