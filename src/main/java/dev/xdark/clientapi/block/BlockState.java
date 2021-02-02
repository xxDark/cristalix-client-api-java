package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import java.util.Collection;
import java.util.Map;

@SidedApi(Side.SERVER)
public interface BlockState extends BlockProperties {

  static BlockState of(int id) {
    throw CompileStub.INSTANCE;
  }

  int getId();

  Block getBlock();

  Collection<Property<?>> getPropertyKeys();

  <T extends Comparable<T>> T getValue(Property<T> property);

  <T extends Comparable<T>, V extends T> BlockState withProperty(Property<T> property, V value);

  <T extends Comparable<T>> BlockState cycleProperty(Property<T> property);

  Map<Property<?>, Comparable<?>> getProperties();

  Material getMaterial();
}
