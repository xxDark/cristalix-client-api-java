package dev.xdark.clientapi.util;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.List;
import java.util.function.Function;

@SidedApi(Side.BOTH)
public interface SearchTree<T> {

  static <T> SearchTree<T> of(Function<T, Iterable<String>> nameFunc) {
    throw CompileStub.create();
  }

  void recalculate();

  void add(T value);

  List<T> search(String input);
}
