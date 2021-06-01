package dev.xdark.clientapi.block.properties;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import dev.xdark.clientapi.util.StringSerializable;

import java.util.Collection;
import java.util.function.Predicate;

@SidedApi(Side.SERVER)
public interface EnumProperty<E extends Enum<E>> extends Property<E> {

  static <E extends Enum<E> & StringSerializable> EnumProperty<E> create(
      String name, Class<E> type) {
    throw CompileStub.create();
  }

  static <E extends Enum<E> & StringSerializable> EnumProperty<E> create(
      String name, Class<E> type, Predicate<E> predicate) {
    throw CompileStub.create();
  }

  static <E extends Enum<E> & StringSerializable> EnumProperty<E> create(
      String name, Class<E> type, Predicate<E> predicate, E... values) {
    throw CompileStub.create();
  }

  static <E extends Enum<E> & StringSerializable> EnumProperty<E> create(
      String name, Class<E> type, E... values) {
    throw CompileStub.create();
  }

  static <E extends Enum<E> & StringSerializable> EnumProperty<E> create(
      String name, Class<E> type, Collection<E> values) {
    throw CompileStub.create();
  }
}
