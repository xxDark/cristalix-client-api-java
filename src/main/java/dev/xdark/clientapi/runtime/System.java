package dev.xdark.clientapi.runtime;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.io.PrintStream;

@SidedApi(Side.BOTH)
public interface System {

  PrintStream out = objectValue();
  PrintStream err = objectValue();

  void exit(int code);

  void halt(int code);

  Platform platform();

  static long currentTimeMillis() {
    return java.lang.System.currentTimeMillis();
  }

  static long nanoTime() {
    return java.lang.System.nanoTime();
  }

  static int identityHashCode(Object x) {
    return java.lang.System.identityHashCode(x);
  }
}
